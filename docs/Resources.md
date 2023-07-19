# Resources

Los recursos se definen en base a la anotación *@Resource* como propiedad de la clase.

## Recursos "utilidades"

- *[Logger](APIReference/Resources/Logger.md)*: Para guardar logs.
- *[Connection](APIReference/Resources/Connection.md)*: Para hacer peticiones http. Las peticiones devuelven un objeto de tipo Response.
- *[Storage](APIReference/Resources/Storage.md)*: Para acceder y modificar datos persistentes del plugin para cada usuario.
- *[UserData](APIReference/Resources/UserData.md)*: Este recurso permite leer y escribir datos únicos del plugin y del usuario login.
- *[Navigator](APIReference/Resources/Navigator.md)*: Para acceder y modificar datos de navegación del usuario
- *[Location](APIReference/Resources/Location.md)*:  Para acceder a datos de localización e idioma.

- *[QueueSender](APIReference/Resources/QueueSender.md)*: Envia mensajes en una cola de procesos.

## Recursos de modelos

A algunos modelos de datos se accede como recurso.

- *[PluginDefinition](APIReference/Definitions/PluginDefinition.md)*: información de plugin.json. Disponible en todos los servicios.

- *[User](APIReference/Models/User.md)*: Datos del usuario. Sólo disponible en las llamadas de usuario.
- *[Cart](APIReference/Models/Cart.md)*: Datos de la cesta. Sólo disponible en las llamadas de olmos.
