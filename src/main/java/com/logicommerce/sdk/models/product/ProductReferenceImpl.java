package com.logicommerce.sdk.models.product;

import java.time.LocalDateTime;
import java.util.List;

public class ProductReferenceImpl implements ProductReference {

	private String identifier;

	private List<String> codes;

	private LocalDateTime updatedAt;

	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public List<String> getCodes() {
		return codes;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
