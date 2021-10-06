# OrderService

Servicio para el checkout.

## Métodos disponibles

### Creación del pedido

Se llama al crear el pedido en caso de que ésta haya sido correcta.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Edición del pedido

Se llama en el momento de editar un pedido.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

## Interfaz

```java
public interface OrderService extends PluginService {

    void create(Order order) throws PluginServiceException;    
    void edit(Order order) throws PluginServiceException;

}
```
