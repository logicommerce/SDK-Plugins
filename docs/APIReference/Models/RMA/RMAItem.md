# RMAItem

## Descripción

Línea devuelta de un *[RMA](RMA.md)*. Extiende *[DocumentItem](../Document/DocumentItem.md)*.

*Disponible desde la versión 2.9.1.*

## Métodos

De *[DocumentItem](../Document/DocumentItem.md)*:

- **int** getProductId(): id del producto devuelto.
- **String** getName(): nombre del producto guardado en la devolución.
- **String** getSku(): SKU de la combinación devuelta; *null* si no tiene.
- **int** getQuantity(): cantidad devuelta en esta línea.

Propios de la línea devuelta:

- **String** getReason(): descripción del motivo de devolución que eligió el cliente, tal como se guardó en la devolución; *null* si la línea no tiene motivo.
- **String** getReasonComment(): comentario que añadió el cliente al motivo; *null* si no tiene.

A diferencia de *[OrderRMAItem](../Order/OrderRMAItem.md)* (líneas del resumen de la devolución dentro del pedido), no trae el *hash* de la línea del pedido, sino los datos del producto.
