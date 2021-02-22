# SearchProductsService

Servicio para buscadores de productos.

Este servicio tiene definidos un evento que Beyond llamará cuando requiera. Espera recibir una lista de identificadores de producto.

## Interfaz

```java
public interface SearchProductsService extends PluginService {

    List<Integer> getProducts(String q) throws PluginServiceException;

}
```
