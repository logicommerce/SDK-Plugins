# CheckoutService

Servicio para el checkout.

## Métodos disponibles

### Creación de pedido.

Se llama en justo después de que el pedido haya sido generado.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

## Interfíce

```java
public interface ChekoutService extends PluginService {

	void createOrderCallback(Order order) throws PluginServiceException;

}
```
