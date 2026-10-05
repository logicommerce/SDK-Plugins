# AppliedDiscountView

## Descripción

Descuento aplicado a una cesta o a un pedido. Los importes son magnitudes no negativas en unidades menores y siguen el
modo de impuestos de la vista, salvo los descuentos de cesta (*TOTAL*) de una vista sin impuestos cuando el comercio
los resta después de impuestos (`TAX.discountsBeforeTax=false`, el valor por defecto): esos van con impuestos y no
reducen el impuesto.

Todo descuento al que se refiere algún *[Allocation](Allocation.md)* de la vista (por *getDiscountId()*) aparece en los
descuentos de la vista, incluido el descuento automático que hace gratuita una fila de regalo (como descuento *PRODUCT*
asignado a esa fila).

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getDiscountId(): id del descuento.
- **String** getName(): nombre del descuento.
- **String** getCode(): código que activa el descuento cuando tiene una condición de código y ese código está en la cesta; *null* para un descuento automático.
- **DiscountApplyTo** getApplyTo(): qué reduce el descuento: *PRODUCT* las filas (con su reparto por fila en *getRows()*), *SHIPPING* el precio del envío y *TOTAL* la cesta en conjunto (descuento de cesta, después de las filas).
- **long** getAmount(): importe descontado: para *PRODUCT*, la suma de *getRows()*; para *SHIPPING* en un pedido, la suma de sus repartos a los envíos (*OrderShipmentView.getShippingDiscounts()*); si no, el importe propio del descuento, redondeado una vez.
- **List<[RowAllocation](RowAllocation.md)>** getRows(): reparto por fila de un descuento *PRODUCT* (suma *getAmount()*); vacía para el resto.

## Referencias

- **[DiscountApplyTo](../../Enums/README.md#DiscountApplyTo)**: Enumerado
