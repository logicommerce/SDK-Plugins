# CombinationView

## Descripción

Combinación de un producto (*getCombinations()* de *[ProductView](ProductView.md)*): en un producto con opciones
combinables, una de sus combinaciones activas formada por valores activos (una fila de combinación del producto o, si el
producto no tiene filas de combinación ni gestiona stock, una combinación de sus valores activos); en un producto sin
opciones combinables, el propio producto. Su id de producto y *getOptionValueIds()* son lo que pide un *RowChange*.

Una combinación *se puede pedir* cuando *[BasketResource](../../Resources/BasketResource.md)* la añade como fila (un
*RowChange* para ella no se rechaza como `ROW_NOT_BUYABLE`), es decir cuando *getStockStatus()* no es `NOT_ORDERABLE`.
Se decide por producto y contexto: la definición del producto es comprable (muestra su precio y su caja de pedido, está
activo y ha llegado su fecha de disponibilidad), el comercio muestra precios para el contexto y el producto no es una
compra de vale (un producto de vale de saldo). El stock no cuenta: una combinación sin stock se puede pedir y devuelve
`OUT_OF_STOCK`. Un producto que necesita personalización (*requiresNonCombinableOption()*) también puede tener
combinaciones que se pueden pedir en este sentido; se añade desde la tienda.

Los precios son los que calcularía la cesta para el mismo contexto, con o sin impuestos según
*ProductView.isTaxesIncluded()*. Todos los precios de una misma llamada a *CatalogResource* están en la misma moneda.

*Disponible desde la versión 2.8.5.*

## Métodos

- **List<Integer>** getOptionValueIds(): ids de los valores de opciones combinables, ordenados por id de opción; vacía sin opciones.
- **String** getSku(): SKU de la combinación, si no el del producto; *null* si no hay.
- **Map<String, String>** getBarcodes(): códigos de barras por estándar: claves `EAN`, `UPC`, `ISBN` y `JAN`, de la combinación o si no del producto; se omiten los vacíos.
- **[PriceView](PriceView.md)** getPrice(): precio de venta, o *null* si los precios del producto están ocultos para el contexto (ver *[ProductView](ProductView.md)*).
- **[PriceView](PriceView.md)** getPreviousPrice(): precio anterior: el precio antes de descuentos (para tacharlo), o *null* si no hay, es igual a *getPrice()* o no se muestran precios.
- **StockStatus** getStockStatus(): `NOT_ORDERABLE` si la combinación no se puede pedir; si no, según el stock y las definiciones de reserva y bajo pedido. Nunca *null*.

## Referencias

- **[StockStatus](../../Enums/README.md#StockStatus)**: Enumerado
