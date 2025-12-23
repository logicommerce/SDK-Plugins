# TaxService

Servicio para taxas.

## Métodos disponibles

### Obtener códigos de taxas (getTaxCodes)

Método utilizado para obtener codigos de taxas a aplicar.

Parámetros:

- **String** q: parámetro para realizar busqueda de códigos.
- **int** page: número de página.
- **int** perPage: cantidad por página.

Devuelve: objecto **[TaxCodeCollection](../Models/TaxCodeCollection.md)**

## Interfaz

```java
public interface TaxService extends PluginService {

	TaxCodeCollection getTaxCodes(String q, int page, int perPage) throws PluginServiceException;

}


```
