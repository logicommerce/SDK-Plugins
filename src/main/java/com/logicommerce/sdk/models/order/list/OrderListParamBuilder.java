package com.logicommerce.sdk.models.order.list;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.OrderStatusType;

/**
 * OrderListParam builder.
 *
 * @author LogiCommerce
 * @see OrderListParam
 * @since 2.8.5
 */
public class OrderListParamBuilder {

	private int page = 1;

	private int perPage = 25;

	private Integer id;

	private String pId;

	private Integer userId;

	private String search;

	private List<OrderStatusType> statuses = new ArrayList<>();

	/**
	 * Sets the page number, starting at 1.
	 *
	 * @param page an int
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder page(int page) {
		this.page = page;
		return this;
	}

	/**
	 * Sets the number of elements per page.
	 *
	 * @param perPage an int
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder perPage(int perPage) {
		this.perPage = perPage;
		return this;
	}

	/**
	 * Sets the order id.
	 *
	 * @param id an Integer
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Sets the order pId.
	 *
	 * @param pId a String
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * Sets the user id owner of the orders.
	 *
	 * @param userId an Integer
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder userId(Integer userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * Sets the search text. Currently matched against the customer email.
	 *
	 * @param search a String
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder search(String search) {
		this.search = search;
		return this;
	}

	/**
	 * Sets the order statuses to filter by, replacing any previously added.
	 *
	 * @param statuses a {@link java.util.List} of {@link com.logicommerce.sdk.enums.OrderStatusType}
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder statuses(List<OrderStatusType> statuses) {
		this.statuses = new ArrayList<>(statuses);
		return this;
	}

	/**
	 * Adds an order status to filter by.
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 * @return a {@link OrderListParamBuilder} object
	 */
	public OrderListParamBuilder addStatus(OrderStatusType status) {
		this.statuses.add(status);
		return this;
	}

	/**
	 * Builds a {@link OrderListParam} object.
	 *
	 * @return a {@link OrderListParam} object
	 */
	public OrderListParam build() {
		OrderListParam param = new OrderListParam();
		param.setPage(page);
		param.setPerPage(perPage);
		param.setId(id);
		param.setPId(pId);
		param.setUserId(userId);
		param.setSearch(search);
		param.setStatuses(new ArrayList<>(statuses));
		return param;
	}

}
