# PaymentService

Servicio para el sistema de pago.

Este servicio se utiliza en tres momentos diferentes (e instancias diferentes):

1. Preparación del pago.
2. Validación del pago desde la pasarela.
3. Obtener y eliminar tokens de pago.

## Métodos disponibles

### Preparación del pago

Para la preparación del pago utiliza el método *getPayment*.

parámetros:

- **[Order](../Models/Order/Order.md)** order
- **String** transactionId

Devuelve **[Payment](../Models/Payment/Payment.md)**.

### Validación del pago

Una vez se sabe con qué sistema se ha efectuado el pago se llama el método *validate*.

parámetros:

- **[Order](../Models/Order/Order.md)** order
- **[RequestParams](../Models/RequestParams.md)** requestParams

Devuelve **[PaymentValidateResponse](../Models/Payment/PaymentValidateResponse.md)**.

### Tokenización

Para obtener listado de tokens de tarjetas que el usuario puede tener guardados se llama el método *getPaymentTokens*.

Devuelve:

-  **[List(PaymentToken)](../Models/Payment/PaymentToken.md)**.

Para eliminar un token registrado se llama el método *deletePaymentToken*.

Parámetros:

- **String** token

## Interfaz

```java
public interface PaymentService extends PluginService {

    Payment getPayment(Order order, String transactionId) throws PluginServiceException;

    PaymentValidateResponse validate(Order order, RequestParams requestParams) throws PluginServiceException;
    
   	List<PaymentToken> getPaymentTokens();

	void deletePaymentToken(String token);

}
```
