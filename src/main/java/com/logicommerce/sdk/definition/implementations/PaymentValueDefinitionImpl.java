package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.PaymentValueDefinition;

/**
 * <p>PaymentValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentValueDefinitionImpl implements PaymentValueDefinition {

	private Integer id;
	
	/**
	 * <p>Constructor for PaymentValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public PaymentValueDefinitionImpl(Integer id) {
		this.id = id;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}
	
	public static class Builder<T> {

		private T parentBuilder;
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


		public PaymentValueDefinition build() {
			return new PaymentValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
