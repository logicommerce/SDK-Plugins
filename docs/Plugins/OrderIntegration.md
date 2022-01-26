# OrderIntegration

Gestiona el finalizado y la edición del pedidos.

Su uso está pensado para añadir funcionalidades en el momento de crear o editar un pedido.

## Configuración

No requiere una configuración específica. Ejemplo del archivo plugin.json:

```json
{
    "name": "Order Integration plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-25",
    "version": "1.1",
    "module": "com.thirdparty.orderIntegration",

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
module com.thirdparty.orderIntegration {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.OrderService
    with com.thirdparty.orderIntegration.OrderIntegrationThirdParty;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio orderIntegrationService.

```java
public class OrderThirdParty implements OrderService {

    @Aggregate
    private Configuration configuration;

    @Override
    List<Order> importOrders(String data) throws PluginServiceException;

}
```

En este caso se inyecta la clase Configuration para obtener la configuración del plugin (definida en plugin.json). Ver [Configuration](Configuration.md).

El método *importOrders* retorna una lista de pedidos a integrar en el sistema.

Para crear los pedios el plugin dispone de un builder específico **OrderSdkBuilder**

#### **Referencias**

[Order](../APIReference/Models/Order/Order.md)

OrderSdkBuilder