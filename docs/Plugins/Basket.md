# Basket

Recibe acciones del basket.

## Definición del plugin

El fichero plugin.json tiene la siguiente definción:

```json
{
    "name": "Basket plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "202-06-08",
    "version": "1.1",
    "module": "com.thirdparty.basket",

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
module com.thirdparty.basket {
    requires com.logicommerce.sdk;

	provides com.logicommerce.sdk.services.DefinitionService
		with com.thirdparty.basket.Definition;

	provides com.logicommerce.sdk.services.BasketService
		with com.thirdparty.basket.BasketServiceImpl;

}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio [BasketService](../APIReference/Services/BasketService.md).

```java
package com.thirdparty.basket;

import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.models.Cart;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.BasketService;

public class BasketServiceImpl implements BasketService {

	@Resource
	private Cart cart;

	@Override
	public void calculate() throws PluginServiceException {
		// Acción recibida al calcular la cesta
	}

	@Override
	public void addItem(String itemHash, Integer quantity) throws PluginServiceException {
		// Acción recibida cuando se añado un elemento en la cesta
	}

	@Override
	public void updateItem(String itemHash, Integer quantity) throws PluginServiceException {
		// Acción recibida cuando se modifica un elemento de la cesta
	}

	@Override
	public void deleteItem(String itemHash) throws PluginServiceException {
		// Acción recibida cuando se elimina un elemento de la cesta
	}

	@Override
	public void clear() throws PluginServiceException {
		// Acción recibida cuando se vacia la cesta
	}
```

Para obtener la cesta entera se tiene que inyectar el recurso Cart.

Los métodos que afectan a un elemento de la cesta, reciben el itemHash. Con este hash, se puede obtener más información del elemento en el recurso Cart.

