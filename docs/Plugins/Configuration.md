# Configuration

La configuración de los plugins se puede capturar con las anotaciones *@Property* , *@PropertyLanguage* y @Mapped.

```java
import com.logicommerce.sdk.Property;

public class Configuration {

    @Property
    private String endPoint;

    @Property
    private String apiKey;

    @Property(connector = ConnectorType.RELATED_DEFINITION)
    private Integer recommenderType;
    
    @Mapped(value = MappedItemType.STATUS_CODE)
    private Map<String, OrderStatusDefinition> mappingStatus;
    
    // ...

}
```

@Property: Uso indicado para definiciones especificas del plugin

@Property(connector = [ConnectorType](../APIReference/Enums/README.md#ConnectorType).RELATED_DEFINITION): Uso indicado para recuperar valor definido para el conector específico.

@Mapped(value = [MappedItemType](../APIReference/Enums/README.md#MappedItemType).STATUS_CODE): Uso indicado para recuperar el valor del mapeo de campos definido.

En caso de que a la definición del plugin haya configuración principal con los elementos "endpoint" y "apiKey", que haya configuración específica de los relacionados y  el mapeo en "mappingStatus".

Los datos de la configuración vendrán dados por Beyond que las lee de la base de datos.

> Nota: Si un plugin implementa diferentes servicios y éstos tienen definición de configuración específica, ésta sólo estará disponible si se llama al servicio correspondiente.
