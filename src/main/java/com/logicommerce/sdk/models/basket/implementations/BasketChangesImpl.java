package com.logicommerce.sdk.models.basket.implementations;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.basket.BasketChanges;
import com.logicommerce.sdk.models.basket.CustomerChange;
import com.logicommerce.sdk.models.basket.RowChange;

/**
 * <p>Implementation of {@link BasketChanges}.</p>
 *
 * @see com.logicommerce.sdk.builders.basket.BasketChangesBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class BasketChangesImpl implements BasketChanges {

	private List<RowChange> rows;

	private List<String> voucherCodes;

	private CustomerChange customer;

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private Map<String, String> storage;

	/**
	 * <p>Constructor for BasketChangesImpl.</p>
	 */
	public BasketChangesImpl() {
		// fields are set with the setters
	}

	/** {@inheritDoc} */
	@Override
	public List<RowChange> getRows() {
		return rows;
	}

	/**
	 * <p>Setter for the field <code>rows</code>.</p>
	 *
	 * @param rows the rows that replace the basket's rows, or null to leave them unchanged
	 */
	public void setRows(List<RowChange> rows) {
		this.rows = rows;
	}

	/** {@inheritDoc} */
	@Override
	public List<String> getVoucherCodes() {
		return voucherCodes;
	}

	/**
	 * <p>Setter for the field <code>voucherCodes</code>.</p>
	 *
	 * @param voucherCodes the voucher codes that replace the basket's voucher codes, or null to leave them unchanged
	 */
	public void setVoucherCodes(List<String> voucherCodes) {
		this.voucherCodes = voucherCodes;
	}

	/** {@inheritDoc} */
	@Override
	public CustomerChange getCustomer() {
		return customer;
	}

	/**
	 * <p>Setter for the field <code>customer</code>.</p>
	 *
	 * @param customer the customer data to set, or null to leave the customer unchanged
	 */
	public void setCustomer(CustomerChange customer) {
		this.customer = customer;
	}

	/** {@inheritDoc} */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <p>Setter for the field <code>countryCode</code>.</p>
	 *
	 * @param countryCode the new navigation country (ISO 3166-1 alpha-2), or null to leave it unchanged
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <p>Setter for the field <code>languageCode</code>.</p>
	 *
	 * @param languageCode the new language code (ISO 639-1, lower case), or null to leave it unchanged
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getCurrencyHint() {
		return currencyHint;
	}

	/**
	 * <p>Setter for the field <code>currencyHint</code>.</p>
	 *
	 * @param currencyHint the preferred currency (ISO 4217), or null
	 */
	public void setCurrencyHint(String currencyHint) {
		this.currencyHint = currencyHint;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, String> getStorage() {
		return storage;
	}

	/**
	 * <p>Setter for the field <code>storage</code>.</p>
	 *
	 * @param storage the per-basket Storage entries to write on creation, or null
	 */
	public void setStorage(Map<String, String> storage) {
		this.storage = storage;
	}

}
