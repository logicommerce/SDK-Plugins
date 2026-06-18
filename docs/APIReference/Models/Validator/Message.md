# Message

## Descripción

Mensaje asociado a una **[Validation](Validation.md)**. Permite devolver al sistema información adicional sobre el resultado de la validación (código, texto y detalle).

## Métodos

- **String** getCode(): código del mensaje.
- **String** getMessage(): texto del mensaje.
- **String** getDetail(): detalle del mensaje.

## Builder

**MessageBuilder** devuelve una implementación de **Message**.

Puede usarse de forma independiente (con `build()`) o de forma anidada desde **[ViesValidationBuilder](ViesValidation.md#builder)** / **[TaxIdValidationBuilder](TaxIdValidation.md#builder)** mediante `addMessage()` (cerrando con `done()`).

Métodos del builder:

- *code(String code)*: establece el código del mensaje.
- *message(String message)*: establece el texto del mensaje.
- *detail(String detail)*: establece el detalle del mensaje.
- *done()*: cierra el builder anidado, añade el mensaje al padre y lo devuelve.
- *build()*: construye el objeto **Message**.

### Ejemplo

```java
Message message = new MessageBuilder<>()
    .code("INVALID_FORMAT")
    .message("El identificador fiscal no tiene un formato válido")
    .detail("Se esperaba un NIF/CIF español")
    .build();
```
