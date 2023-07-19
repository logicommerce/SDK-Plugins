# PaymentKeysService

Servicio para el sistema de pago usado para:

* Recepción del pago desde la pasarela.

## Métodos disponibles

### Recepción del pago

Cuando el sistema de pago vuelve los datos, la API no puede saber a qué sistema pertenecen ni su *transactionId*. Se pasa a todos los plugins que implementan *PaymentKeysService* para que éstos devuelvan el transactionId. El encargado es el método *getPaymentKeys*.

Se tiene que detectar mediante los parámetros recibidos si el plugin es el responsable de gestionar el pago.

**Parámetros**:

* **[PaymentValidateParams](../Models/Payment/PaymentValidateParams.md)** paymentValidateParams

Devuelve **[PaymentKeys](../Models/Payment/PaymentKeys.md)**.

## Interfaz

```java
public interface PaymentKeysService extends PluginService {

    PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException;

}
```
