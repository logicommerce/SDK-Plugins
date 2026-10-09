package com.logicommerce.sdk.models.order.list;

/**
 * OrderListCustomerInvoicingAddress implementation.
 *
 * @author LogiCommerce
 * @see OrderListCustomerInvoicingAddress
 * @since 2.8.5
 */
public class OrderListCustomerInvoicingAddressImpl extends OrderListCustomerAddressImpl implements OrderListCustomerInvoicingAddress {

	private boolean re;

	private boolean tax;

	/** {@inheritDoc} */
	@Override
	public boolean isRe() {
		return re;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isTax() {
		return tax;
	}

	/**
	 * Sets the re.
	 *
	 * @param re a boolean
	 */
	public void setRe(boolean re) {
		this.re = re;
	}

	/**
	 * Sets the tax.
	 *
	 * @param tax a boolean
	 */
	public void setTax(boolean tax) {
		this.tax = tax;
	}

}
