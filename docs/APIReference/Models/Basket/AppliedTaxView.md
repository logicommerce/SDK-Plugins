# AppliedTaxView

## Descripción

Un impuesto de una cesta o de un pedido (*getAppliedTaxes()* de *[TotalsView](TotalsView.md)*): una entrada por grupo de
impuestos de core (tipo, tipo de recargo de equivalencia e impuesto). El recargo de equivalencia no tiene entrada
propia: se suma a la entrada de su impuesto, cuyo tipo es entonces el tipo del impuesto más el del recargo y cuyo
importe incluye el recargo; la entrada conserva el nombre del impuesto.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getName(): nombre del impuesto.
- **String** getRate(): tipo como número decimal en texto, sin `%` ni ceros finales (`"21"`, `"5.5"`), incluido el
  recargo de equivalencia cuando la entrada lo lleva (`"26.2"` para un 21 con un recargo del 5.2).
- **long** getBase(): base imponible sobre la que se calcula el impuesto, en unidades menores: la base neta (sin impuestos) en los dos modos, también cuando los precios de la vista incluyen impuestos.
- **long** getAmount(): importe del impuesto, redondeado una vez.
