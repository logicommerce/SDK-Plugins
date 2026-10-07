# OrderItemAmounts

## Descripción

Importes de una fila del pedido en su moneda de compra (*getItems()* de
*[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)*). Son unidades menores de la moneda de compra, con o
sin impuestos según *isTaxesIncluded()* de *[Order](Order.md)*. Los descuentos son magnitudes no negativas, así que
`getTotal() == getSubtotal() - suma(getDiscounts().amount)`.

A diferencia del significado habitual en LogiCommerce de subtotal y total (sin y con impuestos, como en
*[OrderItemPrices](OrderItemPrices.md)*), aquí *getSubtotal()* y *getTotal()* son el importe de la fila antes y después
de sus descuentos, ambos en el modo de impuestos del pedido.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getHash(): hash de la fila, como en *getHash()* de *[OrderItem](OrderItem.md)*.
- **long** getUnitPrice(): precio unitario, redondeado una vez.
- **long** getSubtotal(): precio unitario por la cantidad de la fila, antes de descuentos. No es el importe sin impuestos: sigue *isTaxesIncluded()*.
- **List<[Allocation](../Basket/Allocation.md)>** getDiscounts(): parte de cada descuento que corresponde a la fila, una por descuento, redondeada una vez; nunca *null*.
- **long** getTotal(): el subtotal menos los descuentos de la fila: el importe después de descuentos. No es el importe con impuestos: sigue *isTaxesIncluded()*.
