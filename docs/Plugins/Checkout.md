# Checkout

Gestiona la finalitzación del pedido.

## Configuración

No requiere una configuración específica. Ejemplo del archivo plugin.json:

```json
{
    "name": "Checkout plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-25",
    "version": "1.1",
    "module": "com.thirdparty.checkout",

    "properties": [
        {
            "name": "endPoint",
            "type": "string",
            "defaultValue": "http://api.thirdparty.com/checkout/",
            "language": {
                "es": "URL del servidor",
                "en": "End point",
                "chi": "End point"
            }
        },{
            "name": "apiKey",
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
module com.thirdparty.checkout {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.OrderService
    with com.thirdparty.checkout.Checkout;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementaciópn del servicio CheckoutService.

```java
public class Newsletter implements OrderService {

    @Aggregate
    private Configuration configuration;

    @Override
    public void confirm(Order order) throws PluginServiceException {
        // Your code
    }

}
```

En este caso se inyecta la classe Configuration para obtener la configuración del plugin (definida en plugin.json). Ver [Configuration](Configuration.md).

El método *confirm* recibe el parámetro **[order](../APIReference/Models/order/Order.md)** de donde se pueden obtener todos los datos del pedido.

