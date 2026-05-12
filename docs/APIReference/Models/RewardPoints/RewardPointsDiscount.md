# RewardPointsDiscount

## Descripción

Representa el descuento generado a partir del canje de puntos de recompensa. Contiene el importe del descuento, los puntos utilizados y la información descriptiva del descuento aplicado.

## Métodos

- **double** getAmount()
- **double** getPointsToRedeem()
- **String** getName()
- **String** getDescription()
- **String** getCode()
- **void** setAmount(double amount)
- **void** setPointsToRedeem(double pointsToRedeem)
- **void** setName(String name)
- **void** setDescription(String description)
- **void** setCode(String code)

## Builder

**RewardPointsDiscountBuilder** devuelve una implementación de **RewardPointsDiscount**.

Métodos del builder:

- *amount(double amount)*: Importe del descuento a aplicar.
- *pointsToRedeem(double pointsToRedeem)*: Número de puntos que se canjean para obtener el descuento.
- *name(String name)*: Nombre del descuento.
- *description(String description)*: Descripción del descuento.
- *code(String code)*: Código identificador del descuento.
- *build()*: Construye el objeto **RewardPointsDiscount**.

### Ejemplo

```java
RewardPointsDiscount discount = new RewardPointsDiscountBuilder()
    .amount(10.00)
    .pointsToRedeem(100)
    .name("Descuento por puntos")
    .description("Descuento aplicado por canje de puntos de fidelización")
    .code("DISC_001")
    .build();
```
