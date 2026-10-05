# BasketResource

Recurso para crear, leer, modificar y eliminar cestas de invitado del comercio a partir de su token, desde cualquier
petición del plugin y sin que la cesta sea la sesión de esa petición.

*Disponible desde la versión 2.8.5.*

Todos los métodos trabajan en un contexto que la plataforma reconstruye a partir de la cesta (su país, idioma, moneda y
cliente) y del *[ClientInfo](../Models/Basket/ClientInfo.md)* recibido, nunca a partir de las cabeceras de la petición
de quien llama: el user agent y la IP salen del *ClientInfo*, el cliente nunca se trata como un bot y los filtros de
plugins por país, zona y grupo se aplican igual que en la tienda. El token de una cesta de otro comercio se comporta
como el de una cesta que no existe.

Una petición del plugin sirve como máximo una cesta: después de que *create*, *get*, *apply* o *delete* hayan cargado o
creado una cesta, llamar a cualquiera de ellos con otro token en la misma petición lanza *IllegalStateException* (un
error de programación, no reintentable). Una llamada que no encuentra la cesta no carga ninguna, y un *create* fallido
no conserva ninguna, así que se puede reintentar con otro token. *putStorage* y *removeStorage* no cargan la cesta y no
tienen este límite. Las llamadas a
*[CatalogResource](CatalogResource.md)* tampoco: pueden hacerse en la misma petición, antes o después, nunca inyectan,
sustituyen ni guardan una cesta y dejan sin cambios la cesta servida y su contexto.

Cada llamada que modifica la cesta aplica todos sus cambios, recalcula la cesta una sola vez y la guarda de forma
síncrona, con una actualización que nunca vuelve a crear una cesta eliminada entretanto. Los rechazos de negocio (una
fila que no se puede añadir, un código de vale rechazado, una moneda rechazada) son datos de la
*[BasketView](../Models/Basket/BasketView.md)* devuelta: *PluginResourceException* solo se lanza por fallos de
infraestructura. Un uso incorrecto (token, contexto o cambios *null* donde son obligatorios, una fila con id de producto
o cantidad no positivos, una clave de *Storage* que no cumple las reglas de *putStorage*) lanza *IllegalArgumentException*
antes de cambiar nada.

Los importes son enteros en unidades menores de la moneda de la vista (ver *[BasketView](../Models/Basket/BasketView.md)*).

```java

@Resource
private BasketResource basketResource;

```

## Métodos disponibles

- BasketView create(BasketContext context, BasketChanges changes): Crea una cesta de invitado en el contexto indicado
  (*[BasketContext](../Models/Basket/BasketContext.md)*: país, idioma, moneda preferida y cliente), le aplica los cambios
  como *apply*, la recalcula una vez, la inserta y después escribe *getStorage()* de los cambios en el *Storage* del
  plugin de esa cesta, como *putStorage*. El país, el idioma y la moneda de los cambios se ignoran: mandan los del contexto. La
  cesta se crea aunque no se haya podido añadir ninguna fila (quien llama la elimina si no la quiere). Si falla la
  escritura del *Storage*, la plataforma elimina la cesta insertada antes de lanzar la excepción, así que una llamada
  fallida no deja ninguna cesta y no cuenta para el límite de una cesta por petición: la petición puede crear o cargar
  otra cesta.

- BasketView get(String token, ClientInfo client): Lee la cesta tal como se guardó por última vez. Nunca recalcula,
  nunca llama a plugins de cesta ni de impuestos y nunca guarda: los totales y los avisos son los guardados con la
  cesta, más las comprobaciones de creación de pedido evaluadas en seco. Devuelve *null* si la cesta no existe o es de
  otro comercio.

- BasketView apply(String token, BasketChanges changes, ClientInfo client): Aplica los cambios
  (*[BasketChanges](../Models/Basket/BasketChanges.md)*) en una sola llamada. Todo lo válido se aplica, la cesta se
  recalcula una vez y se guarda; cada elemento que no se puede aplicar vuelve como un rechazo
  (*[ChangeRejection](../Models/Basket/ChangeRejection.md)*: una fila que no se puede añadir, un producto personalizable
  sin su valor, una moneda o un país rechazados, un email registrado) o, para los códigos de vale, como un
  *[VoucherCodeResult](../Models/Basket/VoucherCodeResult.md)*. Orden: país e idioma, filas, cliente, códigos de vale y la
  regla de la moneda. *getStorage()* se ignora. Devuelve *null* si la cesta no existe o es de otro comercio.

- boolean delete(String token): Elimina la cesta, como lo haría el proceso que elimina las sesiones caducadas. Devuelve
  *true* si se ha eliminado y *false* si la cesta no existe o es de otro comercio.

- boolean putStorage(String token, Map<String, String> entries): Escribe entradas en el *[Storage](Storage.md)* del
  plugin asociado a la cesta, sin cargarla ni guardarla. Las entradas se escriben una a una (`$set`): el resto se
  mantiene y el *Storage* se crea si la cesta no tiene. Siempre es el *Storage* del plugin que llama. Devuelve *true* si
  se han escrito y *false* si el token no es de una cesta del comercio (no se escribe nada). Las claves no pueden estar
  vacías, contener `.` ni el carácter NUL ni empezar por `$`, y los valores no pueden ser *null* (si no, *IllegalArgumentException*).

- boolean removeStorage(String token, Set<String> keys): Elimina entradas del *Storage* del plugin asociado a la cesta,
  sin cargarla ni guardarla (`$unset`): el resto se mantiene y las claves que no existen se ignoran. Devuelve *true* si
  el token es de una cesta del comercio (existieran o no las claves) y *false* si no (no se escribe nada).

Todos los métodos lanzan *[PluginResourceException](PluginResourceException.md)* si la cesta o el *Storage* no se pueden
leer o escribir.

## Ejemplo: crear una cesta con una fila

```java

BasketContext context = new BasketContextBuilder()
	.countryCode("ES")
	.languageCode("es")
	.currencyHint("EUR")
	.client(new ClientInfoBuilder().userAgent(userAgent).ip(ip).build())
	.build();
BasketChanges changes = new BasketChangesBuilder()
	.rows(List.of(new RowChangeBuilder().productId(12).optionValueIds(List.of(31, 45)).quantity(2).build()))
	.storage(Map.of("my_checkout_id", checkoutId))
	.build();
BasketView basket = basketResource.create(context, changes);
for (ChangeRejection rejection : basket.getRejections()) {
	// la fila rejection.getIndex() no se ha añadido: rejection.getCode()
}

```
