package com.logicommerce.sdk.enums;

/**
 * <p>Code of an order-time check that fails on a basket ({@link IssueSource#END_ORDER}): the closed list of values
 * {@link com.logicommerce.sdk.models.basket.BasketIssue#getCode()} takes for such an issue, as
 * {@link #name()}, so {@code EndOrderCode.valueOf(issue.getCode())} never fails for an END_ORDER issue.</p>
 *
 * <p>The dry run evaluates every check that creating the order runs on the customer data (core's
 * {@code OrderUserValidator}: the commerce's END_ORDER data validation, for the customer, the billing address and the
 * shipping address, and the {@code forceBillingAddressCountry} setting), and reports every failure, even where order
 * creation would stop at the first one: one issue per failing field.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum EndOrderCode {
	/**
	 * A field the commerce's END_ORDER data validation requires is empty (core's {@code InvalidFieldType.REQUIRED}). The
	 * issue's field says which one; an account that must be created with the order ({@code createAccount} required) is
	 * reported with {@link EndOrderField#OTHER}.
	 */
	REQUIRED,
	/**
	 * A field has a value that does not match the regular expression of the commerce's END_ORDER data validation (core's
	 * {@code InvalidFieldType.INVALID}). The issue's field says which one.
	 */
	INVALID,
	/**
	 * The commerce forces the billing country to be the shipping country ({@code forceBillingAddressCountry}) and they
	 * differ. Reported with {@link EndOrderField#ADDRESS}.
	 */
	FORCE_BILLING_ADDRESS_COUNTRY,
	/**
	 * Any other failure of the order-time checks on the customer data (for instance a validation that fails without
	 * naming a field). Reported with {@link EndOrderField#OTHER}.
	 */
	OTHER;
}
