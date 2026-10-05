# ChangeRejection

## Descripción

Cambio pedido que no se ha podido aplicar. Todo lo válido de la misma llamada se aplica: un rechazo solo afecta a su
propio elemento. Para *CUSTOMER* ese elemento es solo el email (*CUSTOMER_EMAIL_REGISTERED*): el nombre, los apellidos y el
teléfono del mismo cambio sí se escriben.

El enumerado anidado *ChangeRejection.Target* indica a qué se refiere: *ROW* (una fila pedida), *CUSTOMER* (el cliente), *COUNTRY* o *CURRENCY*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **ChangeRejection.Target** getTarget(): a qué se refiere el rechazo.
- **int** getIndex(): para *ROW*, la posición de la fila en *getRows()* de los cambios (desde 0); -1 para el resto.
- **RejectionCode** getCode(): motivo.
- **String** getDetail(): detalle para los logs (por ejemplo el código de error que rechazó la fila); no se debe mostrar al comprador. Puede ser *null*.

## Referencias

- **[RejectionCode](../../Enums/README.md#RejectionCode)**: Enumerado
