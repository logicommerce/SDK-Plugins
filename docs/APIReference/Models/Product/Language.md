# Language

## Descripción

Textos traducibles comunes a varios modelos del paquete de producto. Es la interfaz base de **[ProductLanguage](ProductLanguage.md)** y **[ProductCustomTagLanguage](ProductCustomTagLanguage.md)**, y se usa directamente en **[ProductBrand](ProductBrand.md)**, **[ProductCategory](ProductCategory.md)** y **[CustomTagGroup](CustomTagGroup.md)**.

Siempre aparece dentro de un mapa indexado por el identificador de idioma de LogiCommerce.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getName(): nombre en ese idioma.
- **String** getDescription(): descripción en ese idioma.

## Builder

**LanguageBuilder** devuelve una implementación de **Language**. Se obtiene con `language(Integer languageId)` desde el builder del modelo que lo contiene.

Métodos del builder: *name(String name)*, *description(String description)*, *build()* y *done()*.

## Referencias

- **[ProductLanguage](ProductLanguage.md)**
- **[ProductCustomTagLanguage](ProductCustomTagLanguage.md)**
