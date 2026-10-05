package com.logicommerce.sdk.models.catalog;

import java.util.List;

/**
 * <p>A combinable option of a catalog product ({@link ProductView#getOptions()}), with its active values.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OptionView {

	/**
	 * Returns the option id.
	 *
	 * @return the option id
	 */
	int getOptionId();

	/**
	 * Returns the option name in the context's language.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the option's active values.
	 *
	 * @return the values, never null
	 */
	List<OptionValueView> getValues();

}
