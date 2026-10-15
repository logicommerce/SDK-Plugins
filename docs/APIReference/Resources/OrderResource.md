# OrderResource

## Descripción

El recurso permite consultar los pedidos de la tienda. Se puede acceder a este recurso desde cualquier servicio. Es de solo lectura: no permite crear ni modificar pedidos.

Disponible desde la versión **2.8.5** del SDK.

## Métodos

- **List<[OrderList](../Models/Order/OrderList.md)>** getOrders(**[OrderListParam](../Models/Order/OrderListParam.md)** param) throws **[PluginResourceException](PluginResourceException.md)**
- **[Order](../Models/Order/Order.md)** getOrder(**int** orderId) throws **[PluginResourceException](PluginResourceException.md)**
- **[Order](../Models/Order/Order.md)** getOrder(**String** documentNumber) throws **[PluginResourceException](PluginResourceException.md)**

### getOrders

Devuelve una página de pedidos que cumplen los filtros de *[OrderListParam](../Models/Order/OrderListParam.md)*, ordenados del más reciente al más antiguo.

- Los filtros que se dejan a `null` (o la lista de estados vacía) no filtran.
- La paginación empieza en la página `1` y por defecto devuelve `25` pedidos por página.
- Si `param` es `null` devuelve una lista vacía.
- Cada elemento es un *[OrderList](../Models/Order/OrderList.md)*, una versión resumida del pedido (cabecera, cliente, método de pago, totales y monedas). Para obtener el detalle completo de un pedido usar *getOrder*.

### getOrder(int orderId)

Devuelve el pedido completo con el id indicado, o `null` si no existe.

### getOrder(String documentNumber)

Devuelve el pedido completo con el número de documento indicado, o `null` si no existe o el número está vacío.

## Ejemplo

```java
public class MyService implements DataService {

	@Resource
	private OrderResource orderResource;

	public void process() throws PluginResourceException {
		OrderListParam param = new OrderListParamBuilder()
			.userId(15)
			.addStatus(OrderStatusType.COMPLETED)
			.page(1)
			.perPage(50)
			.build();
		List<OrderList> orders = orderResource.getOrders(param);

		for (OrderList orderList : orders) {
			Order order = orderResource.getOrder(orderList.getId());
			...
		}

		Order order = orderResource.getOrder("ORD-000123");
		if (order == null) {
			...
		}
	}
}
```

## Referencias

- **[Order](../Models/Order/Order.md)**
- **[OrderList](../Models/Order/OrderList.md)**
- **[OrderListParam](../Models/Order/OrderListParam.md)**
- **[PluginResourceException](PluginResourceException.md)**
