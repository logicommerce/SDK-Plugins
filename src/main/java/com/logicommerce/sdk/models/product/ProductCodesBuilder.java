package com.logicommerce.sdk.models.product;

/**
 * ProductCodes model builder.
 *
 * @author LogiCommerce
 * @see ProductCodes
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductCodesBuilder<T> {

	private T parentBuilder;

	private String pId;

	private String sku;

	private String jan;

	private String isbn;

	private String ean;

	private String upc;

	private String manufacturerSku;

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
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the PID of the product codes.
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * Sets the SKU of the product codes.
	 *
	 * @param sku a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * Sets the JAN of the product codes.
	 *
	 * @param jan a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> jan(String jan) {
		this.jan = jan;
		return this;
	}

	/**
	 * Sets the ISBN of the product codes.
	 *
	 * @param isbn a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> isbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	/**
	 * Sets the EAN of the product codes.
	 *
	 * @param ean a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> ean(String ean) {
		this.ean = ean;
		return this;
	}

	/**
	 * Sets the UPC of the product codes.
	 *
	 * @param upc a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> upc(String upc) {
		this.upc = upc;
		return this;
	}

	/**
	 * Sets the manufacturer SKU of the product codes.
	 *
	 * @param manufacturerSku a {@link java.lang.String} object
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<T> manufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
		return this;
	}

	/**
	 * Builds a {@link ProductCodesImpl} object.
	 *
	 * @return a {@link ProductCodes} object
	 */
	public ProductCodes build() {
		ProductCodesImpl codes = new ProductCodesImpl();
		codes.setPId(pId);
		codes.setSku(sku);
		codes.setJan(jan);
		codes.setIsbn(isbn);
		codes.setEan(ean);
		codes.setUpc(upc);
		codes.setManufacturerSku(manufacturerSku);
		return codes;
	}

	/**
	 * Returns the parent builder.
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
