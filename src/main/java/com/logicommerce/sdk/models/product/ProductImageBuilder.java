package com.logicommerce.sdk.models.product;

/**
 * ProductImage model builder.
 *
 * @author LogiCommerce
 * @see ProductImage
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductImageBuilder<T> {

	private T parentBuilder;

	private String smallImage;

	private String mediumImage;

	private String largeImage;

	/**
	 * <p>Constructor for ProductImageBuilder.</p>
	 */
	public ProductImageBuilder() {
	}

	/**
	 * <p>Constructor for ProductImageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductImageBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the small image of the product image.
	 *
	 * @param smallImage a {@link java.lang.String} object
	 * @return a {@link ProductImageBuilder} object
	 */
	public ProductImageBuilder<T> smallImage(String smallImage) {
		this.smallImage = smallImage;
		return this;
	}

	/**
	 * Sets the medium image of the product image.
	 *
	 * @param mediumImage a {@link java.lang.String} object
	 * @return a {@link ProductImageBuilder} object
	 */
	public ProductImageBuilder<T> mediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
		return this;
	}

	/**
	 * Sets the large image of the product image.
	 *
	 * @param largeImage a {@link java.lang.String} object
	 * @return a {@link ProductImageBuilder} object
	 */
	public ProductImageBuilder<T> largeImage(String largeImage) {
		this.largeImage = largeImage;
		return this;
	}

	/**
	 * Builds a {@link ProductImageImpl} object.
	 *
	 * @return a {@link ProductImage} object
	 */
	public ProductImage build() {
		ProductImageImpl image = new ProductImageImpl();
		image.setSmallImage(smallImage);
		image.setMediumImage(mediumImage);
		image.setLargeImage(largeImage);
		return image;
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
