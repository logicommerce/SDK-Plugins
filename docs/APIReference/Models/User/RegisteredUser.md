# RegisteredUser

## Descripción

Usuario registrado de la tienda (*getUser(String)* de *[UserResource](../../Resources/UserResource.md)*): la persona, identificada por su email, y las cuentas a las que pertenece.

*Disponible desde la versión 2.9.1.*

## Métodos

- **int** getId(): id del usuario registrado.
- **String** getPId(): id público; *null* si no tiene.
- **String** getEmail(): email.
- **String** getUsername(): nombre de usuario; *null* si no tiene.
- **String** getFirstName(): nombre; nunca *null*.
- **String** getLastName(): apellidos; nunca *null*.
- **[Gender](../../Enums/README.md#Gender)** getGender(): género; *null* si no está informado.
- **LocalDate** getBirthday(): fecha de nacimiento; *null* si no está informada.
- **LocalDateTime** getDateAdded(): fecha de alta.
- **LocalDateTime** getLastUsed(): última fecha de uso; *null* si no se ha usado nunca.
- **List<[RegisteredUserAccount](RegisteredUserAccount.md)>** getAccounts(): cuentas a las que pertenece, una entrada por cuenta y ordenadas por id; nunca *null*.

## Referencias

- **[Gender](../../Enums/README.md#Gender)**: Enumerado
- **[RegisteredUserAccount](RegisteredUserAccount.md)**
