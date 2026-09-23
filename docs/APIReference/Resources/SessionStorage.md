# SessionStorage

Permite leer y escribir valores de texto en la sesión de api-plugins, así como consultar, crear y eliminar esa sesión.

Cada sesión se identifica con un token. Si no hay una sesión activa, la petición es anónima.

```java

@Resource
private SessionStorage sessionStorage;

```

## Métodos disponibles

- boolean hasSession(): Devuelve *true* si hay una sesión de api-plugins activa.

- boolean isAnonymous(): Devuelve *true* si no hay una sesión de api-plugins activa.

- String getSessionToken(): Devuelve el token de la sesión de api-plugins.

- Map<String, String> getSessionData(): Devuelve toda la información guardada en la sesión.

- void createNewSession(Duration ttl): Crea una nueva sesión de api-plugins con el tiempo de vida indicado. El token de
  la sesión anterior se descarta, pero la sesión anterior no se elimina.

- void deleteSession(): Elimina la sesión actual.

- String get(String key): Devuelve un valor de la sesión. Si la clave no existe devuelve *null*.

- void set(String key, String value): Guarda un valor en la sesión.

- void remove(String key): Elimina un valor de la sesión.

## Ejemplo

```java

if (sessionStorage.isAnonymous()) {
	sessionStorage.createNewSession(Duration.ofMinutes(30));
}
sessionStorage.set("step", "shipping");
String step = sessionStorage.get("step");

```
