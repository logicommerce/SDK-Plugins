# Sistemas de transporte

Gestiona el sistema de transporte. Permite

## Configuración

No requiere de una configuración específica. Ejemplo de archivo plugin.json:

```json
{
    "name": "Newsletter plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-25",
    "version": "1.1",
    "module": "com.thirdparty.mailing",

    "properties": [
        // ...
    ],
    
    "connector": [
        {
            "type": "SHIPPER",
        },
        {
            "type": "SHIPPING_TYPE"
        }
    ]
}
```

## Módulo

El archivo module-info.java deberá definir los diferentes *providers* referentes al **shipper**.

```java
module com.thirdparty.shipper {
    requires com.logicommerce.sdk;
    
    provides com.logicommerce.sdk.services.DefinitionService
       with com.thirdparty.shipper.Definition;
    
    provides com.logicommerce.sdk.services.ShipperService
       with com.thirdparty.shipper.Shipper;
    
    provides com.logicommerce.sdk.services.ShippingTypeService
       with com.thirdparty.shipper.ShippingType;
    
    provides com.logicommerce.sdk.services.ShipmentActionService
       with com.thirdparty.shipper.ShipmentAction;
    
    provides com.logicommerce.sdk.services.ShipmentStatusService
       with com.thirdparty.shipper.ShipmentStatus;
}
```

## Services

### ShipperService

#### Método getAvailableCarriers

> Comprovar que el nombre es correcto (debería ser shipper?)

Permite obtener los diferentes "carriers"/shippers. Logicommerce, con los carriers disponibles que le devuelve el plugin, comprueba que estan definidos en la base de datos. Si estan definido, será los shippers que se podrán ver en el basket.

Para su comprovación, los carriers también deben estar definidos en la definición del plugin (definición estática o dinámica). De esta manera, en el administrador, se podrá crear el shipper en base la definición del plugin.

##### Método selectShipper

Envia al plugin el shipper seleccionado por el usuario.

### ShippingTypeService

Este servicio solo sirve para determinar que el plugin tiene shippingType.

### ShipmentActionService

Servicio para procesar las diferentes acciones del transportista.

Hay tres tipos de acciones:

- PICKUP
- REFUND
- TRACKING

Estas acciones ser reciben con peticiones que vendran del SQS.

#### Método processAction

Recibe el la expedición del pedido y la acción a realizar. El método devuelve la misma expedición.

### ShipmentStatusService

Servicio con funcionamiento similar al anterior. Procesa los cambios de estado de la expedición.

Acciones de estado disponibles:

- INCIDENTS
- PENDING
- PROCESSING
- SHIPPED
- DELIVERED

#### Método changeStatus

Recibe el la expedición del pedido y el cambio de estado. El método devuelve la misma expedición.
