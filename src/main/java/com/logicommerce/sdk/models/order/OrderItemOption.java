package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.OptionValueType;

public interface OrderItemOption {

	Integer getId();

	List<OrderItemOptionValue> getValues();

	Integer getOptionId();

	Integer getOptionValueId();

	String getSku();

	String getName();

	String getPrompt();

	String getValue();

	Double getPrice();

	double getWeight();

	boolean isUniquePrice();

	OptionValueType getValueType();

	double getPreviousPrice();

	String getProductOptionPId();

	boolean isCombinable();
}
