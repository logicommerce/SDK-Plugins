package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.models.order.AdditionalItem;
import com.logicommerce.sdk.models.order.CreditNote;

/**
 * <p>CreditNoteImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.5.2
 */
public class CreditNoteImpl extends DocumentImpl implements CreditNote  {

	private String externalInvoiceId;
	
	private String originalInvoiceId;

	private List<AdditionalItem> additionalItems;

	/**
	 * <p>Getter for the field <code>externalInvoiceId</code>.</p>
	 *
	 * @return a String object.
	 */
	@Override
	public String getExternalInvoiceId() {
		return externalInvoiceId;
	}

	/**
	 * <p>
	 * Setter for the field <code>externalInvoiceId</code>.
	 * </p>
	 *
	 * @param externalInvoiceId a String object.
	 */
	@Override
	public void setExternalInvoiceId(String externalInvoiceId) {
		this.externalInvoiceId = externalInvoiceId;
	}

	/**
	 * <p>
	 * Getter for the field <code>originalInvoiceId</code>.
	 * </p>
	 *
	 * @return a String object.
	 */

	@Override
	public String getOriginalInvoiceId() {
		return originalInvoiceId;
	}

	/**
     * <p>
     * Setter for the field <code>originalInvoiceId</code>.
     * </p>
     *
     * @param originalInvoiceId a String object
     * 
     */
	@Override
	public void setOriginalInvoiceId(String originalInvoiceId) {
		this.originalInvoiceId = originalInvoiceId;
	}

	/**
	 * <p>
	 * Getter for the field <code>additionalItems</code>.
	 * </p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	@Override
	public List<AdditionalItem> getAdditionalItems() {
		return additionalItems;
	}

	/**
	 * <p>
	 * Setter for the field <code>additionalItems</code>.
	 * </p>
	 *
	 * @param additionalItems a {@link java.util.List} object.
	 */
	@Override
	public void setAdditionalItems(List<AdditionalItem> additionalItems) {
		this.additionalItems = additionalItems;
	}

}
