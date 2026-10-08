package com.logicommerce.sdk.models.basket;

import java.util.Map;
import com.logicommerce.sdk.enums.EndOrderCode;
import com.logicommerce.sdk.enums.EndOrderField;
import com.logicommerce.sdk.enums.IssueSeverity;
import com.logicommerce.sdk.enums.IssueSource;

/**
 * <p>An issue of a basket: a warning of the last recalculation, or an order-time check evaluated as a dry run. A
 * warning that affects several rows is reported once per row; a failing order-time check once per failing field.</p>
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
	 * <li>For a {@link IssueSource#WARNING}, a basket warning code: {@code NOT_AVAILABLE_PRODUCT},
	 * {@code INVALID_PRICE}, {@code MIN_ORDER_QUANTITY}, {@code MAX_ORDER_QUANTITY},
	 * {@code MULTIPLE_ORDER_OVER_QUANTITY}, {@code MULTIPLE_ORDER_QUANTITY}, {@code STOCK_RESTRICTION},
	 * {@code BACKORDER}, {@code BACKORDER_PREVISION}, {@code EMPTY_PRODUCTS}, {@code STOCK_PREVISION},
	 * {@code WAREHOUSE_OFFSET}, {@code ON_REQUEST_PRODUCT}, {@code INVALID_OPTIONS}, {@code NEEDS_PAYMENTSYSTEM},
	 * {@code NEEDS_DELIVERY}, {@code INVALID_BILLING_ADDRESS}, {@code INVALID_SHIPPING_ADDRESS},
	 * {@code ACCOUNT_NOT_ACTIVED}, {@code ACCOUNT_NOT_VERIFIED}, {@code LOCKED_STOCK_RESTRICTION},
	 * {@code EMPLOYEE_PERMISSION_LIMIT_AMOUNT_PER_ORDER}, {@code EMPLOYEE_PERMISSION_LIMIT_ORDER_QUANTITY_PER_EMPLOYEE},
	 * {@code ORDER_APPROVAL_REQUIRED}. New codes may be added: treat an unknown one by its severity.</li>
	 * <li>For an {@link IssueSource#END_ORDER}, the name of an {@link EndOrderCode}.</li>
	 * </ul>
	 *
	 * @return the code
	 */
	String getCode();

	/**
	 * Returns the severity. {@link IssueSource#END_ORDER} issues are always errors.
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
	 * Returns the customer field the issue is about. Always set for an {@link IssueSource#END_ORDER} issue:
	 * {@link EndOrderField#EMAIL}, {@link EndOrderField#FIRST_NAME}, {@link EndOrderField#LAST_NAME} or
	 * {@link EndOrderField#PHONE} for the data {@link CustomerChange} writes, {@link EndOrderField#ADDRESS} for any
	 * other address field, and {@link EndOrderField#OTHER} for anything else.
	 *
	 * @return the field, or null when the issue is not about a customer field (always null for
	 *         {@link IssueSource#WARNING})
	 */
	EndOrderField getField();

	/**
	 * Returns the attributes of the issue, with their values as text (integers in decimal notation, dates in ISO 8601,
	 * lists joined by {@code ','}).
	 *
	 * <p>For a {@link IssueSource#WARNING}: {@code quantity} (the limit of a quantity warning, or the units beyond the
	 * stock of an on-request product), {@code current} (the requested quantity), {@code over}, {@code stock},
	 * {@code offsetDays}, {@code onRequestDays}, {@code combinationId}, {@code myLockedStockUnits},
	 * {@code othersLockedStockUnits}, {@code othersNearestLockedStockToExpireUnits},
	 * {@code othersNearestLockedStockToExpireTime}, {@code min} and {@code max}. New names may be added.</p>
	 *
	 * <p>For an {@link IssueSource#END_ORDER}, only {@code fieldName}: the name of the failing field (for instance
	 * {@code shippingAddress.city}), for logs; absent when the check names no field.</p>
	 *
	 * @return the attributes, empty when none
	 */
	Map<String, String> getAttributes();

}
