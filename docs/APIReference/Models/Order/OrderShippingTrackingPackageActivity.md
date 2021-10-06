# OrderShippingTrackingPackageActivity

## Descripción

Muestra y permite generar la información de la actividad del tracking

### Métodos

- **Integer** getId()
- **LocalDateTime** getDateTime()
- **String** getStatus()
- **String** getDescription()
- **List<[ElementProperty](ElementProperty.md)>** getProperties()
- **void** setStatus(**String** status)
- **void** setDescription(**String** description)
- **void** addProperty(**[ElementProperty](ElementProperty.md)** property)
- **void** addProperty(**String** name, **String** value)

### Referencias

- **[ElementProperty](ElementProperty.md)**
