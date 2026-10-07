# OrderRMAItem

## Descripción

Cantidad devuelta de una fila del pedido (*getItems()* de *[OrderRMA](OrderRMA.md)*). La fila se identifica por su hash:
una fila del pedido (*getItems()* de *[Document](Document.md)*) o, para las unidades de un lote, un elemento de una fila
de lote (*getBundleItems()* de *[OrderItem](OrderItem.md)*), cuya cantidad devuelta cuenta unidades de ese elemento, no
lotes completos.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getHash(): hash de la fila devuelta, como en *getHash()* de *[OrderItem](OrderItem.md)*; puede no coincidir con ninguna fila del pedido.
- **int** getQuantity(): cantidad devuelta.
