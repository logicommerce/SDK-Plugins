# PaymentSystemService

Servicio para la obtención y selección de propiedades y de datos adicionales del sistema de pago. Pensado para añadir opciones de selección de tarjetas o tokens.

## Interfaz

```java
public interface PaymentSystemService extends PluginService {

    PaymentSystemProperties getProperties() throws PluginServiceException;

    void selectProperty(String propertyName, Map<String, String> additionalData) throws PluginServiceException;

}
```
