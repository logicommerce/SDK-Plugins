package com.logicommerce.sdk.models.payment;

import java.util.List;
import com.logicommerce.sdk.models.Param;

/**
 * <p>PaymentDataForm interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentDataForm extends PaymentData {

	/**
	 * <p>getUrl.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUrl();

	/**
	 * <p>getMethod.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMethod();

	/**
	 * <p>getParams.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<Param> getParams();

}
