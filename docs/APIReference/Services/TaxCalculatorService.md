# TaxCalculatorService

Servicio para taxas.

## Métodos disponibles

### Calcular las taxas (calculateTaxes)

Método utilizado para obtener las taxas que se deben de aplicar a la cesta de compra facilitada.

Parámetros:

- **[Cart](../models/Cart.md)** cart: cesta de la compra activa.

Devuelve: objecto **[CalculatedTaxes](../Models/Taxes/CalculatedTaxes.md)**

## Interfaz

```java
public interface TaxCalculatorService extends PluginService {


	CalculatedTaxes calculateTaxes(Cart cart) throws PluginServiceException;

}

```
