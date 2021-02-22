# Definción

> **Alerta!**
>
> Se están redefiniendo los nombres. Puede que no cuadren.

La definición de un plugin puede ser dada por un archivo JSON o bien utilizando un servicio proporcionado por el SDK. La definición que viene dada por un JSON es la definición estática. La dada por el servicio es la definición dinámica.

Los dos tipos de definiciones no son incompatibles entre sí. Se puede tener parte de la definición estática y parte de la definición dinámica.

## Definición estática

La base del Plugin se encuentra en el archivo *plugin.json*. En este documento se define la información principal del plugin:

- **name**: Nombre visible al Administrador.
- **description**: Descripción que se mostrará al Administrador.
- **módulo**: Nombre del módulo del plugin definido en module-info.java.
- **versión**: Versión del plugin.
- **date**: Fecha de publicación.
- **author**: Autor del Plugin.
- **properties**: Propiedades que desde el Administrador se podrán editar desde la pantalla de plugins. Se encontrarán disponibles en*java*a partir del las anotaciones *@Property* y *@PropertyLanguage* al código del plugin. Las propiedades tienen la siguiente definición:
  - **name**: define el nombre de la propiedad
  - **type**: Tipo de valor aceptado
    - string
    - integer
    - double
    - boolean
    - orderStatus
    - country
  - **required**: Si el valor es requerido cuando se edita en el Administrador.
  - **languageValue**: Define si sus valores son únicos por idioma de la tienda o global (por defecto es false)
  - **entryValueMode**:
    - single (predeterminado)
    - radio
    - select
  - **values**: En caso de que *entryValueMode*tenga valores de*radio*o*select*, se espera que este campo exista. Definición de las estructuras de la lista:
    - value: Valor del tipo definido
    - language: nombre del valor que se mostrará al Administrador
  - **language**: Nombre que tiene por idioma del Administrador
- **connectors**: Definiciones específicas que afectan a diferentes módulos de LogiCommerce. Cada estructura de la lista tiene la siguiente definición:
  - **type**: Tipo de módulo de LogiCommerce.
  - **properties**: Propiedades. Siguen el mismo patrón que las propiedades principales del plugin.
  - **additionalData**: Datos adicionals específicos para los diferentes tipos de módulos de LogiCommerce.

### Ejemplo

```json
{
    "name": "First plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-01-15",
    "version": "1.2",
    "sdkVersion": "1.~",
    "module": "com.thirdparty.finder",

    "properties": [
        {
            "name": "endPoint",
            "type": "string",
            "required": true,
            "defaultValue": "www.thirdparty.com/app/",
            "language": {
                "es": "Punto de salida",
                "en": "End point",
                "chi": "端点"
            }
        },
        {
            "name": "appKey",
            "type": "string",
            "required": true,
            "language": {
                "es": "Llave de la aplicación",
                "en": "App key",
                "chi": "应用密钥"
            }
        },
        {
            "name": "secretKey",
            "type": "string",
            "required": true,
            "language": {
                "es": "LLave secreta",
                "en": "Secret key",
                "chi": "密钥"
            }
        },
        {
            "name": "otherKey",
            "type": "integer",
            "required": true,
            "languageValue": true,
            "language": {
                "es": "Otro valor",
                "en": "Other value",
                "chi": "其他价值"
            }
        }
    ],
    "connectors": [
        {
            "type": "defined_type",
            "properties": [
                // ...
            ],
            "additionalData": {
                // ...
            }
        }
    ]
}
```

## Obtención de la definición

Se implementa el servicio *DefinitionService*. Este servicio permite devolver la definción estática así como una definición dinámica. 

```java
public interface DefinitionService extends PluginService {

    PluginDefinition getPluginDefinition() throws PluginServiceException;

    ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException;

    List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException;

}
```

Para tener acceso a la definición estática des de este servicio, se tiene que inyectar el recurso PluginDefinition.

```java
	@Resource
	private PluginDefinition pluginDefinition;
```



## Acceso desde Java

Para acceder a la definción del plugin está el recurso *PluginDefinition* que se puede inyectar vía la anotación *@Resource*. (Ver [Recursos](Resources.md) y [Anotaciones](Annotations.md)).

*PluginDefinition* devuelve sólo la definción en objetos. La configuración que venga del Administrador de Logicommerce no se puede acceder desde aquí. Para acceder a la configuración están las siguientes [anotaciones](Annotations.md):

- *@Property*
- *@PropertyLanguage*

Ejemplo de configuración: [Configuration](Plugins/Configuration.md)

Las propiedades, cuando se accede vía recurso, llevarán el valor configurado en las pantallas del administrador.