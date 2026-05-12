# RewardPointsDiscountResponse

## Descripción

Respuesta del servicio de puntos de recompensa al solicitar un descuento por canje de puntos. Indica si la operación fue exitosa o si se produjo algún error, junto con el detalle del descuento calculado.

## Métodos

- **[RewardPointsErrorType](../../Enums/README.md#RewardPointsErrorType)** getErrorType()
- **boolean** hasError()
- **[RewardPointsDiscount](RewardPointsDiscount.md)** getRewardPointsDiscount()

## Referencias

- **[RewardPointsErrorType](../../Enums/README.md#RewardPointsErrorType)**: Enumerado que indica el tipo de error producido.
- **[RewardPointsDiscount](RewardPointsDiscount.md)**: Detalle del descuento calculado.

## Builder

**RewardPointsDiscountResponseBuilder** devuelve una implementación de **RewardPointsDiscountResponse**.

Métodos del builder:

- *error(boolean error)*: Indica si la operación ha producido un error.
- *errorType(RewardPointsErrorType errorType)*: Tipo de error producido (ver **[RewardPointsErrorType](../../Enums/README.md#RewardPointsErrorType)**).
- *discount(RewardPointsDiscount discount)*: Descuento calculado a partir del canje de puntos.
- *build()*: Construye el objeto **RewardPointsDiscountResponse**.

### Ejemplo — respuesta exitosa

```java
RewardPointsDiscount discount = new RewardPointsDiscountBuilder()
    .amount(10.00)
    .pointsToRedeem(100)
    .name("Descuento por puntos")
    .code("DISC_001")
    .build();

RewardPointsDiscountResponse response = new RewardPointsDiscountResponseBuilder()
    .error(false)
    .discount(discount)
    .build();
```

### Ejemplo — respuesta con error

```java
RewardPointsDiscountResponse response = new RewardPointsDiscountResponseBuilder()
    .error(true)
    .errorType(RewardPointsErrorType.INSUFFICIENT_POINTS)
    .build();
```
