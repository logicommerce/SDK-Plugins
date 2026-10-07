# OrderItem

## Descripción

Elemento del pedido. Forma parte de Order en forma de lista.

## Métodos

- **Integer** getId()
- **String** getPId()
- **String** getHash()
- **String** getName()
- **int** getQuantity()
- **[OrderItemPrices](OrderItemPrices.md)** getPrices()
- **double** getWeight()
- **List<[OrderDiscount](OrderDiscount.md)>** getDiscounts()
- **List<[OrderItemTax](OrderItemTax.md)>** getTaxes()
- **List<[OrderItemOption](OrderItemOption.md)>** getOptions()
- **List<[OrderItemStock](OrderItemStock.md)>** getStocks()
- **List<[CustomTag](../CustomTag.md)>** getCustomTags()
- **Integer** getProductId()
- **Integer** getVinculatedTo()
- **String** getImage()
- **boolean** isSale()
- **boolean** isStockManagement()
- **boolean** isReverseChargeVat()
- **[ProductCodes](../ProductCodes.md)** getCodes()
- **boolean** isNoReturn()
- **[BackorderMode](../../Enums/README.md#BackorderMode)** getBackOrder()
- **boolean** isOnRequest()
- **int** getOnRequestDays()
- **String** getLink()
- **void** setProductId(**Integer** productId)
- **void** setCombinationId(**Integer** combinationId)
- **Integer** getCombinationId()
- **String** getSupplierReference()

Propiedades opcionales (*disponibles desde la versión 2.8.5*). Solo las rellena
*[OrderResource](../../Resources/OrderResource.md)*: son *null* en los pedidos que reciben los hooks y en los que
construye un plugin.

- **[CartItemType](../../Enums/README.md#CartItemType)** getType(): tipo de fila: *PRODUCT*, *GIFT*, *BUNDLE*, *LINKED*, *VOUCHER_PURCHASE* o *SELECTABLE_GIFT* para una fila del pedido; *BUNDLE_ITEM* para un elemento de *getBundleItems()*. Los elementos de un lote no son filas del pedido: un lote es una fila *BUNDLE*, cuyo *getProductId()* es el id del lote. Una fila *VOUCHER_PURCHASE* es el producto vale de saldo.
- **List<[OrderItem](OrderItem.md)>** getBundleItems(): elementos de una fila *BUNDLE*, ordenados por id; *null* para cualquier otro tipo de fila. Cada uno es un *OrderItem* de tipo *BUNDLE_ITEM* con su propio id y hash (a los que se refieren los elementos de envío y de devolución de sus unidades: *getOrderItemId()* y *getHash()* de *[OrderShipmentItem](OrderShipmentItem.md)*, *getHash()* de *[OrderRMAItem](OrderRMAItem.md)*) y con su cantidad en toda la fila: la cantidad de la fila del lote por la cantidad del elemento en cada lote. Su propio *getBundleItems()* es *null*.

## Referencias

- **[OrderItemPrices](OrderItemPrices.md)**
- **[OrderDiscount](OrderDiscount.md)**
- **[OrderItemTax](OrderItemTax.md)**
- **[OrderItemOption](OrderItemOption.md)**
- **[OrderItemStock](OrderItemStock.md)**
- **[CustomTag](../CustomTag.md)**
- **[ProductCodes](../ProductCodes.md)**
- **[BackorderMode](../../Enums/README.md#BackorderMode)**: Enumerado
- **[CartItemType](../../Enums/README.md#CartItemType)**: Enumerado
