# CustomFormService

Servicio para la recepción de formularios personalizados

## Métodos disponibles

### ProcessForm

Procesa el formulario recibido con el método *processForm*.

Parámetros:

- **String** fecha: Los datos del formulario venden sin formato. El plugin se encargará de hacer el *parsing*.

No debe devolver nada.

## Interfaz

```java
public interface CustomFormService extends PluginService {

    void processForm(String data) throws PluginServiceException;

}
```
