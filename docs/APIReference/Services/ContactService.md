# ContactService

## Descripción

Servicio pensado para detectar cuando un usuario envía una petición de contacto.

## Métodos disponibles

### Contacto de usuario

Se llama al enviar formulario de contacto de tipo Usuario.

No tiene parámetros, el **[User](../Models/User.md)**, estará disponible como Recurso.

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Contacto de producto

Se llama al enviar formulario de contacto de tipo producto.

Parámetros:

**[Product](../Models/Product.md)** product.

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Contacto de producto recomendado

Se llama al enviar producto recomendado.

Parámetros:

**[Product](../Models/Product.md)** product.

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

### Contacto de subscripción.

Se llama al realizar solicitud de subscripción.

No tiene parámetros.

No espera ninguna respuesta. El método está pensado para enviar datos al tercero.

## Interfíce

```java
public interface ContactService extends PluginService {

	void contactUser() throws PluginServiceException;

	void contactProduct(Product product) throws PluginServiceException;

	void recommendProduct(Product product) throws PluginServiceException;

	void subscribeNotification() throws PluginServiceException;

}
```