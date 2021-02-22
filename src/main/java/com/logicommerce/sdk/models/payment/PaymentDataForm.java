package com.logicommerce.sdk.models.payment;

import java.util.List;
import com.logicommerce.sdk.models.Param;

public interface PaymentDataForm extends PaymentData {

	String getUrl();

	String getMethod();

	List<Param> getParams();

}
