# AsyncConnection

## Descripción

Recurso para ejecutar peticiones HTTP asíncronas.

Los métodos son los mismos que [Connection](Connection.md), aunque las respuestas de GET, POST, PUT, PATCH y DELETE devuelven **CompletableFuture&lt;Response&gt;**.
