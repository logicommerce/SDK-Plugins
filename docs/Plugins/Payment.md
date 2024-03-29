# Payment

Sistema de pago. Genera los documentos de pago y de control de la autorización del pago.

El plugin de sistema de pago puede necesitar de configuración que se podrá editar desde la pantalla de edición de plugins en el administrador de Logicommerce, esta vendrá definida en la sección *properties*.

El sistema de pago en sí, tiene configuración específica que se podrá editar desde la pantalla de edición de sistemas de pago en el administrador de Logicommerce.

La configuración específica definida en la sección *connectors* es del tipo *payment_system*.

Ejemplo plugin.json:

```json
{
    "name": "Payment",
    "description": "Plugin description",
    "author": "Logicommerce",
    "date": "2019-07-03",
    "version": "0.0.1",
    "module": "com.thirdparty.payment",
    "properties": [
        // ...
    ],
    "connectors": [{
        "type": "payment_system",
        "properties": [
            // ...
        ]
    }]
}
```

ver [Definición](../Definition.md)

## Módulo

El archivo module-info.java deberá definir el *provider*.

```java
module com.thirdparty.payment {
    requires com.logicommerce.sdk;
	
    provides com.logicommerce.sdk.services.PaymentService
        with com.thirdparty.payment.Payment;
    provides com.logicommerce.sdk.services.PaymentKeysService
        with com.thirdparty.payment.PaymentKeys;
    provides com.logicommerce.sdk.services.PaymentSytemService
        with com.thirdparty.payment.PaymentSystem;
    provides com.logicommerce.sdk.services.DefinitionService
        with com.thirdparty.payment.Definition;
}
```

## Implementación PaymentService

En el siguiente código se muestra parte del código de la implementación del servicio PaymentService.

```java
package com.logicommerce.thirdparty;

import com.logicommerce.sdk.parameters.Order;
import com.logicommerce.sdk.parameters.PaymentValidateParams;
import com.logicommerce.sdk.models.payment.Payment;
import com.logicommerce.sdk.models.payment.PaymentKeys;
import com.logicommerce.sdk.models.payment.PaymentValidateResponse;
import com.logicommerce.sdk.services.PaymentService;
import com.logicommerce.sdk.services.PluginServiceException;

public class PaymentThirdParty implements PaymentService {

    @Override
    public Payment getPayment(Order order, String transactionId) throws PluginServiceException {
        // Your code
    }

    @Override
    public PaymentValidateResponse validate(Order order, PaymentValidateParams paymentValidateParams) throws PluginServiceException {
        // Your code
    }
    
    @Override
    public List<PaymentToken> getPaymentTokens() {
        // Your code
    }

    @Override
    public void deletePaymentToken(String token) {
        // Your code
    }

}
```

### Método getPayment

Genera la información que se volverá a Frente y devuelve un objeto tipo **[Payment](../APIReference/Models/Payment/Payment.md)**.

#### Parámetros

Recibe por parámetros los datos del pedido *order* (Ver [Order](../APIReference/Models/Order/Order.md)) y el identificador generado *transactionId*.

#### Respuesta

En la respuesta hay que devolver *transactionId* ya que se prevé que se permite que el sistema de pago pueda generar su propio identificador.

El SDK proporciona el builder **[PaymentBuilder](../APIReference/Models/Payment/Payment.md)** para la respuesta de tipo **Payment**. Se facilita así la creación del objeto. Si no se quiere utilizar el builder se puede devolver una clase propia que implemente **Payment**.

En la respuesta, aparte de volver *transactionId* se determina si es válido, el [tipo](../APIReference/Enums/README.md#PaymentType) que puede ser *formulario*, *offline*, *widget*, *sin pago*. En caso de que sea de tipo *formulario* se debe rellenar con el método, la url y los parámetros. En el caso de que sea de tipo widget se puede pasar mensaje con el elemento.

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

PaymentBuilder *widget*:

```java
new PaymentBuilder()
    .ok()
    .transactionId(transactionId)
    .widget()
    .message(iframeWidget)
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

### Método validate

Validar que el pago ha sido correcto y devuelve un objeto [PaymentValidateResponse](../APIReference/Models/Payment/PaymentValidateResponse.md).

#### Parámetros

Recibe por parámetros los datos del pedido *order* (Ver [Order](../APIReference/Models/Order/Order.md)) y la respuesta del sistema de pago *paymentValidateParams* (Ver [PaymentValidateParams](../APIReference/Models/Payment/PaymentValidateParams.md)).

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

### Método getPaymentTokens

Obtener los tokens guardados en función del usuario activo. lista de [PaymentToken](../APIReference/Models/Payment/PaymentToken.md).

#### Respuesta

El SDK proporciona el builder [PaymentTokenBuilder](../APIReference/Models/Payment/PaymentToken.md#builder) para la respuesta de tipo **[List PaymentToken](../APIReference/Models/Payment/PaymentToken.md)** . Si no se quiere utilizar el builder se puede devolver una clase propia que implemente **PaymentToken**.

##### Ejemplo

```java
new PaymentTokenBuilder()
    .token(token)
    .addItem(key1, value1)
    .addItem(key2, value2)
    .build();
```

### Método deletePaymentTokens

Eliminar token, siempre en función del usuario activo. 

#### Parámetros

Recibe por parámetro **String** con el token (identificador) a eliminar.

##### Ejemplo

```java
	@Resource
	private UserData userData;
	//...

	@Override
	public void deletePaymentToken(String tokenId) {
		if(userData.get(tokenId) != null) {
			userData.remove(tokenId);
		}
	}
```

#### **Referencias**

[@Resource](../Annotations.md#Resource)

[UserData](../APIReference/Resources/UserData.md)

## Implementación PaymentKeysService

En el siguiente código se muestra parte del código de la implementación del servicio PaymentKeysService.

```java
package com.logicommerce.paytransfer;

import com.logicommerce.sdk.parameters.Order;
import com.logicommerce.sdk.parameters.PaymentValidateParams;
import com.logicommerce.sdk.models.payment.Payment;
import com.logicommerce.sdk.models.payment.PaymentKeys;
import com.logicommerce.sdk.models.payment.PaymentValidateResponse;
import com.logicommerce.sdk.services.PaymentService;
import com.logicommerce.sdk.services.PluginServiceException;

public class PaymentKeysThirdParty implements PaymentKeysService {

    @Override
    public PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException {
        // Your code
    }

}
```

### Método getPaymentKeys

Comprueba que la respuesta del pago concuerda con sus datos. Devuelve un objeto tipo **[PaymentKeys](../APIReference/Models/Payment/PaymentKeys.md)**.

#### Parámetros

Recibe *paymentValidateParams* (Ver [PaymentValidateParams](../APIReference/Models/Payment/PaymentValidateParams.md)) de donde se pueden obtener los parámetros como mapa y el cuerpo de la respuesta del sistema de pago.

#### Respuesta

El SDK proporciona una implementación [PaymentKeysImpl](../APIReference/Models/Payment/PaymentKeys.md#implementacion) para la respuesta de tipo **PaymentKeys**.

Esta respuesta devuelve el *transactionId* y, si el sistema de pago tiene *authorizationCode*. Con estos datos, la API podrá recuperar el pedido y devolverla al plugin para que este valide el pago.

##### Ejemplo

```java
Map<String, String> params = paymentValidateParams.getParams();

// Check expected params
// ...

return new PaymentKeysImpl(params.get(TRANSACTION_KEY), params.get(AUTH_CODE_KEY));
```



## Implementación PaymentSystemService

En caso de necesitar propiedades adicionales se debe de implementar la interfaz PaymentSystemService.

En el siguiente código se muestra parte del código de la implementación del servicio PaymentSystemService.

```java
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.models.payment.PaymentSystemProperties;
import com.logicommerce.sdk.models.payment.PaymentSystemPropertiesImpl;
import com.logicommerce.sdk.models.payment.PaymentSystemProperty;
import com.logicommerce.sdk.models.payment.PaymentSystemPropertyImpl;
import com.logicommerce.sdk.resources.Logger;
import com.logicommerce.sdk.resources.Storage;
import com.logicommerce.sdk.resources.UserData;
import com.logicommerce.sdk.services.PaymentSystemService;
import com.logicommerce.sdk.services.PluginServiceException;

public class PaymentSystemThirdParty implements PaymentSystemService {
	
	@Override
	public PaymentSystemProperties getProperties() throws PluginServiceException {
		 // Your code
	}
    
	@Override
	public void selectProperty(String propertyName, Map<String, String> additionalData) throws PluginServiceException {
		 // Your code
	}

}
```

### Método getProperties

Método utilizado para devolver propiedades adicionales necesarias para la forma de pago. Devuelve un objeto tipo **[PaymentSystemProperties](../APIReference/Models/Payment/PaymentSystemProperties.md)**.

#### Parámetros

Recibe *paymentValidateParams* (Ver [PaymentValidateParams](../APIReference/Models/Payment/PaymentValidateParams.md)) de donde se pueden obtener los parámetros como mapa y el cuerpo de la respuesta del sistema de pago.

#### Respuesta

El SDK proporciona una implementación [PaymentSystemPropertiesImpl](../APIReference/Models/Payment/PaymentSystemProperties.md) para la respuesta de tipo **PaymentSystemProperties**.

Esta respuesta devuelve un lista de propiedades adicionales. Estos datos pueden ser utilizado en la representación de la forma de pago.

##### Ejemplo

```java
@Resource
private UserData userData;
// ...

List<PaymentSystemProperty> properties = userData.entrySet().stream()
			.map(this::prepareProperty)
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
return new PaymentSystemPropertiesImpl(properties);

```

#### **Referencias**

[@Resource](../Annotations.md#Resource)

[UserData](../APIReference/Resources/UserData.md)

## Implementación DefinitionService

Todos los plugins necesitan implementar la interfaz DefinitionService. (com.logicommerce.sdk.services.DefinitionService)

ver  **[DefinitionService](../APIReference/Services/DefinitionService.md)**

