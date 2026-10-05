# BasketContext

## Descripción

Contexto en el que se crea una cesta con *create*. Sustituye lo que la plataforma tomaría de las cabeceras y cookies de la petición.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getCountryCode(): país de navegación (ISO 3166-1 alfa-2); *null* para el país por defecto. Un país que no es del comercio se sustituye por el país por defecto y se informa como un rechazo *COUNTRY*.
- **String** getLanguageCode(): idioma, como código de idioma de LogiCommerce: ISO 639-1 en minúsculas (por ejemplo `es`); quien tenga una etiqueta BCP 47 pasa su subetiqueta principal. *null* para el idioma por defecto. Un idioma que no es del comercio se sustituye por el idioma por defecto.
- **String** getCurrencyHint(): moneda preferida (ISO 4217), solo una sugerencia: la moneda se escoge entre las disponibles para el país que acepta la sede (la sugerida si es una de ellas); si no lo es se informa como un rechazo *CURRENCY*. *null* sin preferencia.
- **[ClientInfo](ClientInfo.md)** getClient(): cliente del comprador, o *null*.

## Builder

**BasketContextBuilder** (`com.logicommerce.sdk.builders.basket`) devuelve una implementación de **BasketContext**.

Métodos del builder: countryCode, languageCode, currencyHint, client y *build()*.
