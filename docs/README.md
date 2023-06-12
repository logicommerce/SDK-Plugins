# Introducción

## Filosofía

Los plugins son aplicaciones programadas sobre un *SDK* proporcionado por Logicommerce que **LogiCommerce Headless API** utiliza y ejecuta cuando lo requiere.

### Ejecución de un plugin

Todas las ejecuciones de un plugin empiezan por un *servicio*. Este servicio es una interfaz proporcionada por el *SDK* que hay que definir en el module-info.java e implementar. De este modo Beyond podrá llamar a los métodos del servicio que necesite con la implementación del plugin.

#### Permisos de ejecución de la tienda

Los plugins sólo se ejecutarán cuando la tienda lo tenga contratado.

### Definición de la configuración de un plugin

Para la configuración del plugin, éste deberá proporcionar una definición. La definición se puede proporcionar desde el fichero JSON (plugin.json) o con la implementación del servicio *DefinitionService*. Las propiedades de la configuración se guardarán en la base de datos de la tienda para cada plugin.

Desde el administrador podrá configurar los parámetros que el plugin necesita.

#### Definiciones con idioma

Una propiedad de la configuración puede tener el valor según el idioma.

#### Definiciones específicas

Según lo que el plugin necesite, puede haber configuraciones específicas de cada módulo de LogiCommerce como podría ser el sistema de pago, recomendador o transportista entre otros. Esta definición específica generará una configuración por el plugin y por el módulo, permitiendo que un plugin tenga diferentes configuraciones en una misma tienda.

Las configuraciones específicas editarán en la pantalla de cada módulo del administrador.

## Desarrollo de un plugin

Para el desarrollo de un plugin se debe seguir una estructura de ficheros, es requerida una definición y se base en *Services*:

### Creación de un plugin

Explicación base de la concreción de un plugin.

1. [Requerimientos](Requires.md)
2. [Estructura](Structure.md)
3. [Definición](Definition.md)
4. [Servicios](Services.md)
   - [Anotaciones](Annotations.md)
   - [Recursos](Resources.md)
   - [Testing](Testing.md)

### Tipo de Plugin

Se explica la creación de plugins simples para cada tipo. Hay que tener en cuenta, sin embargo, que un plugin no sólo puede ser de un solo tipo. Puede tener varios ya que cada tipo puede equivaler a un *Servicio*.

- [Recomendador - Secciones - Relacionados](Plugins/RelatedItems.md)
- [Buscador de productos](Plugins/SearchProducts.md)
- [Newsletter](Plugins/Newsletter.md)
- [Sistemas de pago](Plugins/Payment.md)
- [Pedido](Plugins/Order.md)
- [usuario](Plugins/User.md)
- [Cesta](Plugins/Basket.md) 
- [Sistemas de transporte](Plugins/ShipmentSystems.md)
- [Trackers](Plugins/Trackers.md)

### API Reference

Referencia general para la creación de plugins.

[Referencia de la API](APIReference/)

- [Enums](APIReference/Enums/)
- [Models](APIReference/Models/)
- [Resources](APIReference/Resources/)
- [Services](APIReference/Services/)