# AbandonedCartService

Servicio para operaciones de cestas abandonadas.

## Métodos disponibles

### Abandonar cesta de compra.

Detecta cuando un cesta de compra ha sido abandonada.

parámetros:

- ***[Cart](../Models/Cart.md)*** cart: Objecto con los datos de la cesta abandonada.


### Recuperar cesta de compra.

Procesa los assets retornados por * getAssets *.

parámetros:

- ***[Cart](../Models/Cart.md)*** cart: Objecto con los datos de la cesta a recuperar


### Eliminar cesta de compra.

Detecta cuando una cesta de compra ha sido eliminada.

parámetros:

- ***[Cart](../Models/Cart.md)*** cart: Objecto con los datos de la cesta eliminada.


## Interfaz

```java

public interface AbandonedCartService extends PluginService {

	void abandon(Cart cart) throws PluginServiceException;

	void recover(Cart cart) throws PluginServiceException;

	void remove(Cart cart) throws PluginServiceException;
}

```
