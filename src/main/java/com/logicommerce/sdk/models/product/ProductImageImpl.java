package com.logicommerce.sdk.models.product;

public class ProductImageImpl implements ProductImage {

	private String smallImage;

	private String mediumImage;

	private String largeImage;

	@Override
	public String getLargeImage() {
		return largeImage;
	}

	@Override
	public String getSmallImage() {
		return smallImage;
	}

	@Override
	public String getMediumImage() {
		return mediumImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}

	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

}
