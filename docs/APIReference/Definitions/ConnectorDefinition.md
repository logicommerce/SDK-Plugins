# ConnectorDefinition

## Descripción

Extiende la funcionalidad de [ConfigDefinition](ConfigDefinition.md).

Devuelve la definición de las propiedades del plugin de un módulo de LogiCommerce. Hay que tener en cuenta que para obtener los valores definidos en la **Administrador**, estos se deben capturar con las anotaciones *@Property* o *@PropertyLanguage* y sólo estarán disponibles a sus servicios.

## Métodos

- **[ConnectorType](../Enums/README.md#ConnectorType)** getType()
- **Map<String, Object>** getAdditionalData();

## Extensiones

Para facilitar la creación de definiciones, se proporcionan interfaces con el tipo definido:

- PaymentSystemDefinition
- RelatedItemsDefinition
- ShipperDefinition
- SearchEngineDefinition
- CustomTagsDefinition
- MailingSystemDefinition
- MarketplaceDefinition
- ShippingTypeDefinition

## Referencias

- **[ConfigDefinition](ConfigDefinition.md)**
- **[PluginDefinition](PluginDefinition.md)**
- **[Annotations](../../Annotations.md)**
