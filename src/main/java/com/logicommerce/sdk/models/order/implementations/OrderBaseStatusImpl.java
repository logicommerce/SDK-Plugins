package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.models.order.OrderBaseStatus;
import com.logicommerce.sdk.models.order.OrderStatusAction;
import com.logicommerce.utilities.annotations.Uses;

public class OrderBaseStatusImpl<T> implements OrderBaseStatus<T>  {

	private Integer id;

	@Uses(value = OrderStatusActionImpl.class)
	private List<OrderStatusAction> actions;

	private LocalDateTime currentDateTime;
	
	private T status;

	private int substatusId;

	public Integer getId() {
		return id;
	}

	public List<OrderStatusAction> getActions() {
		return actions;
	}

	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}

	public T getStatus() {
		return status;
	}

	public int getSubstatusId() {
		return substatusId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setActions(List<OrderStatusAction> actions) {
		this.actions = actions;
	}

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public void setSubstatusId(int substatusId) {
		this.substatusId = substatusId;
	}

	public void setStatus(T status) {
		this.status = status;
	}
}