# CustomTagSelectableValueLanguage

## Descripción

Etiqueta de un **[CustomTagSelectableValue](CustomTagSelectableValue.md)** en un idioma concreto.

Extiende **[Language](Language.md)**, por lo que la etiqueta visible de la opción se obtiene con `getName()`.

## Métodos

Heredados de **[Language](Language.md)**:

- **String** getName(): etiqueta de la opción.
- **String** getDescription(): descripción de la opción.

## Builder

**CustomTagSelectableValueLanguageBuilder** devuelve una implementación de **CustomTagSelectableValueLanguage**. Se obtiene con `language(Integer languageId)` desde **CustomTagSelectableValueBuilder**.

Métodos del builder: *name(String name)*, *build()* y *done()*.

## Referencias

- **[CustomTagSelectableValue](CustomTagSelectableValue.md)**
- **[Language](Language.md)**
