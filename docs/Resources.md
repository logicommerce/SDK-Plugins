# Resources

Los recursos se definen basándose en la anotación *@Resource* como propiedad de la clase.

## Recursos "utilidades"

- *[Logger](APIReference/Resources/Logger.md)*: Para guardar logs.
- *[Connection](APIReference/Resources/Connection.md)*: Para hacer peticiones http. Las peticiones devuelven un objeto de tipo Response.
- *[Storage](APIReference/Resources/Storage.md)*: Para acceder y modificar datos persistentes del plugin para cada usuario.
- *[SessionStorage](APIReference/Resources/SessionStorage.md)*: Para leer y escribir datos en la sesión de api-plugins, y para crear o eliminar la sesión.
- *[UserData](APIReference/Resources/UserData.md)*: Este recurso permite leer y escribir datos únicos del plugin y del usuario login.
- *[Navigator](APIReference/Resources/Navigator.md)*: Para acceder y modificar datos de navegación del usuario
- *[Location](APIReference/Resources/Location.md)*:  Para acceder a datos de localización e idioma.
- *[QueueSender](APIReference/Resources/QueueSender.md)*: Envía mensajes en una cola de procesos.
- *[LocationResource](APIReference/Resources/LocationResource.md)*: Para acceder a datos de localización e idioma.
- *[SettingsResource](APIReference/Resources/SettingsResource.md)*: Consulta los datos de configuración de la tienda.
- *[AtomicSharedStorage](APIReference/Resources/AtomicSharedStorage.md)*: Almacén de valores compartido por todos los nodos, con caducidad y operaciones atómicas, para coordinar peticiones simultáneas.
- *[BasketResource](APIReference/Resources/BasketResource.md)*: Crea, lee, modifica y elimina cestas de invitado a partir de su token, en un contexto que no depende de la petición.
- *[OrderResource](APIReference/Resources/OrderResource.md)*: Lee pedidos del comercio (una página filtrada, o uno por id o por número de documento), también desde el consumidor de colas. Cada pedido trae el resumen de sus devoluciones (con su número de documento) y sus envíos (con su id), que se leen completos con *RMAResource* y *ShipmentResource*.
- *[UserResource](APIReference/Resources/UserResource.md)*: Lee un usuario registrado por su email, con todas las cuentas a las que pertenece y los datos de facturación (NIF/CIF/NIE) de cada una. Disponible desde la versión 2.9.1.
- *[RMAResource](APIReference/Resources/RMAResource.md)*: Lee las devoluciones de un cliente (una página filtrada por su email y fechas) o una por id o por número de documento, con sus líneas, motivos e importes. Disponible desde la versión 2.9.1.
- *[ShipmentResource](APIReference/Resources/ShipmentResource.md)*: Lee los envíos de los pedidos de un cliente (una página filtrada por su email y la fecha del pedido) o uno por id o por número de albarán, con su estado, transportista y seguimiento. Disponible desde la versión 2.9.1.
- *[CatalogResource](APIReference/Resources/CatalogResource.md)*: Busca y lee productos para un país, idioma y moneda explícitos. La búsqueda se describe con *[CatalogQuery](APIReference/Models/Catalog/CatalogQuery.md)* (texto en *search*, categorías, precios y página). Disponible desde la versión 2.9.0; en la 2.9.1, *getText()* / *text* de *CatalogQuery* pasan a llamarse *getSearch()* / *search*.

## Recursos de modelos

A algunos modelos de datos se accede como recurso.

- *[PluginDefinition](APIReference/Definitions/PluginDefinition.md)*: información de plugin.json. Disponible en todos los servicios.
- *[User](APIReference/Models/User.md)*: Datos del usuario. Solo disponible en las llamadas de usuario. Para leer cualquier usuario registrado por su email, desde cualquier servicio, se usa *[UserResource](APIReference/Resources/UserResource.md)*.
- *[Cart](APIReference/Models/Cart.md)*: Datos de la cesta. Solo disponible en las llamadas de olmos.

## Relación entre los recursos de pedidos, usuarios y documentos

Desde la versión 2.9.1, *OrderResource*, *UserResource*, *RMAResource* y *ShipmentResource* se pueden combinar para obtener el contexto completo de un cliente:

| Desde | Dato | Hacia |
|---|---|---|
| *UserResource* (*RegisteredUser*) | *getEmail()* | *getRMAs* de *RMAResource* y *getShipments* de *ShipmentResource* (*email* de *[CustomerDocumentListParam](APIReference/Models/Document/CustomerDocumentListParam.md)*) |
| *UserResource* (*RegisteredUserAccount*) | *getAccountId()* | *getOrders* de *OrderResource* (*userId* de *[OrderListParam](APIReference/Models/Order/OrderListParam.md)*) |
| *OrderResource* (*Order*) | *getRMAs()* → *getId()* | *getRMA(int)* de *RMAResource* |
| *OrderResource* (*Order*) | *getDelivery().getShipments()* → *getId()* | *getShipment(int)* de *ShipmentResource* |
| *RMAResource* y *ShipmentResource* | *getOrderId()* | *getOrder(int)* de *OrderResource* |

Para pasar de un recurso a otro se usan los ids, que siempre están informados. Los números de documento (*getDocumentNumber()*, *getOrderDocumentNumber()*) son los que ve el cliente: sirven para mostrarlos o para buscar un documento cuyo número ha dado el cliente, con *getOrder(String)*, *getRMA(String)* y *getShipment(String)*. El de un envío es el de su albarán, que puede no existir.

Los cuatro son de solo lectura y se pueden usar desde cualquier servicio, incluido el consumidor de colas. *RMAResource* y *ShipmentResource* no comprueban a qué cliente pertenece un documento leído por id o por número: antes de mostrarlo a un cliente hay que comparar el email de *getCustomer()* (ver *[CustomerDocument](APIReference/Models/Document/CustomerDocument.md)*).
