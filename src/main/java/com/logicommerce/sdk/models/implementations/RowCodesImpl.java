package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.RowCodes;

/**
 * <p>RowCodesImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.1.11
 */
public class RowCodesImpl implements RowCodes {

	private String ean;

	private String isbn;

	private String jan;

	private String manufacturerSku;

	private String sku;

	private String upc;
	
	private String pId;

	/**
	 * <p>Getter for the field <code>ean</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getEan() {
		return ean;
	}

	/**
	 * <p>Getter for the field <code>isbn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * <p>Getter for the field <code>jan</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getJan() {
		return jan;
	}

	/**
	 * <p>Getter for the field <code>manufacturerSku</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getManufacturerSku() {
		return manufacturerSku;
	}

	/**
	 * <p>Getter for the field <code>sku</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * <p>Getter for the field <code>upc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getUpc() {
		return upc;
	}

	@Override
	public String getPId() {		
		return pId;
	}

	/**
	 * <p>Setter for the field <code>ean</code>.</p>
	 *
	 * @param ean a {@link java.lang.String} object
	 */
	public void setEan(String ean) {
		this.ean = ean;
	}

	/**
	 * <p>Setter for the field <code>isbn</code>.</p>
	 *
	 * @param isbn a {@link java.lang.String} object
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * <p>Setter for the field <code>jan</code>.</p>
	 *
	 * @param jan a {@link java.lang.String} object
	 */
	public void setJan(String jan) {
		this.jan = jan;
	}

	/**
	 * <p>Setter for the field <code>manufacturerSku</code>.</p>
	 *
	 * @param manufacturerSku a {@link java.lang.String} object
	 */
	public void setManufacturerSku(String manufacturerSku) {
		this.manufacturerSku = manufacturerSku;
	}

	/**
	 * <p>Setter for the field <code>sku</code>.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * <p>Setter for the field <code>upc</code>.</p>
	 *
	 * @param upc a {@link java.lang.String} object
	 */
	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * <p>Setter for the field <code>pId</code>.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 */
	public void setpId(String pId) {
		this.pId = pId;
	}
}
