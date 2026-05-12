# RewardPointsService

Servicio de puntos de recompensa

## Métodos disponibles

### - getBalance

Obtiene el balance de puntos para el usuario activo.

# 

# Interfaz

```java
public interface RewardPointsService extends PluginService {

    RewardPointsBalance getBalance() throws PluginServiceException;

    RewardPointsDiscountResponse getDiscount(int pointsToRedeem) throws PluginServiceException;

    void redeemPoints(Order order, int pointsToRedeem) 

}
```
