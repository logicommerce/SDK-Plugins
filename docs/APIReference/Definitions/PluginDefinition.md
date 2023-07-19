# PluginDefinition

## Descripción

Extiende la funcionalidad de [ConfigDefinition](ConfigDefinition.md).

Devuelve la definición del plugin (**plugin.json**).

## Métodos

- **String** getName()
- **String** getDescription()
- **String** getAuthor()
- **String** getVersion()
- **List<[ConnectorDefinition](ConnectorDefinition.md)>** getConnectorDefinitions()
- **void** addConnectorDefinition(**T** connectorDefinition)
- **T** getConnectorDefinition([ConnectorType](../Enums/README.md#ConnectorType) connectorType)

## Referencias

- **[ConfigDefinition](configDefinition.md)**

- **[ConnectorDefinition](ConnectorDefinition.md)**

- **[ConnectorType](../Enums/README.md#ConnectorType)**
