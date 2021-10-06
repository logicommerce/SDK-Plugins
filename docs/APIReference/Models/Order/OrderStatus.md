# OrderStatus

## Descripción

Muestra el estado del pedido.

Extiende interfaz **OrderBaseStatus**.

## Métodos

- **Integer** getId()
- **List<[OrderStatusAction](OrderStatusAction.md)>** getActions()
- **LocalDateTime** getCurrentDateTime()
- ***OrderStatusType*** getStatus()
- **int** getSubstatusId()

## Referencias

- **[OrderStatusAction](OrderStatusAction.md)**
- **OrderStatusType**: Enumerado
