# Product

## Descripción

Ficha completa de un producto procedente de un proveedor externo. Es la respuesta de `getProduct` y `getUpdateProduct` de **[ProductIntegrationService](../../Services/ProductIntegrationService.md)**.

*Disponible desde la versión 2.8.0.*

> :warning: No confundir con **[Product](../Product.md)** (`com.logicommerce.sdk.models.Product`), que es un modelo distinto y más reducido, usado por otros servicios. Este vive en el paquete `com.logicommerce.sdk.models.product`.

## Métodos

- **String** getProductId(): identificador del producto en el proveedor.
- Map<**Integer**, **[ProductLanguage](ProductLanguage.md)**> getLanguages(): textos del producto indexados por identificador de idioma de LogiCommerce.
- **[ProductImage](ProductImage.md)** getImages(): imagen principal.
- List<**[ProductImage](ProductImage.md)**> getAdditionalImages(): imágenes adicionales.
- List<**[ProductCustomTag](ProductCustomTag.md)**> getCustomTags(): custom tags del producto.
- List<**[AdditionalAttachment](AdditionalAttachment.md)**> getAdditionalAttachments(): documentos adjuntos del producto.
- **[ProductCodes](ProductCodes.md)** getProductCodes(): códigos del producto.
- **[ProductBrand](ProductBrand.md)** getProductBrand(): marca.
- **[ProductCategory](ProductCategory.md)** getProductCategory(): categoría.

## Campos no informados

LogiCommerce vuelca sobre el producto existente **solo los bloques que vengan informados**. Devolver `null` en un bloque significa "no lo toques", no "bórralo".

Esto es lo que permite que `getUpdateProduct` devuelva una proyección más reducida que `getProduct`: por ejemplo, omitir imágenes y custom tags en las actualizaciones para no pisar lo que se haya editado a mano en el BackOffice.

## Construcción

**ProductSdkBuilder** es el punto de entrada para construir un **Product**. A diferencia de otros builders del SDK no es genérico, porque siempre es la raíz.

Métodos del builder:

- *productId(String productId)*: establece el identificador en el proveedor.
- *language(Integer languageId)*: inicia un **[ProductLanguage](ProductLanguage.md)** anidado para ese idioma; con `done()` se añade al mapa y se vuelve al builder.
- *images()*: inicia la **[ProductImage](ProductImage.md)** principal.
- *additionalImage()*: inicia una **[ProductImage](ProductImage.md)** adicional y la añade a la lista.
- *customTag()*: inicia un **[ProductCustomTag](ProductCustomTag.md)** y lo añade a la lista.
- *additionalAttachment()*: inicia un **[AdditionalAttachment](AdditionalAttachment.md)** y lo añade a la lista.
- *productCodes()*: inicia los **[ProductCodes](ProductCodes.md)**.
- *productBrand()*: inicia la **[ProductBrand](ProductBrand.md)**.
- *productCategory()*: inicia la **[ProductCategory](ProductCategory.md)**.
- *build()*: construye el objeto **Product**.

```java
new ProductSdkBuilder()
    .productId("515820")
    .productCodes()
        .ean("8412345678901")
        .sku("ACME-3000")
        .done()
    .productBrand()
        .brandId("acme")
        .language(1)
            .name("Acme")
            .done()
        .done()
    .language(1)
        .name("Acme Widget 3000")
        .description("Widget de altas prestaciones")
        .done()
    .images()
        .largeImage("https://.../large.jpg")
        .done()
    .build();
```

## Referencias

- **[ProductIntegrationService](../../Services/ProductIntegrationService.md)**
- **[ProductReference](ProductReference.md)**
- **[ProductCodes](ProductCodes.md)**
- **[ProductLanguage](ProductLanguage.md)**
- **[ProductBrand](ProductBrand.md)**
- **[ProductCategory](ProductCategory.md)**
- **[ProductImage](ProductImage.md)**
- **[ProductCustomTag](ProductCustomTag.md)**
- **[AdditionalAttachment](AdditionalAttachment.md)**
