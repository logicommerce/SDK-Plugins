# NewsletterService

Servicio para el sistema de mailing.

Este servicio se llama en dos casos diferentes:

- Cuando se hace la petición de suscripción o de eliminar suscripción por parte del cliente.
- Cuando desde beyond se quiere validar que un email se encuentra suscrito al sistema de mailing.

## Interfaz

```java
public interface NewsletterService extends PluginService {

    void subscribe(String email) throws PluginServiceException;

    void unsubscribe(String email) throws PluginServiceException;

    boolean isSubscribed(String email) throws PluginServiceException;

}
```
