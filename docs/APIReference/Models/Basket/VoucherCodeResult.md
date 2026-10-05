# VoucherCodeResult

## Descripción

Resultado de un código de vale (un código de descuento o un código de vale de saldo) en una cesta (*getVoucherCodes()*
de *[BasketView](BasketView.md)*).

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getCode(): el código, tal como se pidió (o tal como está en la cesta si la llamada no pidió códigos). Se compara sin distinguir mayúsculas.
- **VoucherCodeStatus** getStatus(): estado.
- **String** getErrorCode(): por qué la plataforma rechazó el código: el nombre del código de error (`VOUCHER_CODE_NOT_FOUND`, `VOUCHER_CODE_EXPIRED`, ...); *null* salvo si el estado es *REJECTED*.

## Referencias

- **[VoucherCodeStatus](../../Enums/README.md#VoucherCodeStatus)**: Enumerado
