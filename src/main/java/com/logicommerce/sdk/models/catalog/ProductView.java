package com.logicommerce.sdk.models.catalog;

import java.util.List;

/**
 * <p>A catalog product, as a guest of the context's country sees it, in the context's language
 * ({@link com.logicommerce.sdk.resources.CatalogResource}).</p>
 *
 * <p>A visible product that cannot be ordered in the context is still returned, with every combination
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}.</p>
 *
 * <p><b>Hidden prices.</b> When the product's prices are hidden for the context, {@link #getPriceRange()} is null, and
 * so are {@link #getPreviousPriceRange()} and every combination's prices; every combination is then
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}. Otherwise {@link #getPriceRange()} and every
 * combination's {@link CombinationView#getPrice()} are never null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface ProductView {

	/**
	 * Returns the product id.
	 *
	 * @return the product id
	 */
	int getId();

	/**
	 * Returns the product name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the short description, as stored (usually plain text).
	 *
	 * @return the short description, or null
	 */
	String getShortDescription();

	/**
	 * Returns the long description, as stored (HTML).
	 *
	 * @return the long description, or null
	 */
	String getLongDescription();

	/**
	 * Returns the product's own URL slug.
	 *
	 * @return the slug, or null
	 */
	String getUrlSeo();

	/**
	 * Returns the absolute URL of the product page in the storefront, under the same base URL as
	 * {@link com.logicommerce.sdk.models.basket.BasketView#getStoreBaseUrl()} for the context's language and country.
	 *
	 * @return an absolute URL, or null when the commerce has no absolute store URL configured
	 */
	String getUrl();

	/**
	 * Returns the absolute URLs of the product images, the main image first.
	 *
	 * @return the image URLs, never null
	 */
	List<String> getImages();

	/**
	 * Returns the product's categories as name paths in the context's language, from the root down, joined by
	 * {@code " > "}.
	 *
	 * @return the name paths, never null
	 */
	List<String> getCategoryNamePaths();

	/**
	 * Returns the product's combinable options with their active values.
	 *
	 * @return the options, empty for a product without combinable options
	 */
	List<OptionView> getOptions();

	/**
	 * Returns the combinations. The first is the featured one, or for
	 * {@link com.logicommerce.sdk.resources.CatalogResource#getProduct getProduct} the one the selection identifies.
	 * {@link com.logicommerce.sdk.resources.CatalogResource#search search} caps the number of combinations; the others
	 * return them all.
	 *
	 * @return the combinations, never null and never empty
	 */
	List<CombinationView> getCombinations();

	/**
	 * Returns the lowest and highest {@link CombinationView#getPrice() price} across every combination of the product,
	 * including those not listed in {@link #getCombinations()}.
	 *
	 * @return the price range, or null when the product's prices are hidden for the context
	 */
	PriceRange getPriceRange();

	/**
	 * Returns the lowest and highest price before discounts across every combination of the product, for strikethrough
	 * display. A combination without a previous price contributes its price.
	 *
	 * @return the previous price range, or null when no combination has a previous price or the product's prices are
	 *         hidden for the context
	 */
	PriceRange getPreviousPriceRange();

	/**
	 * Returns whether the prices include taxes for the context's country.
	 *
	 * @return true when prices are gross
	 */
	boolean isTaxesIncluded();

	/**
	 * Returns whether the product has a required non-combinable option (a personalisation such as text or date). Such
	 * a product cannot be added through {@link com.logicommerce.sdk.resources.BasketResource}, only in the storefront.
	 *
	 * @return true when the product needs a personalisation
	 */
	boolean requiresNonCombinableOption();

}
