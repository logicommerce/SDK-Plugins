# Allocation

## Descripción

Parte de un descuento que corresponde a una fila (vista desde la fila: *getDiscounts()* de
*[BasketRowView](BasketRowView.md)* y de *[OrderItemAmounts](../Order/OrderItemAmounts.md)*) o, en los envíos de un
pedido, a un envío (*getShippingDiscounts()* de *[OrderShipmentAmounts](../Order/OrderShipmentAmounts.md)*). El importe se redondea una vez y es la unidad con la que se suman todos los totales de descuento, así que los
repartos de un descuento suman exactamente su importe.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getDiscountId(): id del descuento.
- **long** getAmount(): importe descontado, no negativo, en unidades menores.
