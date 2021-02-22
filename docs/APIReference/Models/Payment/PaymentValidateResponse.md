# PaymentValidateResponse

## Descripción

Respuesta de la validación del pago:

## Métodos

- **boolean** isSuccess()
- **String** getMessage()
- **String** getTransactionId()
- **String** getAuthorizationCode()
- **boolean** isPaid()
- **LocalDateTime** getPaymentDate()
- ***PaymentValidateResponseType*** getType()
- **[PaymentData](PaymentData.md)** getData()
- **[OrderStatusDefinition](../../Definitions/OrderStatusDefinition.md)** getOrderStatus();

## Referencias

- **PaymentValidateResponseType**: Enumerado
- **[PaymentData](PaymentData.md)**

## Builder

**PaymentValidateResponseBuilder** devuelve una implementación de **PaymentValidateResponse**.

Métodos del builder:

- *ok()*: Cuando es válido.
- *ko()*: Si no ha pasado la validación.
- *message(String message)*: Mensaje que se guarda como Log
- *transactionId(String transactionId)*
- *authorizationCode(String authorizationCode)*
- *paid(boolean paid)*: Determina si el pago se ha efectuado o no.
- *paymentDate(LocalDateTime paymentDate)*
- *noData()*: Cuando la validación no devuelve datos para la vista.
- *form()*: Cuando la validación devuelve un formulario para la vista (Ver **[PaymentDataForm](PaymentData.md#PaymentDataForm)**).
