# OrderResource

## Descripción

El recurso permite consultar los pedidos de la tienda. Se puede acceder a este recurso desde cualquier servicio, incluido el consumidor de colas. Es de solo lectura: no permite crear ni modificar pedidos.

Disponible desde la versión **2.8.5** del SDK.

## Métodos

- **List<[OrderList](../Models/Order/OrderList.md)>** getOrders(**[OrderListParam](../Models/Order/OrderListParam.md)** param) throws **[PluginResourceException](PluginResourceException.md)**
- **[Order](../Models/Order/Order.md)** getOrder(**int** orderId) throws **[PluginResourceException](PluginResourceException.md)**
- **[Order](../Models/Order/Order.md)** getOrder(**String** documentNumber) throws **[PluginResourceException](PluginResourceException.md)**

### getOrders

Devuelve una página de pedidos que cumplen los filtros de *[OrderListParam](../Models/Order/OrderListParam.md)*, ordenados del más reciente al más antiguo.

- Los filtros que se dejan a `null` (o la lista de estados vacía) no filtran.
- *fromDate* y *toDate* filtran por la fecha del pedido y los dos límites son inclusivos. Se puede indicar solo uno. Son *LocalDateTime* sin zona horaria y se comparan con la fecha guardada en el pedido. Disponibles desde la versión **2.9.1** del SDK.
- La paginación empieza en la página `1` y por defecto devuelve `25` pedidos por página.
- Si `param` es `null` devuelve una lista vacía.
- Cada elemento es un *[OrderList](../Models/Order/OrderList.md)*, una versión resumida del pedido (cabecera, cliente, método de pago, totales y monedas). Para obtener el detalle completo de un pedido usar *getOrder*.

### getOrder(int orderId)

Devuelve el pedido completo con el id indicado, sea cual sea su estado, o `null` si el comercio no tiene ningún pedido con ese id (no existe o pertenece a otro comercio).

### getOrder(String documentNumber)

Devuelve el pedido completo con el número de documento indicado, sea cual sea su estado, o `null` si el comercio no tiene ningún pedido con ese número de documento (no existe, pertenece a otro comercio o el número está vacío).

Sirve cuando solo se conoce el número que ve el cliente (por ejemplo, el que ha escrito en un formulario). Para leer un pedido desde otro recurso (*getOrderId()* de un *[RMA](../Models/RMA/RMA.md)* o de un *[Shipment](../Models/Shipment/Shipment.md)*, *getId()* de un *[OrderList](../Models/Order/OrderList.md)*) se usa *getOrder(int)*.

### Contrato común de getOrder

Los dos *getOrder* devuelven `null` solo cuando el comercio no tiene ningún pedido con ese id o número de documento. Cualquier otro fallo (el pedido no se puede leer o convertir) lanza *[PluginResourceException](PluginResourceException.md)*, de forma que quien llama nunca confunde un fallo con un pedido inexistente.

Cada llamada devuelve un *[Order](../Models/Order/Order.md)* nuevo, leído de la base de datos, nunca la instancia que recibe un hook. Además de los datos que recibe un hook, ese pedido incluye las propiedades que solo rellena este recurso (disponibles desde la versión **2.9.0** del SDK; en los pedidos que reciben los hooks y en los que construye un plugin son `null`):

- *[Order](../Models/Order/Order.md)*: *isTaxesIncluded()*, *getPurchaseCurrencyAmounts()* (los importes en unidades menores de la moneda de compra, ver *[OrderPurchaseCurrencyAmounts](../Models/Order/OrderPurchaseCurrencyAmounts.md)*), *getRMAs()*, *getCreditNotes()* y *getPermalinkUrl()*.
- *[OrderItem](../Models/Order/OrderItem.md)*: *getType()* y *getBundleItems()*.
- *[OrderBaseStatus](../Models/Order/OrderBaseStatus.md)*: *getFromStatus()*.
- *[OrderShipmentItem](../Models/Order/OrderShipmentItem.md)*: *getHash()*.

El id de cada devolución de *getRMAs()* (*getId()* de *[OrderRMA](../Models/Order/OrderRMA.md)*) sirve para leer el detalle completo de la devolución con *[RMAResource](RMAResource.md)* (*getRMA(int)*). Desde la versión **2.9.1** del SDK, *OrderRMA* incluye también su número de documento (*getDocumentNumber()*), para mostrarlo. Del mismo modo, el id de cada envío del pedido (*getId()* de *[OrderShipment](../Models/Order/OrderShipment.md)*) sirve para leer el envío con *[ShipmentResource](ShipmentResource.md)* (*getShipment(int)*). El *getDocumentNumber()* de *OrderShipment* es el número del pedido, no el del albarán.

Las propiedades guardadas en el pedido (*getAdditionalInformation()* de *[Document](../Models/Order/Document.md)*) son las de todos los plugins, sin filtrar: no se expone qué plugin añadió cada una, así que un plugin no debe suponer que un valor guardado con uno de sus nombres de propiedad lo añadió él. Añadir una propiedad al pedido devuelto (*addProperty*) no guarda nada.

## Ejemplo

```java
public class MyService implements DataService {

	@Resource
	private OrderResource orderResource;

	@Resource
	private RMAResource rmaResource;

	public void process() throws PluginResourceException {
		OrderListParam param = new OrderListParamBuilder()
			.userId(15)
			.addStatus(OrderStatusType.COMPLETED)
			.fromDate(LocalDateTime.of(2026, 1, 1, 0, 0))
			.toDate(LocalDateTime.of(2026, 1, 31, 23, 59, 59))
			.page(1)
			.perPage(50)
			.build();
		List<OrderList> orders = orderResource.getOrders(param);

		for (OrderList orderList : orders) {
			Order order = orderResource.getOrder(orderList.getId());
			...
		}

		Order order = orderResource.getOrder(4521);
		if (order == null) {
			...
		}

		for (OrderRMA orderRMA : order.getRMAs()) {
			RMA rma = rmaResource.getRMA(orderRMA.getId());
			...
		}
	}
}
```

## Referencias

- **[Order](../Models/Order/Order.md)**
- **[OrderList](../Models/Order/OrderList.md)**
- **[OrderListParam](../Models/Order/OrderListParam.md)**
- **[OrderRMA](../Models/Order/OrderRMA.md)**
- **[RMAResource](RMAResource.md)**
- **[ShipmentResource](ShipmentResource.md)**
- **[PluginResourceException](PluginResourceException.md)**
