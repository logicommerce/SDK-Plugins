# Connection

## Descripción

Recurso para ejecutar peticiones HTTP.

Este recurso permite construir una petición web y devuelve un resultado con un objeto tipo *Response*.

Los métodos *get*, *post*, *put*, *delete* son "finales" y devuelven un objeto de tipo *Response*.

El resto son mutables y están pensados para que se puedan concatenar (como un builder) y generar la petición.

## Métodos

- **Connection** init(String endPoint)
- **Connection** authorization(String authorization)
- **Connection** path(String path)
- **Connection** contentType(String contentType)
- **Connection** acceptType(String acceptType)
- **Connection** header(String name, String value)
- **Connection** cookie(String name, String value)
- **Connection** params(String params)
- **Connection** timeout(Integer timeout);
- **Connection** multipartMaxSize(int maxSize) *(desde 2.9.1)*
- **[Response](Response.md)** get() throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** post(String body) throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** post(MultipartBody body) throws **[PluginResourceException](PluginResourceException.md)** *(desde 2.9.1)*
- **[Response](Response.md)** put(String body) throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** put(MultipartBody body) throws **[PluginResourceException](PluginResourceException.md)** *(desde 2.9.1)*
- **[Response](Response.md)** delete() throws **[PluginResourceException](PluginResourceException.md)**

## Peticiones multipart/form-data

Desde la versión 2.9.1, *post* y *put* aceptan un **MultipartBody** para enviar ficheros. El cuerpo se construye con partes de texto y de fichero; un mismo nombre de parte se puede repetir:

```java
MultipartBody body = new MultipartBody()
	.text("body", "Mensaje")
	.file("attachments[]", "factura.pdf", "application/pdf", pdfBytes)
	.file("attachments[]", "foto.png", "image/png", pngBytes);

Response response = connection.init(url)
	.timeout(10000)
	.multipartMaxSize(10 * 1024 * 1024)
	.post(body);
```

- La cabecera *Content-Type* (con su *boundary*) se genera a partir del cuerpo; el valor indicado con *contentType* se ignora.
- Si el *contentType* de un fichero está vacío o no es válido, se envía como *application/octet-stream*.
- El tamaño de un cuerpo es la suma de los bytes de sus ficheros y de sus textos en UTF-8 (**MultipartBody.getSize()**).
- El tamaño máximo por defecto y absoluto es **MultipartBody.MAX_SIZE** (20 MB). Con *multipartMaxSize* se puede reducir; los valores mayores se reducen a 20 MB y los menores de 1 se ignoran.
- Si el cuerpo supera el máximo, la petición no se envía y se lanza **[PluginResourceException](PluginResourceException.md)** con el código *REQUEST_TOO_LARGE*.
- Las versiones de core sin soporte multipart lanzan *UnsupportedOperationException*.

## Referencias

- **[Response](Response.md)**
- **[PluginResourceException](PluginResourceException.md)**

