# PaymentValidateResponse

## Descripción

Respuesta de la validación del pago:

## Métodos

- **String** getMessage()
- **String** getTransactionId()
- **String** getAuthorizationCode()
- **boolean** isPaid()
- **LocalDateTime** getPaymentDate()
- **PaymentValidateResponseType** getType()
- **[PaymentData](PaymentData.md)** getData()
- **[OrderStatusDefinition](../../Definitions/OrderStatusDefinition.md)** getOrderStatus()
- **[PaymentValidateStatusType](../../Enums/README.md#PaymentValidateStatusType)** getStatus()

## Referencias

- **[PaymentValidateResponseType](../../Enums/README.md#PaymentValidateResponseType)**: Enumerado
- **[PaymentValidateStatusType](../../Enums/README.md#PaymentValidateStatusType)**: Enumerado
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
- *skip()*: Cuando la validación no requiere acciones.
- *webhookMessage()*: Cuando la validación requiere que se muestre mensaje.
- *validated()*: Para indicar que la validación ya ha sido realizada anteriormente.

