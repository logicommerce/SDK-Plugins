# Services

Los servicios de **Beyond SDK** son el puente de comunicación entre Beyond y el plugin. Desde Beyond se llaman los servicios cuando el sistema lo necesita. Si un plugin implementa el servicio este será invocado.

Según cada acción del sistema llamará al servicio que requiera. En cada petición a la API el servicio implementado será una sola instancia. Si el servicio tiene diferentes métodos que pueden ser llamados durante la petición se mantendrá, pues, la misma instancia.

Aparte de implementar la interfaz que le corresponde, las clases pueden utilizar diferentes **[anotaciones](Annotations.md)** para tener la **configuración del plugin **como también diferentes **recursos** (Ver [Resources](Resources.md)).

**[Servicios disponibles](APIReference/services/README.md)**

## Inyección de dependencias

Las implementaciones se crean vía inyección de dependencias. Se pueden inyectar clases propias a partir de la anotación *@Aggregate* (Ver [Annotations](Annotations.md)). De este modo en subclases se podrán añadir otros **recursos**.

## Exceptions

Todos los métodos de los servicios pueden tirar una excepción tipo PluginServiceException. En el caso de que haya algún error en la ejecución del plugin, se debe tirar esta excepción. Internamente Beyond gestionará el problema y seguirá la ejecución de la petición como si el método no se hubiese llamado.

## Example

```java
public class RelatedItems implements RelatedItemsService {

    @Aggregate
    private Config config;

    @Override
    public List<Integer> getItems(RelatedItemType relatedItemType, Integer id)
        throws PluginServiceExcption {
        // ...
    }

    // ...

}
```

