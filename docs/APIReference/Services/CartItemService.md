# CartItemService

Servicio para el basket.

## Métodos disponibles

### Añadir elemento a la cesta

Se llama cuando es añadido un elemento a la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.
- **Integer** quantity

No espera ninguna respuesta.

### Añadir elementos a la cesta

Se llama cuando se añade un listado de elementos en la cesta.

parámetros:

- List<**[CartItem](../Models/CartItem.md)**> items: Lista de elementos a añadir.

No espera ninguna respuesta.

### Modificar elemento a la cesta

Se llama cuando se modifica un elemento a la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.
- **Integer** quantity

No espera ninguna respuesta.

### Modificar elementos a la cesta

Se llama cuando se modifica una lista de elementos en la cesta.

parámetros:

- List<**[CartItem](../Models/CartItem.md)**> items: Lista de elementos a modificar.

No espera ninguna respuesta.

### Eliminar elemento de la cesta

Se llama cuando se elimina un elemento de la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.

No espera ninguna respuesta.

## Interfíce

```java
public interface CartItemService extends PluginService {

	void addItem(String itemHash, Integer quantity) throws PluginServiceException;

	void addItems(List<CartItem> items) throws PluginServiceException;

	void updateItem(String itemHash, Integer quantity) throws PluginServiceException;
	
	void updateItems(List<CartItem> items) throws PluginServiceException;

	void deleteItem(String itemHash) throws PluginServiceException;

}
```
