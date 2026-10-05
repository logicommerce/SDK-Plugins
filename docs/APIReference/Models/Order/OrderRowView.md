# OrderRowView

## Descripción

Fila de un pedido (*getRows()* de *[OrderView](OrderView.md)*), con la misma forma que
*[BasketRowView](../Basket/BasketRowView.md)*. Importes en unidades menores de la moneda de compra, con o sin impuestos
según *isTaxesIncluded()* del pedido.

A diferencia del significado habitual en LogiCommerce de subtotal y total (sin y con impuestos), aquí *getSubtotal()* y
*getTotal()* son el importe de la fila antes y después de sus descuentos, los dos en el modo de impuestos del pedido.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getHash(): hash de la fila, copiado de la fila de la cesta.
- **int** getProductId(): id del producto; 0 para una fila *BUNDLE* (un pack no es un producto: se identifica con *getBundleId()*). Una fila *VOUCHER_PURCHASE* es el producto vale de saldo.
- **List<Integer>** getOptionValueIds(): ids de los valores de opciones combinables, ordenados por id de opción.
- **CartItemType** getType(): tipo de fila: *PRODUCT*, *GIFT*, *BUNDLE*, *LINKED*, *VOUCHER_PURCHASE* o *SELECTABLE_GIFT*; nunca *BUNDLE_ITEM* (un pack es una sola fila *BUNDLE*).
- **Integer** getBundleId(): id del pack de una fila *BUNDLE*, o *null*.
- **String** getName()
- **String** getImageUrl(): o *null*.
- **long** getQuantity()
- **long** getUnitPrice(): redondeado una vez.
- **long** getSubtotal(): precio unitario por cantidad, antes de descuentos. No es el importe sin impuestos: sigue *isTaxesIncluded()* del pedido.
- **List<[Allocation](../Basket/Allocation.md)>** getDiscounts()
- **long** getTotal(): subtotal menos descuentos: el importe de la fila después de descuentos. No es el importe con impuestos: sigue *isTaxesIncluded()* del pedido.

## Referencias

- **[CartItemType](../../Enums/README.md#CartItemType)**: Enumerado
