package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.Invoice;
import com.logicommerce.sdk.models.order.implementations.InvoiceImpl;

/**
 * <p>InvoiceSdkBuilder class.</p>
 *
 * @author LogiCommerce
 * @since 2.5.2
 */
public class InvoiceSdkBuilder extends DocumentSdkBuilder<InvoiceSdkBuilder> {

	protected String externalInvoiceId;

	/**
	 * <p>Constructor for OrderSdkBuilder.</p>
	 */
	public InvoiceSdkBuilder() {
		//pass
	}

	/**
	 * <p>externalInvoiceId.</p>
	 *
	 * @param externalInvoiceId a String
	 * @return a {@link com.logicommerce.sdk.builders.order.InvoiceSdkBuilder} object
	 */
	public InvoiceSdkBuilder externalInvoiceId(String externalInvoiceId) {
		this.externalInvoiceId = externalInvoiceId;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.Invoice} object
	 */
	public Invoice build() {
		InvoiceImpl order = new InvoiceImpl();
		setFields(order);
		order.setExternalInvoiceId(externalInvoiceId);
		return order;
	}

	@Override
	public InvoiceSdkBuilder returnThis() {
		return this;
	}
}
