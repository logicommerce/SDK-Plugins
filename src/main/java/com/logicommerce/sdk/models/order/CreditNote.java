package com.logicommerce.sdk.models.order;

import java.util.List;

/**
 * <p>Order interface.</p>
 *
 * @author Logicommerce
 * @since 2.5.2
 */
public interface CreditNote extends Document {

	String getExternalInvoiceId();

	void setExternalInvoiceId(String externalInvoiceId);
	
	String getOriginalInvoiceId();
	
	void setOriginalInvoiceId(String originalInvoiceId);

	List<AdditionalItem> getAdditionalItems();

	void setAdditionalItems(List<AdditionalItem> additionalItems);
}
