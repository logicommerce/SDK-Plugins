# Enumerados

[TOC]

## AmountType

- ABSOLUTE
- PERCENTAGE

## AdditionalItemType

- SHIPPING
- PAYMENT
- VOUCHER

## BackorderMode

- NONE
- WITH_AND_WITHOUT_PREVISION
- WITHOUT_PREVISION
- WITH_PREVISION

## BenefitMode

- CHEAPEST
- MOST_EXPENSIVE
- CHEAPEST_BY_GROUPS

## CalculationMode

- FIXED_UNITS
- PERCENTAGE_OVER_UNITS
- FIXED_AMOUNT
- PERCENTAGE_OVER_TOTAL

## CartItemType

Tipo de fila de una cesta (*[CartItem](../Models/CartItem.md)*). Desde la versión 2.8.5 también es el tipo de fila de
*[BasketRowView](../Models/Basket/BasketRowView.md)*, que nunca devuelve `BUNDLE_ITEM` (un pack es una sola fila
`BUNDLE`), y de *getType()* de *[OrderItem](../Models/Order/OrderItem.md)*, que solo lo devuelve para los elementos de
una fila `BUNDLE` (*getBundleItems()*).

- PRODUCT
- GIFT: regalo automático
- LINKED: fila vinculada a otra
- BUNDLE: pack
- BUNDLE_ITEM: artículo de un pack
- VOUCHER_PURCHASE: compra de un vale de saldo
- SELECTABLE_GIFT: regalo escogido por el comprador entre los que ofrece un descuento. *Disponible desde la versión 2.8.5.*

## CurrencyMode

- ECOMMERCE
- PAY

## CustomTagItemType

- PRODUCT
- CATEGORY
- BASKET
- PAGE

## CustomTagType

Tipo de dato de un **[ProductCustomTag](../Models/Product/ProductCustomTag.md)**.

- BOOLEAN
- NUMBER
- SHORT_TEXT
- LONG_TEXT
- SELECTOR
- MULTIPLE_SELECTION
- SINGLE_SELECTION_IMAGE
- MULTIPLE_SELECTION_IMAGE
- LINK

## ConnectorType

- ADDRESS_VALIDATOR
- ASSET
- BASKET
- CAPTCHA
- CONFIRM_ORDER
- CUSTOM_TAG
- DATA
- DOCUMENT_PAYMENT_SYSTEM
- DOCUMENT_SHIPMENT
- EXPRESS_CHECKOUT
- INVOICE
- MAILING_SYSTEM
- MAILER
- MAPS
- MARKETING
- MARKETPLACE
- NONE
- OAUTH
- ORDER
- ORDER_STATUS
- PAYMENT_SYSTEM
- PICKUP_POINT_PROVIDER
- RELATED_DEFINITION
- REWARD_POINTS
- RMA
- ROUTE
- SHIPMENT
- SHIPPER
- SHIPPING_TYPE
- SEARCH_ENGINE
- SITE_BUILDER
- TAXES
- TAX_ID_VALIDATOR
- TRACKER
- UNKNOWN
- VIES_VALIDATOR

## DeliveryType

- SHIPPING
- PICKING

## DiscountApplyTo

Qué reduce un descuento. Desde la versión 2.8.5 también lo devuelve *getApplyTo()* de
*[AppliedDiscountView](../Models/Basket/AppliedDiscountView.md)*.

- PRODUCT: filas; en *AppliedDiscountView*, con el reparto por fila
- SHIPPING: el precio del envío
- TOTAL: la cesta en conjunto (descuento de cesta, después de las filas)

## DiscountType

- AMOUNT
- GIFT
- UNIT
- SELECTABLE_GIFT
- MXN

## DocumentType

- ORDER
- DELIVERY_NOTE
- INVOICE
- REFUND_REQUESTS
- RETURN
- REFUND

## EndOrderCode

*Disponible desde la versión 2.8.5.* Código de una comprobación de creación de pedido que falla en una cesta
(*[BasketIssue](../Models/Basket/BasketIssue.md)* con origen `END_ORDER`): la lista cerrada de valores que toma
*getCode()*, como *name()*, así que `EndOrderCode.valueOf(issue.getCode())` nunca falla para un aviso `END_ORDER`. La
evaluación en seco ejecuta todas las comprobaciones de datos del cliente que hace la creación del pedido
(`OrderUserValidator`: la validación de datos END_ORDER del comercio para el cliente, la dirección de facturación y la
de envío, y el ajuste `forceBillingAddressCountry`) e informa todos los fallos, aunque la creación del pedido se pare en
el primero: un aviso por campo que falla.

- REQUIRED: un campo obligatorio de la validación END_ORDER está vacío (`InvalidFieldType.REQUIRED`); *getField()* dice cuál. Una cuenta que se debe crear con el pedido (`createAccount` obligatorio) se informa con `OTHER`.
- INVALID: un campo no cumple la expresión regular de la validación (`InvalidFieldType.INVALID`); *getField()* dice cuál.
- FORCE_BILLING_ADDRESS_COUNTRY: el comercio obliga a que el país de facturación sea el de envío y son distintos. Se informa con `ADDRESS`.
- OTHER: cualquier otro fallo de las comprobaciones de datos del cliente (por ejemplo una validación que falla sin nombrar un campo). Se informa con `OTHER`.

## EndOrderField

*Disponible desde la versión 2.8.5.* Campo del cliente al que se refiere una comprobación de creación de pedido (un *[BasketIssue](../Models/Basket/BasketIssue.md)* con origen `END_ORDER`).

- EMAIL
- FIRST_NAME
- LAST_NAME
- PHONE
- ADDRESS: cualquier otro campo de la dirección de facturación o de envío
- OTHER: cualquier otro campo

## EmailSenderMimeType

- TEXT_PLAIN
- TEXT_HTML

## ExportStatusType

- PENDING_TO_SEND
- PENDING_TO_CONFIRM
- CONFIRMED

## Gender

- UNDEFINED
- MALE
- FEMALE

## IssueSeverity

*Disponible desde la versión 2.8.5.* Gravedad de un aviso de cesta.

- ERROR: no se puede crear el pedido mientras siga
- WARNING: informativo

## IssueSource

*Disponible desde la versión 2.8.5.* Origen de un aviso de cesta.

- WARNING: aviso del último recálculo; su código es el nombre de una constante de `BasketWarningCode` de la plataforma
- END_ORDER: comprobación de creación de pedido evaluada en seco; su código es el nombre de un *[EndOrderCode](#EndOrderCode)*

## MappedItemType

- USER
- STATUS_CODE
- REFUND_CODE

## OauthStatusType

- INVALID_CREDENTIALS
- ALREADY_CONNECTED
- INTERNAL_ERROR
- SUCCESS

## OrderShipmentStatusType

- INCIDENTS
- PENDING
- PROCESSING
- SHIPPED
- DELIVERED

## OrderStatusType

Desde la versión 2.8.5 el enumerado tiene `PENDING_APPROVAL`, colocado antes de `CONFIRM_DELETED` (cuyo ordinal pasa de 6
a 7). Las plataformas que antes informaban esos pedidos con estado *null* ahora informan `PENDING_APPROVAL`: los plugins
no deben depender de los ordinales, y un `switch` exhaustivo en forma de expresión sin rama `default`, compilado con un
SDK anterior, lanza una excepción cuando encuentra la nueva constante.

- DENIED
- INCIDENTS
- INCOMING
- IN_PROCESS
- COMPLETED
- DELETED
- PENDING_APPROVAL: el pedido espera la aprobación de un responsable de la cuenta (B2B). Como INCIDENTS y DENIED, el
  pedido todavía no se ha colocado. *Disponible desde la versión 2.8.5.*
- CONFIRM_DELETED

## PaymentType

- FORM
- OFFLINE
- NO_PAY
- CASH_ON_DELIVERY
- WIDGET
- REDIRECT

## PaymentValidateResponseType

- NO_DATA
- FORM
- XML
- REDIRECT
- WEBHOOK_MESSAGE

## PaymentValidateStatusType

- SKIP
- VALIDATED
- OK
- KO
- ACCEPTED

## PrevisionType

- RESERVE
- PREVISION
- AVAILABLE

## PermissionType

- LC_SUPER_ADMINISTRATOR_USER
- LC_ADMINISTRATOR_USER
- SUPER_ADMINISTRATOR_USER
- ADMINISTRATOR_USER

## RejectionCode

*Disponible desde la versión 2.8.5.* Motivo de un cambio de cesta rechazado (*[ChangeRejection](../Models/Basket/ChangeRejection.md)*).

- ROW_NOT_BUYABLE: la fila pedida no identifica una combinación que se pueda pedir: producto desconocido o no visible, producto con opciones combinables pedido sin ellas, valores que no son una combinación del producto, o una combinación que no se puede pedir en el contexto de la cesta (`NOT_ORDERABLE`). Se comprueba antes que `ROW_REQUIRES_NON_COMBINABLE_OPTION`. La fila no se añade, y la fila existente que nombra se elimina como una fila no pedida
- ROW_REQUIRES_NON_COMBINABLE_OPTION: el producto tiene una opción obligatoria no combinable; no se añade
- ROW_ADD_FAILED: la plataforma ha rechazado la fila por otro motivo
- CURRENCY_NOT_AVAILABLE: la moneda sugerida no está disponible
- COUNTRY_NOT_COMMERCE: el país no es del comercio; se usa el país por defecto
- CUSTOMER_EMAIL_REGISTERED: el email es de una cuenta registrada. Solo se rechaza el email: no se escribe y se borra el email que tuviera la cesta, porque la petición lo sustituía; el nombre, los apellidos y el teléfono del mismo *CustomerChange* sí se escriben

## RelatedItemType

- PRODUCT
- CATEGORY
- USER
- BASKET

## RewardPointsErrorType

- INSUFFICIENT_POINTS
- MAX_REDEEM_POINTS_EXCEEDED
- MINIMUM_PURCHASE_IMPORT
- NONE

## RMAStatusType

*Disponible desde la versión 2.8.5.* Estado de una devolución (*[OrderRMA](../Models/Order/OrderRMA.md)*), el `RMAStatusType` de la plataforma.

- INCIDENTS
- PENDING
- AUTHORIZED
- NO_AUTHORIZED
- IN_PROCESS
- ACCEPTED
- DENIED
- COMPLETED
- DELETED

## SettingOrderSubstatusActionType

- SEND_MAIL
- CHANGE_GROUP
- RESET_INTEGRATION
- CREATE_INVOICE
- SPEND_GIFT_CODES
- RELEASE_GIFT_CODES
- SPEND_DISCOUNTS
- RELEASE_DISCOUNTS
- NOTIFICATION
- CHANGE_SHIPMENT_STATUS

## ShippingActionType

- PICKUP
- REFUND
- TRACKING

## ShippingCalculation

- BY_WEIGHT
- BY_UNITS

## StockStatus

*Disponible desde la versión 2.8.5.* Estado de stock de una combinación del catálogo (*[CombinationView](../Models/Catalog/CombinationView.md)*).

- IN_STOCK: se puede pedir y hay stock (o el producto no gestiona stock)
- BACKORDER: se puede pedir, sin stock pero con reserva (con o sin previsión) o bajo pedido
- OUT_OF_STOCK: se puede pedir en el sentido de *CombinationView*, pero sin stock y sin entrega hasta que se reponga: la cesta la acepta como fila e informa un aviso `STOCK_RESTRICTION`
- NOT_ORDERABLE: el producto no se puede pedir en el contexto, tenga o no stock: su definición no es comprable (oculta su precio o su caja de pedido, como un producto solo de catálogo, o aún no ha llegado su fecha de disponibilidad), el comercio oculta los precios para el contexto (su ajuste `showPrice` del país y grupo de cuentas), o el producto es una compra de vale (un producto de vale de saldo, que solo se compra en la tienda). La cesta rechaza una fila suya (`ROW_NOT_BUYABLE`). Se decide por producto: todas sus combinaciones tienen este valor

## SubscriptionActionStatus

- SUCCESS
- ALREADY_SUBSCRIBED
- ALREADY_UNSUBSCRIBED
- CAN_NOT_SUBSCRIBE
- VALIDATE_ERROR
- SUBSCRIPTION_NOT_FOUND

## SubscriptionMessageType

- INFO
- SCRIPT

## SubscriptionStatus

- SUBSCRIBED
- UNSUBSCRIBED
- ERROR

## TaxIdOwnerType

- NATURAL_PERSON
- LEGAL_ENTITY

## TaxIdType

- TIN
- CONSUMPTION_TAX

## TrackerScriptType

- CODE
- IFRAME

## ValidationResult

- VALID
- INVALID
- UNSUPPORTED_SCENARIO
- SKIPPED
- ERROR

##WebhookResponseType

- JSON
- NO_DATA
- XML

## VoucherCodeStatus

*Disponible desde la versión 2.8.5.* Estado de un código de vale (un código de descuento o un código de vale de saldo) en una cesta (*[VoucherCodeResult](../Models/Basket/VoucherCodeResult.md)*).

- APPLIED: el código está en la cesta y su descuento se aplica
- REJECTED: la plataforma ha rechazado el código; no está en la cesta
- NOT_APPLYING: el código está en la cesta pero su descuento no se aplica ahora
- BALANCE_VOUCHER: es un vale de saldo utilizable; si se pide no se canjea (uno pedido que ha caducado o no tiene saldo es *REJECTED*, con `VOUCHER_CODE_EXPIRED` o `VOUCHER_CODE_EXHAUSTED` como código de error), y si ya está en la cesta se canjeó en la tienda y cuenta en *getVouchers()* de los totales

## WidgetAmbience

- ALL
- DESKTOP
- MOBILE

## WidgetPageType

- ALL
- HOME
- AREA
- CATEGORY
- PRODUCT
- CHECKOUT
- CHECKOUT_USER
- PAYMENT_SHIPPING
- CONFIRM_ORDER
- DENIED_ORDER
- PAGE_CONTENT
- NEWS
- NEW_USER
- BLOG
- BLOG_HOME
- BLOG_TAGS
- BLOG_CATEGORY
- BLOG_POST
- BLOG_AUTHOR
- SEARCH

## WidgetPosition

- HEAD_TOP
- HEAD_BOTTOM
- BODY_TOP
- BODY_BOTTOM
- FOOTER_TOP
- FOOTER_BOTTOM
- ALL

## WidgetType

- CSS
- JS
