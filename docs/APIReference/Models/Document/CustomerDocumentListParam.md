# CustomerDocumentListParam

## Descripción

Filtro para listar los documentos de un cliente con *getRMAs* de *[RMAResource](../../Resources/RMAResource.md)* y *getShipments* de *[ShipmentResource](../../Resources/ShipmentResource.md)*. Extiende *PaginationParam*. Se construye con *CustomerDocumentListParamBuilder*.

Los documentos se buscan por el **email guardado en el documento** (en los envíos, el de su pedido), no por la cuenta del cliente. Para los pedidos de una cuenta se usa *[OrderListParam](../Order/OrderListParam.md)* con *getOrders* de *[OrderResource](../../Resources/OrderResource.md)*.

*Disponible desde la versión 2.9.1.*

## Métodos

- **String** getEmail(): email del cliente. Obligatorio: si es `null` o está vacío, la lista es vacía.
- **LocalDateTime** getFromDate(): límite inferior inclusivo de la fecha; `null` para no filtrar.
- **LocalDateTime** getToDate(): límite superior inclusivo de la fecha; `null` para no filtrar.
- **int** getPage(): página, empezando en `1`. Por defecto `1`.
- **int** getPerPage(): documentos por página. Por defecto `25`, máximo `100`.

Tiene también los setters correspondientes (*setEmail*, *setFromDate*, *setToDate*, *setPage*, *setPerPage*).

## Cómo se aplica cada filtro

| Filtro | Devoluciones (*getRMAs*) | Envíos (*getShipments*) |
|---|---|---|
| *email* | Email del cliente de la devolución | Email del cliente del pedido del envío |
| *fromDate* / *toDate* | Fecha de la devolución (*getDate()* de *[RMA](../RMA/RMA.md)*) | Fecha del pedido (*getOrderDate()* de *[Shipment](../Shipment/Shipment.md)*) |
| Orden | De la devolución más reciente a la más antigua | Del pedido más reciente al más antiguo; dentro de un pedido, por id del envío |
| Qué cuenta *perPage* | Devoluciones | Envíos (los de un mismo pedido pueden quedar en páginas distintas) |

- **Email:** coincidencia exacta, sin los espacios del principio y del final. No es una búsqueda por prefijo como *search* de *OrderListParam*: `ana@tienda.com` no encuentra `ana@tienda.com.ar`. Se incluyen los documentos hechos con ese email aunque no estén ligados a una cuenta registrada.
- **Fechas:** son *LocalDateTime* sin zona horaria y se comparan con la fecha guardada en el documento. Se puede indicar solo una. Si *fromDate* es posterior a *toDate*, la lista es vacía (no se valida ni se lanza ninguna excepción).
- **Paginación:** los valores fuera de rango no lanzan ninguna excepción. Una página menor que `1` se trata como `1`; un tamaño menor que `1` como `25` y uno mayor que `100` como `100`.
- No hay total. Para saber si hay más páginas, pedir la siguiente o un único elemento más allá del final de la página actual (página `page * perPage + 1` con `perPage` `1`).

## Builder

*CustomerDocumentListParamBuilder* empieza en la página `1` con `25` documentos por página.

- **CustomerDocumentListParamBuilder** email(**String** email)
- **CustomerDocumentListParamBuilder** fromDate(**LocalDateTime** fromDate)
- **CustomerDocumentListParamBuilder** toDate(**LocalDateTime** toDate)
- **CustomerDocumentListParamBuilder** page(**int** page)
- **CustomerDocumentListParamBuilder** perPage(**int** perPage)
- **CustomerDocumentListParam** build()

```java
CustomerDocumentListParam param = new CustomerDocumentListParamBuilder()
	.email("ana@tienda.com")
	.fromDate(LocalDateTime.of(2026, 1, 1, 0, 0))
	.toDate(LocalDateTime.of(2026, 1, 31, 23, 59, 59))
	.page(1)
	.perPage(25)
	.build();

List<RMA> rmas = rmaResource.getRMAs(param);
List<Shipment> shipments = shipmentResource.getShipments(param);
```

## Referencias

- **[RMAResource](../../Resources/RMAResource.md)**
- **[ShipmentResource](../../Resources/ShipmentResource.md)**
- **[CustomerDocument](CustomerDocument.md)**
- **[OrderListParam](../Order/OrderListParam.md)**
