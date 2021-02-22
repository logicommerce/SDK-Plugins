# User

Recibe acciones del usuario.

## Definición del plugin

El fichero plugin.json tiene la siguiente definción:

```json
{
    "name": "User plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "202-06-08",
    "version": "1.1",
    "module": "com.thirdparty.user",

    "properties": [
        // ...
    ]
}
```

### Configuración específica

El servicio de Tracker no tiene configuración específica.

## Módulo

El archivo module-info.java deberá definir el *provider* (Servicio).

```java
module com.thirdparty.user {
    requires com.logicommerce.sdk;

	provides com.logicommerce.sdk.services.DefinitionService
		with com.thirdparty.user.Definition;

	provides com.logicommerce.sdk.services.UserService
		with com.thirdparty.user.UserServiceImpl;

}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio [UserService](../APIReference/Services/UserService.md).

```java
package com.thirdparty.user;

import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.models.User;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	private User user;

	@Override
	public void upsert() throws PluginServiceException {
		// insert or update action
	}

	@Override
	public void delete() throws PluginServiceException {
		// delete user action
	}

	@Override
	public void login() throws PluginServiceException {
		//  login action
	}

	@Override
	public void logout() throws PluginServiceException {
		// logout action
	}
```

Como se puede ver, los métodos de este servicio, no tienen argumentos. La información del usuario de la sesión, se obtiene inyectando el recurso User.
