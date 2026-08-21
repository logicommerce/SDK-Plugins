# AdditionalAttachment

## Descripción

Documento adjunto de un **[Product](Product.md)**, por ejemplo una ficha técnica o un manual. Se devuelven en `getAdditionalAttachments()`.

La `url` es la dirección desde la que LogiCommerce descarga y almacena el documento; el `contentType` indica el tipo de fichero que se espera encontrar en ella.

*Disponible desde la versión 2.8.2.*

## Métodos

- **[ContentType](../../Enums/README.md#ContentType)** getContentType(): tipo de documento.
- **String** getUrl(): URL de descarga del documento.
- **String** getName(): nombre del documento.

## Builder

**AdditionalAttachmentBuilder** devuelve una implementación de **AdditionalAttachment**. Se obtiene con `additionalAttachment()` desde **ProductSdkBuilder**.

Métodos del builder: *contentType(ContentType contentType)*, *url(String url)*, *name(String name)*, *build()* y *done()*.

```java
new ProductSdkBuilder()
    .productId("515820")
    .additionalAttachment()
        .name("Manual de usuario")
        .url("https://.../manual.pdf")
        .contentType(ContentType.PDF)
        .done()
    .build();
```

## Referencias

- **[Product](Product.md)**