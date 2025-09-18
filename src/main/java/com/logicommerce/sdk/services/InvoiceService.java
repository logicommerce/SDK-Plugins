package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.DataFile;
import com.logicommerce.sdk.models.order.CreditNote;
import com.logicommerce.sdk.models.order.Invoice;

/**
 * InvoiceService interface.<br><br>
 * This service can't inject the resources Cart and Storage.
 *
 * @author LogiCommerce
 * @since 2.5.2
 */
public interface InvoiceService extends PluginService {

	/**
	 * Process invoice from order<br>
	 * Method called when an Invoice have been generated.
	 * 
	 * @param invoice a {@link com.logicommerce.sdk.models.order.Invoice} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	Invoice createInvoice(Invoice invoice) throws PluginServiceException;

	/**
	 * Process creditNote from RMA<br>
	 * Method called when an CreditNote have been generated.
	 * 
	 * @param creditNote a {@link com.logicommerce.sdk.models.order.CreditNote} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	CreditNote creditNote(CreditNote creditNote) throws PluginServiceException;

	/**
	 * <p>getInvoiceFile.</p>
	 *
	 * @param invoice a {@link com.logicommerce.sdk.models.order.Invoice} object
	 * @return a {@link com.logicommerce.sdk.models.DataFile} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	DataFile getInvoiceFile(Invoice invoice) throws PluginServiceException;

	/**
	 * <p>getCreditNoteFile.</p>
	 *
	 * @param creditNote a {@link com.logicommerce.sdk.models.order.CreditNote} object
	 * @return a {@link com.logicommerce.sdk.models.DataFile} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	DataFile getCreditNoteFile(CreditNote creditNote) throws PluginServiceException;
}
