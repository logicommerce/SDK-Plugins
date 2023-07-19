# PaymentToken

## Descripción

Interfaz que devuelve los datos del token:

## Métodos

- **String** getToken()
- **void** setToken()
- **Map<String, String>** getData()
- **void** setData(**Map<String, String>**  data)
- **void** addItem(**String** key, **String** value)

## Builder

**PaymentTokenBuilder** devuelve una implementación de **PaymenToken**.

Métodos del builder:

- *token(String token)*: Añade un token.
- *addItem(String name, String value)*: Añade un elemento para paymentToken.
