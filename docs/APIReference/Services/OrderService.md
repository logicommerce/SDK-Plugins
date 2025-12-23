# OrderService

Servicio para el checkout.

## Métodos disponibles

### Creación del pedido (validateCallback)

Se llama al crear el pedido en caso de que ésta haya sido correcta.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Inicio de Edición del pedido (starEdit)

Se llama en el momento de editar un pedido.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Edición del pedido (edit)

Se llama en el momento de guaarder un pedido editado.

parámetros

- **[Order](../Models/Order/Order.md)** order

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

## Interfaz

```java
public interface OrderService extends PluginService {

	void validateCallback(Order order) throws PluginServiceException;

	void startEdit(Order order) throws PluginServiceException;

	void edit(Order order) throws PluginServiceException;

}
```
