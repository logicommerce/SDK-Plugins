# RowChange

## Descripción

Fila pedida (*getRows()* de *[BasketChanges](BasketChanges.md)*). Una fila pedida con el hash de una fila existente del
mismo producto y opciones cambia la cantidad de esa fila; con el hash de una fila de otro producto u opciones elimina esa
fila y añade la nueva; sin hash (o con un hash que no es de ninguna fila) añade el producto. El mismo producto con las
mismas opciones pedido dos veces acaba en una sola fila.

*RowChangeBuilder* exige un id de producto y una cantidad positivos; la plataforma los vuelve a comprobar sea cual sea
la implementación, y una petición con una fila que no los cumple lanza *IllegalArgumentException* antes de aplicar
ningún cambio. *RowChangeImpl* empieza con *getOptionValueIds()* vacía y su setter trata *null* como vacía.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getRowHash(): hash de la fila existente, o *null* para una fila nueva.
- **int** getProductId(): id del producto.
- **List<Integer>** getOptionValueIds(): ids de los valores de opciones combinables que seleccionan la combinación, en cualquier orden; nunca *null*. Las opciones no combinables nunca se informan: un producto con una opción obligatoria no combinable no se añade (*ROW_REQUIRES_NON_COMBINABLE_OPTION*).
- **long** getQuantity(): cantidad, positiva.

## Builder

**RowChangeBuilder** (`com.logicommerce.sdk.builders.basket`) devuelve una implementación de **RowChange**.

Métodos del builder: rowHash, productId, optionValueIds, quantity y *build()*. *build()* lanza *IllegalArgumentException* si el producto o la cantidad no son positivos, o si un id de valor es *null*.
