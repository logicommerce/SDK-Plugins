# RewardPointsBalance

## Descripción

Representa el balance de puntos de recompensa de un usuario. Contiene la información sobre los puntos disponibles y el identificador del balance asociado.

## Métodos

- **Integer** getId()
- **int** getAvailablePoints()
- **String** getCode()

## Builder

**RewardPointsBalanceBuilder** devuelve una implementación de **RewardPointsBalance**.

Métodos del builder:

- *id(Integer id)*: Identificador del balance de puntos de recompensa.
- *availablePoints(int availablePoints)*: Número de puntos disponibles para canjear.
- *code(String code)*: Código asociado al balance de puntos.
- *build()*: Construye el objeto **RewardPointsBalance**.

### Ejemplo

```java
RewardPointsBalance balance = new RewardPointsBalanceBuilder()
    .id(1)
    .availablePoints(500)
    .code("REWARDS_CODE")
    .build();
```
