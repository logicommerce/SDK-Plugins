# ProductImage

## Descripción

Imagen de un **[Product](Product.md)**, en sus tres tamaños. Se usa tanto para la imagen principal (`getImages()`) como para cada una de las adicionales (`getAdditionalImages()`).

Los valores son URLs desde las que LogiCommerce descarga y almacena la imagen.

*Disponible desde la versión 2.8.0.*

## Métodos

- **String** getSmallImage()
- **String** getMediumImage()
- **String** getLargeImage()

## Builder

**ProductImageBuilder** devuelve una implementación de **ProductImage**. Se obtiene con `images()` (principal) o `additionalImage()` (adicional) desde **ProductSdkBuilder**.

Métodos del builder: *smallImage(String smallImage)*, *mediumImage(String mediumImage)*, *largeImage(String largeImage)*, *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
