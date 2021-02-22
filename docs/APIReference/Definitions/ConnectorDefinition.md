# ConnectorDefinition

## Descripción

Devuelve la definición de las propiedades del plugin de un módulo de LogiCommerce. Hay que tener en cuenta que para obtener los valores definidos en la **Administrador**, estos se deben capturar con las anotaciones *@Property* o *@PropertyLanguage* y sólo estarán disponibles a sus servicios.

## Métodos

- **[ConnectorType](../Enums/README.md#ConnectorType)** getType()
- **List<[PropertyDefinition](PropertyDefinition.md)>** getProperties()
- **boolean** hasAdditionalProperties();
- **List<[PropertyDefinition](PropertyDefinition.md)>** getAdditionalProperties();
- **void** addAdditionalProperty(PropertyDefinition property)
- **Map<String, Object>** getAdditionalData();

## Extensiones

Para facilitar la creación de definiciones, se proporcionan interfaces con el tipo definido:

- PaymentDefinition
- RelatedItemsDefinition
- ShipperDefinition

## Referencias

- **[PluginDefinition](PluginDefinition.md)**
- **[PropertyDefinition](PropertyDefinition.md)**
- **[Annotations](../../Annotations.md)**
