# AddressService

Servicio para validar direcciones.

## Métodos disponibles

### Validar una dirección

Valida una dirección **[Address](../Models/Address.md)**, devuelve el resultado de la validación: **[AddressValidated](../Models/AddressValidated.md)**

parámetros:

- **[Address](../Models/Address.md)** address: dirección a validar.

Devuelve un objeto **[AddressValidated](../Models/AddressValidated.md)** con el resultado de la validación.

## Interfaz

```java
public interface AddressService extends PluginService {

	AddressValidated validate(Address address) throws PluginServiceException;

}

```
