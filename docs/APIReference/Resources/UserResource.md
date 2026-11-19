# UserResource

## Descripción

El recurso permite consultar los usuarios registrados de la tienda. Se puede acceder a este recurso desde cualquier servicio, incluido el consumidor de colas. Es de solo lectura: no permite crear ni modificar usuarios.

Un usuario registrado es una persona identificada por su email. El mismo usuario puede pertenecer a varias cuentas (por ejemplo, como empleado de varias cuentas de empresa), así que el usuario devuelto incluye todas sus cuentas y es el plugin quien decide cuál usar.

Disponible desde la versión **2.9.1** del SDK.

## Métodos

- **[RegisteredUser](../Models/User/RegisteredUser.md)** getUser(**String** email) throws **[PluginResourceException](PluginResourceException.md)**

### getUser

Devuelve el usuario registrado con el email indicado, o `null` si el email es `null` o está vacío o si ningún usuario registrado lo tiene. Se ignoran los espacios al principio y al final del email.

Cualquier otro fallo (el usuario no se puede leer o convertir) lanza *[PluginResourceException](PluginResourceException.md)*, de forma que quien llama nunca confunde un fallo con un usuario inexistente.

El NIF/CIF/NIE no es un dato de la persona sino de cada cuenta: está en su dirección de facturación por defecto (*getInvoicingAddress()* de *[RegisteredUserAccount](../Models/User/RegisteredUserAccount.md)*).

El id de cada cuenta del usuario (*getId()* de *[RegisteredUserAccount](../Models/User/RegisteredUserAccount.md)*) es el mismo id de usuario que usan *[User](../Models/User.md)* y los mensajes de cola de usuario, así que sirve para enviar un *UserQueueMessage* de esa cuenta.

### Los ids de un usuario registrado

Un usuario registrado tiene tres ids distintos, y cada recurso usa uno:

| Id | Método | Para qué sirve |
|---|---|---|
| Usuario registrado (la persona) | *getId()* de *[RegisteredUser](../Models/User/RegisteredUser.md)* | Identifica a la persona, sea cual sea la cuenta. |
| Usuario en una cuenta | *getId()* de *[RegisteredUserAccount](../Models/User/RegisteredUserAccount.md)* | Es el id de *[User](../Models/User.md)* y el de los mensajes de cola de usuario (*UserQueueMessage*). |
| Cuenta | *getAccountId()* de *[RegisteredUserAccount](../Models/User/RegisteredUserAccount.md)* | Es el *userId* de *[OrderListParam](../Models/Order/OrderListParam.md)*: los pedidos de una cuenta se listan con *getOrders* de *[OrderResource](OrderResource.md)* filtrando por ese id. |

### Relación con otros recursos

- **Pedidos de una cuenta:** *getOrders* de *[OrderResource](OrderResource.md)* con `userId` igual a *getAccountId()* de la cuenta. Así se obtienen los pedidos de la cuenta, no los de la persona en todas sus cuentas.
- **Devoluciones y envíos:** *[RMAResource](RMAResource.md)* y *[ShipmentResource](ShipmentResource.md)* buscan por el email guardado en el documento (*email* de *[CustomerDocumentListParam](../Models/Document/CustomerDocumentListParam.md)*), no por la cuenta. Se usa *getEmail()* del usuario registrado. Incluyen los documentos hechos con ese email aunque no estén ligados a ninguna de sus cuentas.
- **Datos fiscales:** el NIF/CIF/NIE y el nombre de facturación están en *getInvoicingAddress()* de cada cuenta. Si el plugin necesita un único valor, tiene que elegir la cuenta (por ejemplo, la que tiene *isMaster()* y estado `ENABLED`).

## Ejemplo

```java
public class MyService implements DataService {

	@Resource
	private UserResource userResource;

	@Resource
	private OrderResource orderResource;

	@Resource
	private RMAResource rmaResource;

	public void process(String email) throws PluginResourceException {
		RegisteredUser user = userResource.getUser(email);
		if (user == null) {
			...
		}

		for (RegisteredUserAccount account : user.getAccounts()) {
			if (account.isMaster() && account.getStatus() == RegisteredUserAccountStatus.ENABLED) {
				UserAddress invoicingAddress = account.getInvoicingAddress();
				String nif = invoicingAddress == null ? null : invoicingAddress.getNif();
				List<OrderList> accountOrders = orderResource.getOrders(new OrderListParamBuilder()
					.userId(account.getAccountId())
					.build());
				...
			}
		}

		List<RMA> rmas = rmaResource.getRMAs(new CustomerDocumentListParamBuilder()
			.email(user.getEmail())
			.build());
	}
}
```

## Referencias

- **[RegisteredUser](../Models/User/RegisteredUser.md)**
- **[RegisteredUserAccount](../Models/User/RegisteredUserAccount.md)**
- **[RegisteredUserAccountStatus](../Enums/README.md#RegisteredUserAccountStatus)**: Enumerado
- **[OrderResource](OrderResource.md)**
- **[RMAResource](RMAResource.md)**
- **[ShipmentResource](ShipmentResource.md)**
- **[PluginResourceException](PluginResourceException.md)**
