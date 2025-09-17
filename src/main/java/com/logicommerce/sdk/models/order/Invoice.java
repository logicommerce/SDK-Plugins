package com.logicommerce.sdk.models.order;

/**
 * <p>Order interface.</p>
 *
 * @author Logicommerce
 * @since 2.5.2
 */
public interface Invoice extends Document {

	String getExternalInvoiceId();

	void setExternalInvoiceId(String externalInvoiceId);
	
	String getOriginalInvoiceId();

	void setOriginalInvoiceId(String originalInvoiceId);

}
