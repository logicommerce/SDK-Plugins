# RowQuantity

## Descripción

Cantidad de una fila del pedido en un envío o en una devolución.

Las cantidades se cuentan por fila del pedido ([OrderRowView](OrderRowView.md)) dentro de un envío o de una devolución. Una fila de envío se asocia a su fila del pedido por el enlace de fila y, si no lo tiene, por hash; una fila de devolución, por hash; un hash que no corresponde a ninguna fila del pedido se informa tal cual. Una fila de lote (bundle) cuenta solo los lotes completos: para cada artículo del lote, su cantidad en ese envío o devolución dividida por la cantidad del artículo por lote (redondeando hacia abajo); el menor de esos valores, como máximo la cantidad del lote. Un lote cuyos artículos se reparten entre varios envíos no cuenta en ninguno de ellos. Las filas sin cantidad se omiten.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getRowHash(): hash de la fila del pedido.
- **long** getQuantity()
