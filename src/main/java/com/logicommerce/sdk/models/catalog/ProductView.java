package com.logicommerce.sdk.models.catalog;

import java.util.List;

/**
 * <p>A catalog product, as a guest of the context's country sees it, in the context's language
 * ({@link com.logicommerce.sdk.resources.CatalogResource}).</p>
 *
 * <p>A product is only returned when it has at least one combination (see {@link CombinationView}), whether or not it
 * can be ordered: a visible product that cannot be ordered in the context (a catalogue-only product, one whose
 * available date has not come yet, or a voucher purchase) is returned with every combination
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}, and keeps its prices.</p>
 *
 * <p><b>Hidden prices.</b> When the product's prices are hidden for the context, because the product's own
 * {@code showPrice} is off or the commerce's {@code showPrice} setting is off for the context's country and account
 * group, core still returns the product and signals it by {@link #getPriceRange()} being null; then
 * {@link #getPreviousPriceRange()} and every combination's {@link CombinationView#getPrice()} and
 * {@link CombinationView#getPreviousPrice()} are null too, and every combination is
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}. Conversely, when prices are shown,
 * {@link #getPriceRange()} and every combination's {@link CombinationView#getPrice()} are never null, whether or not
 * the product can be ordered. A caller that must not list products without a price skips those whose
 * {@link #getPriceRange()} is null.</p>
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
	 * Returns the absolute URL of the product page in the storefront: the storefront base URL for the context's language
	 * and country (computed as {@link com.logicommerce.sdk.models.basket.BasketView#getStoreBaseUrl()} is for a basket of
	 * that language and country, without a trailing slash), followed by {@code '/'} and the product's full SEO path in
	 * the context's language. Its path is therefore valid under the store base URL of a basket with the same language
	 * and country.
	 *
	 * @return an absolute URL, or null when the commerce has no absolute store URL configured (as
	 *         {@link com.logicommerce.sdk.models.basket.BasketView#getStoreBaseUrl()})
	 */
	String getUrl();

	/**
	 * Returns the absolute URLs of the product images, the main image first.
	 *
	 * @return the image URLs, never null
	 */
	List<String> getImages();

	/**
	 * Returns the product's categories as name paths: the names from the root category down, joined by {@code " > "},
	 * in the context's language.
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
	 * Returns combinations (see {@link CombinationView}).
	 * {@link com.logicommerce.sdk.resources.CatalogResource#getProducts getProducts} returns every combination, the
	 * featured one first; {@link com.logicommerce.sdk.resources.CatalogResource#getProduct getProduct} returns every
	 * combination, the one the selection identifies first (the featured one when the selection identifies none);
	 * {@link com.logicommerce.sdk.resources.CatalogResource#search search} returns the featured combination first and a
	 * capped number of others, so the product's range comes from {@link #getPriceRange()}, not from these combinations.
	 *
	 * @return the combinations, never null and never empty
	 */
	List<CombinationView> getCombinations();

	/**
	 * Returns the lowest and highest {@link CombinationView#getPrice() price} across every combination of the product.
	 * Core computes it over all of them, whether or not {@link #getCombinations()} lists them all (a search caps the
	 * list). It is in the currency of the combinations' prices.
	 *
	 * @return the price range, or null when the product's prices are hidden for the context
	 */
	PriceRange getPriceRange();

	/**
	 * Returns the lowest and highest price before discounts across every combination of the product, for
	 * strikethrough display: each combination contributes its {@link CombinationView#getPreviousPrice() previous price},
	 * or its {@link CombinationView#getPrice() price} when it has no previous price. Like {@link #getPriceRange()}, it
	 * covers every combination, not only the listed ones.
	 *
	 * @return the previous price range, or null when no combination has a previous price or the product's prices are
	 *         hidden for the context
	 */
	PriceRange getPreviousPriceRange();

	/**
	 * Returns whether the prices include taxes for the context's country (the commerce's {@code showTaxesIncluded}).
	 *
	 * @return true when prices are gross
	 */
	boolean isTaxesIncluded();

	/**
	 * Returns whether the product has a required option that is not combinable (a personalisation: text, date, boolean,
	 * attachment, multiple selection...). Such a product cannot be added through
	 * {@link com.logicommerce.sdk.resources.BasketResource}: the buyer adds it in the storefront.
	 *
	 * @return true when the product needs a personalisation
	 */
	boolean requiresNonCombinableOption();

}
