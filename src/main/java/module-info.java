module com.logicommerce.sdk {
	requires com.logicommerce.utilities;

	exports com.logicommerce.sdk;
	exports com.logicommerce.sdk.definition;
	exports com.logicommerce.sdk.definition.implementations;
	exports com.logicommerce.sdk.services;
	exports com.logicommerce.sdk.services.queues;
	exports com.logicommerce.sdk.resources;
	exports com.logicommerce.sdk.models;
	exports com.logicommerce.sdk.models.implementations;
	exports com.logicommerce.sdk.models.order;
	exports com.logicommerce.sdk.models.order.implementations;
	exports com.logicommerce.sdk.models.payment;
	exports com.logicommerce.sdk.models.queues;
	exports com.logicommerce.sdk.models.taxes;
	exports com.logicommerce.sdk.models.pickuppoints;
	exports com.logicommerce.sdk.enums;
	exports com.logicommerce.sdk.builders;
	exports com.logicommerce.sdk.builders.order;
}