# DefinitionService

Servicio para definir configuraciones. Estas configuraciones son las que desde el administrador de cada tienda se podrá llenar. También se llamarán a la carga del resto de servicios y se encontrará disponible a **[PluginDefinition](../Definitions/PluginDefinition.md)**.

Los métodos devuelven una definición de configuración por tipo o la lista de todas configuraciones.

El tipo viene definido por el enumerado **[ConnectorType](../Enums/README.md#ConnectorType)**.

## Interfície

```java
public interface DefinitionService extends PluginService {

    PluginDefinition getPluginDefinition() throws PluginServiceException;

    default PluginDefinition getPluginDefinition(boolean loadDynamicData) throws PluginServiceException {
        return this.getPluginDefinition();
    }

    ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException;

    default ConnectorDefinition getConnectorDefinition(ConnectorType connectorType, boolean loadDynamicData) throws PluginServiceException {
        return this.getConnectorDefinition(connectorType);
    }

    List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException;

}
```

Ejemplo de implementación de DefinitionService. Esta implementación devuelve la definción estática.

```java
public class Definition implements DefinitionService {

	@Resource
	private PluginDefinition pluginDefinition;

	@Override
	public PluginDefinition getPluginDefinition() throws PluginServiceException {
		return pluginDefinition;
	}

	@Override
	public List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException {
		return pluginDefinition.getConnectorDefinitions();
	}

	@Override
	public ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException {
		for (ConnectorDefinition connectorDefinition : getConnectorDefinitions()) {
			if (connectorDefinition.getType().equals(connectorType)) {
				return connectorDefinition;
			}
		}
		return null;
	}

}
```

## Carga de datos dinámicos

*Disponible desde la versión 2.8.4.*

Las sobrecargas con el parámetro *loadDynamicData* permiten separar la definición **estática** (la que el plugin resuelve por sí mismo) de la definición **dinámica** (la que necesita datos de un sistema externo: métodos de pago, transportistas, centros de distribución, campos de una lista de contactos...).

Beyond siempre invoca las sobrecargas e indica en *loadDynamicData* si necesita los datos dinámicos:

| Origen de la petición | loadDynamicData | Qué se espera del plugin |
| --- | --- | --- |
| Administrador (Back Office) | `true` | La definición estática más los valores que haya que pedir al sistema externo. |
| Tienda (Front Office) | `false` | Solo la definición estática, sin llamadas al sistema externo. |

Los datos dinámicos únicamente hacen falta cuando el Administrador está editando la configuración del plugin, que es donde se tienen que ver los valores de los desplegables. En las peticiones de la tienda la definición sólo se usa para resolver la configuración ya guardada, de modo que las llamadas al sistema externo serían un coste (latencia y consumo de la API) sin ningún efecto visible.

Las dos sobrecargas tienen implementación por defecto y delegan en los métodos sin parámetro, así que **un plugin ya publicado sigue funcionando igual sin tocar nada**. Sólo hay que implementarlas si el plugin construye definición dinámica.

### Cómo implementarlo

- Poner la lógica en la sobrecarga y hacer que el método sin parámetro delegue en ella con `false`.
- Declarar **siempre** la propiedad, con su identificador, tipo e idiomas. Lo que depende de *loadDynamicData* son los **valores**, no la estructura: la configuración guardada se resuelve recorriendo las propiedades de la definición, por lo que una propiedad que no se declare no llegará a las anotaciones *@Property*, *@PropertyLanguage* y *@Mapped*.
- Hacer la llamada al sistema externo dentro del `if (loadDynamicData)`.

```java
public class Definition implements DefinitionService {

	@Resource
	private PluginDefinition pluginDefinition;

	@Aggregate
	private ApiConnection apiConnection;

	private PropertyDefinition paymentMethods;

	@Override
	public PluginDefinition getPluginDefinition() throws PluginServiceException {
		return pluginDefinition;
	}

	@Override
	public ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException {
		return getConnectorDefinition(connectorType, false);
	}

	@Override
	public ConnectorDefinition getConnectorDefinition(ConnectorType connectorType, boolean loadDynamicData) throws PluginServiceException {
		ConnectorDefinition connectorDefinition = pluginDefinition.getConnectorDefinition(connectorType);
		if (connectorDefinition == null) {
			return null;
		}
		if (ConnectorType.PAYMENT_SYSTEM.equals(connectorDefinition.getType()) && paymentMethods == null) {
			paymentMethods = getPaymentMethods(loadDynamicData);
			connectorDefinition.addProperty(paymentMethods);
		}
		return connectorDefinition;
	}

	@Override
	public List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException {
		return pluginDefinition.getConnectorDefinitions();
	}

	private PropertyDefinition getPaymentMethods(boolean loadDynamicData) throws PluginServiceException {
		Builder<?> property = new PropertyDefinitionImpl.Builder<>()
				.entryValueMode("select")
				.identifier("subPaymentSystemId")
				.languages()
					.value("es", "Modalidad de pago")
					.value("en", "Payment method")
				.done();
		if (loadDynamicData) {
			for (PaymentMethod method : apiConnection.getPaymentMethods()) {
				property.value()
						.languages()
							.value("es", method.getName())
							.value("en", method.getName())
						.done()
						.value(method.getCode())
					.done();
			}
		}
		return property.build();
	}

}
```

El mismo criterio se aplica a *getPluginDefinition(boolean)* cuando las propiedades dinámicas son del plugin y no de un conector.

> :bulb: El servicio es una única instancia por petición y se puede invocar más de una vez. Guardar la propiedad ya construida en un campo, como en el ejemplo, evita repetir la llamada al sistema externo dentro de la misma petición.

*getConnectorDefinitions()* no tiene sobrecarga: devuelve las definiciones de los conectores tal como estén declaradas, sin datos dinámicos.
