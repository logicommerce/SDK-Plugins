# OrderItemStock

## Descripción

Muestra el stock del elemento del pedido.

## Métodos

- **Integer** getId()
- **Integer** getWarehouseId()
- **Integer** getWarehouseGroupId()
- **int** getQuantity()
- **int** getReservedQuantity()
- **LocalDate** getIncomingDate()
- **int** getOffsetDays()
- **int** getPriority()
- **String** getHash()
- ***PrevisionType*** getPrevisionType()
- **List<[OrderItemSubstractedStock](OrderItemSubstractedStock.md)>** getSubstractedStocks()

## Referencias

- **PrevisionType**: Enumerado
- **[OrderItemSubstractedStock](OrderItemSubstractedStock.md)**
