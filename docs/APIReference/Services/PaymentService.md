# PaymentService

Servicio para el sistema de pago.

Este servicio se utiliza en dos momentos diferentes (e instancias diferentes):

1. Preparación del pago.
2. Recepción y validación del pago desde la pasarela.

## Métodos disponibles

### Preparación del pago

Para la preparación del pago utiliza el método *getPayment*.

parámetros:

- **[Order](../Models/Order/Order.md)** order
- **String** transactionId

Devuelve **[Payment](../Models/Payment/Payment.md)**.

### Recepción y validación del pago

#### Recepción

Cuando el sistema de pago vuelve los datos, la API no puede saber a qué sistema pertenecen ni su *transactionId*. Se pasa a todos los plugins que implementan *PaymentService* para que éstos devuelvan el transactionId. El encargado es el método *getPaymentKeys*.

parámetros:

- **[PaymentValidateParams](../Models/Payment/PaymentValidateParams.md)** paymentValidateParams

Devuelve **[PaymentKeys](../Models/Payment/PaymentKeys.md)**.

#### Validación

Una vez se sabe con qué sistema se ha efectuado el pago se llama el método *validate*.

parámetros:

- **[Order](../Models/Order/Order.md)** order
- **[PaymentValidateParams](../Models/Payment/PaymentValidateParams.md)** paymentValidateParams

Devuelve **[PaymentValidateResponse](../Models/Payment/PaymentValidateResponse)**.

## Interfaz

```java
public interface PaymentService extends PluginService {

    Payment getPayment(Order order, String transactionId) throws PluginServiceException;

    PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException;

    PaymentValidateResponse validate(Order order, PaymentValidateParams paymentValidateParams) throws PluginServiceException;

}
```
