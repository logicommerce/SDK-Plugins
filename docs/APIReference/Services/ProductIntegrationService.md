# ProductIntegrationService

Servicio para la integración del catálogo de productos con un proveedor externo de contenido (tipo Icecat o similar).

Un plugin que implemente este servicio permite a LogiCommerce **importar** fichas de producto y **mantenerlas actualizadas** de forma desatendida: el plugin publica qué productos existen o han cambiado en origen, y LogiCommerce le pide la ficha completa de aquellos que necesita.

No requiere conector: se resuelve por tipo de servicio, no por **[ConnectorType](../Enums/README.md#ConnectorType)**.

*Disponible desde la versión 2.8.0.*

## Funcionamiento

El proceso tiene siempre dos fases:

1. **Listado**. LogiCommerce pide al plugin las referencias de producto (*getProducts* o *getUpdatedProducts*). El plugin devuelve identificadores y códigos, no fichas completas.
2. **Descarga**. LogiCommerce resuelve cada referencia contra su propio catálogo y, solo para los productos que le interesan, pide la ficha (*getProduct* o *getUpdateProduct*).

Esta separación evita descargar fichas de productos que no existen en el comercio o que no han cambiado.

## Métodos disponibles

### Listado completo (getProducts)

Devuelve todas las referencias de producto disponibles en el proveedor.

No recibe parámetros.

Devuelve una lista de **[ProductReference](../Models/Product/ProductReference.md)**.

### Listado de modificados (getUpdatedProducts)

Devuelve únicamente las referencias que el proveedor ha modificado desde su última publicación (típicamente un índice diario de cambios).

No recibe parámetros.

Devuelve una lista de **[ProductReference](../Models/Product/ProductReference.md)**.

Cada referencia puede incluir su fecha de modificación en origen (`getUpdatedAt`). LogiCommerce la compara con la fecha en que procesó ese producto por última vez y **descarta** los que no han cambiado, de modo que no se llega a pedir su ficha.

> :bulb: Devolver `getUpdatedAt` es opcional pero muy recomendable: si es `null`, LogiCommerce no puede filtrar y descargará la ficha en cada ejecución.

### Ficha de producto para importación (getProduct)

Devuelve la ficha completa de un producto, para la **primera** importación.

parámetros:

- **Integer** productId: identificador del producto **en LogiCommerce**. Útil para aplicar reglas propias del plugin, como listas de exclusión.
- **String** identifier: identificador del producto en el proveedor (el `getIdentifier` de la referencia).
- **String** code: código del producto (el primero de los `getCodes` de la referencia).

Devuelve un **[Product](../Models/Product/Product.md)**, o `null` si el plugin decide que ese producto no debe importarse.

### Ficha de producto para actualización (getUpdateProduct)

Igual que el anterior, pero se invoca en el flujo de **actualización** de un producto ya importado.

parámetros: los mismos que *getProduct*.

Devuelve un **[Product](../Models/Product/Product.md)**, o `null` si el plugin decide que ese producto no debe actualizarse.

Tener dos métodos permite al plugin devolver **proyecciones distintas** en cada caso: es habitual que en la importación inicial se envíe la ficha completa y que en las actualizaciones se envíen solo los bloques que el comercio ha configurado como actualizables (por ejemplo, mantener las imágenes o los custom tags que ya se editaron manualmente en LogiCommerce).

> :warning: LogiCommerce vuelca sobre el producto existente **solo los campos que vengan informados**. Un bloque que el plugin no devuelva se conserva tal cual estaba; no se borra.

## Interfaz

```java
public interface ProductIntegrationService extends PluginService {

    List<ProductReference> getProducts() throws PluginServiceException;

    List<ProductReference> getUpdatedProducts() throws PluginServiceException;

    Product getProduct(Integer productId, String identifier, String code) throws PluginServiceException;

    Product getUpdateProduct(Integer productId, String identifier, String code) throws PluginServiceException;

}
```

## Ejemplo

Construcción de las referencias en el listado:

```java
@Override
public List<ProductReference> getUpdatedProducts() throws PluginServiceException {
    List<ProductReference> references = new ArrayList<>();
    for (ProviderItem item : provider.getDailyChanges()) {
        references.add(new ProductReferenceBuilder<>()
            .identifier(item.getId())
            .addCode(item.getEan())
            .updatedAt(item.getModifiedAt())
            .build());
    }
    return references;
}
```

Construcción de la ficha con **[ProductSdkBuilder](../Models/Product/Product.md#construcción)**:

```java
@Override
public Product getProduct(Integer productId, String identifier, String code) throws PluginServiceException {
    ProviderProduct source = provider.get(identifier);
    if (source == null) {
        return null;
    }
    return new ProductSdkBuilder()
        .productId(source.getId())
        .productCodes()
            .ean(source.getEan())
            .sku(source.getSku())
            .done()
        .productBrand()
            .brandId(source.getBrandId())
            .done()
        .language(languageId)
            .name(source.getName())
            .description(source.getShortDescription())
            .done()
        .build();
}
```

## Errores

Cualquier fallo de comunicación con el proveedor debe propagarse como **[PluginServiceException](PluginServiceException.md)**. LogiCommerce la registra y continúa: un plugin que falle no interrumpe al resto ni aborta el lote en curso.

Devolver `null` en *getProduct* / *getUpdateProduct* no es un error, significa "no hay nada que importar para este producto".

## Referencias

- **[ProductReference](../Models/Product/ProductReference.md)**
- **[Product](../Models/Product/Product.md)**
- **[ProductCodes](../Models/Product/ProductCodes.md)**
- **[ProductLanguage](../Models/Product/ProductLanguage.md)**
- **[ProductBrand](../Models/Product/ProductBrand.md)**
- **[ProductCategory](../Models/Product/ProductCategory.md)**
- **[ProductImage](../Models/Product/ProductImage.md)**
- **[ProductCustomTag](../Models/Product/ProductCustomTag.md)**
- **[AdditionalAttachment](../Models/Product/AdditionalAttachment.md)**
- **[PluginServiceException](PluginServiceException.md)**
