package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.catalog.CatalogContext;
import com.logicommerce.sdk.models.catalog.CatalogQuery;
import com.logicommerce.sdk.models.catalog.ProductPage;
import com.logicommerce.sdk.models.catalog.ProductView;

/**
 * <p>Catalog resource interface: searches and reads products as a guest of the given country, language and currency
 * sees them, priced as a basket in the same context would be.</p>
 *
 * <p>The context is built from the {@link CatalogContext} alone, never from the caller's request headers or basket.
 * Products the context cannot see are never returned. Visible products that cannot be ordered have their combinations
 * {@link com.logicommerce.sdk.enums.StockStatus#NOT_ORDERABLE}. Products with hidden prices have a null
 * {@link ProductView#getPriceRange()}, so a search page may yield fewer listable products than
 * {@link CatalogQuery#getPerPage()}.</p>
 *
 * <p>Catalog calls never load or change a basket and do not count towards {@link BasketResource}'s
 * one-basket-per-request limit.</p>
 *
 * <p>A null {@code query} or {@code context} throws {@link IllegalArgumentException};
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
	 * Reads products by id and by code. Each visible product is returned once; ids and codes that match no visible
	 * product are left out. A code matches a combination when it is exactly equal (case-sensitive) to its
	 * {@link com.logicommerce.sdk.models.catalog.CombinationView#getSku() SKU} or one of its
	 * {@link com.logicommerce.sdk.models.catalog.CombinationView#getBarcodes() barcodes}.
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
