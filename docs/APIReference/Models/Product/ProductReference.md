# ProductReference

## Descripción

Referencia ligera a un producto del proveedor externo. Es el elemento que devuelven `getProducts` y `getUpdatedProducts` de **[ProductIntegrationService](../../Services/ProductIntegrationService.md)**.

No contiene la ficha del producto, solo lo necesario para que LogiCommerce lo localice en su catálogo y decida si hace falta descargarla.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getIdentifier(): identificador del producto en el proveedor.
- List<**String**> getCodes(): códigos del producto (EAN, SKU u otros) con los que localizarlo si el identificador no casa.
- **LocalDateTime** getUpdatedAt(): fecha de la última modificación **en origen**.

## getUpdatedAt

LogiCommerce guarda esta fecha como fecha de proceso del producto y, en la siguiente ejecución, solo descarga la ficha si la nueva `getUpdatedAt` es posterior a la guardada.

Por eso la fecha debe ser **la que reporta el proveedor**, sin convertir de zona horaria: así ambos lados de la comparación usan el mismo reloj.

Si el plugin no puede determinarla, debe devolver `null`: LogiCommerce entenderá que no puede filtrar y descargará la ficha siempre.

## Builder

**ProductReferenceBuilder** devuelve una implementación de **ProductReference**.

Métodos del builder:

- *identifier(String identifier)*: establece el identificador en el proveedor.
- *codes(List\<String\> codes)*: establece la lista completa de códigos.
- *addCode(String code)*: añade un código a la lista.
- *updatedAt(LocalDateTime updatedAt)*: establece la fecha de modificación en origen.
- *build()*: construye el objeto **ProductReference**.
- *done()*: devuelve el builder padre.

```java
new ProductReferenceBuilder<>()
    .identifier("515820")
    .addCode("8412345678901")
    .updatedAt(LocalDateTime.of(2025, 1, 2, 13, 0))
    .build();
```

## Referencias

- **[ProductIntegrationService](../../Services/ProductIntegrationService.md)**
- **[Product](Product.md)**