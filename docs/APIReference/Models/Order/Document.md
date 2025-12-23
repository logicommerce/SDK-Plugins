# Order

## Descripción

Devuelve los datos de un pedido. *Order* llega como parámetro, nunca como *Resource*.

## Métodos

- **Integer** getId()
- **String** getPId()
- **List<[CustomTag](../CustomTag.md)>** getCustomTags()
- **List<[OrderItem](OrderItem.md)>** getItems()
- **[OrderDelivery](OrderDelivery.md)** getDelivery()
- **List<[OrderStatus](OrderStatus.md)>** getStatuses()
- **List<[OrderAdditionalInformation](OrderAdditionalInformation.md)>** getAdditionalInformation()
- **List<[ElementProperty](../ElementProperty.md)>**  getProperties()
- **void** addProperty([**ElementProperty**](../ElementProperty.md) property)
- **void** addProperty(**String** name, **String** value)
- **List<[OrderCurrency](OrderCurrency.md)>** getCurrencies()
- **[OrderInformation](OrderInformation.md)** getInformation()
- **[OrderPaymentSystem](OrderPaymentSystem.md)** getPaymentSystem()
- **List<[OrderTax](OrderTax.md)>** getTaxes()
- **[OrderTotal](OrderTotal.md)** getTotals()
- **[OrderUser](OrderUser.md)** getUser()
- **List<[OrderVoucher](OrderVoucher.md)>** getVouchers()
- **List<[OrderDiscount](OrderDiscount.md)>** getDiscounts()
- **String** getDocumentNumber()
- **String** getLanguageId()
- **LocalDateTime** getDate()
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)** getStatus()
- **int** getSubstatusId()
- **LocalDateTime** getDeliveryDate()
- **boolean** isPaid()
- **LocalDateTime** getPaymentDate()
- **String** getComment()
- **[ExportStatusType](../../Enums/README.md#ExportStatusType)** getExportStatus()
- **boolean** isReverseChargeVat()
- **[Headquarter](../Headquarter.md)** getHeadquarter()

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
- **[Headquarter](../Headquarter.md)**


## Builder

**OrderSdkBuilder** devuelve **Order**.

Métodos del builder:

- *comment(String comment)*: Añade comentario.
- *customTag()*: Añade customTag, utiliza CustomTagBuilder.
- language(): Añade languageId.
- user(): Añade usuario, utiliza OrderUserBuilder.
- totals(): Añade los totales, utiliza OrderTotalBuilder.
- voucher(): Añade vouchers, utiliza OrderVoucherBuilder.
- items(): Añade items, utiliza OrderItemBuilder.
- headquarter(): Añade sede de facturación.
