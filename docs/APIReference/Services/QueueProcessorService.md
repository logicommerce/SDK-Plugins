# QueueProcessorService

Interfaz principal de donde extienden los servicios específicos de cola.

```java
public interface QueueProcessorService extends PluginService {

}
```

Este servicio no se llama nunca desde Beyond por tanto no es necesario implementarlo.

Servicios que extienden de *QueueProcessorService*:

## FreeQueueProcessorService

```java
public interface FreeQueueProcessorService extends QueueProcessorService {

    void process(String action, Set<Attribute> attributes) throws PluginServiceException;

}
```

## OrderQueueProcessorService

```java
public interface OrderQueueProcessorService extends QueueProcessorService {

    void process(String action, Set<Attribute> attributes, Order order) throws PluginServiceException;

}

```

## UserQueueProcessorService

```java
public interface UserQueueProcessorService extends QueueProcessorService {

    void process(String action, Set<Attribute> attributes, User user) throws PluginServiceException;

}

```

## FreeLargeQueueProcessorService

```java
public interface FreeLargeQueueProcessorService extends QueueProcessorService {

    void process(String action, Set<Attribute> attributes, String body) throws PluginServiceException;

}
```
