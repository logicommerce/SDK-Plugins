# NewsletterSubscriptionService

Servicio para el sistema de mailing.

Este servicio se llama en dos casos diferentes:

- Cuando se hace la petición de suscripción o de eliminar suscripción por parte del cliente.
- Cuando desde beyond se quiere validar que un email se encuentra suscrito al sistema de mailing.

## Interfaz

```java
public interface NewsletterSubscriptionService extends PluginService {

    SubscriptionResponse subscribe(String email, final Map<String, String> data) throws PluginServiceException;

    SubscriptionResponse unsubscribe(String email, final Map<String, String> data) throws PluginServiceException;

    SubscriptionResponse getStatus(String email, final Map<String, String> data) throws PluginServiceException;

}
```
