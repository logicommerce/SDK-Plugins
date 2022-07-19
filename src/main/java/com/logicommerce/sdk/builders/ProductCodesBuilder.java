package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.ProductCodes;
import com.logicommerce.sdk.models.implementations.ProductCodesImpl;

/**
 * <p>ProductCodesBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ProductCodesBuilder<T> {

	private T parentBuilder;

	protected String ean;

	protected String isbn;

	protected String jan;

	protected String manufacturerSku;

	protected String sku;

	protected String upc;

	/**
	 * <p>Constructor for ProductCodesBuilder.</p>
	 */
	public ProductCodesBuilder() {

	}

	/**
	 * <p>Constructor for ProductCodesBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductCodesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>ean.</p>
	 *
	 * @param ean a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> ean(String ean) {
		this.ean = ean;
		return this;
	}

	/**
	 * <p>isbn.</p>
	 *
	 * @param isbn a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> isbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	/**
	 * <p>jan.</p>
	 *
	 * @param jan a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> jan(String jan) {
		this.jan = jan;
		return this;
	}

	/**
	 * <p>manufacturerSku.</p>
	 *
	 * @param manufacturerSku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> manufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
		return this;
	}

	/**
	 * <p>sku.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * <p>upc.</p>
	 *
	 * @param upc a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> upc(String upc) {
		this.upc = upc;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ProductCodes} object
	 */
	public ProductCodes build() {
		ProductCodesImpl codes = new ProductCodesImpl();
		codes.setEan(ean);
		codes.setIsbn(isbn);
		codes.setJan(jan);
		codes.setManufacturerSku(manufacturerSku);
		codes.setSku(sku);
		codes.setUpc(upc);
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
