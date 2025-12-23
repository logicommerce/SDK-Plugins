# ShoppingListService

Servicio para lista de compra

## Métodos disponibles

### Añadir productos a la lista de compra (upsert)

Se llama cuando se añaden o modifican produtos en la lista de compra.

parámetros:

- List<**[Product](../Models/Product.md)**> products: lista de productos.


## Interfaz

```java
public interface ShoppingListService extends PluginService {

	void upsert(List<Product> product) throws PluginServiceException;

}
```
