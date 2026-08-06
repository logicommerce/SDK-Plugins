package com.logicommerce.sdk.models.product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductReference model builder.
 *
 * @author LogiCommerce
 * @see ProductReference
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductReferenceBuilder<T> {

	private T parentBuilder;

	private String identifier;

	private List<String> codes;

	private LocalDateTime updatedAt;

	/**
	 * <p>Constructor for ProductReferenceBuilder.</p>
	 */
	public ProductReferenceBuilder() {
		codes = new ArrayList<>();
	}

	/**
	 * <p>Constructor for ProductReferenceBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductReferenceBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the identifier of the product in the external source.
	 *
	 * @param identifier a {@link java.lang.String} object
	 * @return a {@link ProductReferenceBuilder} object
	 */
	public ProductReferenceBuilder<T> identifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	/**
	 * Sets the codes of the product in the external source.
	 *
	 * @param codes a {@link java.util.List} of {@link java.lang.String} objects
	 * @return a {@link ProductReferenceBuilder} object
	 */
	public ProductReferenceBuilder<T> codes(List<String> codes) {
		this.codes = codes == null ? new ArrayList<>() : new ArrayList<>(codes);
		return this;
	}

	/**
	 * Adds a code of the product in the external source.
	 *
	 * @param code a {@link java.lang.String} object
	 * @return a {@link ProductReferenceBuilder} object
	 */
	public ProductReferenceBuilder<T> addCode(String code) {
		codes.add(code);
		return this;
	}

	/**
	 * Sets the date on which the external source last modified the product.
	 *
	 * @param updatedAt a {@link java.time.LocalDateTime} object
	 * @return a {@link ProductReferenceBuilder} object
	 */
	public ProductReferenceBuilder<T> updatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	/**
	 * Builds a {@link ProductReferenceImpl} object.
	 *
	 * @return a {@link ProductReference} object
	 */
	public ProductReference build() {
		ProductReferenceImpl reference = new ProductReferenceImpl();
		reference.setIdentifier(identifier);
		reference.setCodes(codes);
		reference.setUpdatedAt(updatedAt);
		return reference;
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
