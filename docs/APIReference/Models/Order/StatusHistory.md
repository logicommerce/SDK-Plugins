# StatusHistory

## Descripción

Entrada de un historial de estados, de un pedido o de un envío. Los estados son los nombres de la plataforma como texto
(para un pedido los de *OrderStatusType*; para un envío los de *OrderShipmentStatusType* más `NONE`), así que una entrada
nunca falla al convertirse.

*Disponible desde la versión 2.8.5.*

## Métodos

- **long** getId(): id de la entrada, estable.
- **String** getFromStatus(): estado anterior, o *null* si la plataforma no registró ninguno. La plataforma solo registra una entrada cuando cambia el estado (ninguna al crear el pedido o el envío), así que la primera entrada también lo tiene.
- **String** getToStatus(): estado nuevo.
- **Instant** getCurrentDateTime(): momento del cambio (UTC).
