# Cache

Permite cachear cadenas de texto.

## Métodos disponibles

- String get(String key): Devuelve el valor cacheado. Si no existe o ha caducado devuelve *null*.

- void put(String key, String value): Guarda un valor en cache.

- void purge(): Límpia la cache.


## Configuracion de la cache

Se puede configurar la cache con la anotación *@CacheSettings*.

```java

@Resource
@CacheSettings(name = "nombreCache", duration = 2 * 60)
private Cache cache;

```

- **name**: nombre de la cache. Por defecto, si no se define o se deja el valor en blanco, será el nombre del campo (cache en este ejemplo).
- **duration**: En segundos. Por defecto es 300.
