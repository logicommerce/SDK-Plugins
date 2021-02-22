# Order

## Descripción

Devuelve los datos de un pedido. *Order* llega como parámetro, nunca como *Resource*.

## Métodos

- **Integer** getId()
- **String** getPId()
- **List<[CustomTag](../CustomTag.md)>** getCustomTags()
- **List<[OrderItem](OrderItem.md)>** getItems()
- **List<[OrderShipment](OrderShipment.md)>** getShipments()
- **List<[OrderStatus](OrderStatus.md)>** getStatuses()
- **List<[OrderAdditionalInformation](OrderAdditionalInformation.md)>** getAdditionalInformation()
- **List<[OrderCurrency](OrderCurrency.md)>** getCurrencies()
- **[OrderInformation](OrderInformation.md)** getInformation()
- **[OrderPaymentSystem](OrderPaymentSystem.md)** getPaymentSystem()
- **List<[OrderTax](OrderTax.md)>** getTaxes()
- **[OrderTotal](OrderTotal.md)** getTotals()
- **[OrderUser](OrderUser.md)** getUser()
- **List<[OrderVoucher](OrderVoucher.md)>** getVouchers()
- **List<[OrderDiscount](OrderDiscount.md)>** getDiscounts()
- **String** getDocumentNumber()
- **String** getLanguage()
- **LocalDateTime** getDate()
- ***OrderStatusType*** getStatus()
- **int** getSubstatusId()
- **LocalDateTime** getDeliveryDate()
- **boolean** isPaid()
- **LocalDateTime** getPaymentDate()
- **String** getComment()
- ***ExportStatusType*** getExportStatus()
- **boolean** isReverseChargeVat()

## Referencias

- **[CustomTag](../CustomTag.md)**
- **[OrderItem](OrderItem.md)**
- **[OrderShipment](OrderShipment.md)**
- **[OrderStatus](OrderStatus.md)**
- **[OrderAdditionalInformation](OrderAdditionalInformation.md)**
- **[OrderCurrency](OrderCurrency.md)**
- **[OrderInformation](OrderInformation.md)**
- **[OrderPaymentSystem](OrderPaymentSystem.md)**
- **[OrderTax](OrderTax.md)**
- **[OrderTotal](OrderTotal.md)**
- **[OrderUser](OrderUser.md)**
- **[OrderVoucher](OrderVoucher.md)**
- **[OrderDiscount](OrderDiscount.md)**
- **OrderStatusType**: Enumerado
- **ExportStatusType**: Enumerado
