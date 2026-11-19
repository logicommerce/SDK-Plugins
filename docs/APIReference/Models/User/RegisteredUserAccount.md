# RegisteredUserAccount

## Descripción

Vínculo entre un *[RegisteredUser](RegisteredUser.md)* y una de sus cuentas (*getAccounts()* de *[RegisteredUser](RegisteredUser.md)*).

*Disponible desde la versión 2.9.1.*

## Métodos

- **int** getId(): id del vínculo entre el usuario y la cuenta. Es el id de usuario de *getId()* de *[User](../User.md)* y de los mensajes de cola de usuario.
- **int** getAccountId(): id de la cuenta. Es el *userId* de *[OrderListParam](../Order/OrderListParam.md)* para listar los pedidos de la cuenta.
- **boolean** isMaster(): *true* si el usuario es el master de la cuenta.
- **[RegisteredUserAccountStatus](../../Enums/README.md#RegisteredUserAccountStatus)** getStatus(): estado del usuario en la cuenta.
- **[UserAddress](../UserAddress.md)** getInvoicingAddress(): dirección de facturación por defecto de la cuenta; *null* si no tiene. Contiene los datos fiscales de la cuenta (*getNif()*, *getVat()*) y su nombre de facturación (*getFirstName()*, *getLastName()*, *getCompany()*).

## Referencias

- **[UserAddress](../UserAddress.md)**
- **[RegisteredUserAccountStatus](../../Enums/README.md#RegisteredUserAccountStatus)**: Enumerado
