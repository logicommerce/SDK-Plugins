package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.catalog.CatalogContext;
import com.logicommerce.sdk.models.catalog.CatalogQuery;
import com.logicommerce.sdk.models.catalog.ProductPage;
import com.logicommerce.sdk.models.catalog.ProductView;

/**
 * <p>Catalog resource interface: searches and reads products as a guest of an explicit country, language and currency
 * sees them.</p>
 *
 * <p>Core builds the pricing and visibility context from the {@link CatalogContext} alone (as for a transient guest
 * basket that is never saved), never from the caller's request headers nor from any basket of the request, and prices
 * exactly as a basket with the same country, language, currency and client would. Products the context cannot see
 * (category restrictions per country, zone or group, inactive products) are never returned. Visible products that
 * cannot be ordered in the context are returned with their combinations
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}, the same combinations
 * {@link BasketResource} rejects as {@link com.logicommerce.sdk.enums.RejectionCode#ROW_NOT_BUYABLE}. Products whose
 * prices are hidden for the context (the product's own {@code showPrice} or the commerce's setting) are returned with a
 * null {@link ProductView#getPriceRange()} and null combination prices (see {@link ProductView}), so the caller can skip
 * them; a search page may then yield fewer listable products than {@link CatalogQuery#getPerPage()}, and
 * {@link ProductPage#hasNextPage()} still refers to the unfiltered results.</p>
 *
 * <p>Catalog calls may run in the same plugin request as {@link BasketResource} calls, before or after them. They never
 * load, inject, replace or save a basket, do not count towards {@link BasketResource}'s one-basket-per-request limit,
 * and leave the context of the basket the request serves unchanged: a {@link BasketResource} call after a catalog call
 * sees the same basket and context it would have seen without it.</p>
 *
 * <p>A null {@code query} or {@code context} is a programming error and throws {@link IllegalArgumentException};
 * {@link PluginResourceException} is only thrown for infrastructure failures.</p>
 *
 * <pre>
 * &#64;Resource
 * private CatalogResource catalogResource;
 * </pre>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CatalogResource {

	/**
	 * Searches the catalog.
	 *
	 * @param query the text, filters and page
	 * @param context the country, language, currency hint and client
	 * @return the requested page
	 * @throws PluginResourceException if the catalog cannot be read
	 */
	ProductPage search(CatalogQuery query, CatalogContext context) throws PluginResourceException;

	/**
	 * Reads products by id and by code. Each visible product is returned once, whichever ids and codes matched it; ids
	 * and codes that match no visible product are left out. A code matches a combination when it is exactly equal
	 * (case-sensitive, not trimmed) to the combination's
	 * {@link com.logicommerce.sdk.models.catalog.CombinationView#getSku() SKU}
	 * or to one of its {@link com.logicommerce.sdk.models.catalog.CombinationView#getBarcodes() barcodes} as the returned
	 * view carries them, so the caller can tell which combination each code resolved to; other product codes (such as the
	 * manufacturer SKU) never match.
	 *
	 * @param productIds the product ids; may be null or empty
	 * @param codes SKUs and barcodes; may be null or empty
	 * @param context the country, language, currency hint and client
	 * @return the products found, never null
	 * @throws PluginResourceException if the catalog cannot be read
	 */
	List<ProductView> getProducts(List<Integer> productIds, List<String> codes, CatalogContext context)
		throws PluginResourceException;

	/**
	 * Reads one product with every combination, the combination the selected option values identify first.
	 *
	 * @param productId the product id
	 * @param optionValueIds the selected combinable option value ids, in any order; may be null or empty
	 * @param context the country, language, currency hint and client
	 * @return the product, or null when there is no such product, it has no combination or the context cannot see it
	 * @throws PluginResourceException if the catalog cannot be read
	 */
	ProductView getProduct(int productId, List<Integer> optionValueIds, CatalogContext context) throws PluginResourceException;

}
