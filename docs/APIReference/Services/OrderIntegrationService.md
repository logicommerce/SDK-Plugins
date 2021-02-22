# OrderIntegrationService

:warning: Beyond no lo tiene implementado

Servicio para la integración de pedidos con sistemas externos (tipo QAShops o similar).

## Métodos disponibles

### Importación de pedidos

Se utiliza el método *importOrders*.

parámetros:

A terminar de definir qué parámetros se pasarán

Devuelve una lista de elementos de **[Order](../Models/Order/Order.md)** que LogiCommerce guardará en su sistema.

## Interfaz

```java
public interface OrderIntegrationService extends PluginService {

    List<Order> importOrders(String data) throws PluginServiceException;

}
```
