# Validation

## Descripción

Interfaz base de una validación. Define los datos comunes a cualquier resultado de validación devuelto por **[ValidatorService](../../Services/ValidatorService.md)**: el estado, el instante de proceso y los mensajes asociados.

La extienden **[ViesValidation](ViesValidation.md)** y **[TaxIdValidation](TaxIdValidation.md)**.

## Métodos

- **[ValidationResult](../../Enums/README.md#ValidationResult)** getStatus(): estado de la validación.
- **LocalDateTime** getProcessedAt(): instante en que se procesó la validación, en formato ISO-8601 (`YYYY-MM-DDTHH:mm:ss`).
- List<**[Message](Message.md)**> getMessages(): mensajes asociados a la validación.

## Referencias

- **[ValidationResult](../../Enums/README.md#ValidationResult)**: enumerado con el estado de la validación.
- **[Message](Message.md)**: mensaje de detalle de la validación.
