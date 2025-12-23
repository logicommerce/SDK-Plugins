# ReturnService

Servicio para processar documentos de devolución

## Métodos disponibles

### create

Se llama en el momento de la creación de un documento de devolución.

parámetros:

- **[Order](../Models/Order/Order.md)** originalOrder
- **[ReturnDocument](../Models/Order/ReturnDocument.md)** returnDocument

No devuelve respuesta. Uso para que el tercero realize acciones en caso de generar un documento de devolución.

## Interfaz

```java
public interface ReturnService extends PluginService {

	void create(Order originalOrder, ReturnDocument returnDocument) throws PluginServiceException;

}

```
