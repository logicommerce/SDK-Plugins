package com.logicommerce.sdk.models.catalog.implementations;

import java.util.List;
import com.logicommerce.sdk.models.catalog.CatalogQuery;

/**
 * <p>Implementation of {@link CatalogQuery}.</p>
 *
 * @see com.logicommerce.sdk.builders.catalog.CatalogQueryBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CatalogQueryImpl implements CatalogQuery {

	private String text;

	private List<String> categoryNamePaths;

	private Long fromPrice;

	private Long toPrice;

	private String priceCurrencyCode;

	private int page = 1;

	private int perPage = 20;

	/**
	 * <p>Constructor for CatalogQueryImpl.</p>
	 */
	public CatalogQueryImpl() {
		// fields are set with the setters; page defaults to 1 and perPage to 20, as in the builder
	}

	/** {@inheritDoc} */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <p>Setter for the field <code>text</code>.</p>
	 *
	 * @param text the free text to search, or null
	 */
	public void setText(String text) {
		this.text = text;
	}

	/** {@inheritDoc} */
	@Override
	public List<String> getCategoryNamePaths() {
		return categoryNamePaths;
	}

	/**
	 * <p>Setter for the field <code>categoryNamePaths</code>.</p>
	 *
	 * @param categoryNamePaths the category name paths to filter by, or null
	 */
	public void setCategoryNamePaths(List<String> categoryNamePaths) {
		this.categoryNamePaths = categoryNamePaths;
	}

	/** {@inheritDoc} */
	@Override
	public Long getFromPrice() {
		return fromPrice;
	}

	/**
	 * <p>Setter for the field <code>fromPrice</code>.</p>
	 *
	 * @param fromPrice the minimum price in minor units of the price currency, or null
	 */
	public void setFromPrice(Long fromPrice) {
		this.fromPrice = fromPrice;
	}

	/** {@inheritDoc} */
	@Override
	public Long getToPrice() {
		return toPrice;
	}

	/**
	 * <p>Setter for the field <code>toPrice</code>.</p>
	 *
	 * @param toPrice the maximum price in minor units of the price currency, or null
	 */
	public void setToPrice(Long toPrice) {
		this.toPrice = toPrice;
	}

	/** {@inheritDoc} */
	@Override
	public String getPriceCurrencyCode() {
		return priceCurrencyCode;
	}

	/**
	 * <p>Setter for the field <code>priceCurrencyCode</code>.</p>
	 *
	 * @param priceCurrencyCode the ISO 4217 currency of the price filter, or null
	 */
	public void setPriceCurrencyCode(String priceCurrencyCode) {
		this.priceCurrencyCode = priceCurrencyCode;
	}

	/** {@inheritDoc} */
	@Override
	public int getPage() {
		return page;
	}

	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page the page, starting at 1
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/** {@inheritDoc} */
	@Override
	public int getPerPage() {
		return perPage;
	}

	/**
	 * <p>Setter for the field <code>perPage</code>.</p>
	 *
	 * @param perPage the page size, from 1 to 100
	 */
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

}
