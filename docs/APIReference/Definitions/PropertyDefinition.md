# PropertyDefinition

## Descripción

Devuelve la definición de las propiedades del plugin. Hay que tener en cuenta que para obtener los valores definidos en el **Administrador**, estos se deben capturar con las anotaciones *@Property* o *@PropertyLanguage*.

## Métodos

- **String** getIdentifier()
- **String** getType()
- **boolean** isRequired()
- **String** getDefaultValue()
- **boolean** isLanguageValue()
- **boolean** isMultipleValue()
- **String** getEntryValueMode()
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
