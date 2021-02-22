# Configuration

La configuración de los plugins se puede capturar con las anotaciones *@Property* i *@PropertyLanguage*.

```java
import com.logicommerce.sdk.Property;

public class Configuration {

    @Property
    private String endPoint;

    @Property
    private String apiKey;

    @Property(specificConfig = "related_definition")
    private Integer recommenderType;

    // ...

}
```

En caso de que a la definción del plugin haya configuración principal con los elementos "endpoint" y "apiKey" y que haya configuración específica de los relacionados.

Los datos de la configuración vendrán dadas por Beyond que las lee de la base de datos.

> Nota: Si un plugin implementa diferentes servicios y éstos tienen definición de configuración específica, ésta sólo estará disponible si se llama al servicio correspondiente.
