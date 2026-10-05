# BasketIssue

## Descripción

Aviso de una cesta: un aviso del último recálculo o una comprobación de creación de pedido evaluada en seco. Un aviso
que afecta a varias filas se informa una vez por fila; una comprobación de creación de pedido que falla, una vez por
campo que falla.

El conflicto de email registrado no es un aviso: la plataforma no guarda ese email, así que lo informa la llamada que
intentó ponerlo, como rechazo `CUSTOMER_EMAIL_REGISTERED` (*[ChangeRejection](ChangeRejection.md)*).

*Disponible desde la versión 2.8.5.*

## Métodos

- **IssueSource** getSource(): origen.
- **String** getCode(): código del aviso.
  - Para *WARNING*: el nombre de la constante (no el valor JSON) de `BasketWarningCode` de la plataforma:
    `NOT_AVAILABLE_PRODUCT`, `INVALID_PRICE`, `MIN_ORDER_QUANTITY`, `MAX_ORDER_QUANTITY`, `MULTIPLE_ORDER_OVER_QUANTITY`,
    `MULTIPLE_ORDER_QUANTITY`, `STOCK_RESTRICTION`, `BACKORDER`, `BACKORDER_PREVISION`, `EMPTY_PRODUCTS`,
    `STOCK_PREVISION`, `WAREHOUSE_OFFSET`, `ON_REQUEST_PRODUCT`, `INVALID_OPTIONS`, `NEEDS_PAYMENTSYSTEM`,
    `NEEDS_DELIVERY`, `INVALID_BILLING_ADDRESS`, `INVALID_SHIPPING_ADDRESS`, `ACCOUNT_NOT_ACTIVED`,
    `ACCOUNT_NOT_VERIFIED`, `LOCKED_STOCK_RESTRICTION`, `EMPLOYEE_PERMISSION_LIMIT_AMOUNT_PER_ORDER`,
    `EMPLOYEE_PERMISSION_LIMIT_ORDER_QUANTITY_PER_EMPLOYEE`, `ORDER_APPROVAL_REQUIRED`. Versiones posteriores de la
    plataforma pueden añadir nombres: uno desconocido se trata según su gravedad.
  - Para *END_ORDER*: el nombre de un *[EndOrderCode](../../Enums/README.md#EndOrderCode)*, una lista cerrada.
- **IssueSeverity** getSeverity(): gravedad: la del `BasketWarningCode` para un aviso; los *END_ORDER* siempre son *ERROR*.
- **String** getRowHash(): hash de la fila afectada, o *null* (siempre *null* para *END_ORDER*).
- **EndOrderField** getField(): campo del cliente afectado, o *null* (siempre *null* para *WARNING*). Para *END_ORDER*
  siempre tiene valor: `EMAIL`, `FIRST_NAME`, `LAST_NAME` o `PHONE` para los campos de la validación que guardan los
  datos que escribe *[CustomerChange](CustomerChange.md)* (donde sea que la plataforma los guarde), `ADDRESS` para cualquier
  otro campo de la dirección de facturación o de envío y `OTHER` para el resto.
- **Map<String, String>** getAttributes(): atributos del aviso como texto (enteros en decimal, fechas y fechas con hora
  en ISO 8601, listas como sus elementos unidos por `,`); vacío si no hay.
  - Para *WARNING*: los nombres de atributo de la plataforma, sin cambios. Los que pone hoy: `quantity` (el límite de un
    aviso de cantidad, o las unidades por encima del stock de un producto bajo pedido), `current` (la cantidad pedida de
    un aviso de cantidad), `over` (de `MULTIPLE_ORDER_OVER_QUANTITY`), `stock` (el stock disponible), `offsetDays` (días
    hasta que el stock de una previsión o de un desfase de almacén está disponible), `onRequestDays`, `combinationId`,
    `myLockedStockUnits`, `othersLockedStockUnits`, `othersNearestLockedStockToExpireUnits`,
    `othersNearestLockedStockToExpireTime` (avisos de stock bloqueado), y `min` y `max` (límites de permisos de
    empleado). Versiones posteriores pueden añadir nombres.
  - Para *END_ORDER*: solo `fieldName`, el nombre del campo que falla en la validación de datos del comercio (por
    ejemplo `email` o `shippingAddress.city`), para los logs; no está cuando la comprobación no nombra ningún campo
    (`FORCE_BILLING_ADDRESS_COUNTRY`, y los fallos `OTHER` sin campo).

## Referencias

- **[IssueSource](../../Enums/README.md#IssueSource)**: Enumerado
- **[EndOrderCode](../../Enums/README.md#EndOrderCode)**: Enumerado
- **[IssueSeverity](../../Enums/README.md#IssueSeverity)**: Enumerado
- **[EndOrderField](../../Enums/README.md#EndOrderField)**: Enumerado
