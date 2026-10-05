# BasketView

## Descripción

Cesta tal como la devuelve *[BasketResource](../../Resources/BasketResource.md)*.

Todos los importes de la vista (filas, descuentos y totales) son enteros en unidades menores de *getCurrencyCode()* (según
los decimales de `java.util.Currency.getDefaultFractionDigits()`), calculados por la plataforma: cada precio unitario y
cada reparto de descuento se redondea una sola vez y cada total es la suma de sus partes redondeadas, así que los totales
siempre cuadran, aunque pueden diferir en unas pocas unidades de los totales sin redondear de la plataforma. Los precios
llevan impuestos o no según *isTaxesIncluded()*.

Después de *create* y *apply* la vista refleja el recálculo de la llamada; después de *get* es la cesta tal como se
guardó por última vez, nunca recalculada. Las listas nunca son *null*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getToken(): token de la cesta (sin el sufijo `_<id>` que añade *getToken* de *[Cart](../Cart.md)*). Es la credencial de la sesión: nunca se debe exponer a terceros.
- **int** getId(): id de la cesta (`Basket.id`, el sufijo `_<id>` de *getToken* de *[Cart](../Cart.md)*). Solo cambia cuando la plataforma regenera la cesta después de confirmar un pedido (`/validate` OK o `/pay` con total cero).
- **String** getCurrencyCode(): código ISO 4217 de todos los importes: la moneda de compra de la cesta.
- **boolean** isTaxesIncluded(): *true* si los precios incluyen impuestos para el país de la cesta (`showTaxesIncluded`): entonces *getTax()* de los totales es 0 y *getAppliedTaxes()* lista los impuestos incluidos.
- **String** getCountryCode(): país de navegación (ISO 3166-1 alfa-2).
- **String** getLanguageCode(): idioma de la cesta: código de idioma de LogiCommerce, ISO 639-1 en minúsculas (por ejemplo `es`).
- **[CustomerView](CustomerView.md)** getCustomer(): datos del cliente; nunca *null*.
- **List<[BasketRowView](BasketRowView.md)>** getRows(): filas de la cesta en orden de inserción (estable entre llamadas).
- **List<[AppliedDiscountView](AppliedDiscountView.md)>** getDiscounts(): descuentos aplicados, uno por descuento.
- **List<[VoucherCodeResult](VoucherCodeResult.md)>** getVoucherCodes(): códigos de vale (códigos de descuento y de vales de saldo): tras un *create* o *apply* cuyo *BasketChanges.getVoucherCodes()* no es *null*, uno por código pedido en el orden de la petición, rechazados incluidos; si no (un *get*, o una llamada que no cambia los códigos), los guardados en la cesta, en el orden en que se añadieron. Los códigos rechazados nunca se guardan, así que ahí no aparecen.
- **[TotalsView](TotalsView.md)** getTotals(): totales; nunca *null*.
- **List<[BasketIssue](BasketIssue.md)>** getIssues(): avisos del último recálculo (nuevos tras *create* y *apply*, los guardados para *get*) más las comprobaciones de creación de pedido evaluadas en seco.
- **List<[ChangeRejection](ChangeRejection.md)>** getRejections(): cambios pedidos que esta llamada no ha podido aplicar. Siempre vacía para *get*.
- **Integer** getDocumentId(): id del último pedido creado desde la cesta, sea cual sea su estado, o *null*.
- **boolean** isLoggedIn(): *true* si hay un usuario registrado logueado en la cesta.
- **boolean** isPendingLogin(): *true* si hay un login pendiente de escoger cuenta (`pendingLoginRegisteredUserId`).
- **Integer** getAccountId(): cuenta de la cesta, o *null* para una cesta de invitado sin cuenta.
- **Instant** getUpdatedAt(): última vez que se guardó la cesta.
- **Duration** getLifeTime(): duración efectiva de esta cesta: el proceso que elimina las sesiones la borra cuando pasa este tiempo desde que se guardó por última vez. Es la duración de la sesión de la tienda, salvo para una cesta anónima vacía (sin filas ni cuenta), que la plataforma elimina a los 5 minutos.
- **String** getStoreBaseUrl(): URL base de la tienda para el idioma y el país de la cesta, calculada a partir de la cesta y nunca de la petición; si no hay una entrada para el país, la URL base de la home, después la URL de la tienda del idioma de la cesta y después la URL por defecto de la tienda; se descarta cualquier candidata que no sea una URL http o https absoluta. Es absoluta (esquema, host y una ruta opcional) y sin barra final: se le añaden las rutas de la tienda (por ejemplo `/checkout`). Es *null* si el comercio no tiene configurada ninguna URL de tienda absoluta.
