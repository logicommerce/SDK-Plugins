# ShipperService

Gestión de los transportistas

## Interfaz

```java
public interface ShipperService extends PluginService {

    Carriers getAvailableCarriers() throws PluginServiceException;

    void selectShipper(String shippingHash, Map<String, String> additionalData)
        throws PluginServiceException;

}

```
