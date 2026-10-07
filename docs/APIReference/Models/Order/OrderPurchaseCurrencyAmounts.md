# OrderPurchaseCurrencyAmounts

## Descripción

Importes de un pedido en su moneda de compra (*getPurchaseCurrencyAmounts()* de *[Order](Order.md)*). Solo los rellena
*[OrderResource](../../Resources/OrderResource.md)*.

Los importes de *Order* son valores sin redondear en la moneda de la sede. Estos son los mismos importes como enteros en
unidades menores de la moneda de compra (*getCurrencyCode()*), convertidos por la plataforma con los valores de moneda
guardados en el pedido y redondeados como en las cestas: cada precio unitario y cada reparto de descuento una vez, y
cada total como la suma de sus partes redondeadas (ver *[TotalsView](../Basket/TotalsView.md)*). Van con o sin
impuestos según *isTaxesIncluded()* de *Order*, y el total es el importe que cobró la plataforma. Las listas nunca son
*null*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getCurrencyCode(): moneda de compra del pedido (ISO 4217, en mayúsculas), la de todos los importes.
- **List<[OrderItemAmounts](OrderItemAmounts.md)>** getItems(): importes de las filas, uno por fila de *getItems()* de *[Document](Document.md)*, emparejados por *getHash()*. Los elementos de un lote (*getBundleItems()* de *[OrderItem](OrderItem.md)*) no tienen entrada propia: la de la fila del lote los cubre.
- **List<[AppliedDiscountView](../Basket/AppliedDiscountView.md)>** getDiscounts(): descuentos aplicados, uno por descuento. El hash de fila de un reparto (*getRowHash()* de *[RowAllocation](../Basket/RowAllocation.md)*) se refiere a *getHash()* de *OrderItemAmounts*.
- **[TotalsView](../Basket/TotalsView.md)** getTotals(): totales; nunca *null*. El total de envío es la suma de los precios de envío de los envíos más el precio de recogida, y un pedido de recogida (`PICKING`) cuenta como envío seleccionado (*isDeliverySelected()*).
- **List<[OrderShipmentAmounts](OrderShipmentAmounts.md)>** getShipments(): importes de envío, uno por envío de *getShipments()* de *[OrderDelivery](OrderDelivery.md)*, emparejados por *getShipmentId()* y ordenados por él.
- **List<[OrderCreditNoteAmounts](OrderCreditNoteAmounts.md)>** getCreditNotes(): importes de las facturas rectificativas, uno por factura de *getCreditNotes()* de *Order*, emparejados por *getCreditNoteId()* y ordenados por él.
