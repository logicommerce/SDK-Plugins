package com.logicommerce.sdk.builders.catalog;

import java.util.List;
import java.util.Objects;
import com.logicommerce.sdk.models.catalog.CatalogQuery;
import com.logicommerce.sdk.models.catalog.implementations.CatalogQueryImpl;

/**
 * <p>Builder of {@link CatalogQuery}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CatalogQueryBuilder {

	private String text;

	private List<String> categoryNamePaths;

	private Long fromPrice;

	private Long toPrice;

	private String priceCurrencyCode;

	private int page = 1;

	private int perPage = 20;

	/**
	 * <p>Constructor for CatalogQueryBuilder.</p>
	 */
	public CatalogQueryBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>text</code>.</p>
	 *
	 * @param text the free text to search, or null
	 * @return this builder
	 */
	public CatalogQueryBuilder text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * <p>Sets <code>categoryNamePaths</code>.</p>
	 *
	 * @param categoryNamePaths the category name paths to filter by, or null
	 * @return this builder
	 */
	public CatalogQueryBuilder categoryNamePaths(List<String> categoryNamePaths) {
		this.categoryNamePaths = categoryNamePaths;
		return this;
	}

	/**
	 * <p>Sets <code>fromPrice</code>.</p>
	 *
	 * @param fromPrice the minimum price in minor units of the price currency, or null
	 * @return this builder
	 */
	public CatalogQueryBuilder fromPrice(Long fromPrice) {
		this.fromPrice = fromPrice;
		return this;
	}

	/**
	 * <p>Sets <code>toPrice</code>.</p>
	 *
	 * @param toPrice the maximum price in minor units of the price currency, or null
	 * @return this builder
	 */
	public CatalogQueryBuilder toPrice(Long toPrice) {
		this.toPrice = toPrice;
		return this;
	}

	/**
	 * <p>Sets <code>priceCurrencyCode</code>.</p>
	 *
	 * @param priceCurrencyCode the ISO 4217 currency of the price filter, or null
	 * @return this builder
	 */
	public CatalogQueryBuilder priceCurrencyCode(String priceCurrencyCode) {
		this.priceCurrencyCode = priceCurrencyCode;
		return this;
	}

	/**
	 * <p>Sets <code>page</code>.</p>
	 *
	 * @param page the page, starting at 1
	 * @return this builder
	 */
	public CatalogQueryBuilder page(int page) {
		this.page = page;
		return this;
	}

	/**
	 * <p>Sets <code>perPage</code>.</p>
	 *
	 * @param perPage the page size, from 1 to 100
	 * @return this builder
	 */
	public CatalogQueryBuilder perPage(int perPage) {
		this.perPage = perPage;
		return this;
	}

	/**
	 * <p>Builds the {@link CatalogQuery}.</p>
	 *
	 * @return a {@link CatalogQuery} object
	 * @throws IllegalArgumentException if the page or the page size is out of range, or a category name path is null
	 */
	public CatalogQuery build() {
		if (page < 1) {
			throw new IllegalArgumentException("page must be at least 1");
		}
		if (perPage < 1 || perPage > CatalogQuery.MAX_PER_PAGE) {
			throw new IllegalArgumentException("perPage must be between 1 and " + CatalogQuery.MAX_PER_PAGE);
		}
		if (categoryNamePaths != null && categoryNamePaths.stream().anyMatch(Objects::isNull)) {
			throw new IllegalArgumentException("categoryNamePaths must not contain null");
		}
		CatalogQueryImpl result = new CatalogQueryImpl();
		result.setText(text);
		result.setCategoryNamePaths(categoryNamePaths == null ? null : List.copyOf(categoryNamePaths));
		result.setFromPrice(fromPrice);
		result.setToPrice(toPrice);
		result.setPriceCurrencyCode(priceCurrencyCode);
		result.setPage(page);
		result.setPerPage(perPage);
		return result;
	}

}
