# Order

Gestiona el finalizado y la edición del pedido.

Su uso está pensado para añadir funcionalidades en el momento de crear o editar un pedido.

## Configuración

No requiere una configuración específica. Ejemplo del archivo plugin.json:

```json
{
    "name": "Order plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-25",
    "version": "1.1",
    "module": "com.thirdparty.checkout",

    "properties": [
        {
            "identifier": "endPoint",
            "type": "string",
            "defaultValue": "http://api.thirdparty.com/checkout/",
            "language": {
                "es": "URL del servidor",
                "en": "End point",
                "chi": "End point"
            }
        },{
            "identifier": "apiKey",
            "type": "string",
            "required": true,
            "language": {
                "es": "API key",
                "en": "API key",
                "chi": "API key"
            }
        }
        // ...
    ]
}
```

## Módulo

El archivo module-info.java deberá definir el *provider*.

```java
module com.thirdparty.order {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.OrderService
    with com.thirdparty.order.OrderThirdParty;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio orderService.

```java
public class OrderThirdParty implements OrderService {

    @Aggregate
    private Configuration configuration;

    @Override
    public void create(Order order) throws PluginServiceException {
        // Your code
    }
    
    @Override
    public void edit(Order order) throws PluginServiceException {
        // Your code
    }

}
```

En este caso se inyecta la clase Configuration para obtener la configuración del plugin (definida en plugin.json). Ver [Configuration](Configuration.md).

El método *create* recibe el parámetro **[order](../APIReference/Models/order/Order.md)** de donde se pueden obtener todos los datos del pedido creado.

El método *edit* recibe el parámetro **[order](../APIReference/Models/order/Order.md)** de donde se pueden obtener todos los datos del pedido modificado.

