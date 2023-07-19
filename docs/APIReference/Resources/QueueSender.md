# QueueSender

## Descripción

Envia mensajes en una cola de procesos. Los mensajes los recibirá *[QueueProcessorService](../Services/QueueProcessorService.md)*.

## Método

- **void** send(QueueMessage message)

## QueueMessage

*QueueMessage* es la clase abstracta donde se define el menaje.

### Campos

- **action**: cadena de texto de no mas de 32 carácteres que define la acció. Solo permite letras, numéros y "_".
- **attributes**: Lista de atributos del mensaje.
  - Solo se permiten los tipos *String*, *Integer*, *Double* y *Boolean*. Los tipos se definen con el enum *AttributeType* (**type**).
  - El nombre del atributo (**name**) es una cadena de texto de no mas de 32 carácteres i solo permite letras, numéros y "_".
  - El valor del atributo (**value**) no puede diferir del tipo. Cuando es un String, la cadena de texto no puede superar los 256 caracteres.
- **settings**: Para definir comportamiento del mensaje.
  - **delay**: Tiempo de espera en segundos para mandar el mensaje a la cola. No puede ser inferior a 0 ni superior a 900. Su valor por defecto es 0.
  - **retryCount**: Define el número de reintentos en el caso que no se pueda procesar el mensaje. No puede ser inferior a 0 ni superior a 10. Su valor por defecto es 0 (no hay reintentos).
  - **interval**: Tiempo de espera en segundos entre reintentos. No puede ser inferior a 0 ni superior a 10. Su valor por defecto es 0.

Implementaciones de *QueueService*:

### FreeQueueMessage

Mensaje simple. Solo permite los campos de *QueueMessage*.

### OrderQueueMessage

Mensaje con el Order. Además de los campos de *QueueMessage*, se pasa el campo *Order*.

### UserQueueMessage

Mensaje con el User. Además de los campos de *QueueMessage*, se pasa el campo *User*.

### FreeLargeMessage

Mensaje con un campo de texto libre (**body**). Su tamaño el tamaño máximo permitido es de 1 MB.
