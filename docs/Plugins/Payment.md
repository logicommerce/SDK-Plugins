# Payment

Sistema de pago. Genera los documentos de pago y de control de la autorización del pago.

El sistema de pago tiene configuración específica que se podrá editar desde la pantalla de edición de sistemas de pago al administrador de Logicommerce.

La configuración específica es del tipo *payment_system*.

Ejemplo plugin.json:

```json
{
    "name": "Payment",
    "description": "Plugin description",
    "author": "Logicommerce",
    "date": "2019-07-03",
    "version": "0.0.1",
    "module": "com.thirdparty.payment",
    "config": [
        // ...
    ],
    "specificConfig": [{
        "type": "payment_system",
        "config": [
            // ...
        ]
    }]
}
```

## Módulo

El archivo module-info.java deberá definir el *provider*.

```java
module com.thirdparty.payment {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.PaymentService
        with com.thirdparty.payment.PaymentSystem;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio PaymentSystemService.

```java
package com.logicommerce.paytransfer;

import com.logicommerce.sdk.parameters.Order;
import com.logicommerce.sdk.parameters.PaymentValidateParams;
import com.logicommerce.sdk.models.payment.Payment;
import com.logicommerce.sdk.models.payment.PaymentKeys;
import com.logicommerce.sdk.models.payment.PaymentValidateResponse;
import com.logicommerce.sdk.services.PaymentService;
import com.logicommerce.sdk.services.PluginServiceException;

public class Payment implements PaymentService {

    @Override
    public Payment getPayment(Order order, String transactionId) throws PluginServiceException {
        // Your code
    }

    @Override
    public PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException {
        // Your code
    }

    @Override
    public PaymentValidateResponse validate(Order order, PaymentValidateParams paymentValidateParams) throws PluginServiceException {
        // Your code
    }

}
```

### Método getPayment

Genera la información que se volverá a Frente y devuelve un objeto tipo **[Payment](../APIReference/Responses/Payment.md)**.

#### Parámetros

Recibe por parámetros los datos del pedido *order* (Ver [Order](../APIReference/Parameters/Order.md)) y el identificador generado *transactionId*.

#### Respuesta

En la respuesta hay que devolver *transactionId* ya que se prevé que se permite que el sistema de pago pueda generar su propio identificador.

El SDK proporciona el builder **[PaymentBuilder](PaymentBuilder.md)** para la respuesta de tipo **Payment**. Se facilita así la creación del objeto. Si no se quiere utilizar el builder se puede devolver una clase propia que implemente **Payment**.

En la respuesta, aparte de volver *transactionId* se determina si es válido, el [tipo](../APIReference/Enums/PaymentType) que puede ser *formulario*, *offline*, *sin pago*. En caso de que sea de tipo *formulario* se debe rellenar con el método, la url y los parámetros.

##### Ejemplos

PaymentBuilder con *formulario*:

```java
new PaymentBuilder()
    .ok()
    .transactionId(transactionId)
    .form()
        .url("url")
        .post()
        .param("param1", "value")
        .param("param2", "otherValue")
        .done()
    .build();
```

PaymentBuilder *offline*:

```java
new PaymentBuilder()
    .ok()
    .offline()
    .build();
```

En el caso que no sea válido:

```java
new PaymentBuilder()
    .ko()
    .message("Message")
    .build();
```

### Método getPaymentKeys

Comprueba que la respuesta del pago concuerda con sus datos. Devuelve un objeto tipo **[PaymentKeys](../APIReference/Responses/PaymentKeys.md)**.

#### Parámetros

Recibe *paymentValidateParams* (Ver [PaymentValidateParams](../APIReference/Models/Payment/PaymentValidateParams.md)) de donde se pueden obtener los parámetros como mapa y el cuerpo de la respuesta del sistema de pago.

#### Respuesta

El SDK proporciona una implementación [PaymentKeysImpl](../APIReference/Models/Payment/PaymentKeysImpl.md) para la respuesta de tipo **PaymentKeys**.

Esta respuesta devuelve el *transactionId* y, si el sistema de pago tiene *authorizationCode*. Con estos datos, la API podrá recuperar el pedido y devolverla al plugin para que este valide el pago.

##### Ejemplo

```java
Map<String, String> params = paymentValidateParams.getParams();

// Check expected params
// ...

return new PaymentKeysImpl(params.get(TRANSACTION_KEY), params.get(AUTH_CODE_KEY));
```

### Método validate

Validar que el pago ha sido correcto y devuelve un objeto [PaymentValidateResponse](../APIReference/Responses/PaymentValidateResponse.md).

#### Parámetros

Recibe por parámetros los datos del pedido *order* (Ver [Order](../APIReference/Parameters/Order.md)) y la respuesta del sistema de pago *paymentValidateParams* (Ver [PaymentValidateParams](../APIReference/modelos/Payment/PaymentValidateParams.md)).

#### Respuesta

El SDK proporciona el builder [PaymentValidateResponseBuilder](../APIReference/Models/Payment/PaymentValidateResponse.md#builder) para la respuesta de tipo **PaymentValidateResponseBuilder**. Si no se quiere utilizar el builder se puede devolver una clase propia que implemente **PaymentValidateResponse**.

##### Ejemplo

Respuesta válida sin datos:

```java
new PaymentValidateResponseBuilder()
    .ok()
    .authorizationCode(params.get(AUTH_CODE_KEY))
    .transactionId(params.get(TRANSACTION_KEY))
    .paid(true)
    .paymentDate(LocalDateTime.now())
    .noData()
    .build()
```
