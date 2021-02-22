# Annotations

El SDK proporciona diferentes anotaciones que sirven para obtener datos de configuración y/o recursos:

## Tipo

### *@Initiator*

Se llama una vez a la petición a la creación del objeto. Una vez inicializado el plugin no se vuelve a llamar.

### *@Aggregate*

Permite agrupar propiedades y recursos en una clase.

### *@Property*

Permite recibir el valor de la propiedad definida en el Administrador a partir de la definición a *plugin.json*.

Puede utilizarse el campo *name* de la anotación cuando el nombre de la definición del plugin no es el mismo del nombre del campo.

En caso de que se quieran los datos de una definición de un conector, es necesario definir el campo *connector* con el tipo.

Se recomienda que no se utilice en una clase principal y que las propiedades se encuentren en una sub clase.

### *@PropertyLanguage*

Propiedad de la configuración del plugin que tiene un valor diferente para cada idioma.
Puede utilizarse el campo *name* de la anotación cuando el nombre de la definición del plugin no es el mismo del nombre del campo.

En caso de que se quieran los datos de una configuración de un conector, hay que definir el campo *connector* con el tipo.

El campo *type* de la anotación es obligatorio y define el tipo de valor que espera recibir de la configuración. Valores posibles:

- String.class
- Integer.class
- Double.class
- Boolean.class

Se recomienda que no se utilice en una clase principal y que las propiedades se encuentren en una sub clase.

### *@Resource*

Define un [recurso] (Resources.md). Según la interfaz del campo definido (dadas por el SDK) el plugin cargará los recursos.

## Ejemplo de código con las anotaciones

```java
public class SomeServiceImpl implements SomeService {

    @Aggregate
    private Config config;

    @Resource
    private Logger logger;

    @Resource
    private Connection connection;

    @Initiator
    public void init() {
        //
    }

    // Code ...

}
```

Ejemplo de código *Config.java* donde hay definidas las propiedades del plugin. Esta clase es única para cada plugin. Es un ejemplo de uso:

```java
public class Config {

    @Property
    private String endPoint;

    @Property
    private String appKey;

    @Property
    private String secretKey;

    @PropertyLanguage(name = "otherKey", type = Integer.class)
    private OtherKeys otherKeys;

    @Property(connector = ConnectorType.PAYMENT_SYSTEM)
    private Integer specificValue;

    @Resource
    private Navigator navigator;

    // ...

}
```

El campo de *@PropertyLanguage* es una clase propia del plugin. Esta clase requiere implementar la interfaz `Language<T>` donde T es el tipo esperado de la propiedad:

```java
public class OtherKeys implements LanguageValue<Integer> {

    private Map<String, Integer> values;

    @Override
    public Integer getValue(String language) {
        if (values != null && values.containsKey(language))
            return values.get(language);
        return null;
    }

    @Override
    public void setValue(String language, Integer value) {
        if (values == null)
            values = new LinkedHashMap<>();
        values.put(language, value);
    }

}
```
