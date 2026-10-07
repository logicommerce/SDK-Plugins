# OrderResource

Recurso para leer los pedidos del comercio, desde cualquier petición del plugin, incluido el consumidor de colas.

*Disponible desde la versión 2.8.5.*

```java

@Resource
private OrderResource orderResource;

```

## Métodos disponibles

- List<OrderList> getOrders(OrderListParam param): Devuelve una página de pedidos que cumplen los filtros de *param*
  (`com.logicommerce.sdk.models.order.list`). Lanza *[PluginResourceException](PluginResourceException.md)* si falla.
- *[Order](../Models/Order/Order.md)* getOrder(int orderId): Lee el pedido con ese id, sea cual sea su estado.
- *[Order](../Models/Order/Order.md)* getOrder(String documentNumber): Lee el pedido con ese número de documento, sea
  cual sea su estado.

Los dos *getOrder* devuelven *null* solo cuando el comercio no tiene ningún pedido con ese id o número de documento (no
existe o pertenece a otro comercio). Cualquier otro fallo (el pedido no se puede leer o convertir) lanza
*[PluginResourceException](PluginResourceException.md)*, de forma que quien llama nunca confunde un fallo con un pedido
inexistente.

Cada llamada devuelve un *Order* nuevo, leído de la base de datos, nunca la instancia que recibe un hook. Además de los
datos que recibe un hook, ese pedido incluye las propiedades que solo rellena este recurso (en los pedidos que reciben
los hooks y en los que construye un plugin son *null*):

- *[Order](../Models/Order/Order.md)*: *isTaxesIncluded()*, *getPurchaseCurrencyAmounts()* (los importes en unidades
  menores de la moneda de compra, ver *[OrderPurchaseCurrencyAmounts](../Models/Order/OrderPurchaseCurrencyAmounts.md)*),
  *getRMAs()*, *getCreditNotes()* y *getPermalinkUrl()*.
- *[OrderItem](../Models/Order/OrderItem.md)*: *getType()* y *getBundleItems()*.
- *[OrderBaseStatus](../Models/Order/OrderBaseStatus.md)*: *getFromStatus()*.
- *[OrderShipmentItem](../Models/Order/OrderShipmentItem.md)*: *getHash()*.

Las propiedades guardadas en el pedido (*getAdditionalInformation()* de *[Document](../Models/Order/Document.md)*) son
las de todos los plugins, sin filtrar: no se expone qué plugin añadió cada una, así que un plugin no debe suponer que un
valor guardado con uno de sus nombres de propiedad lo añadió él. Añadir una propiedad al pedido devuelto (*addProperty*)
no guarda nada.
