# OrderStatus

## Descripción

Muestra el estado del pedido.

Extiende interfaz **[OrderBaseStatus](./OrderBaseStatus.md)**.

## Métodos

- **Integer** getId()
- **List<[OrderStatusAction](OrderStatusAction.md)>** getActions()
- **LocalDateTime** getCurrentDateTime()
- ***[OrderStatusType](../../Enums/README.md#OrderStatusType)*** getStatus()
- **int** getSubstatusId()

## Referencias

- **[OrderStatusAction](OrderStatusAction.md)**
- **[OrderStatusType](../../Enums/README.md#OrderStatusType)**: Enumerado
