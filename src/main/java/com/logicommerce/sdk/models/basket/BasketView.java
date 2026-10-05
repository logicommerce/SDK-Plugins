package com.logicommerce.sdk.models.basket;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * <p>A basket as {@link com.logicommerce.sdk.resources.BasketResource} returns it.</p>
 *
 * <p>Every amount of the view (rows, discounts, totals) is an integer number of minor units of
 * {@link #getCurrencyCode()} (the ISO 4217 exponent of {@link java.util.Currency#getDefaultFractionDigits()}), computed by core: each unit price
 * and each discount allocation is rounded once, and every total is the sum of its rounded parts, so the totals always
 * add up but may differ from core's unrounded totals by a few minor units. Prices are gross (taxes included) or net
 * according to {@link #isTaxesIncluded()}.</p>
 *
 * <p>After {@link com.logicommerce.sdk.resources.BasketResource#create create} and
 * {@link com.logicommerce.sdk.resources.BasketResource#apply apply} the view reflects the recalculation that the call
 * made; after {@link com.logicommerce.sdk.resources.BasketResource#get get} it is the basket as it was last saved,
 * never recalculated. Lists are never null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketView {

	/**
	 * Returns the basket token: the storefront session credential, never to be exposed to third parties.
	 *
	 * @return the token (as stored, without the {@code _<basketId>} suffix that
	 *         {@link com.logicommerce.sdk.models.Cart#getToken()} adds)
	 */
	String getToken();

	/**
	 * Returns the basket id (core's {@code Basket.id}, the {@code _<basketId>} suffix of
	 * {@link com.logicommerce.sdk.models.Cart#getToken()}). Core only changes it when it regenerates the basket after the
	 * payment flow confirmed an order ({@code /validate} answered OK, or a zero-total {@code /pay}), so an id that moved
	 * means an order was confirmed from this basket.
	 *
	 * @return the basket id
	 */
	int getId();

	/**
	 * Returns the ISO 4217 code (upper case) of every amount in the view: the basket's purchase currency.
	 *
	 * @return the currency code
	 */
	String getCurrencyCode();

	/**
	 * Returns whether prices are shown with taxes included for the basket's country (the commerce's
	 * {@code showTaxesIncluded}, overridable per country and account group). When true, unit prices and totals are gross,
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
	 * @return the LogiCommerce language code: ISO 639-1, lower case (for instance {@code es})
	 */
	String getLanguageCode();

	/**
	 * Returns the customer data stored on the basket.
	 *
	 * @return the customer, never null (its fields are null when unknown)
	 */
	CustomerView getCustomer();

	/**
	 * Returns the basket rows, in insertion order (stable across calls).
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
	 * Returns the voucher codes (discount codes and balance voucher codes). After a {@code create} or {@code apply}
	 * whose {@link BasketChanges#getVoucherCodes()} is not null, one entry per requested code in the order of the request
	 * (so a position maps to the request's list), rejected codes included. Otherwise (a {@code get}, or a call that left
	 * the voucher codes unchanged) the codes stored on the basket, in the order they were added; rejected codes are never
	 * stored, so they do not appear there.
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
	 * Returns the issues of the basket: the warnings of the last recalculation (fresh after create and apply, as saved
	 * for get) plus the order-time checks evaluated as a dry run.
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
	 * Returns the id of the latest order created from the basket (core's {@code Basket.documentId}), whatever its
	 * status.
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
	 * Returns whether a login is pending on the basket (a login that matched several accounts and waits for the buyer to
	 * choose one: core's {@code pendingLoginRegisteredUserId} is set).
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
	 * Returns the effective lifetime of this basket: it is deleted by the session reaper once this long has passed
	 * since its last save ({@link #getUpdatedAt()}). It is the commerce's storefront session lifetime, except for an
	 * empty anonymous basket (no rows, no account), which core reaps after 5 minutes.
	 *
	 * @return the lifetime
	 */
	Duration getLifeTime();

	/**
	 * Returns the storefront base URL for the basket's own language and country (the URL the storefront would route the
	 * basket to), computed by core from the basket and never from the caller's request. It falls back to the base home
	 * URL, then to the store URL of the basket's language, then to the default store URL, when no country-level entry
	 * matches; a candidate that is not an absolute http or https URL is skipped. Storefront paths (for instance
	 * {@code /checkout}) are appended to it.
	 *
	 * @return an absolute URL (scheme, host and an optional path), without a trailing slash, or null when the commerce
	 *         has no absolute store URL configured
	 */
	String getStoreBaseUrl();

}
