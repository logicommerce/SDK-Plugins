package com.logicommerce.sdk.models.catalog;

/**
 * <p>A value of a combinable option ({@link OptionView#getValues()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OptionValueView {

	/**
	 * Returns the option value id, as used by {@link CombinationView#getOptionValueIds()}.
	 *
	 * @return the option value id
	 */
	int getOptionValueId();

	/**
	 * Returns the value text in the context's language.
	 *
	 * @return the value
	 */
	String getValue();

}
