# OrderCreditNoteAmounts

## Descripción

Importe de una factura rectificativa del pedido en su moneda de compra (*getCreditNotes()* de
*[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)*).

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getCreditNoteId(): id de la factura rectificativa, como en *getId()* de *[OrderCreditNote](OrderCreditNote.md)*.
- **long** getTotal(): importe abonado (el total de la factura rectificativa), no negativo, redondeado una vez a unidades menores de la moneda de compra.
