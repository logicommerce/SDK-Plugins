package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.ProductCodes;
import com.logicommerce.sdk.models.implementations.ProductCodesImpl;

public class ProductCodesBuilder<T> {

	private T parentBuilder;

	protected String ean;

	protected String isbn;

	protected String jan;

	protected String manufacturerSku;

	protected String sku;

	protected String upc;

	public ProductCodesBuilder() {

	}

	public ProductCodesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public ProductCodesBuilder<T> ean(String ean) {
		this.ean = ean;
		return this;
	}

	public ProductCodesBuilder<T> isbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	public ProductCodesBuilder<T> jan(String jan) {
		this.jan = jan;
		return this;
	}

	public ProductCodesBuilder<T> manufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
		return this;
	}

	public ProductCodesBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	public ProductCodesBuilder<T> upc(String upc) {
		this.upc = upc;
		return this;
	}

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

	public T done() {
		return parentBuilder;
	}
}