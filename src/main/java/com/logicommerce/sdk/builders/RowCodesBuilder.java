package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.RowCodes;
import com.logicommerce.sdk.models.implementations.RowCodesImpl;

/**
 * <p>RowCodesBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.1.11
 */
public class RowCodesBuilder<T> {

	private T parentBuilder;

	protected String pId;
	
	protected String ean;

	protected String isbn;

	protected String jan;

	protected String manufacturerSku;

	protected String sku;

	protected String upc;

	/**
	 * <p>Constructor for RowCodesBuilder.</p>
	 */
	public RowCodesBuilder() {

	}

	/**
	 * <p>Constructor for RowCodesBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public RowCodesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>pId.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * <p>ean.</p>
	 *
	 * @param ean a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> ean(String ean) {
		this.ean = ean;
		return this;
	}

	/**
	 * <p>isbn.</p>
	 *
	 * @param isbn a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> isbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	/**
	 * <p>jan.</p>
	 *
	 * @param jan a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> jan(String jan) {
		this.jan = jan;
		return this;
	}

	/**
	 * <p>manufacturerSku.</p>
	 *
	 * @param manufacturerSku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> manufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
		return this;
	}

	/**
	 * <p>sku.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * <p>upc.</p>
	 *
	 * @param upc a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<T> upc(String upc) {
		this.upc = upc;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.RowCodes} object
	 */
	public RowCodes build() {
		RowCodesImpl codes = new RowCodesImpl();
		codes.setEan(ean);
		codes.setIsbn(isbn);
		codes.setJan(jan);
		codes.setManufacturerSku(manufacturerSku);
		codes.setSku(sku);
		codes.setUpc(upc);
		codes.setpId(ean);
		return codes;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
