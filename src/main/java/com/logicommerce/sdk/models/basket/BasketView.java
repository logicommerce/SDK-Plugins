package com.logicommerce.sdk.models.basket;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * <p>A basket as {@link com.logicommerce.sdk.resources.BasketResource} returns it.</p>
 *
 * <p>Every amount is an integer number of minor units of {@link #getCurrencyCode()}, gross or net according to
 * {@link #isTaxesIncluded()}. Each unit price and discount allocation is rounded once and every total is the sum of
 * its rounded parts, so totals always add up but may differ by a few minor units from the unrounded totals.</p>
 *
 * <p>After {@link com.logicommerce.sdk.resources.BasketResource#create create} and
 * {@link com.logicommerce.sdk.resources.BasketResource#apply apply} the view reflects the recalculation of the call;
 * after {@link com.logicommerce.sdk.resources.BasketResource#get get} it is the basket as last saved. Lists are never
 * null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketView {

	/**
	 * Returns the basket token. It is a session credential: never expose it to third parties.
	 *
	 * @return the token, without the {@code _<basketId>} suffix of {@link com.logicommerce.sdk.models.Cart#getToken()}
	 */
	String getToken();

	/**
	 * Returns the basket id. It only changes when an order is confirmed from this basket.
	 *
	 * @return the basket id
	 */
	int getId();

	/**
	 * Returns the basket's currency, in which every amount of the view is expressed.
	 *
	 * @return the ISO 4217 code, upper case
	 */
	String getCurrencyCode();

	/**
	 * Returns whether prices include taxes for the basket's country. When true, prices are gross,
	 * {@link TotalsView#getTax()} is 0 and {@link TotalsView#getAppliedTaxes()} lists the included taxes; when false,
	 * prices are net and the taxes are added in {@link TotalsView#getTax()}.
	 *
	 * @return true when prices include taxes
	 */
	boolean isTaxesIncluded();

	/**
	 * Returns the basket's navigation country.
	 *
	 * @return the ISO 3166-1 alpha-2 code
	 */
	String getCountryCode();

	/**
	 * Returns the basket's language.
	 *
	 * @return the ISO 639-1 code in lower case (for instance {@code es})
	 */
	String getLanguageCode();

	/**
	 * Returns the customer data stored on the basket.
	 *
	 * @return the customer, never null (its fields are null when unknown)
	 */
	CustomerView getCustomer();

	/**
	 * Returns the basket rows, in insertion order.
	 *
	 * @return the rows
	 */
	List<BasketRowView> getRows();

	/**
	 * Returns the discounts applied to the basket, one entry per discount.
	 *
	 * @return the applied discounts
	 */
	List<AppliedDiscountView> getDiscounts();

	/**
	 * Returns the voucher codes. After a {@code create} or {@code apply} that set
	 * {@link BasketChanges#getVoucherCodes()}, one entry per requested code in the order of the request, rejected codes
	 * included. Otherwise, the codes stored on the basket, which never include rejected ones.
	 *
	 * @return the voucher code results
	 */
	List<VoucherCodeResult> getVoucherCodes();

	/**
	 * Returns the basket totals.
	 *
	 * @return the totals, never null
	 */
	TotalsView getTotals();

	/**
	 * Returns the warnings of the last recalculation plus the order-time checks evaluated as a dry run.
	 *
	 * @return the issues
	 */
	List<BasketIssue> getIssues();

	/**
	 * Returns the requested changes that this call could not apply. Always empty for get.
	 *
	 * @return the rejections
	 */
	List<ChangeRejection> getRejections();

	/**
	 * Returns the id of the latest order created from the basket, whatever its status.
	 *
	 * @return the order id, or null when no order was created from this basket
	 */
	Integer getDocumentId();

	/**
	 * Returns whether a registered user is logged in on the basket.
	 *
	 * @return true when logged in
	 */
	boolean isLoggedIn();

	/**
	 * Returns whether a login is pending: it matched several accounts and waits for the buyer to choose one.
	 *
	 * @return true when a login is pending
	 */
	boolean isPendingLogin();

	/**
	 * Returns the account the basket belongs to.
	 *
	 * @return the account id, or null for a guest basket without an account
	 */
	Integer getAccountId();

	/**
	 * Returns when the basket was last saved.
	 *
	 * @return the last save time
	 */
	Instant getUpdatedAt();

	/**
	 * Returns how long after its last save ({@link #getUpdatedAt()}) the basket is deleted: the storefront session
	 * lifetime, or 5 minutes for an empty anonymous basket.
	 *
	 * @return the lifetime
	 */
	Duration getLifeTime();

	/**
	 * Returns the storefront base URL for the basket's language and country, computed from the basket, never from the
	 * caller's request. Storefront paths (for instance {@code /checkout}) are appended to it.
	 *
	 * @return an absolute URL without a trailing slash, or null when the commerce has no absolute store URL configured
	 */
	String getStoreBaseUrl();

}
