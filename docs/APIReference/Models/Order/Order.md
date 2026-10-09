# Order

## Descripción

Devuelve los datos de un pedido. *Order* llega como parámetro en los servicios de pedido, y también se puede consultar con *[OrderResource](../../Resources/OrderResource.md)*.
Extiende de **[Document](./Document.md)**

## Métodos

- **[OrderStatusType](../../Enums/README.md#OrderStatusType)** getStatus()
- **int** getSubstatusId()
- **[OrderTotalCurrency](./OrderTotalCurrency.md)** getTotalCurrency()

## Referencias

- **[OrderTotalCurrency](OrderTotalCurrency.md)**
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumeradoo

## Builder

**OrderSdkBuilder** devuelve **Order**.

Métodos del builder: (Extiende DocumentBuilder)

- status(OrderStatusType status): Añade estadp
- substatusId(int substatusId): Añade subestado.
- totalCurrency(): Añade total currency, utiliza OrderTotalCurrencyBuilder

