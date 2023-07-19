# Location

## Descripción

El recurso permite consultar los datos de localización e idioma.

## Métodos

- **List**<**[Location](Location.md)**> getLocationsPath(**Integer** languageId, **Integer** countryId, **Integer** locationId)
- **Integer** getCountryId(**String** countryCode)
- **String** getCountryName(**String** countryCode)
- **String** getCountryCode(**Integer** countryId)
- **String** getStateCode(**Integer** languageId, **Integer** countryId, Integer locationId)
- **String** getStateName(**Integer** languageId, Integer countryId, **Integer** locationId)
- **String** getLanguageCode(**Integer** languageId)
- **Integer** getLanguageId(**String** name)
