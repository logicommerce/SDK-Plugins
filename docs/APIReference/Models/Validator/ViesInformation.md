# ViesInformation

## Descripción

Información devuelta por el sistema **VIES** al validar un número de IVA. Forma parte de **[ViesValidation](ViesValidation.md)**.

## Métodos

- **String** getVat(): número de IVA.
- **String** getName(): nombre o razón social asociada al número de IVA.
- **String** getState(): provincia / estado.
- **String** getCity(): población.
- **String** getPostalCode(): código postal.
- **String** getAddress(): dirección.

## Builder

**ViesInformationBuilder** devuelve una implementación de **ViesInformation**.

Puede usarse de forma independiente (con `build()`) o de forma anidada desde **[ViesValidationBuilder](ViesValidation.md#builder)** mediante `viesInformation()` (cerrando con `done()`).

Métodos del builder:

- *vat(String vat)*: establece el número de IVA.
- *name(String name)*: establece el nombre o razón social.
- *state(String state)*: establece la provincia / estado.
- *city(String city)*: establece la población.
- *postalCode(String postalCode)*: establece el código postal.
- *address(String address)*: establece la dirección.
- *done()*: cierra el builder anidado y vuelve al **ViesValidationBuilder**.
- *build()*: construye el objeto **ViesInformation**.

## Referencias

- **[ViesValidation](ViesValidation.md)**: validación que contiene esta información.
