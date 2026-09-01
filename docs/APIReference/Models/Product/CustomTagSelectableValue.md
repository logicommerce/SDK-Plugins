# CustomTagSelectableValue

## Descripción

Opción seleccionable de un **[ProductCustomTag](ProductCustomTag.md)** de tipo selector o imagen (`SELECTOR`, `MULTIPLE_SELECTION`, `SINGLE_SELECTION_IMAGE`, `MULTIPLE_SELECTION_IMAGE`).

El valor (`getValue()`) es la clave neutra de idioma de la opción en el proveedor; LogiCommerce la usa para cotejar y reutilizar la misma opción entre idiomas y productos. La etiqueta visible se da por idioma con **[CustomTagSelectableValueLanguage](CustomTagSelectableValueLanguage.md)**, y la imagen (`getImage()`) solo aplica a los tipos imagen.

## Métodos

- **String** getValue(): clave neutra de idioma de la opción.
- **String** getImage(): URL de la imagen de la opción (tipos imagen); `null` en caso contrario.
- Map<**Integer**, **[CustomTagSelectableValueLanguage](CustomTagSelectableValueLanguage.md)**> getLanguages(): etiqueta de la opción por idioma.

## Builder

**CustomTagSelectableValueBuilder** devuelve una implementación de **CustomTagSelectableValue**. Se obtiene con `selectableValue()` desde **ProductCustomTagBuilder**.

Métodos del builder:

- *value(String value)*: establece la clave neutra de idioma.
- *image(String image)*: establece la URL de la imagen.
- *language(Integer languageId)*: inicia un **[CustomTagSelectableValueLanguage](CustomTagSelectableValueLanguage.md)** anidado; con `done()` se añade al mapa y se vuelve al builder.
- *build()* y *done()*.

## Referencias

- **[ProductCustomTag](ProductCustomTag.md)**
- **[CustomTagSelectableValueLanguage](CustomTagSelectableValueLanguage.md)**
- **[CustomTagType](../../Enums/README.md#CustomTagType)**
