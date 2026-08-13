# ProductLanguage

## Descripción

Textos de un **[Product](Product.md)** en un idioma concreto. Se obtienen del mapa `getLanguages()` del producto, indexado por identificador de idioma de LogiCommerce.

Extiende **[Language](Language.md)**, por lo que también dispone de `getName()` y `getDescription()`.

*Disponible desde la versión 2.8.0.*

> :warning: No confundir con **[ProductLanguage](../ProductLanguage.md)** (`com.logicommerce.sdk.models.ProductLanguage`). Este vive en el paquete `com.logicommerce.sdk.models.product`.

## Métodos

Heredados de **[Language](Language.md)**:

- **String** getName(): nombre del producto.
- **String** getDescription(): descripción corta.

Propios:

- **String** getLongDescription(): descripción larga.

## Builder

**ProductLanguageBuilder** devuelve una implementación de **ProductLanguage**. Se obtiene con `language(Integer languageId)` desde **ProductSdkBuilder**.

Métodos del builder: *name(String name)*, *description(String description)*, *longDescription(String longDescription)*, *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
- **[Language](Language.md)**
