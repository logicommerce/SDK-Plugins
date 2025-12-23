# MailerService

Servicio para el envio de emails.

## Métodos disponibles

### envair email

parámetros:

- **[EmailSenderParam](../Models/EmailSender/EmailSenderParam.md)** message: información sobre el mensaje a enviar.

No devuelve parámetros.

## Interfaz

```java
public interface MailerService extends PluginService {
	
	void send(EmailSenderParam message) throws PluginServiceException;
	
}
```
