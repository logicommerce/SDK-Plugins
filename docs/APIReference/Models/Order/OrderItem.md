# OrderItem

## Descripción

Elemento del pedido. Forma parte de Order en forma de lista.

## Métodos

- **Integer** getId()
- **String** getPId()
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
- **double** getAffiliatePercentCommission()
- **Integer** getVinculatedTo()
- **String** getImage()
- **boolean** isSale()
- **boolean** isStockManagement()
- **boolean** isReverseChargeVat()
- **[ProductCodes](../ProductCodes.md)** getCodes()
- **boolean** isNoReturn()
- ***BackorderMode*** getBackOrder()
- **boolean** isOnRequest()
- **int** getOnRequestDays()

## Referencias

- **[OrderItemPrices](OrderItemPrices.md)**
- **[OrderDiscount](OrderDiscount.md)**
- **[OrderItemTax](OrderItemTax.md)**
- **[OrderItemOption](OrderItemOption.md)**
- **[OrderItemStock](OrderItemStock.md)**
- **[CustomTag](../CustomTag.md)**
- **[ProductCodes](../ProductCodes.md)**
- **BackorderMode**: Enumerado
