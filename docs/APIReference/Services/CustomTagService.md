# CustomTagService

Servicio para la recepción etiquetas.

## Métodos disponibles

### GetCustomTagValue

Recibe el valor de una etiqueta, permite modificar el valor.

Cuando se configura una etiqueta en Logicommerce, se le puede asociar un plugin.

Si la etiqueta está asociada a un plugin en el momento de acceder a la etiqueta primero se procesará por el plugin mediante esté método.

Parámetros:

- **[CustomTagItemType](../Enums/README.md#CustomTagItemType)** : Es el tipo de etiqueta.
- **String** value: El valor de la etiqueta.

Devuelve la etiqueta con el nuevo valor.

## Interfaz

```java
public interface CustomTagService extends PluginService {

	String getCustomTagValue(CustomTagItemType itemType, String value) throws PluginServiceException;

}
```
