package com.logicommerce.sdk.models.catalog;

import java.util.List;

/**
 * <p>A catalog search ({@link com.logicommerce.sdk.resources.CatalogResource#search search}). Null or empty filters
 * are not applied. Build it with {@link com.logicommerce.sdk.builders.catalog.CatalogQueryBuilder}; a page or page
 * size out of range makes {@code search} throw {@link IllegalArgumentException}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CatalogQuery {

	/**
	 * The largest page size.
	 */
	int MAX_PER_PAGE = 100;

	/**
	 * Returns the free text to search (names, keywords, SKU, EAN, brand).
	 *
	 * @return the text, or null
	 */
	String getText();

	/**
	 * Returns the categories to filter by, as name paths in the context's language joined by {@code " > "} (for
	 * instance {@code "Apparel > Shirts"}), as in {@link ProductView#getCategoryNamePaths()}. Matched
	 * case-insensitively; a single name matches every category with that name.
	 *
	 * @return the name paths, or null
	 */
	List<String> getCategoryNamePaths();

	/**
	 * Returns the minimum price, in minor units of {@link #getPriceCurrencyCode()}. 0 or less sets no lower bound.
	 *
	 * @return the minimum price, or null
	 */
	Long getFromPrice();

	/**
	 * Returns the maximum price, in minor units of {@link #getPriceCurrencyCode()}. 0 or less keeps only free products.
	 *
	 * @return the maximum price, or null
	 */
	Long getToPrice();

	/**
	 * Returns the currency of the price filter. When it is null or unknown, the price filter is ignored and
	 * {@link ProductPage#isPriceFilterIgnored()} is true.
	 *
	 * @return the ISO 4217 code, or null
	 */
	String getPriceCurrencyCode();

	/**
	 * Returns the page to read.
	 *
	 * @return the page, starting at 1
	 */
	int getPage();

	/**
	 * Returns the page size.
	 *
	 * @return the page size, from 1 to {@link #MAX_PER_PAGE}
	 */
	int getPerPage();

}
