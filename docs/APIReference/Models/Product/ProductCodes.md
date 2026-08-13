# ProductCodes

## Descripción

Códigos identificativos de un **[Product](Product.md)** procedente de un proveedor externo.

LogiCommerce los usa para localizar el producto en su catálogo cuando el identificador del proveedor no casa directamente.

*Disponible desde la versión 2.8.0.*

> :warning: No confundir con **[ProductCodes](../ProductCodes.md)** (`com.logicommerce.sdk.models.ProductCodes`). Este vive en el paquete `com.logicommerce.sdk.models.product` y añade `getPId()`.

## Métodos

- **String** getPId(): identificador público del producto en LogiCommerce.
- **String** getSku()
- **String** getJan()
- **String** getIsbn()
- **String** getEan()
- **String** getUpc()
- **String** getManufacturerSku()

## Builder

**ProductCodesBuilder** devuelve una implementación de **ProductCodes**. Se obtiene con `productCodes()` desde **ProductSdkBuilder**.

Métodos del builder: *pId*, *sku*, *jan*, *isbn*, *ean*, *upc*, *manufacturerSku*, *build()* y *done()*.

## Referencias

- **[Product](Product.md)**
