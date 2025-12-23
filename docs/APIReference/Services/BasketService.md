# BasketService

Servicio para el basket.

## Métodos disponibles

### Cálculo de la cesta

Se llama al realizado un cálculo de la cesta.

No tiene parámetros ya que la cesta se puede obtener

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Limpieza de la cesta

Se llama cuando se limpia la cesta.

No tiene parámetros.

No espera ninguna respuesta.

## Interfíce

```java
public interface BasketService extends PluginService {

    void calculate() throws PluginServiceException;

    void clear() throws PluginServiceException;

}
```
