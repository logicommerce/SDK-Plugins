package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.ProductCodes;

public class ProductCodesImpl implements ProductCodes {

	private String ean;

	private String isbn;

	private String jan;

	private String manufacturerSku;

	private String sku;

	private String upc;

	public String getEan() {
		return ean;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getJan() {
		return jan;
	}

	public String getManufacturerSku() {
		return manufacturerSku;
	}

	public String getSku() {
		return sku;
	}

	public String getUpc() {
		return upc;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setJan(String jan) {
		this.jan = jan;
	}

	public void setManufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}
}