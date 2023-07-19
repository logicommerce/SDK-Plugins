# DefinitionService

Servicio para definir configuraciones. Estas configuraciones son las que desde el administrador de cada tienda se podrá llenar. También se llamarán a la carga del resto de servicios y se encontrará disponible a **[PluginDefinition](../Definitions/PluginDefinition.md)**.

Los métodos devuelven una definición de configuración por tipo o la lista de todas configuraciones.

El tipo viene definido por el enumerado **[DefinitionType](../Enums/README.md)**.

## Interfície

```java
public interface DefinitionService extends PluginService {

    PluginDefinition getPluginDefinition() throws PluginServiceException;

    ConnectorDefinition getConnectorDefinition(DefinitionType definitionType) throws PluginServiceException;

    List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException;

}
```

Ejemplo de implementación de DefinitionService. Esta implementación devuelve la definción estática.

```java
public class Definition implements DefinitionService {

    @Resource
    private PluginDefinition pluginDefinition;

    @Override
    public PluginDefinition getPluginDefinition() throws PluginServiceException {
        return pluginDefinition;
    }

    @Override
    public List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException {
        return pluginDefinition.getConnectorDefinitions();
    }

    @Override
    public ConnectorDefinition getConnectorDefinition(DefinitionType definitionType) throws PluginServiceException {
        for (ConnectorDefinition connectorDefinition : getConnectorDefinitions()) {
            if (connectorDefinition.getType().equals(definitionType)) {
                return connectorDefinition;
            }
        }
        return null;
    }

}
```
