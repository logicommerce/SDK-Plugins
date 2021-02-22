package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;

public interface OrderShippingTrackingPackageActivity {

	Integer getId();

	LocalDateTime getDateTime();

	String getStatus();

	String getDescription();

	List<ElementProperty> getProperties();

	void setStatus(String status);

	void setDescription(String description);

	void addProperty(ElementProperty property);

	void addProperty(String name, String value);

}
