# AtomicSharedStorage

Almacén de valores de texto compartido por todos los nodos que sirven el comercio, donde cada entrada caduca por sí
misma y donde las operaciones condicionales son atómicas.

Esto es lo que permite coordinar peticiones simultáneas: registros de idempotencia, locks, refrescar el token de un
tercero una sola vez en lugar de una vez por petición, descartar notificaciones duplicadas o limitar el número de
llamadas a una API externa.

A diferencia de *[Cache](Cache.md)*, una lectura nunca responde con una copia local del nodo que atiende la petición,
así que un valor escrito por un nodo lo ven inmediatamente los demás. A diferencia de *[Storage](Storage.md)* y de
*SessionStorage*, las entradas no pertenecen a ningún usuario, sesión ni cesta, y se escriben en el momento en que se
guardan y no al final de la petición.

Las claves están limitadas al comercio y al plugin: ni otro plugin ni otro comercio pueden leerlas ni sobrescribirlas.
Un plugin que guarde más de un tipo de entrada debería prefijar sus propias claves.

Todas las escrituras indican cuánto vive la entrada, porque esto es estado de coordinación y no un almacén de
documentos: los valores tienen que ser pequeños y tienen que caducar.

```java

@Resource
private AtomicSharedStorage atomicSharedStorage;

```

## Métodos disponibles

- String get(String key): Devuelve el valor guardado. Si la clave no existe o ya ha caducado devuelve *null*.

- void put(String key, String value, Duration ttl): Guarda un valor, reemplazando lo que hubiera en la clave, y vuelve a
  empezar su caducidad.

- String putIfAbsent(String key, String value, Duration ttl): Guarda un valor solo si la clave no tiene ninguno, como
  una única operación atómica. De dos llamadas simultáneas con la misma clave, exactamente una guarda su valor y recibe
  *null*; la otra recibe el valor que guardó la ganadora.

- boolean replace(String key, String expectedValue, String value, Duration ttl): Reemplaza el valor de una clave solo si
  contiene el valor esperado, como una única operación atómica, y vuelve a empezar su caducidad. Devuelve *true* si se
  ha reemplazado.

- boolean remove(String key): Elimina una clave. Devuelve *true* si existía.

- boolean remove(String key, String expectedValue): Elimina una clave solo si contiene el valor esperado, como una única
  operación atómica. Así es como el propietario de un lock lo libera sin eliminar nunca el lock que otro ha cogido
  después de caducar el suyo.

- long increment(String key, long amount, Duration ttl): Suma una cantidad al contador guardado en una clave, como una
  única operación atómica, y devuelve el resultado. El contador se crea con la caducidad indicada si la clave no tiene
  ninguno; un contador que ya existe mantiene la caducidad que tiene, de forma que las llamadas siguientes no alargan la
  ventana que abrió la primera.

Todos los métodos lanzan *[PluginResourceException](PluginResourceException.md)* si el almacén no está disponible.

## Ejemplo: procesar una notificación una sola vez

```java

Duration retention = Duration.ofHours(24);
if (atomicSharedStorage.putIfAbsent("notification:" + notificationId, "processing", retention) != null) {
	return; // otro nodo ya la ha cogido
}
processNotification(notificationId);

```

## Ejemplo: limitar las llamadas a una API externa

```java

String window = "calls:" + Instant.now().truncatedTo(ChronoUnit.MINUTES).getEpochSecond();
if (atomicSharedStorage.increment(window, 1, Duration.ofMinutes(1)) > 60) {
	throw new PluginResourceException("rate limit exceeded");
}

```
