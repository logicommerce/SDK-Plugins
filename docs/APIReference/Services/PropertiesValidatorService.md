# PropertiesValidatorService

Servicio para el checkout.

## Métodos disponibles

### validar propiedades (validate)

Se llama al utilizar desde backoffice el botón para validar las propiedes configuradas.

parámetros

- **PropertyValueMap** order

repuesta

**[PropertiesValidatorResponse](../Models/PropertiesValidatorResponse.md)**


## Interfaz

```java
public interface PropertiesValidatorService extends PluginService {

	PropertiesValidatorResponse validate(PropertyValueMap properties) throws PluginServiceException;

}
```
