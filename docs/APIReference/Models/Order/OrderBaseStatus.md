# OrderBaseStatus

## Descripción

Estado del pedido o del envío.

### Métodos

- **Integer** getId()
- **List<[OrderStatusAction](OrderStatusAction)>** getActions()
- **LocalDateTime** getCurrentDateTime()
- **T** getStatus(): T és el genérico que puede definirse como un pedido o como un envío.
- **int** getSubstatusId()
- **T** getFromStatus(): estado anterior al cambio. La plataforma solo registra una entrada cuando el estado cambia, así que la primera entrada del historial también lo tiene. *null* si la plataforma no registró ninguno o si no tiene equivalente en *T* (el *NONE* de un envío). *Disponible desde la versión 2.8.5.* Solo lo rellena *[OrderResource](../../Resources/OrderResource.md)*: *null* en los pedidos que reciben los hooks y en los que construye un plugin.

## Referencias

**[OrderStatusAction](OrderStatusAction)**
