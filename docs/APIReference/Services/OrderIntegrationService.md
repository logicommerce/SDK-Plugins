# OrderIntegrationService

:warning: Beyond no lo tiene implementado

Servicio para la integración de pedidos con sistemas externos (tipo QAShops o similar).

## Métodos disponibles

### Importación de pedidos

Se utiliza el método *importOrders*.

parámetros:

 - **[DocumentType](../../Enums/README.md#DocumentType)** documentType : tipo de documento a importar.
 - **String** marketplaceId : identificador del marketplace

Devuelve una lista de elementos de **[Order](../Models/Order/Order.md)** que LogiCommerce guardará en su sistema.

## Interfaz

```java
public interface OrderIntegrationService extends PluginService {

    List<Order> importOrders(DocumentType documentType, String marketplaceId) throws PluginServiceException;

}
```
