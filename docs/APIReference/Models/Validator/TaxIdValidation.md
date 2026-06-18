# TaxIdValidation

## Descripción

Resultado de la validación de un identificador fiscal. Es la respuesta del método `validateTaxId` de **[ValidatorService](../../Services/ValidatorService.md)**.

Extiende **[Validation](Validation.md)**, por lo que también dispone de `getStatus()`, `getProcessedAt()` y `getMessages()`.

## Métodos

Heredados de **[Validation](Validation.md)**:

- **[ValidationResult](../../Enums/README.md#ValidationResult)** getStatus()
- **LocalDateTime** getProcessedAt()
- List<**[Message](Message.md)**> getMessages()

Propios:

- **boolean** isBlocking(): indica si la validación es bloqueante (impide continuar el proceso si no es válida).
- **[TaxIdInformation](TaxIdInformation.md)** getTaxIdInformation(): información normalizada del identificador fiscal.

## Referencias

- **[Validation](Validation.md)**: interfaz base de la validación.
- **[TaxIdInformation](TaxIdInformation.md)**: identificador fiscal en formato compacto y estándar.

## Builder

**TaxIdValidationBuilder** devuelve una implementación de **TaxIdValidation**.

Métodos del builder:

- *validationResult(ValidationResult validationResult)*: establece el estado de la validación.
- *processedAt(LocalDateTime processedAt)*: establece el instante de proceso (ISO-8601).
- *messages(List<Message> messages)*: establece la lista de mensajes.
- *addMessage()*: inicia un **[Message](Message.md)** anidado; con `done()` se añade a la lista y se vuelve al builder.
- *blocking(boolean blocking)*: indica si la validación es bloqueante.
- *taxIdInformation(TaxIdInformation taxIdInformation)*: establece una **[TaxIdInformation](TaxIdInformation.md)** ya construida.
- *taxIdInformation()*: inicia un **[TaxIdInformation](TaxIdInformation.md)** anidado; con `done()` se vuelve al builder.
- *build()*: construye el objeto **TaxIdValidation**.

### Ejemplo

```java
TaxIdValidation validation = new TaxIdValidationBuilder()
    .validationResult(ValidationResult.VALID)
    .processedAt(LocalDateTime.now())
    .blocking(true)
    .taxIdInformation()
        .taxIdCompact("ESB12345678")
        .taxIdStandard("ES B12345678")
        .done()
    .build();
```
