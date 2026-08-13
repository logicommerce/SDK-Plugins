# ProductBrand

## Descripción

Marca de un **[Product](Product.md)**.

LogiCommerce la resuelve por identificador o por nombre y, si no existe en el comercio, la **crea automáticamente** con los idiomas recibidos.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getBrandId(): identificador de la marca en el proveedor.
- Map<**Integer**, **[Language](Language.md)**> getLanguages(): nombre y descripción de la marca por idioma.

Si tanto el identificador como el nombre vienen vacíos, el producto se importa sin marca.

## Builder

**ProductBrandBuilder** devuelve una implementación de **ProductBrand**. Se obtiene con `productBrand()` desde **ProductSdkBuilder**.

Métodos del builder:

- *brandId(String brandId)*: establece el identificador en el proveedor.
- *language(Integer languageId)*: inicia un **[Language](Language.md)** anidado; con `done()` se añade al mapa y se vuelve al builder.
- *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
- **[Language](Language.md)**
