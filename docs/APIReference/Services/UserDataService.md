# UserDataService

## Descripción

Servicio para la preparación los datos del usuario. Útil para modificar datos que devolverá la API.

## Métodos disponibles

### Preparación de los datos

parámetros

- **List <[UserDataProperty](../Models/UserDataProperty.md)>** properties

## Interfaz

```java
public interface UserDataService extends PluginService {

    void prepareUserDataProperties(List<UserDataProperty> properties) throws PluginServiceException;

}
```
