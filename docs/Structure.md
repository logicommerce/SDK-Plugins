# Estructura

Estructura de ficheros de un plugin

- :file_folder: plugin/
  - :file_folder: src/main/java/
    - :package: plugin.packages
    - :page_facing_up: module-info.java
  - :file_folder: src/main/resources/
    - :file_folder: META-INF
      - :file_folder: moduleName
        - :page_facing_up: plugin.json
      - :file_folder: statics/
  - :file_folder: src/test/main/
  - :page_facing_up: pom.xml

## Module Info

Los plugins se deben desarrollar con el sistema de módulos. Necesitan el fichero *module-info.java* para acceder a los packets del SDK:

```java
module com.thirdparty.finder {
    requires gson;
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.SearchProductsService
        with com.thirdparty.finder.SearchProducts;
}
```

Es obligatorio proveer el servicio que se quiera implementar. Esto se hace vía `provides fullyQualifiedName.Service with fullyQualifiedName.YourImplementation`. LogiCommerce lo necesita para poder llamar el plugin. En este *module* se marca como ejemplo que se utilizará la interfaz SearchProductsService con la clase SearchProducts del paquete com.thirdparty.finder.

La interfaz que se implementa es el evento que llama *LogiCommerce*.

## Proyecto

Se puede utilizar Maven para la estructura del proyecto.

### Beyond SDK al proyecto

El SDK para la creación de los plugins se encuentra en un repositorio propio

[Ver Documentación repositorio](Repository.md)

#### Maven

```xml
<dependency>
    <groupId>com.logicommerce</groupId>
    <artifactId>sdk</artifactId>
    <version>1.0.0</version>
</dependency>
<dependency>
    <groupId>com.logicommerce</groupId>
    <artifactId>utilities</artifactId>
    <version>1.0.1</version>
</dependency>
<dependency>
    <groupId>com.logicommerce</groupId>
    <artifactId>sdktest</artifactId>
    <version>1.0.0</version>
</dependency>
```

##### Maven Archetype

Documentación del uso de los archetypes de maven
Crear un archetype para cada tipo de servicio.

#### Gradle

```gradle
compile(group: 'com.logicommerce', name: 'sdk', version: '1.0.0')
compile(group: 'com.logicommerce', name: 'utilities', version: '1.0.0')
compile(group: 'com.logicommerce', name: 'sdktest', version: '1.0.0')
```

#### Ivy

```xml
<dependency org="com.logicommerce" name="sdk" rev="0.0.1">
    <artifact name="sdk" ext="jar"/>
</dependency>
```
