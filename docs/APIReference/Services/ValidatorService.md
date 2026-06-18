# ValidatorService

Servicio para la validación de identificadores fiscales (Tax ID) y números de IVA intracomunitario (VIES).

Un plugin que implemente este servicio se conecta como conector de tipo **VIES_VALIDATOR** o **TAX_ID_VALIDATOR** (ver **[ConnectorType](../Enums/README.md#ConnectorType)**) y es invocado por LogiCommerce cuando necesita validar un identificador fiscal, normalmente durante el checkout o al gestionar los datos fiscales de un usuario.

*Disponible desde la versión 2.7.6.*

## Métodos disponibles

### Validar IVA intracomunitario (validateVies)

Valida un número de IVA contra el sistema **VIES** (VAT Information Exchange System) de la Unión Europea.

parámetros:

- **String** taxId: identificador fiscal / número de IVA a validar.
- **String** countryCode: código de país (ISO) al que pertenece el identificador.

Devuelve un **[ViesValidation](../Models/Validator/ViesValidation.md)** con el resultado de la validación y la información obtenida de VIES.

### Validar identificador fiscal (validateTaxId)

Valida un identificador fiscal según su tipo y el tipo de titular.

parámetros:

- **String** taxId: identificador fiscal a validar.
- **String** countryCode: código de país (ISO) al que pertenece el identificador.
- **[TaxIdType](../Enums/README.md#TaxIdType)** taxIdType: tipo de identificador fiscal (`TIN`, `CONSUMPTION_TAX`).
- **[TaxIdOwnerType](../Enums/README.md#TaxIdOwnerType)** taxIdOwnerType: tipo de titular (`NATURAL_PERSON`, `LEGAL_ENTITY`).

Devuelve un **[TaxIdValidation](../Models/Validator/TaxIdValidation.md)** con el resultado de la validación, si es bloqueante y la información normalizada del identificador.

## Interfaz

```java
public interface ValidatorService extends PluginService {

    ViesValidation validateVies(String taxId, String countryCode) throws PluginServiceException;

    TaxIdValidation validateTaxId(String taxId, String countryCode, TaxIdType taxIdType, TaxIdOwnerType taxIdOwnerType) throws PluginServiceException;

}
```

## Definiciones

Para la configuración del conector se proporcionan las siguientes definiciones (ver **[ConnectorDefinition](../Definitions/ConnectorDefinition.md)**):

- **ViesValidatorDefinition**: define el conector de tipo `VIES_VALIDATOR`.
- **TaxIdValidatorDefinition**: define el conector de tipo `TAX_ID_VALIDATOR`.

## Referencias

- **[ViesValidation](../Models/Validator/ViesValidation.md)**
- **[TaxIdValidation](../Models/Validator/TaxIdValidation.md)**
- **[ValidationResult](../Enums/README.md#ValidationResult)**
- **[TaxIdType](../Enums/README.md#TaxIdType)**
- **[TaxIdOwnerType](../Enums/README.md#TaxIdOwnerType)**
- **[PluginServiceException](PluginServiceException.md)**
