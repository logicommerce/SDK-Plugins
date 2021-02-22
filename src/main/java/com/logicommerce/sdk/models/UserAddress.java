package com.logicommerce.sdk.models;


public interface UserAddress extends Address {

	boolean isDefaultAddress();

	String getAlias();

	String getFirstName();

	String getLastName();

	String getCompany();

	String getAddressAdditionalInformation();

	String getNumber();

	String getFax();

	String getNif();

	String getVat();

	boolean isTax();

	boolean isRe();

	boolean isReverseChargeVat();

}
