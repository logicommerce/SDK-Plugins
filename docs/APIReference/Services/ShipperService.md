# ShipperService

Gestión de los transportistas


## Métodos disponibles

### Obtener transportistas (getAvailableCarriers)

Retorna los transportistas disponibles.

Respuesta

**[Carriers](../Models/Carriers.md)**

### Selección de transportista (selectShipper)

Se llama en el momento de selecionar un transportista. 

Parámetros:

- **String** shippingHash
- **Map<String, String>** additionalData

## Interfaz

```java
public interface ShipperService extends PluginService {

    Carriers getAvailableCarriers() throws PluginServiceException;

    void selectShipper(String shippingHash, Map<String, String> additionalData)
        throws PluginServiceException;

}

```
