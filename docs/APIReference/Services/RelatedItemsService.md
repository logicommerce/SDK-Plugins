# RelatedItemService

Servicio para los recomendadores.

En una petición que se piden recomendados Beyond llama primero el método getItems que debe devolver una lista de Integer. En caso de que el recomendado venga a partir de un producto o una categoría se pasa su identificador numérico como parámetro.

Los tipos disponibles son los siguientes (enumera RelatedItemType):

- *PRODUCT*
- *CATEGORY*
- *USER*
- *BASKET*

Con la lista numérica Beyond busca los productos y los devuelve al Servicio con la llamada *updateProducts* por si hay que modifcar algunos datos como sería añadir parámetros o atributos en la ruta del producto. Este método tiene el parámetro `List <Product>` donde [Product](../Models/Product.md) es una interfaz con los métodos de lectura y escritura permitidos de la información del producto.

## Interfaz

```java
public interface RelatedItemsService extends PluginService {

    List<Integer> getItems(RelatedItemType relatedItemType, Integer id) throws PluginServiceException;

    List<Integer> getItems(RelatedItemType relatedItemType) throws PluginServiceException;

    List<Product> updateProducts(List<Product> products) throws PluginServiceException;

}
```
