# ProductView

## Descripción

Producto del catálogo tal como lo ve un invitado del país del contexto, en el idioma del contexto. Solo se devuelve si
tiene al menos una combinación (ver *[CombinationView](CombinationView.md)*), se pueda pedir o no: un producto visible
que no se puede pedir en el contexto (solo de catálogo, cuya fecha de disponibilidad aún no ha llegado, o una compra de
vale) se devuelve con todas sus combinaciones `NOT_ORDERABLE` y conserva sus precios.

**Precios ocultos.** Si los precios del producto están ocultos para el contexto, porque su propio `showPrice` está
desactivado o porque el ajuste `showPrice` del comercio lo está para el país y grupo de cuentas del contexto, la
plataforma devuelve igualmente el producto y lo indica con *getPriceRange()* a *null*; entonces *getPreviousPriceRange()*
y *getPrice()* y *getPreviousPrice()* de cada combinación también son *null*, y todas las combinaciones son
`NOT_ORDERABLE`. Al revés, si se muestran precios, *getPriceRange()* y el *getPrice()* de cada combinación nunca son
*null*, se pueda pedir o no el
producto. Quien no deba listar productos sin precio omite los que tienen *getPriceRange()* a *null*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId(): id del producto.
- **String** getName(): nombre.
- **String** getShortDescription(): descripción corta tal como se guarda (normalmente texto plano), o *null*.
- **String** getLongDescription(): descripción larga tal como se guarda (HTML), o *null*.
- **String** getUrlSeo(): slug propio del producto, o *null*.
- **String** getUrl(): URL absoluta de la página del producto en la tienda: la URL base de la tienda para el idioma y el país del contexto (calculada como *BasketView.getStoreBaseUrl()* para una cesta de ese idioma y país, sin barra final), seguida de `/` y la ruta SEO completa del producto en el idioma del contexto. Su ruta es por tanto válida bajo la URL base de una cesta con el mismo idioma y país. Es *null* si el comercio no tiene configurada ninguna URL de tienda absoluta (como *BasketView.getStoreBaseUrl()*).
- **List<String>** getImages(): URLs absolutas de las imágenes, la principal primero.
- **List<String>** getCategoryNamePaths(): categorías como rutas de nombres desde la raíz, unidos por `" > "`.
- **List<[OptionView](OptionView.md)>** getOptions(): opciones combinables con sus valores activos.
- **List<[CombinationView](CombinationView.md)>** getCombinations(): combinaciones, nunca vacía: *getProducts* devuelve todas, la destacada primero; *getProduct* todas, primero la que identifican los valores seleccionados; *search* la destacada primero y un número limitado de otras, así que el rango del producto sale de *getPriceRange()* y no de estas combinaciones.
- **[PriceRange](PriceRange.md)** getPriceRange(): precio (*getPrice()*) mínimo y máximo entre todas las combinaciones del producto, las liste o no *getCombinations()* (la plataforma lo calcula sobre todas, aunque una búsqueda limite la lista), en la moneda de los precios de las combinaciones; *null* si los precios del producto están ocultos para el contexto.
- **[PriceRange](PriceRange.md)** getPreviousPriceRange(): precio antes de descuentos mínimo y máximo entre todas las combinaciones, para tacharlo: cada combinación aporta su *getPreviousPrice()*, o su *getPrice()* si no tiene precio anterior; *null* si ninguna combinación tiene precio anterior o los precios del producto están ocultos para el contexto.
- **boolean** isTaxesIncluded(): *true* si los precios incluyen impuestos para el país del contexto.
- **boolean** requiresNonCombinableOption(): *true* si el producto tiene una opción obligatoria no combinable (una personalización: texto, fecha, booleano, adjunto, selección múltiple...). Ese producto no se puede añadir con *BasketResource*: el comprador lo añade en la tienda.
