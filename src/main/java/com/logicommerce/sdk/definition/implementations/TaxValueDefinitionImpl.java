package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.TaxValueDefinition;

/**
 * <p>TaxValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.5.2
 */
public class TaxValueDefinitionImpl implements TaxValueDefinition {

	private Integer taxId;

	/**
	 * <p>Constructor for TaxValueDefinitionImpl.</p>
	 *
	 * @param taxId a {@link java.lang.Integer} object
	 */
	public TaxValueDefinitionImpl(Integer taxId) {
		this.taxId = taxId;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getTaxId() {
		return taxId;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Integer taxId;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> taxId(Integer taxId) {
			this.taxId = taxId;
			return this;
		}

		public TaxValueDefinition build() {
			return new TaxValueDefinitionImpl(taxId);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
