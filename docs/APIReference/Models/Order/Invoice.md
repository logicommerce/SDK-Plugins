# Invoice

## Descripción

Devuelve los datos de un pedido. *Order* llega como parámetro, nunca como *Resource*.
Extiende de **[Document](./Document.md)**

## Métodos

- **String** getExternalInvoiceId();
- **void** setExternalInvoiceId(**String** externalInvoiceId);
- **String** getOriginalInvoiceId();
- **void** setOriginalInvoiceId(**String** originalInvoiceId);

## Referencias

- **[OrderTotalCurrency](OrderTotalCurrency.md)**
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumeradoo

## Builder

**OrderSdkBuilder** devuelve **Order**.

Métodos del builder: (Extiende DocumentBuilder)

- status(OrderStatusType status): Añade estadp
- substatusId(int substatusId): Añade subestado.
- totalCurrency(): Añade total currency, utiliza OrderTotalCurrencyBuilder

