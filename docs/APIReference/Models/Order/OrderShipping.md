# OrderShipping

## Descripción

Muestra la información del envío de la expedición.

## Métodos

- **Integer** getId()
- **int** getShippingTypeId()
- **String** getName()
- **Boolean** isCashOnDelivery()
- **Double** getPrice()
- **String** getShippingTypeName()
- **Integer** getShippingSectionId()
- **[*ShippingCalculation*](../../Enums/README.md#ShippingCalculation)** getShippingCalculation()
- **String** getShipperPId()
- **String** getShippingTypePId()
- **List<[OrderItemTax](OrderItemTax.md)>** getTaxes()
- **List<[OrderDiscount](OrderDiscount.md)>** getDiscounts()
- **[OrderShippingTracking](OrderShippingTracking.md)** getTracking()
- **void** setTracking(**[OrderShippingTracking](OrderShippingTracking.md)** tracking)
- **List<[ElementProperty](ElementProperty.md)>** getProperties()
- **void** addProperty(**[ElementProperty](../ElementProperty.md)** property)
- **void** addProperty(**String** name, **String** value)

## Referencias

- **[ShippingCalculation](../../Enums/README.md#ShippingCalculation)**: Enumerado
- **[OrderItemTax](OrderItemTax.md)**
- **[OrderDiscount](OrderDiscount.md)**
- **[OrderShippingTracking](OrderShippingTracking.md)**
- **[ElementProperty](../ElementProperty.md)**
