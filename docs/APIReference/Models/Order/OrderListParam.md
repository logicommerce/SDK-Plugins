# OrderListParam

## Descripción

Filtros y paginación para listar pedidos con *[OrderResource](../../Resources/OrderResource.md)*.getOrders(). Los filtros que se dejan a `null` (o la lista de estados vacía) no se aplican. Extiende de *PaginationParam*.

Disponible desde la versión **2.8.5** del SDK.

## Métodos

- **int** getPage(): Página a devolver, empieza en `1`. Por defecto `1`.
- **int** getPerPage(): Pedidos por página. Por defecto `25`.
- **Integer** getId(): Id del pedido.
- **String** getPId(): pId del pedido.
- **Integer** getUserId(): Id del usuario propietario de los pedidos.
- **String** getSearch(): Texto de búsqueda. Actualmente se compara con el email del cliente.
- **List<[OrderStatusType](../../Enums/README.md#OrderStatusType)>** getStatuses(): Estados por los que filtrar. Si contiene varios, devuelve los pedidos que estén en cualquiera de ellos.

Cada getter tiene su setter correspondiente.

## Referencias

- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumerado

## Builder

**OrderListParamBuilder** devuelve **OrderListParam**.

Métodos del builder:

- page(int page): Página, empieza en 1.
- perPage(int perPage): Pedidos por página.
- id(Integer id): Filtra por id de pedido.
- pId(String pId): Filtra por pId.
- userId(Integer userId): Filtra por usuario propietario.
- search(String search): Texto de búsqueda (email del cliente).
- statuses(List<OrderStatusType> statuses): Sustituye la lista de estados.
- addStatus(OrderStatusType status): Añade un estado a la lista.
- build(): Devuelve el **OrderListParam**.

```java
OrderListParam param = new OrderListParamBuilder()
	.search("customer@example.com")
	.addStatus(OrderStatusType.INCOMING)
	.addStatus(OrderStatusType.IN_PROCESS)
	.perPage(10)
	.build();
```
