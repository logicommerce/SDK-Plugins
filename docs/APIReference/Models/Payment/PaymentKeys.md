# PaymentKeys

## Descripción

Interfaz que devuelve *transactionId* y *authorizationCode*.

## Métodos

- **String** getTransactionId ()
- **String** getAuthorizationCode ()

## Implementación

El SDK facilita el trabajo con una implementación: **PaymentKeysImpl** donde a su constructor se le puede pasar *transactionId* y *authorizationCode*.

```java
PaymentKeys paymentKeys = new PaymentKeysImpl(transactionId, authorizationCode);
```

