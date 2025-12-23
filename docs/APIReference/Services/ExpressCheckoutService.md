# ExpressCheckoutService

Servicio para express checkout.

## Métodos disponibles

### Obtener url para chekout

Se llama cuando se presiona el botón para realizar la compra express.

parámetros:

- **[CartItem](../Models/Cart.md)**> cart: cesta de la compra activa.

Respuesta: **String** con la dirección url para realizar autenticación en el sistema tercero para el checkout express.

### Validación de parámetros.

Se llama para validar los parámetors recibidos.

parámetros:

- **[RequestParams](../Models/RequestParams.md)** requestParams: parámetros recibidos.

No espera ninguna respuesta.

### Obtención del usuario

Se llama cuando es neceario obtener los datos del usuario autenticado en el sistema tercero.

parámetros:

- **[RequestParams](../Models/RequestParams.md)** requestParams: parámetros necesarios para obtener los datos de usuario.

No espera ninguna respuesta.

## Interfíce

```java
public interface ExpressCheckoutService extends PluginService {

	String getUrl(Cart cart) throws PluginServiceException;

	boolean validate(RequestParams requestParams) throws PluginServiceException;

	ExpressCheckoutCustomer getCustomer(RequestParams requestParams) throws PluginServiceException;

}
```
