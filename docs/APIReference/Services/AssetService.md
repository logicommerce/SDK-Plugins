# AssetService

Servicio para obtener de assets.

## Métodos disponibles

### Obtener los assets

Procesa los assets retornados por * getAssets *.

parámetros:

- ***[WidgetPageType](../Enums/README.md#WidgetPageType)*** pageType: enumerado que dice a qué ámbito va el asset.

Devuelve una lista de **[AssetResponse](../Models/AssetResponse.md)**

## Interfaz

```java
public interface AssetService extends PluginService {

	List<AssetResponse> getAssets(WidgetPageType pageType) throws PluginServiceException;

}
```
