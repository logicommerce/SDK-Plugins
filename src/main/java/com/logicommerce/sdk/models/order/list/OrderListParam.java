package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.PaginationParam;

/**
 * Filter param for order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public class OrderListParam extends PaginationParam {

	private Integer id;

	private String pId;

	private Integer userId;

	private String search;

	private List<OrderStatusType> statuses = new ArrayList<>();

	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	/**
	 * Returns the order id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the order id.
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Returns the order pId.
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPId() {
		return pId;
	}

	/**
	 * Sets the order pId.
	 *
	 * @param pId a {@link java.lang.String} object
	 */
	public void setPId(String pId) {
		this.pId = pId;
	}

	/**
	 * Returns the user id owner of the orders.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Sets the user id owner of the orders.
	 *
	 * @param userId a {@link java.lang.Integer} object
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * Returns the search text. Currently matched against the customer email.
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * Sets the search text. Currently matched against the customer email.
	 *
	 * @param search a {@link java.lang.String} object
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * Returns the order statuses to filter by. An empty list does not filter.
	 *
	 * @return a {@link java.util.List} of {@link com.logicommerce.sdk.enums.OrderStatusType}
	 */
	public List<OrderStatusType> getStatuses() {
		return statuses;
	}

	/**
	 * Sets the order statuses to filter by. An empty list does not filter.
	 *
	 * @param statuses a {@link java.util.List} of {@link com.logicommerce.sdk.enums.OrderStatusType}
	 */
	public void setStatuses(List<OrderStatusType> statuses) {
		this.statuses = statuses;
	}

	/**
	 * Returns the minimum order date, inclusive. A null value does not filter.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 * @since 2.9.1
	 */
	public LocalDateTime getFromDate() {
		return fromDate;
	}

	/**
	 * Sets the minimum order date, inclusive. A null value does not filter.
	 *
	 * @param fromDate a {@link java.time.LocalDateTime} object
	 * @since 2.9.1
	 */
	public void setFromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * Returns the maximum order date, inclusive. A null value does not filter.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 * @since 2.9.1
	 */
	public LocalDateTime getToDate() {
		return toDate;
	}

	/**
	 * Sets the maximum order date, inclusive. A null value does not filter.
	 *
	 * @param toDate a {@link java.time.LocalDateTime} object
	 * @since 2.9.1
	 */
	public void setToDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}

}
