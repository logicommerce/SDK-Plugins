# BasketRowView

## Descripción

Fila de una cesta (*getRows()* de *[BasketView](BasketView.md)*).

Importes en unidades menores de la moneda de la *[BasketView](BasketView.md)*, con o sin impuestos según
*isTaxesIncluded()*. Los descuentos son magnitudes no negativas: `getTotal() == getSubtotal() - suma(getDiscounts().amount)`.

A diferencia del significado habitual en LogiCommerce de subtotal y total (sin y con impuestos, como en
*[CartItem](../CartItem.md)*), aquí *getSubtotal()* y *getTotal()* son el importe de la fila antes y después de sus
descuentos, los dos en el modo de impuestos de la vista.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getHash(): hash de la fila: se calcula a partir del producto y sus opciones, no depende de la cantidad, es estable entre recálculos y se copia a las filas del pedido.
- **int** getProductId(): id del producto; 0 para una fila *BUNDLE* (un pack no es un producto: se identifica con *getBundleId()*). Una fila *VOUCHER_PURCHASE* es el producto vale de saldo.
- **List<Integer>** getOptionValueIds(): ids de los valores de opciones combinables, ordenados por id de opción; vacía si el producto no tiene opciones combinables.
- **CartItemType** getType(): tipo de fila: *PRODUCT*, *GIFT*, *BUNDLE*, *LINKED*, *VOUCHER_PURCHASE* o *SELECTABLE_GIFT*. Los artículos de un pack no son filas propias: un pack es una sola fila *BUNDLE*, así que nunca devuelve *BUNDLE_ITEM*.
- **Integer** getBundleId(): id del pack de una fila *BUNDLE*, o *null*.
- **String** getName(): nombre de la fila en el idioma de la cesta.
- **String** getImageUrl(): URL de la primera imagen, o *null*.
- **long** getQuantity(): cantidad. La plataforma nunca la corrige: los límites de cantidad y de stock se informan como avisos.
- **long** getUnitPrice(): precio unitario, redondeado una vez. Un regalo automático (*GIFT*) lleva el precio real del producto y un reparto de descuento del mismo importe.
- **long** getSubtotal(): precio unitario por cantidad, antes de descuentos. No es el importe sin impuestos: sigue *isTaxesIncluded()* de la cesta.
- **List<[Allocation](Allocation.md)>** getDiscounts(): parte de cada descuento que se aplica a la fila, redondeada una vez.
- **long** getTotal(): subtotal menos los descuentos de la fila: el importe de la fila después de descuentos. No es el importe con impuestos: sigue *isTaxesIncluded()* de la cesta.

## Referencias

- **[CartItemType](../../Enums/README.md#CartItemType)**: Enumerado
