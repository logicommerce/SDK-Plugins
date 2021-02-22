# OrderBaseStatus

## Descripción

Estado del pedido o del envío.

### Métodos

- **Integer** getId()
- **List<[OrderStatusAction](OrderStatusAction)>** getActions()
- **LocalDateTime** getCurrentDateTime()
- **T** getStatus(): T és el genérico que puede definirse como un pedido o como un envío.
- **int** getSubstatusId()

## Referencias

**[OrderStatusAction](OrderStatusAction)**
