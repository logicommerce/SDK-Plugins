# ShipmentResource

## Descripción

El recurso permite consultar los envíos de los pedidos de la tienda, sea cual sea su estado. Se puede acceder a este recurso desde cualquier servicio, incluido el consumidor de colas. Es de solo lectura: no permite crear envíos, cambiar su estado ni generar albaranes.

Solo lee envíos de pedidos del comercio de la petición. Cada llamada devuelve objetos *[Shipment](../Models/Shipment/Shipment.md)* nuevos, leídos de la base de datos.

Un envío pertenece a un pedido, y un pedido puede tener varios envíos. Por eso el número del pedido no identifica un envío: los identificadores de un envío son su id y el número de su albarán, que solo existe si se ha generado.

Disponible desde la versión **2.9.1** del SDK.

## Métodos

- **List<[Shipment](../Models/Shipment/Shipment.md)>** getShipments(**[CustomerDocumentListParam](../Models/Document/CustomerDocumentListParam.md)** param) throws **[PluginResourceException](PluginResourceException.md)**
- **[Shipment](../Models/Shipment/Shipment.md)** getShipment(**int** shipmentId) throws **[PluginResourceException](PluginResourceException.md)**
- **[Shipment](../Models/Shipment/Shipment.md)** getShipment(**String** documentNumber) throws **[PluginResourceException](PluginResourceException.md)**

### getShipments

Devuelve una página de los envíos de los pedidos del comercio cuyo cliente tiene exactamente el email del param, del pedido más reciente al más antiguo (a igual fecha, por id de pedido descendente; los envíos de un mismo pedido, por id ascendente). Si el param o su email son `null` o están vacíos, devuelve una lista vacía.

- **Email:** se compara con el email guardado en el pedido del envío (*getCustomer().getEmail()*), sin los espacios del principio y del final. No es una búsqueda por prefijo: `ana@tienda.com` no encuentra `ana@tienda.com.ar`. Se incluyen los envíos de pedidos hechos con ese email aunque no estén ligados a una cuenta registrada.
- **Fechas:** *fromDate* y *toDate* filtran por la **fecha del pedido** (*getOrderDate()*), no por la del envío; los dos límites son inclusivos y se puede indicar solo uno.
- **Paginación:** se pagina por envíos, no por pedidos, así que los envíos de un mismo pedido pueden quedar en páginas distintas. La página empieza en `1` y por defecto trae `25` envíos; el máximo es `100`. Una página menor que `1` se trata como `1`; un tamaño menor que `1` como `25`, y uno mayor que `100` como `100`.
- No hay total: para saber si hay más páginas, pedir la siguiente (o un elemento más allá del final de la página actual).

### getShipment(int shipmentId)

Devuelve el envío con ese id, o `null` si el comercio no tiene ninguno (no existe o su pedido es de otro comercio).

Para leer los envíos de un pedido concreto, se obtiene el pedido con *[OrderResource](OrderResource.md)* y se lee cada envío con el id de *getDelivery().getShipments()* (*getId()* de *[OrderShipment](../Models/Order/OrderShipment.md)*). El *getDocumentNumber()* de *OrderShipment* es el número del pedido, no el del albarán, así que no sirve para *getShipment(String)*.

### getShipment(String documentNumber)

Devuelve el envío del albarán con ese número de documento, o `null` si el comercio no tiene ningún albarán con ese número o el número está vacío. Sirve cuando solo se conoce el número del albarán; desde otro recurso se usa el id con *getShipment(int)*. Un envío sin albarán solo se puede leer por id.

Los albaranes no se generan solos al enviar un pedido. Se crean desde la API de back (`POST /orderShipments/{id}/deliveryNote`) o con la acción *Crear albarán* (`CREATE_DELIVERYNOTE`) de un subestado de envío. Si la tienda no los genera, *getDocumentNumber()* de *[Shipment](../Models/Shipment/Shipment.md)* es `null` y este método no encuentra el envío.

### Relación con pedidos

- **Del pedido al envío:** los envíos de un *[Order](../Models/Order/Order.md)* leído con *[OrderResource](OrderResource.md)* están en *getDelivery().getShipments()* (*[OrderShipment](../Models/Order/OrderShipment.md)*). Su *getId()* sirve para *getShipment(int)*. *getDelivery()* puede ser `null` si el pedido no tiene entrega.
- **Del envío al pedido:** *getOrderId()* del *[Shipment](../Models/Shipment/Shipment.md)* sirve para *getOrder(int)* de *[OrderResource](OrderResource.md)*. *getOrderDocumentNumber()* es el número del pedido, para mostrarlo.

| | *[OrderShipment](../Models/Order/OrderShipment.md)* (dentro del pedido) | *[Shipment](../Models/Shipment/Shipment.md)* (este recurso) |
|---|---|---|
| Id | Sí | Sí |
| *getDocumentNumber()* | Número del **pedido** | Número del **albarán** (`null` si no hay) |
| Estado | Texto, con historial de estados | *OrderShipmentStatusType*, sin historial |
| Seguimiento | Número, URL y paquetes con actividades | Número y URL |
| Líneas | Id, línea del pedido, nombre, cantidad y peso | Producto, nombre, SKU y cantidad |
| Cliente y pedido | Implícitos | Email, nombre y empresa; id, número y fecha del pedido |
| Direcciones de origen y destino | Sí | No |

### Contrato común

Los métodos devuelven `null` (o una lista vacía) solo cuando no hay datos. Cualquier otro fallo lanza *[PluginResourceException](PluginResourceException.md)*. El recurso no comprueba a qué cliente pertenece el envío leído por id o número: si el plugin lo muestra a un cliente, debe comparar el email de *getCustomer()*.

## Ejemplo

```java
public class MyService implements DataService {

	@Resource
	private ShipmentResource shipmentResource;

	@Resource
	private OrderResource orderResource;

	public void process(String email) throws PluginResourceException {
		List<Shipment> shipments = shipmentResource.getShipments(new CustomerDocumentListParamBuilder()
			.email(email)
			.build());

		for (Shipment shipment : shipments) {
			String trackingUrl = shipment.getTrackingUrl();
			...
		}

		Shipment shipment = shipmentResource.getShipment(1532);
		if (shipment == null || !email.equalsIgnoreCase(shipment.getCustomer().getEmail())) {
			...
		}
		Order shipmentOrder = orderResource.getOrder(shipment.getOrderId());

		Order order = orderResource.getOrder(4521);
		if (order == null || order.getDelivery() == null) {
			...
		}
		for (OrderShipment orderShipment : order.getDelivery().getShipments()) {
			Shipment orderShipmentDetail = shipmentResource.getShipment(orderShipment.getId());
			...
		}
	}
}
```

## Referencias

- **[Shipment](../Models/Shipment/Shipment.md)**
- **[CustomerDocumentListParam](../Models/Document/CustomerDocumentListParam.md)**
- **[OrderResource](OrderResource.md)**
- **[OrderShipment](../Models/Order/OrderShipment.md)**
- **[OrderShipmentStatusType](../Enums/README.md#OrderShipmentStatusType)**: Enumerado
- **[RMAResource](RMAResource.md)**
- **[UserResource](UserResource.md)**
- **[PluginResourceException](PluginResourceException.md)**
