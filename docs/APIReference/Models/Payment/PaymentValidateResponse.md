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
- **[OrderStatusDefinition](../../Definitions/OrderStatusDefinition.md)** getOrderStatus()
- **boolean** simulateAbort()
- **boolean** validated()

## Referencias

- **[PaymentValidateResponseType](../../Enums/README.md#PaymentValidateResponseType)**: Enumerado
- **[PaymentData](PaymentData.md)**
- **[OrderStatusDefinition](../../Definitions/OrderStatusDefinition.md)** 

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
- *form()*: Cuando la validación devuelve un formulario para la vista (Ver **[PaymentDataForm](PaymentDataForm.md)**).
- *simulateAbort()*: Cuando la validación no requiere que se muestre en una vista.
- *validated()*: Para indicar que la validación ya ha sido realizada anteriormente.

