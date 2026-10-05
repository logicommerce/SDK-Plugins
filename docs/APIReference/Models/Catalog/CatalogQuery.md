# CatalogQuery

## Descripción

Búsqueda en el catálogo. Los filtros *null* o vacíos no se aplican. La constante `MAX_PER_PAGE` (100) es el tamaño de página máximo. El builder valida la página; la plataforma la vuelve a validar sea cual sea la implementación, y una página o un tamaño fuera de rango hacen que *search* lance *IllegalArgumentException*. *CatalogQueryImpl* empieza con página 1 y tamaño 20, como el builder.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getText(): texto libre: la búsqueda de productos de la plataforma (nombres, palabras clave, SKU, EAN, marca), que un plugin *SearchProductsService* puede sustituir.
- **List<String>** getCategoryNamePaths(): categorías como rutas de nombres en el idioma del contexto, desde la raíz y unidos por `" > "` (`"Ropa > Camisas"`). Se comparan sin distinguir mayúsculas; un solo nombre encaja con todas las categorías con ese nombre; una ruta que no encaja con ninguna categoría no encaja con ningún producto.
- **Long** getFromPrice(): precio mínimo en unidades menores de *getPriceCurrencyCode()*. Un mínimo de 0 o menos no pone límite inferior.
- **Long** getToPrice(): precio máximo en unidades menores de *getPriceCurrencyCode()*. Un máximo de 0 o menos deja solo los productos gratuitos.
- **String** getPriceCurrencyCode(): moneda del filtro de precio (ISO 4217); si no se puede convertir a la moneda del catálogo, el filtro se ignora e *isPriceFilterIgnored()* de la página es *true*.
- **int** getPage(): página, desde 1.
- **int** getPerPage(): tamaño de página, de 1 a 100.

## Builder

**CatalogQueryBuilder** (`com.logicommerce.sdk.builders.catalog`) devuelve una implementación de **CatalogQuery**.

Métodos del builder: text, categoryNamePaths, fromPrice, toPrice, priceCurrencyCode, page (por defecto 1), perPage (por defecto 20) y *build()*. *build()* lanza *IllegalArgumentException* si la página o el tamaño están fuera de rango, o si una ruta de categoría es *null*.
