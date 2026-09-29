# UserService

Servicio de acciones del usuario.

Cuando se ejecuta *login*, el token de la cesta ya puede haber sido rotado. Para reaccionar al cambio de token, implementa
*[BasketTokenService](BasketTokenService.md)*.

## Interfaz

```java
public interface UserService extends PluginService {

    void upsert() throws PluginServiceException;

    void delete() throws PluginServiceException;

    void login() throws PluginServiceException;

    void logout() throws PluginServiceException;

}
```
