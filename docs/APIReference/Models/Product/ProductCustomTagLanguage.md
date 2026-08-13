# ProductCustomTagLanguage

## Descripción

Nombre y valor de un **[ProductCustomTag](ProductCustomTag.md)** en un idioma concreto.

Extiende **[Language](Language.md)**, por lo que también dispone de `getName()` y `getDescription()`.

*Disponible desde la versión 2.8.0.*

## Métodos

Heredados de **[Language](Language.md)**:

- **String** getName(): nombre del custom tag.
- **String** getDescription(): descripción del custom tag.

Propios:

- **String** getValue(): valor del custom tag para este producto.

## Builder

**ProductCustomTagLanguageBuilder** devuelve una implementación de **ProductCustomTagLanguage**. Se obtiene con `language(Integer languageId)` desde **ProductCustomTagBuilder**.

Métodos del builder: *name(String name)*, *description(String description)*, *value(String value)*, *build()* y *done()*.

## Referencias

- **[ProductCustomTag](ProductCustomTag.md)**
- **[Language](Language.md)**
