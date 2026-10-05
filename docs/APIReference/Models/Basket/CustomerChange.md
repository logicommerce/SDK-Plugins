# CustomerChange

## Descripción

Datos del cliente que se escriben en una cesta de invitado, con la lógica de cliente invitado de la tienda: email,
nombre, apellidos y teléfono, nunca direcciones. Un campo *null* deja el valor de la cesta como está; una cadena vacía lo
borra. Un email que pertenece a una cuenta registrada (si el comercio identifica a los usuarios por email) no se
escribe, se borra el email que tuviera la cesta y se informa como un rechazo *CUSTOMER_EMAIL_REGISTERED*; el nombre, los
apellidos y el teléfono del mismo cambio sí se escriben.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getEmail()
- **String** getFirstName()
- **String** getLastName()
- **String** getPhone()

## Builder

**CustomerChangeBuilder** (`com.logicommerce.sdk.builders.basket`) devuelve una implementación de **CustomerChange**.

Métodos del builder: email, firstName, lastName, phone y *build()*.
