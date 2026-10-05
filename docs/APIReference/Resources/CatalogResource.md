# CatalogResource

Recurso para buscar y leer productos tal como los ve un invitado de un país, idioma y moneda explícitos.

*Disponible desde la versión 2.8.5.*

La plataforma construye el contexto de precios y visibilidad solo a partir del
*[CatalogContext](../Models/Catalog/CatalogContext.md)* (como para una cesta de invitado transitoria que nunca se
guarda), nunca a partir de las cabeceras de la petición de quien llama ni de ninguna cesta de la petición, y calcula los
precios exactamente como lo haría una cesta con el mismo país, idioma, moneda y cliente. Nunca se devuelven productos que
el contexto no puede ver (restricciones de categoría por país, zona o grupo, productos inactivos). Los productos visibles
que no se pueden pedir en el contexto se devuelven con sus combinaciones `NOT_ORDERABLE`, las mismas que
*BasketResource* rechaza como `ROW_NOT_BUYABLE`. Los productos con los precios ocultos para el contexto (por su propio `showPrice` o por
el ajuste del comercio) se devuelven con *getPriceRange()* a *null* y los precios de sus combinaciones a *null* (ver
*[ProductView](../Models/Catalog/ProductView.md)*), para que quien llama los pueda omitir; una página de búsqueda puede
quedar entonces con menos productos listables que *getPerPage()*, y *hasNextPage()* se refiere a los resultados sin
filtrar.

Las llamadas al catálogo pueden hacerse en la misma petición del plugin que las de
*[BasketResource](BasketResource.md)*, antes o después. Nunca cargan, inyectan, sustituyen ni guardan una cesta, no
cuentan para el límite de una cesta por petición de *BasketResource* y dejan sin cambios el contexto de la cesta que
sirve la petición: una llamada a *BasketResource* posterior ve la misma cesta y el mismo contexto que sin ella.

Un *query* o *context* *null* es un error de programación y lanza *IllegalArgumentException*.

Los precios son *[PriceView](../Models/Catalog/PriceView.md)*: importe entero en unidades menores más su código de moneda ISO
4217.

```java

@Resource
private CatalogResource catalogResource;

```

## Métodos disponibles

- ProductPage search(CatalogQuery query, CatalogContext context): Busca en el catálogo
  (*[CatalogQuery](../Models/Catalog/CatalogQuery.md)*: texto, categorías, rango de precios y página) y devuelve la
  página pedida (*[ProductPage](../Models/Catalog/ProductPage.md)*). Cada producto lleva su combinación destacada primero
  y un número limitado de combinaciones más; su rango de precios (*getPriceRange()*) cubre igualmente todas sus
  combinaciones.

- List<ProductView> getProducts(List<Integer> productIds, List<String> codes, CatalogContext context): Lee productos
  por id y por código. Un código encuentra una combinación cuando es exactamente igual (distinguiendo mayúsculas, sin recortar
  espacios) a su SKU o a uno de sus códigos de barras tal como los devuelve la
  *[CombinationView](../Models/Catalog/CombinationView.md)*, así que quien llama puede saber a qué combinación corresponde
  cada código; otros códigos del producto (como el SKU del fabricante) nunca coinciden. Cada producto visible se devuelve una
  sola vez, con todas sus combinaciones; los ids y códigos que no encuentran ningún producto visible se omiten.

- ProductView getProduct(int productId, List<Integer> optionValueIds, CatalogContext context): Lee un producto con
  todas sus combinaciones, primero la que identifican los valores de opción seleccionados. Devuelve *null* si el
  producto no existe, no tiene ninguna combinación o el contexto no lo puede ver.

Todos los métodos lanzan *[PluginResourceException](PluginResourceException.md)* si el catálogo no se puede leer.
