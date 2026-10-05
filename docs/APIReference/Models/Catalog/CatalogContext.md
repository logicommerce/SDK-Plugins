# CatalogContext

## Descripción

Contexto de las lecturas de *[CatalogResource](../../Resources/CatalogResource.md)*. La plataforma calcula precios y
filtra el catálogo exactamente como para una cesta de invitado con el mismo país, idioma, moneda y cliente, sin leer las
cabeceras de la petición ni la cesta de la petición.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getCountryCode(): país (visibilidad, precios e impuestos); *null* para el país por defecto. Un país que no es del comercio se sustituye por el país por defecto.
- **String** getLanguageCode(): idioma de nombres, descripciones y URLs, como código de idioma de LogiCommerce: el código ISO 639-1 en minúsculas (por ejemplo `es`); quien tenga una etiqueta BCP 47 pasa su subetiqueta principal. *null* para el idioma por defecto; un idioma que no es del comercio se sustituye por el idioma por defecto.
- **String** getCurrencyHint(): moneda preferida: los precios van en ella si está disponible para el país, si no en la moneda por defecto del país. Todos los *PriceView* de una llamada van en esa misma moneda, y la llevan.
- **[ClientInfo](../Basket/ClientInfo.md)** getClient(): cliente del comprador, usado como en *BasketResource* (el user agent y la IP que seleccionan el canal), para que el catálogo calcule precios como la cesta del comprador; nunca se trata como un bot. *null* si no se conoce.

## Builder

**CatalogContextBuilder** (`com.logicommerce.sdk.builders.catalog`) devuelve una implementación de **CatalogContext**.

Métodos del builder: countryCode, languageCode, currencyHint, client y *build()*.
