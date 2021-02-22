# Payment

## Descripción

Interface que devuelve los datos del pago.

## Métodos

- **boolean** isSuccess()
- **String** getMessage()
- **String** getTransactionId()
- ***PaymentType*** getType()
- **[PaymentData](PaymentData.md)** getData()

## Referencias

- **PaymentType**: Enumerado
- **[PaymentData](PaymentData.md)**

## Builder

El SDK proporciona un builder para facilitar la creación del objeto de tipo **Payment**: PaymentBuilder.

Métodos del builder:

- *ok()*: Cuando es válido.
- *ko()*: Si no ha pasado la validación.
- *message(String message)*: Mensaje que se guarda como Log
- *transactionId(String transactionId)*
- *offline()*: El pago es offline
- *noPay()*: El sistema de pago no requiere un pago.
- *form()*: Cuando devuelve un formulario para la vista (Ver [PaymentData Form](PaymentData.md#Form)).
