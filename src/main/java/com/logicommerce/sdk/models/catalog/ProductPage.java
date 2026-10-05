package com.logicommerce.sdk.models.catalog;

import java.util.List;

/**
 * <p>One page of catalog search results ({@link com.logicommerce.sdk.resources.CatalogResource#search search}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface ProductPage {

	/**
	 * Returns the products of the page, in the search's order. In search results each product carries its featured
	 * combination first and a capped number of other combinations.
	 *
	 * @return the products, never null
	 */
	List<ProductView> getProducts();

	/**
	 * Returns whether a next page exists.
	 *
	 * @return true when there are more results
	 */
	boolean hasNextPage();

	/**
	 * Returns whether the price filter was ignored because it could not be converted to the catalog's currency.
	 *
	 * @return true when a price filter was requested and not applied
	 */
	boolean isPriceFilterIgnored();

}
