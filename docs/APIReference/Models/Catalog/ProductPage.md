# ProductPage

## Descripción

Página de resultados de una búsqueda.

*Disponible desde la versión 2.8.5.*

## Métodos

- **List<[ProductView](ProductView.md)>** getProducts(): productos de la página, en el orden de la búsqueda. En los resultados de búsqueda cada producto lleva primero su combinación destacada y un número limitado de otras combinaciones.
- **boolean** hasNextPage(): *true* si hay más resultados.
- **boolean** isPriceFilterIgnored(): *true* si se pidió un filtro de precio y no se ha aplicado porque no se podía convertir a la moneda del catálogo.
