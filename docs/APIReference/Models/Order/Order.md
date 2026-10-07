# Order

## Descripción

Devuelve los datos de un pedido. *Order* llega como parámetro, nunca como *Resource*.
Extiende de **[Document](./Document.md)**

## Métodos

- **[OrderStatusType](../../Enums/README.md#OrderStatusType)** getStatus()
- **int** getSubstatusId()
- **[OrderTotalCurrency](./OrderTotalCurrency.md)** getTotalCurrency()

Propiedades opcionales (*disponibles desde la versión 2.8.5*). Solo las rellena
*[OrderResource](../../Resources/OrderResource.md)*: son *null* en los pedidos que reciben los hooks y en los que
construye un plugin.

- **Boolean** isTaxesIncluded(): *true* si los precios del pedido se muestran con impuestos incluidos (*showTaxesIncluded* del comercio, configurable por país y grupo de cuentas, para el país y el grupo de cuentas del pedido), como *isTaxesIncluded()* de *[BasketView](../Basket/BasketView.md)* en las cestas. Los importes de *getPurchaseCurrencyAmounts()* lo siguen.
- **[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)** getPurchaseCurrencyAmounts(): importes del pedido en su moneda de compra, en unidades menores, calculados por la plataforma a partir de los importes en la moneda de la sede con los valores de moneda guardados en el pedido.
- **List<[OrderRMA](OrderRMA.md)>** getRMAs(): devoluciones (RMA) del pedido, ordenadas por id; vacía si no tiene.
- **List<[OrderCreditNote](OrderCreditNote.md)>** getCreditNotes(): facturas rectificativas del pedido, ordenadas por id; vacía si no tiene. Sus importes están en *getCreditNotes()* de *getPurchaseCurrencyAmounts()*.
- **String** getPermalinkUrl(): página de pedido de invitado de la tienda (`<tienda>/orders/<id>?token=<token>`), construida por la plataforma, nunca a partir de la petición: `<tienda>` es la versión de la tienda que la resolución de rutas elige para el idioma del pedido y su país de envío (si no, el de facturación); si no coincide ninguna, la primera versión del idioma del pedido para cualquier país; si tampoco hay, la URL de la tienda configurada para el idioma del pedido.

## Referencias

- **[OrderTotalCurrency](OrderTotalCurrency.md)**
- **[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)**
- **[OrderRMA](OrderRMA.md)**
- **[OrderCreditNote](OrderCreditNote.md)**
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumeradoo

## Builder

**OrderSdkBuilder** devuelve **Order**.

Métodos del builder: (Extiende DocumentBuilder)

- status(OrderStatusType status): Añade estadp
- substatusId(int substatusId): Añade subestado.
- totalCurrency(): Añade total currency, utiliza OrderTotalCurrencyBuilder

