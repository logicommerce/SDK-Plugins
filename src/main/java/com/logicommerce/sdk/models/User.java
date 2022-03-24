package com.logicommerce.sdk.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface User {

	Integer getId();

	String getEmail();

	String getNick();

	String getGender();

	LocalDate getBirthday();

	String getCompany();

	Integer getSalesAgentId();

	Boolean isSalesAgent();

	List<UserAddress> getBillingAddresses();

	List<UserAddress> getShippingAddresses();

	Map<String, String> getCustomTags();

}
