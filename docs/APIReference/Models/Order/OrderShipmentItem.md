# OrderShipmentItem

## Descripción

Mostrar los elementos asignados a la expedición con su cantidad.

## Métodos

- **Integer** getId()
- **int** getQuantity()
- **Integer** getOrderItemId()
- **double** getWeight()
- **String** getName(): nombre del elemento enviado, tal como está guardado en la expedición; *null* si no está disponible. Método *default* desde la versión 2.9.0 (abstracto en la 2.8.5): las implementaciones anteriores a la 2.8.5 no lo sobrescriben y devuelven *null*. *Disponible desde la versión 2.8.5.*
- **String** getHash(): hash de la fila del pedido que envía este elemento: el *getHash()* de una fila del pedido o de un elemento de una fila de lote (*getBundleItems()* de *[OrderItem](OrderItem.md)*). Sirve para encontrar esa fila cuando *getOrderItemId()* es *null* o no coincide con ninguna fila; *null* si la plataforma no guardó ninguno. *Disponible desde la versión 2.9.0.* Solo lo rellena *[OrderResource](../../Resources/OrderResource.md)*: *null* en los pedidos que reciben los hooks y en los que construye un plugin.
