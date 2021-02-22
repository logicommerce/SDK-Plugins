# UserService

Servicio de acciones del usuario.

## Interfaz

```java
public interface UserService extends PluginService {

    void upsert() throws PluginServiceException;

    void delete() throws PluginServiceException;

    void login() throws PluginServiceException;

    void logout() throws PluginServiceException;

}
```
