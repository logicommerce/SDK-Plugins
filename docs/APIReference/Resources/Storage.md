# Storage

## Descripción

Este recurso permite leer y escribir datos únicos del plugin y del usuario navegador. Son persistentes en las diferentes peticiones durante la navegación del usuario. Una vez la sesión caduca estos datos se pierden.

## Métodos

- **int** size()
- **boolean** isEmpty()
- **boolean** containsKey(String key)
- **String** get(String key)
- **String** put(String key, String value)
- **String** remove(String key)
- **void** clear()
- **Set<Entry<String, String>>** entrySet()
