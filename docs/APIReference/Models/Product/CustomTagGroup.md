# CustomTagGroup

## Descripción

Grupo al que pertenece un **[ProductCustomTag](ProductCustomTag.md)**. Sirve para agrupar características afines del producto (dimensiones, conectividad, alimentación…) en la ficha del FrontOffice.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getId(): identificador del grupo en el proveedor.
- Map<**Integer**, **[Language](Language.md)**> getLanguages(): nombre y descripción del grupo por idioma.

## Builder

**CustomTagGroupBuilder** devuelve una implementación de **CustomTagGroup**. Se obtiene con `customTagGroup()` desde **ProductCustomTagBuilder**.

Métodos del builder:

- *id(String id)*: establece el identificador en el proveedor.
- *language(Integer languageId)*: inicia un **[Language](Language.md)** anidado; con `done()` se añade al mapa y se vuelve al builder.
- *build()* y *done()*.

## Referencias

- **[ProductCustomTag](ProductCustomTag.md)**
- **[Language](Language.md)**
