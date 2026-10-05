# AddressView

## Descripción

Dirección postal de un pedido: la de envío o la de un punto de recogida. Cada campo es *null* si no se conoce.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getFirstName()
- **String** getLastName()
- **String** getCompany()
- **String** getAddress(): calle seguida del número, si lo hay.
- **String** getAddressAdditionalInformation()
- **String** getCity()
- **String** getState()
- **String** getPostalCode()
- **String** getCountryCode(): ISO 3166-1 alfa-2.
- **String** getPhone()
