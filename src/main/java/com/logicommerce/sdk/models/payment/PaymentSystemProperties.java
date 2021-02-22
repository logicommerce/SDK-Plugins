package com.logicommerce.sdk.models.payment;

import java.util.List;

public interface PaymentSystemProperties {

	List<PaymentSystemProperty> getProperties();

	void setProperties(List<PaymentSystemProperty> paymentProperties);

	void addProperty(PaymentSystemProperty paymentProperty);

	void clean();

}
