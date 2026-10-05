# OrderResource

Recurso para leer pedidos del comercio a partir de su id, desde cualquier petición del plugin, incluido el consumidor de
colas.

*Disponible desde la versión 2.8.5.*

```java

@Resource
private OrderResource orderResource;

```

## Métodos disponibles

- OrderView getOrder(int orderId): Lee un pedido, sea cual sea su estado
  (*[OrderView](../Models/Order/OrderView.md)*). Devuelve *null* solo cuando el comercio no tiene ningún pedido con ese
  id (también si la fila del pedido se ha eliminado). Cualquier otro fallo (el pedido no se puede leer o convertir)
  lanza *[PluginResourceException](PluginResourceException.md)*, de forma que quien llama nunca confunde un fallo con un
  pedido inexistente.

Los importes de *OrderView* son enteros en unidades menores de la moneda de compra del pedido, convertidos desde la
moneda de la sede con los valores de moneda guardados en el pedido.
