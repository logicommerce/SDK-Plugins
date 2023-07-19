# PaymentSystemProperties

## Descripción

Propiedades del sistema de pago

## Métodos

- **List<[PaymentSystemProperty](PaymentSystemProperty.md)**> getProperties()
- **void setProperties(List<[PaymentSystemProperty](PaymentSystemProperty.md)>** paymentProperties)
- **void** addProperty(**[PaymentSystemProperty](PaymentSystemProperty.md)** paymentProperty)
- **void** clean()

## Implementación

El SDK facilita el trabajo con una implementación: **PaymentSystemPropertiesImpl** donde a su constructor se le tiene que pasar una lista de propiedaes:  List<[PaymentSystemProperty](PaymentSystemProperty.md)>

```java
PaymentSystemProperties paymentSystemProperties = new PaymentSystemPropertiesImpl(properties);
```

## Referencias

- **[PaymentSystemProperty](PaymentSystemProperty.md)**
