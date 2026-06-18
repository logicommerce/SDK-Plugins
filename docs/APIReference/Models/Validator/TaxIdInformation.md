# TaxIdInformation

## Descripción

Información normalizada de un identificador fiscal. Forma parte de **[TaxIdValidation](TaxIdValidation.md)** y proporciona el identificador en sus distintos formatos.

## Métodos

- **String** getTaxIdCompact(): identificador fiscal en formato compacto (sin separadores).
- **String** getTaxIdStandard(): identificador fiscal en formato estándar.

## Builder

**TaxIdInformationBuilder** devuelve una implementación de **TaxIdInformation**.

Puede usarse de forma independiente (con `build()`) o de forma anidada desde **[TaxIdValidationBuilder](TaxIdValidation.md#builder)** mediante `taxIdInformation()` (cerrando con `done()`).

Métodos del builder:

- *taxIdCompact(String taxIdCompact)*: establece el formato compacto del identificador.
- *taxIdStandard(String taxIdStandard)*: establece el formato estándar del identificador.
- *done()*: cierra el builder anidado y vuelve al **TaxIdValidationBuilder**.
- *build()*: construye el objeto **TaxIdInformation**.

## Referencias

- **[TaxIdValidation](TaxIdValidation.md)**: validación que contiene esta información.
