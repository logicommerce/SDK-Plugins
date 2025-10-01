# BasketService

Servicio para el basket.

## Métodos disponibles

### Cálculo de la cesta

Se llama al realizado un cálculo de la cesta.

No tiene parámetros ya que la cesta se puede obtener

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Añadir elemento a la cesta

Se llama cuando es añadido un elemento a la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.
- **Integer** quantity

No espera ninguna respuesta.

### Modificar elemento a la cesta

Se llama cuando se modifica un elemento a la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.
- **Integer** quantity

No espera ninguna respuesta.

### Eliminar elemento de la cesta

Se llama cuando se elimina un elemento de la cesta.

parámetros:

- **String** itemHash: Hash que define el producto con las opciones.

No espera ninguna respuesta.

### Limpieza de la cesta

Se llama cuando se limpia la cesta.

No tiene parámetros.

No espera ninguna respuesta.

## Interfíce

```java
public interface BasketService extends PluginService {

    void calculate() throws PluginServiceException;

    void addItem(String itemHash, Integer quantity) throws PluginServiceException;

    void updateItem(String itemHash, Integer quantity) throws PluginServiceException;

    void deleteItem(String itemHash) throws PluginServiceException;

    void clear() throws PluginServiceException;

}
```
