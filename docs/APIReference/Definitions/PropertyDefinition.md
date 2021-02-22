# PropertyDefinition

## Descripción

Devuelve la definición de las propiedades del plugin. Hay que tener en cuenta que para obtener los valord definidos en el **Administrador**, estos se deben capturar con las anotaciones *@Property* o *@PropertyLanguage*.

## Métodos

- **String** getName()
- **String** getType()
- **boolean** getRequired()
- **String** getDefaultValue()
- **List\<PropertyDefinitionValue>** getValues()
- **[DefinitionLanguages](DefinitionLanguages.md)** getLanguages(): Nombre de la propiedad por idioma

### PropertyDefinitionValue

Valores posibles que puede tener la propiedad.

### Métodos de la propiedad

- **String** getValue()
- **[DefinitionLanguages](DefinitionLanguages.md)** getLanguages(): Nombre del valor por idioma

## Referencias

- **[PluginDefinition](PluginDefinition.md)**
- **[Annotations](../../Annotations.md)**
- **[DefinitionLanguages](DefinitionLanguages.md)**
