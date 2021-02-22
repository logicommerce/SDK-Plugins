package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.FileType;

public class DataFile {

	private FileType type;

	private String name;

	private String data;

	public DataFile() {
		super();
	}

	public DataFile(FileType type, String name, String data) {
		this.type = type;
		this.name = name;
		this.data = data;
	}

	public FileType getType() {
		return type;
	}

	public void setType(FileType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
