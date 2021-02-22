# PluginServiceException

Todos los métodos definidos en los servicios pueden tirar la excepción *PluginServiceException.java*

## Interfaz

```java
public class PluginServiceException extends Exception {

    public PluginServiceException(final String message) {
        super(message);
    }

    public PluginServiceException(final Exception exception) {
        super(exception);
    }

    public PluginServiceException(final String message, final Exception exception) {
        super(message, exception);
    }
}
```
