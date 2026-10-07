# TotalsView

## Descripción

Totales de una cesta (*getTotals()* de *[BasketView](BasketView.md)*) o de un pedido (*getTotals()* de
*[OrderPurchaseCurrencyAmounts](../Order/OrderPurchaseCurrencyAmounts.md)*; en un pedido, la vista son sus importes en
la moneda de compra, en el modo de impuestos de *isTaxesIncluded()* de *[Order](../Order/Order.md)*). Todos los importes son magnitudes no negativas en unidades menores y cada total es
la suma de partes redondeadas:

```
subtotal      = suma de los subtotales de las filas
rowsDiscount  = suma de los descuentos de las filas
total         = subtotal - rowsDiscount + delivery - discount + paymentSystem + tax - vouchers
```

A diferencia del significado habitual en LogiCommerce de subtotal y total (sin y con impuestos, como en
*[CartTotals](../CartTotals.md)*), aquí *getSubtotal()* es el importe de las filas antes de descuentos, en el modo de
impuestos de la vista (con impuestos si los precios de la vista los incluyen), y *getTotal()* es el importe a pagar
después de todos los descuentos.

*Disponible desde la versión 2.8.5.*

## Métodos

- **long** getSubtotal(): suma de los subtotales de las filas: el importe de las filas antes de descuentos. No es el importe sin impuestos: sigue el modo de impuestos de la vista.
- **long** getRowsDiscount(): suma de los descuentos de fila.
- **long** getDelivery(): precio del envío antes de sus descuentos; en una cesta solo se conoce si la plataforma ya ha seleccionado un envío, y es una estimación; en un pedido es la suma de los precios de envío de los envíos más el precio de recogida. 0 si no hay envío seleccionado (o es gratuito: ver *isDeliverySelected()*).
- **boolean** isDeliverySelected(): *true* si hay un envío seleccionado, lo que distingue un envío gratuito seleccionado de ningún envío cuando *getDelivery()* es 0. En una cesta, si la plataforma ya ha seleccionado un envío; en un pedido, si tiene al menos un envío con tipo de envío o es un pedido de recogida.
- **long** getDiscount(): descuentos de cesta y de envío.
- **long** getPaymentSystem(): recargo del sistema de pago; 0 si no hay.
- **long** getTax(): suma de los impuestos añadidos a precios sin impuestos; siempre 0 si los precios incluyen impuestos.
- **long** getVouchers(): importe pagado con vales de saldo, que se descuenta después del total como un pago; 0 si no hay.
- **long** getTotal(): importe a pagar, después de todos los descuentos (ver la fórmula).
- **List<[AppliedTaxView](AppliedTaxView.md)>** getAppliedTaxes(): impuestos, uno por impuesto y tipo: sin impuestos incluidos suman *getTax()*; con impuestos incluidos son los impuestos incluidos en el total (y no se suman).
