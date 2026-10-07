# OrderShipmentAmounts

## Descripción

Importes de envío de un envío del pedido en su moneda de compra (*getShipments()* de
*[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)*). Son unidades menores de la moneda de compra, con o
sin impuestos según *isTaxesIncluded()* de *[Order](Order.md)*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getShipmentId(): id del envío, como en *getId()* de *[OrderShipment](OrderShipment.md)*.
- **long** getShippingPrice(): precio de envío antes de sus descuentos, redondeado una vez.
- **List<[Allocation](../Basket/Allocation.md)>** getShippingDiscounts(): parte de cada descuento de envío que corresponde a este envío, una por descuento, redondeada una vez; nunca *null*.
