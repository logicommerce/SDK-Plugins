# PaymentData

## Descripción

Datos de respuesta para **[Payment](Payment.md)** i de **[PaymentValidateResponse](PaymentValidateResponse.md)**.

Esta interfaz no tiene métodos. Es una definción de tipo. En caso de que los datos sean de formulario existe la interfaz **PaymentDataForm**.

## PaymentDataForm

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
