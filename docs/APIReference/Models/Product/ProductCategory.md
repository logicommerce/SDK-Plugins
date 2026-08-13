# ProductCategory

## Descripción

Categoría de un **[Product](Product.md)**.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getCategoryId(): identificador de la categoría en el proveedor.
- Map<**Integer**, **[Language](Language.md)**> getLanguages(): nombre y descripción de la categoría por idioma.

## Builder

**ProductCategoryBuilder** devuelve una implementación de **ProductCategory**. Se obtiene con `productCategory()` desde **ProductSdkBuilder**.

Métodos del builder:

- *categoryId(String categoryId)*: establece el identificador en el proveedor.
- *language(Integer languageId)*: inicia un **[Language](Language.md)** anidado; con `done()` se añade al mapa y se vuelve al builder.
- *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
- **[Language](Language.md)**
