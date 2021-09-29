## PaymentDataForm

Extiende interfaz [PaymentData](PaymentData.md)

### Métodos

- **String** getUrl()
- **String** getMethod()
- **List<[Param](../Param.md)>** getParams()

### Referencias

- **[Param](../Param.md)**

### Builder

Métodos del builder:

- *url(String url)*:
- *method(String method)*: Método o verb del formulario. El builder proporciona métodos para determinarlo
- *get()*: Formulario con verb GET.
- *post()*: Formulario con verb POST.
- *put()*: Formulario con verb PUT.
- *delete()*: Formulario con verb DELETE.
- *param(String name, String value)*: Parámetros del formulario. Dependiendo del verb, los parámetros se tratarán como un parámetro de *query* o de *form*.
