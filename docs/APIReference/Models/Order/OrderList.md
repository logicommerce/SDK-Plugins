# OrderList

## Descripción

Versión resumida de un pedido, tal como se devuelve en los listados de *[OrderResource](../../Resources/OrderResource.md)*.getOrders(). Para obtener el pedido completo usar *[OrderResource](../../Resources/OrderResource.md)*.getOrder().

Disponible desde la versión **2.8.5** del SDK.

## Métodos

- **Integer** getId()
- **String** getPId()
- **int** getCommerceId()
- **int** getChannelId()
- **int** getLanguageId()
- **Integer** getHeadquarterId()
- **Integer** getMarketplaceId()
- **Integer** getOwnerAccountId()
- **Integer** getDocumentId()
- **String** getDocumentNumber()
- **int** getDocumentIdLength()
- **String** getPrefix()
- **String** getSuffix()
- **LocalDateTime** getDate()
- **LocalDateTime** getDeliveryDate()
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)** getStatus()
- **Integer** getSubstatusId()
- **[ExportStatusType](../../Enums/README.md#ExportStatusType)** getExportStatus()
- **double** getTotal()
- **List<[OrderCurrency](OrderCurrency.md)>** getCurrencies()
- **boolean** isPaid()
- **LocalDateTime** getPaymentDate()
- **String** getTransactionId()
- **String** getAuthNumber()
- **[OrderListPaymentSystem](OrderListPaymentSystem.md)** getPaymentSystem()
- **[OrderListCustomer](OrderListCustomer.md)** getCustomer()

## Referencias

- **[OrderCurrency](OrderCurrency.md)**
- **[OrderListPaymentSystem](OrderListPaymentSystem.md)**
- **[OrderListCustomer](OrderListCustomer.md)**
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumerado
- **[ExportStatusType](../../Enums/README.md#ExportStatusType)**: Enumerado
