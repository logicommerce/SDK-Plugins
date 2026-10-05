# BasketChanges

## Descripción

Cambios que se aplican a una cesta en una sola llamada (*create* y *apply*). Cada campo *null* deja esa parte de la
cesta como está. Orden de aplicación: país e idioma, filas, cliente, códigos de vale y la regla de la moneda; después la
cesta se recalcula una vez y se guarda.

*Disponible desde la versión 2.8.5.*

## Métodos

- **List<[RowChange](RowChange.md)>** getRows(): si no es *null*, sustituye las filas de la cesta: se eliminan las filas no pedidas (con sus filas vinculadas), salvo las de la tienda (regalos automáticos), que el recálculo vuelve a calcular.
- **List<String>** getVoucherCodes(): si no es *null*, sustituye los códigos de vale de la cesta (códigos de descuento y de vales de saldo), sin distinguir mayúsculas. Los vales de saldo no se canjean (*BALANCE_VOUCHER*).
- **[CustomerChange](CustomerChange.md)** getCustomer(): datos del cliente, o *null*.
- **String** getCountryCode(): nuevo país de navegación, o *null*. *create* lo ignora (usa el del contexto).
- **String** getLanguageCode(): nuevo idioma (ISO 639-1 en minúsculas, como *BasketContext.getLanguageCode()*), o *null*. *create* lo ignora.
- **String** getCurrencyHint(): moneda preferida, o *null*. *create* lo ignora. La moneda se vuelve a evaluar igualmente si cambia el país.
- **Map<String, String>** getStorage(): entradas que *create* escribe en el *Storage* del plugin de la nueva cesta, como *putStorage*; *apply* las ignora.

## Builder

**BasketChangesBuilder** (`com.logicommerce.sdk.builders.basket`) devuelve una implementación de **BasketChanges**.

Métodos del builder: rows, voucherCodes, customer, countryCode, languageCode, currencyHint, storage y *build()*. Las listas y el mapa se copian como no modificables; *build()* lanza *IllegalArgumentException* si una lista contiene un elemento *null* o el mapa una clave o un valor *null*.
