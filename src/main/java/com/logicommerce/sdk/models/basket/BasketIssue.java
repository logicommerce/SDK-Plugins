package com.logicommerce.sdk.models.basket;

import java.util.Map;
import com.logicommerce.sdk.enums.EndOrderCode;
import com.logicommerce.sdk.enums.EndOrderField;
import com.logicommerce.sdk.enums.IssueSeverity;
import com.logicommerce.sdk.enums.IssueSource;

/**
 * <p>An issue of a basket ({@link BasketView#getIssues()}): a warning of the last recalculation, or an order-time check
 * evaluated as a dry run. A warning that affects several rows is reported once per row; a failing order-time check once
 * per failing field.</p>
 *
 * <p>The registered-email conflict is not an issue: core refuses to store such an email, so it is reported by the call
 * that tried to set it, as a {@link com.logicommerce.sdk.enums.RejectionCode#CUSTOMER_EMAIL_REGISTERED} rejection.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketIssue {

	/**
	 * Returns where the issue comes from.
	 *
	 * @return the source
	 */
	IssueSource getSource();

	/**
	 * Returns the code of the issue.
	 *
	 * <ul>
	 * <li>For a {@link IssueSource#WARNING}: the constant name (not the JSON value) of core's {@code BasketWarningCode}:
	 * {@code NOT_AVAILABLE_PRODUCT}, {@code INVALID_PRICE}, {@code MIN_ORDER_QUANTITY}, {@code MAX_ORDER_QUANTITY},
	 * {@code MULTIPLE_ORDER_OVER_QUANTITY}, {@code MULTIPLE_ORDER_QUANTITY}, {@code STOCK_RESTRICTION},
	 * {@code BACKORDER}, {@code BACKORDER_PREVISION}, {@code EMPTY_PRODUCTS}, {@code STOCK_PREVISION},
	 * {@code WAREHOUSE_OFFSET}, {@code ON_REQUEST_PRODUCT}, {@code INVALID_OPTIONS}, {@code NEEDS_PAYMENTSYSTEM},
	 * {@code NEEDS_DELIVERY}, {@code INVALID_BILLING_ADDRESS}, {@code INVALID_SHIPPING_ADDRESS},
	 * {@code ACCOUNT_NOT_ACTIVED}, {@code ACCOUNT_NOT_VERIFIED}, {@code LOCKED_STOCK_RESTRICTION},
	 * {@code EMPLOYEE_PERMISSION_LIMIT_AMOUNT_PER_ORDER}, {@code EMPLOYEE_PERMISSION_LIMIT_ORDER_QUANTITY_PER_EMPLOYEE},
	 * {@code ORDER_APPROVAL_REQUIRED}. Later core versions may add names: treat an unknown one by its severity.</li>
	 * <li>For an {@link IssueSource#END_ORDER}: the {@link EndOrderCode#name() name} of an {@link EndOrderCode}, a
	 * closed list.</li>
	 * </ul>
	 *
	 * @return the code
	 */
	String getCode();

	/**
	 * Returns the severity: the {@code BasketWarningCode}'s own for a warning; {@link IssueSource#END_ORDER} issues are
	 * always errors.
	 *
	 * @return the severity
	 */
	IssueSeverity getSeverity();

	/**
	 * Returns the hash of the row the issue is about.
	 *
	 * @return the row hash, or null when the issue is not about a row (always null for {@link IssueSource#END_ORDER})
	 */
	String getRowHash();

	/**
	 * Returns the customer field the issue is about. For an {@link IssueSource#END_ORDER} issue it is always set:
	 * {@link EndOrderField#EMAIL}, {@link EndOrderField#FIRST_NAME}, {@link EndOrderField#LAST_NAME} or
	 * {@link EndOrderField#PHONE} for the validation fields that hold the data {@link CustomerChange} writes (wherever
	 * core stores it), {@link EndOrderField#ADDRESS} for any other field of the billing or shipping address, and
	 * {@link EndOrderField#OTHER} for anything else.
	 *
	 * @return the field, or null when the issue is not about a customer field (always null for
	 *         {@link IssueSource#WARNING})
	 */
	EndOrderField getField();

	/**
	 * Returns the attributes of the issue, by name, with their values as text (integers in plain decimal notation,
	 * dates and date-times in ISO 8601, lists as their elements joined by {@code ','}).
	 *
	 * <p>For a {@link IssueSource#WARNING}, core's warning attribute names, unchanged. The ones core sets today:
	 * {@code quantity} (the limit of a quantity warning, or the units beyond the stock of an on-request product),
	 * {@code current} (the requested quantity of a quantity warning), {@code over} (of
	 * {@code MULTIPLE_ORDER_OVER_QUANTITY}), {@code stock} (the available stock), {@code offsetDays} (days until the
	 * stock of a prevision or a warehouse offset is available), {@code onRequestDays}, {@code combinationId},
	 * {@code myLockedStockUnits}, {@code othersLockedStockUnits}, {@code othersNearestLockedStockToExpireUnits},
	 * {@code othersNearestLockedStockToExpireTime} (locked stock warnings), and {@code min} and {@code max} (employee
	 * permission limits). Later core versions may add names.</p>
	 *
	 * <p>For an {@link IssueSource#END_ORDER}, only {@code fieldName}: the name of the failing field in the commerce's
	 * data validation (for instance {@code email} or {@code shippingAddress.city}), for logs; absent when the check names
	 * no field ({@link EndOrderCode#FORCE_BILLING_ADDRESS_COUNTRY}, and {@link EndOrderCode#OTHER} failures without one).</p>
	 *
	 * @return the attributes, empty when none
	 */
	Map<String, String> getAttributes();

}
