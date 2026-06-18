# ViesValidation

## Descripción

Resultado de la validación de un número de IVA contra el sistema **VIES** (VAT Information Exchange System). Es la respuesta del método `validateVies` de **[ValidatorService](../../Services/ValidatorService.md)**.

Extiende **[Validation](Validation.md)**, por lo que también dispone de `getStatus()`, `getProcessedAt()` y `getMessages()`.

## Métodos

Heredados de **[Validation](Validation.md)**:

- **[ValidationResult](../../Enums/README.md#ValidationResult)** getStatus()
- **LocalDateTime** getProcessedAt()
- List<**[Message](Message.md)**> getMessages()

Propios:

- **[ViesInformation](ViesInformation.md)** getViesInformation(): información obtenida de VIES para el número de IVA validado.

## Referencias

- **[Validation](Validation.md)**: interfaz base de la validación.
- **[ViesInformation](ViesInformation.md)**: datos devueltos por VIES.

## Builder

**ViesValidationBuilder** devuelve una implementación de **ViesValidation**.

Métodos del builder:

- *validationResult(ValidationResult validationResult)*: establece el estado de la validación.
- *processedAt(LocalDateTime processedAt)*: establece el instante de proceso (ISO-8601).
- *messages(List<Message> messages)*: establece la lista de mensajes.
- *addMessage()*: inicia un **[Message](Message.md)** anidado; con `done()` se añade a la lista y se vuelve al builder.
- *viesInformation(ViesInformation viesInformation)*: establece una **[ViesInformation](ViesInformation.md)** ya construida.
- *viesInformation()*: inicia un **[ViesInformation](ViesInformation.md)** anidado; con `done()` se vuelve al builder.
- *build()*: construye el objeto **ViesValidation**.

### Ejemplo

```java
ViesValidation validation = new ViesValidationBuilder()
    .validationResult(ValidationResult.VALID)
    .processedAt(LocalDateTime.now())
    .viesInformation()
        .vat("ESB12345678")
        .name("Empresa Ejemplo SL")
        .state("Barcelona")
        .city("Barcelona")
        .postalCode("08001")
        .address("Calle Ejemplo 1")
        .done()
    .build();
```
