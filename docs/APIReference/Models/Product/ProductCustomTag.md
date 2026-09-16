# ProductCustomTag

## Descripción

Custom tag de un **[Product](Product.md)**: una característica del producto (peso, color, potencia…) con su valor traducible.

LogiCommerce coteja cada custom tag recibido contra los que ya existen en el comercio (por identificador, por nombre y por grupo) y crea los que falten.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getId(): identificador del custom tag en el proveedor.
- **[CustomTagType](../../Enums/README.md#CustomTagType)** getType(): tipo de dato (`BOOLEAN`, `NUMBER`, `SHORT_TEXT`, `LONG_TEXT`, `SELECTOR`, `MULTIPLE_SELECTION`, `SINGLE_SELECTION_IMAGE`, `MULTIPLE_SELECTION_IMAGE`, `LINK`).
- **[CustomTagGroup](CustomTagGroup.md)** getCustomTagGroup(): grupo al que pertenece.
- Map<**Integer**, **[ProductCustomTagLanguage](ProductCustomTagLanguage.md)**> getLanguages(): nombre y valor por idioma.
- List<**[CustomTagSelectableValue](CustomTagSelectableValue.md)**> getSelectableValues(): opciones seleccionables, para los tipos selector e imagen (`SELECTOR`, `MULTIPLE_SELECTION`, `SINGLE_SELECTION_IMAGE`, `MULTIPLE_SELECTION_IMAGE`).
- **boolean** isFiltrable(): indica si debe poder usarse como filtro en el listado.
- **boolean** isSearchable(): indica si su valor debe indexarse para la búsqueda.

## Builder

**ProductCustomTagBuilder** devuelve una implementación de **ProductCustomTag**. Se obtiene con `customTag()` desde **ProductSdkBuilder**.

Métodos del builder:

- *id(String id)*: establece el identificador en el proveedor.
- *type(CustomTagType type)*: establece el tipo de dato.
- *filtrable(boolean filtrable)*: marca el custom tag como filtrable.
- *searchable(boolean searchable)*: marca el custom tag como buscable.
- *customTagGroup()*: inicia un **[CustomTagGroup](CustomTagGroup.md)** anidado; con `done()` se vuelve al builder.
- *language(Integer languageId)*: inicia un **[ProductCustomTagLanguage](ProductCustomTagLanguage.md)** anidado; con `done()` se añade al mapa y se vuelve al builder.
- *selectableValue()*: inicia un **[CustomTagSelectableValue](CustomTagSelectableValue.md)** anidado y lo añade a la lista; con `done()` se vuelve al builder.
- *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
- **[ProductCustomTagLanguage](ProductCustomTagLanguage.md)**
- **[CustomTagSelectableValue](CustomTagSelectableValue.md)**
- **[CustomTagGroup](CustomTagGroup.md)**
- **[CustomTagType](../../Enums/README.md#CustomTagType)**
