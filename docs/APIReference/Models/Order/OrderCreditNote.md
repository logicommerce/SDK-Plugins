# OrderCreditNote

## Descripción

Factura rectificativa emitida para un pedido (*getCreditNotes()* de *[Order](Order.md)*). Su importe está en
*getCreditNotes()* de *[OrderPurchaseCurrencyAmounts](OrderPurchaseCurrencyAmounts.md)*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId(): id de la factura rectificativa.
- **LocalDateTime** getDate(): fecha, tal como está guardada (como *getDate()* de *[Document](Document.md)*).
