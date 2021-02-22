# SDK Test

Se proporciona el "Framework" para la creación de los tests. Requiere los módulos "sdkTest" y "utilities".

Mujer clases para obtener Recursos y mediante builders o directamente implementaciones falsas del recurso.

## PluginInjector

Genera los objetos a hacer el testing vía inyección. De esta manera se puede reproducir el funcionamiento de los servicios.

PluginInjector necesita que se abran los packages al módulo ya que utiliza *reflection*.

```java
module com.thirdparty.finder {
    requires com.logicommerce.sdk;

    opens com.thirdparty.finder;

    provides com.logicommerce.sdk.services.SearchProductsService
        with com.thirdparty.finder.SearchProducts;
}
```

### Métodos disponibles

#### Añadir instancia

- `public PluginInjector addInstance (Object object);`
- `public PluginInjector addInstance (Class <?> Clazz, Object object);`

Si una propiedad es un objeto definido, se le puede pasar instanciado.

Si se necesita ser le puede forzar la clase al objeto definido.

Se devuelve él mismo para poder seguir construyendo el objeto.

#### Añadido implementación

- `public PluginInjector addImplementation (Class <?> Impl);`
- `public PluginInjector addImplementation (Class <?> Iface, Class <?> Impl);`

Se le pasa una implementación a una objeto con un tipo definido por una interfaz. Pensado básicamente para la creación de los recursos del plugin.

Al pasar una implementación, se le puede marcar específicamente qué interfaces utiliza.

Se devuelve él mismo para poder seguir construyendo el objeto.

#### Añadir propiedad

- `public PluginInjector addProperty (String name, Object property);`

Si la del objeto que se quiere crear tiene propiedades que no vienen de objetos definidos y se quiere hacer uso para el test, se puede añadir una propiedad. El argumento *name* es el nombre de la propiedad y el argumento *property* es el valor (tipo Object).

Se devuelve él mismo para poder seguir construyendo el objeto.

#### Obtener instancia

- `public <T> T getInstance (Class<T> clazz);`

Método final. Requiere como parámetro la clase que se quiere instanciar y devuelve el objeto con todas las instancias, propiedades e implementaciones.

Hace caso de las anotaciones *@Initiator*, *@Resource* y *@Aggregate* para la creación del objeto.

### Ejemplo

Classe RelatedItems:

```java
public class RelatedItems implements RelatedItemsService {

    @Aggregate
    private Config config;

    @Resource
    private Connection connection;

    @Resource
    private Logger logger;

    @Initiator
    public void init() {
        // ...
    }

    @Override
    public List<Integer> getItems(RelatedItemType relatedItemType, Integer id) throws PluginServiceException {
        // ...
    }

    @Override
    public List<Integer> getItems(RelatedItemType relatedItemType) throws PluginServiceException {
        // ...
    }

    @Override
    public List<Product> updateProducts(List<Product> products) throws PluginServiceException {
        // ...
    }

}
```

Método de uso de **PluginInjector**:

```java
public class RelatedItemsTest {

    // Test methods...

    private RelatedItems getRelatedItemsInstance() {
        Config config = new ConfigBuilder()
                .endPoint(endPoint)
                .token(token)
                .recommenderType(recommenderType)
                .build();
    
        return new PluginInjector()
            .addInstance(config)
            .addImplementation(ConnectionFake.class)
            .getInstance(RelatedItems.class);
    }

}
```

Las clases **Config** y **ConfigBuilder** son propias del plugin.

Se puede ver cómo se le pasa una instancia de **config** y una implementación **ConnectionFake** y se le acaba pidiendo un objeto de tipo **RelatedItems**.

En cambio el recurso de **Logger** no se añade a PluginInjector. En este caso **PluginInjector** crea un objeto falso de tipo **Logger** que se llamará y no hará nada.

