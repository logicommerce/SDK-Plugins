package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ProductsDefinition;
import com.logicommerce.sdk.enums.ProductMapperType;

/**
 * <p>ProductsDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ProductsDefinitionImpl implements ProductsDefinition {

	private Integer id;

	private ProductMapperType productMapperType;

	/**
	 * <p>Constructor for ProductsDefinitionImpl.</p>
	 *
	 * @param id a {@link Integer} object
	 */
	public ProductsDefinitionImpl(ProductMapperType productMapperType, Integer id) {
		this.productMapperType = productMapperType;
		this.id = id;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	/** {@inheritDoc} */
	@Override
	public ProductMapperType getProductMapperType() {
		return productMapperType;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private ProductMapperType productMapperType;
		private Integer id;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> id(Integer id) {
			this.id = id;
			return this;
		}

		public Builder<T> productMapperType(ProductMapperType productMapperType) {
			this.productMapperType = productMapperType;
			return this;
		}

		public ProductsDefinition build() {
			return new ProductsDefinitionImpl(productMapperType, id);
		}

		public T done() {
			return parentBuilder;
		}

	}
}
