package com.logicommerce.sdk.builders.basket;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.logicommerce.sdk.models.basket.BasketChanges;
import com.logicommerce.sdk.models.basket.CustomerChange;
import com.logicommerce.sdk.models.basket.RowChange;
import com.logicommerce.sdk.models.basket.implementations.BasketChangesImpl;

/**
 * <p>Builder of {@link BasketChanges}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class BasketChangesBuilder {

	private List<RowChange> rows;

	private List<String> voucherCodes;

	private CustomerChange customer;

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private Map<String, String> storage;

	/**
	 * <p>Constructor for BasketChangesBuilder.</p>
	 */
	public BasketChangesBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>rows</code>.</p>
	 *
	 * @param rows the rows that replace the basket's rows, or null to leave them unchanged
	 * @return this builder
	 */
	public BasketChangesBuilder rows(List<RowChange> rows) {
		this.rows = rows;
		return this;
	}

	/**
	 * <p>Sets <code>voucherCodes</code>.</p>
	 *
	 * @param voucherCodes the voucher codes that replace the basket's voucher codes, or null to leave them unchanged
	 * @return this builder
	 */
	public BasketChangesBuilder voucherCodes(List<String> voucherCodes) {
		this.voucherCodes = voucherCodes;
		return this;
	}

	/**
	 * <p>Sets <code>customer</code>.</p>
	 *
	 * @param customer the customer data to set, or null to leave the customer unchanged
	 * @return this builder
	 */
	public BasketChangesBuilder customer(CustomerChange customer) {
		this.customer = customer;
		return this;
	}

	/**
	 * <p>Sets <code>countryCode</code>.</p>
	 *
	 * @param countryCode the new navigation country (ISO 3166-1 alpha-2), or null to leave it unchanged
	 * @return this builder
	 */
	public BasketChangesBuilder countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * <p>Sets <code>languageCode</code>.</p>
	 *
	 * @param languageCode the new language code (ISO 639-1, lower case), or null to leave it unchanged
	 * @return this builder
	 */
	public BasketChangesBuilder languageCode(String languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	/**
	 * <p>Sets <code>currencyHint</code>.</p>
	 *
	 * @param currencyHint the preferred currency (ISO 4217), or null
	 * @return this builder
	 */
	public BasketChangesBuilder currencyHint(String currencyHint) {
		this.currencyHint = currencyHint;
		return this;
	}

	/**
	 * <p>Sets <code>storage</code>.</p>
	 *
	 * @param storage the per-basket Storage entries to write on creation, or null
	 * @return this builder
	 */
	public BasketChangesBuilder storage(Map<String, String> storage) {
		this.storage = storage;
		return this;
	}

	/**
	 * <p>Builds the {@link BasketChanges}. The lists and the map are copied unmodifiable.</p>
	 *
	 * @return a {@link BasketChanges} object
	 * @throws IllegalArgumentException if a list holds a null element, or the storage a null key or value
	 */
	public BasketChanges build() {
		BasketChangesImpl result = new BasketChangesImpl();
		result.setRows(copyOf("rows", rows));
		result.setVoucherCodes(copyOf("voucherCodes", voucherCodes));
		result.setCustomer(customer);
		result.setCountryCode(countryCode);
		result.setLanguageCode(languageCode);
		result.setCurrencyHint(currencyHint);
		result.setStorage(copyOf(storage));
		return result;
	}

	private static <T> List<T> copyOf(String name, List<T> values) {
		if (values == null) {
			return null;
		}
		if (values.stream().anyMatch(Objects::isNull)) {
			throw new IllegalArgumentException(name + " must not contain null");
		}
		return List.copyOf(values);
	}

	private static Map<String, String> copyOf(Map<String, String> entries) {
		if (entries == null) {
			return null;
		}
		entries.forEach((key, value) -> {
			if (key == null || value == null) {
				throw new IllegalArgumentException("storage must not contain null keys or values");
			}
		});
		return Map.copyOf(entries);
	}

}
