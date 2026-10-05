# OrderView

## Descripción

Pedido tal como lo devuelve *[OrderResource](../../Resources/OrderResource.md)*. Todos los importes son enteros en
unidades menores de la moneda de compra (*getCurrencyCode()*), convertidos desde la moneda de la sede con los valores de
moneda guardados en el pedido y redondeados como en las cestas (ver *[TotalsView](../Basket/TotalsView.md)*). Las listas
y los mapas nunca son *null*.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId(): id del pedido.
- **String** getDocumentNumber(): número de documento, asignado cuando el pedido se coloca (cuando sale de *INCIDENTS*, *DENIED* y *PENDING_APPROVAL*); *null* hasta entonces.
- **OrderStatusType** getStatus(): estado.
- **Instant** getDate(): fecha del pedido (UTC), fijada al crearlo y que no cambia después. La plataforma la trunca a segundos enteros, la precisión con la que se guarda. Para un pedido leído de la base de datos, `LocalDateTime.ofInstant(getDate(), ZoneOffset.UTC)` es igual a su *getDate()* de *[Document](Document.md)* guardado; para un pedido que la plataforma aún tiene en memoria (la petición que lo creó) es la hora de creación truncada a segundos, que puede ser un segundo anterior a la guardada, porque la base de datos puede redondear la fracción hacia arriba.
- **String** getCurrencyCode(): moneda de compra (ISO 4217).
- **boolean** isTaxesIncluded(): *true* si los importes incluyen impuestos, como en las cestas.
- **int** getLanguageId(): id del idioma del pedido.
- **List<[StatusHistory](StatusHistory.md)>** getStatusHistory(): historial de estados, en orden cronológico.
- **Map<String, String>** getProperties(): propiedades que la cuenta de plugin que llama ha añadido al pedido con *addProperty*, por nombre. No incluye las que han añadido otros plugins (u otras cuentas del mismo plugin), así que nunca ocultan las suyas. Si un nombre se repite, gana el último valor.
- **List<[OrderRowView](OrderRowView.md)>** getRows(): filas del pedido.
- **List<[AppliedDiscountView](../Basket/AppliedDiscountView.md)>** getDiscounts(): descuentos aplicados.
- **[TotalsView](../Basket/TotalsView.md)** getTotals(): totales. El total de envío es la suma de los precios de envío de los envíos más el precio de recogida, y un pedido de recogida (`PICKING`) cuenta como envío seleccionado (*isDeliverySelected()*).
- **[AddressView](AddressView.md)** getShippingAddress(): dirección de envío, o *null* si no hay (por ejemplo un pedido de recogida).
- **[CustomerView](../Basket/CustomerView.md)** getCustomer(): datos del cliente; nunca *null*.
- **DeliveryType** getDeliveryType(): tipo de entrega, o *null* si el pedido no tiene entrega.
- **[PickupLocationView](PickupLocationView.md)** getPhysicalLocation(): dónde se recoge un pedido de recogida (`PICKING`): un punto físico del comercio o un punto de recogida de un transportista (con *getPhysicalLocationId()* 0); *null* si no es un pedido de recogida, y también en un pedido de recogida que no tiene ni punto físico ni punto de recogida de un proveedor.
- **List<[OrderShipmentView](OrderShipmentView.md)>** getShipments(): envíos.
- **List<[RMAView](RMAView.md)>** getRMAs(): devoluciones (RMA).
- **List<[CreditNoteView](CreditNoteView.md)>** getCreditNotes(): facturas rectificativas.
- **String** getPermalinkUrl(): página de pedido de invitado de la tienda (`<tienda>/orders/<id>?token=<token>`), construida por la plataforma, nunca a partir de la petición: `<tienda>` es la versión de la tienda que la resolución de rutas elige para el idioma del pedido y su país de envío (si no, el de facturación); si no coincide ninguna, la primera versión del idioma del pedido para cualquier país; si tampoco hay, la URL de la tienda configurada para el idioma del pedido.

## Referencias

- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumerado
- **[DeliveryType](../../Enums/README.md#DeliveryType)**: Enumerado
