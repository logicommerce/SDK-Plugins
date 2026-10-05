# ClientInfo

## Descripción

Cliente del comprador, tal como lo conoce el plugin (por ejemplo a partir de las señales de una plataforma de agentes).
La plataforma lo usa en lugar de las cabeceras de la petición al reconstruir el contexto de la cesta, y nunca lo trata
como un bot.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getUserAgent(): user agent, o *null*/vacío si no se conoce.
- **String** getIp(): IP, o *null*/vacío si no se conoce.

## Builder

**ClientInfoBuilder** (`com.logicommerce.sdk.builders.basket`) devuelve una implementación de **ClientInfo**.

Métodos del builder: userAgent, ip y *build()*.
