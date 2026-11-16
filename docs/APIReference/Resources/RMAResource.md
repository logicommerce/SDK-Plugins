# RMAResource

## Descripción

El recurso permite consultar las devoluciones (RMAs) de la tienda, sea cual sea su estado (también las `DELETED`). Se puede acceder a este recurso desde cualquier servicio, incluido el consumidor de colas. Es de solo lectura: no permite crear, modificar ni cambiar de estado devoluciones.

Solo lee devoluciones del comercio de la petición. Cada llamada devuelve objetos *[RMA](../Models/RMA/RMA.md)* nuevos, leídos de la base de datos.

Disponible desde la versión **2.9.1** del SDK.

## Métodos

- **List<[RMA](../Models/RMA/RMA.md)>** getRMAs(**[CustomerDocumentListParam](../Models/Document/CustomerDocumentListParam.md)** param) throws **[PluginResourceException](PluginResourceException.md)**
- **[RMA](../Models/RMA/RMA.md)** getRMA(**int** rmaId) throws **[PluginResourceException](PluginResourceException.md)**
- **[RMA](../Models/RMA/RMA.md)** getRMA(**String** documentNumber) throws **[PluginResourceException](PluginResourceException.md)**

### getRMAs

Devuelve una página de las devoluciones del comercio cuyo cliente tiene exactamente el email del param, de la más reciente a la más antigua (a igual fecha, por id descendente). Si el param o su email son `null` o están vacíos, devuelve una lista vacía.

- **Email:** se compara con el email guardado en la devolución (*getCustomer().getEmail()*), sin los espacios del principio y del final. No es una búsqueda por prefijo: `ana@tienda.com` no encuentra `ana@tienda.com.ar`. Se incluyen las devoluciones hechas con ese email aunque no estén ligadas a una cuenta registrada.
- **Fechas:** *fromDate* y *toDate* filtran por la fecha de la devolución (*getDate()*); los dos límites son inclusivos y se puede indicar solo uno.
- **Paginación:** la página empieza en `1` y por defecto trae `25` devoluciones; el máximo es `100`. Una página menor que `1` se trata como `1`; un tamaño menor que `1` como `25`, y uno mayor que `100` como `100`.
- No hay total: para saber si hay más páginas, pedir la siguiente (o un elemento más allá del final de la página actual).

### getRMA(int rmaId)

Devuelve la devolución con ese id, o `null` si el comercio no tiene ninguna (no existe o es de otro comercio).

### getRMA(String documentNumber)

Devuelve la devolución con ese número de documento, o `null` si el comercio no tiene ninguna o el número está vacío. Sirve cuando solo se conoce el número que ve el cliente; desde otro recurso se usa el id con *getRMA(int)*.

### Relación con pedidos

- **Del pedido a la devolución:** *getRMAs()* de un *[Order](../Models/Order/Order.md)* leído con *[OrderResource](OrderResource.md)* trae un resumen de cada devolución (*[OrderRMA](../Models/Order/OrderRMA.md)*). Su *getId()* sirve para *getRMA(int)* y obtener el detalle completo.
- **De la devolución al pedido:** *getOrderId()* del *[RMA](../Models/RMA/RMA.md)* sirve para *getOrder(int)* de *[OrderResource](OrderResource.md)*. *getOrderDocumentNumber()* es el número del pedido, para mostrarlo.

| | *[OrderRMA](../Models/Order/OrderRMA.md)* (dentro del pedido) | *[RMA](../Models/RMA/RMA.md)* (este recurso) |
|---|---|---|
| Id, número de documento, estado y fecha | Sí | Sí |
| Líneas | Hash de la línea del pedido y cantidad | Producto, nombre, SKU, cantidad, motivo y comentario |
| Cliente | No | Email, nombre, apellidos y empresa |
| Pedido | Implícito | *getOrderId()* y *getOrderDocumentNumber()* |
| Importes | No | Subtotal, total y moneda |

### Contrato común

Los métodos devuelven `null` (o una lista vacía) solo cuando no hay datos. Cualquier otro fallo lanza *[PluginResourceException](PluginResourceException.md)*, de forma que quien llama nunca confunde un fallo con una devolución inexistente. El recurso no comprueba a qué cliente pertenece la devolución leída por id o número: si el plugin la muestra a un cliente, debe comparar el email de *getCustomer()*.

## Ejemplo

```java
public class MyService implements DataService {

	@Resource
	private RMAResource rmaResource;

	@Resource
	private OrderResource orderResource;

	public void process(String email) throws PluginResourceException {
		List<RMA> rmas = rmaResource.getRMAs(new CustomerDocumentListParamBuilder()
			.email(email)
			.perPage(10)
			.build());

		for (RMA rma : rmas) {
			for (RMAItem item : rma.getItems()) {
				String reason = item.getReason();
				...
			}
		}

		RMA rma = rmaResource.getRMA(312);
		if (rma == null || !email.equalsIgnoreCase(rma.getCustomer().getEmail())) {
			...
		}
		Order order = orderResource.getOrder(rma.getOrderId());
	}
}
```

## Referencias

- **[RMA](../Models/RMA/RMA.md)**
- **[CustomerDocumentListParam](../Models/Document/CustomerDocumentListParam.md)**
- **[OrderRMA](../Models/Order/OrderRMA.md)**
- **[OrderResource](OrderResource.md)**
- **[UserResource](UserResource.md)**
- **[PluginResourceException](PluginResourceException.md)**
