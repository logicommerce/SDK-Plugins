package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.FileType;

/**
 * <p>DataFile class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class DataFile {

	private FileType type;

	private String name;

	private String data;

	/**
	 * <p>Constructor for DataFile.</p>
	 */
	public DataFile() {
		super();
	}

	/**
	 * <p>Constructor for DataFile.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.FileType} object
	 * @param name a {@link java.lang.String} object
	 * @param data a {@link java.lang.String} object
	 */
	public DataFile(FileType type, String name, String data) {
		this.type = type;
		this.name = name;
		this.data = data;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.FileType} object
	 */
	public FileType getType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.FileType} object
	 */
	public void setType(FileType type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>data</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getData() {
		return data;
	}

	/**
	 * <p>Setter for the field <code>data</code>.</p>
	 *
	 * @param data a {@link java.lang.String} object
	 */
	public void setData(String data) {
		this.data = data;
	}

}
