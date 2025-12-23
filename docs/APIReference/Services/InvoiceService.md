# InvoiceService

Servicio para las facturas

## Métodos disponibles

### Crear factura

Se llama cuando se genera una nueva factura.

Parámetros:

**[Invoice](../Models/Order/Invoice.md)** invoice

Respuesta:

**[DataFile](../Models/DataFile.md)** dataFile - datos pdf en format base64.

### Obtener documento PDF factura

Se llama cuando se genera una nueva factura rectificativa.

Parámetros:

**[Invoice](../Models/Order/Invoice.md)** invoice

Respuesta:

**[DataFile](../Models/DataFile.md)** invoice

### Crear factura rectificativa

Se llama cuando se genera una nueva factura rectificativa.

Parámetros:

**[CreditNote](../Models/Order/CreditNote.md)** creditNote

Respuesta:

**[CreditNote](../Models/Order/CreditNote.md)** creditNote

### Obtener documento PDF factura rectificativa

Se llama cuando se genera una nueva factura rectificativa.

Parámetros:

**[CreditNote](../Models/Order/CreditNote.md)** creditNote

Respuesta:

**[DataFile](../Models/DataFile.md)** dataFile - datos pdf en format base64.

## Interfíce

```java
public interface InvoiceService extends PluginService {

	Invoice createInvoice(Invoice invoice) throws PluginServiceException;

	CreditNote creditNote(CreditNote creditNote) throws PluginServiceException;

	DataFile getInvoiceFile(Invoice invoice) throws PluginServiceException;

	DataFile getCreditNoteFile(CreditNote creditNote) throws PluginServiceException;

}
```
