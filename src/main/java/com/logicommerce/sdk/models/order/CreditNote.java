package com.logicommerce.sdk.models.order;

/**
 * <p>Order interface.</p>
 *
 * @author Logicommerce
 * @since 2.4.1
 */
public interface CreditNote extends Document {

	String getExternalInvoiceId();

	void setExternalInvoiceId(String externalInvoiceId);
	
	String getOriginalInvoiceId();
	
	void setOriginalInvoiceId(String originalInvoiceId);
}
