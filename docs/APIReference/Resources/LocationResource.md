# LocationResource

## Descripción

El recurso permite acceder a datos de localización e idioma. Se puede acceder a este recurso desde cualquier servicio.

## Métodos

- **Integer** getCommerceId()
- **List<Location>** getLocationsPath(Integer languageId, Integer countryId, Integer parentLocationId)
- **List<Location>** getLocations(String languageCode, String countryCode, String postalCode)
- **Integer** getCountryId(String countryCode)
- **String** getCountryName(String countryCode)
- **String** getCountryCode(Integer countryId)
- **String** getStateCode(Integer languageId, Integer countryId, Integer locationId)
- **String** getStateName(Integer languageId, Integer countryId, Integer locationId)
- **String** getLanguageCode(Integer languageId)
- **Integer** getLanguageId(String languageCode)
- **double** convertCurrency(String sourceCurrencyCode, String targetCurrencyCode, double amount)