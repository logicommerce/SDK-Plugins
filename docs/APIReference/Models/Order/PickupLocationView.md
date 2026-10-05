# PickupLocationView

## Descripción

Lugar donde se recoge un pedido de recogida: un punto físico del comercio o un punto de recogida de un transportista.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getPhysicalLocationId(): id del punto físico, o 0 para un punto de recogida de un transportista.
- **String** getName(): nombre del punto físico o del punto de recogida.
- **[AddressView](AddressView.md)** getAddress(): nunca *null*.
