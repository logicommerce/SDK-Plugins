package com.logicommerce.sdk.builders;

import java.time.LocalTime;
import com.logicommerce.sdk.models.PeriodTime;
import com.logicommerce.sdk.models.implementations.PeriodTimeImpl;

/**
 * <p>PeriodDateBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.7
 */
public class PeriodTimeBuilder<T> {

	private T parentBuilder;

	private LocalTime startDate;

	private LocalTime endDate;

	/**
	 * <p>Constructor for PeriodDateBuilder.</p>
	 */
	public PeriodTimeBuilder() {
		
	}

	/**
	 * <p>Constructor for PeriodDateBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public PeriodTimeBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	
	/**
	 * <p>startDate.</p>
	 *
	 * @param startDate a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<T> startDate(LocalTime startDate) {
		this.startDate = startDate;
		return returnThis();
	}

	/**
	 * <p>endDate.</p>
	 *
	 * @param endDate a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<T> endDate(LocalTime endDate) {
		this.endDate = endDate;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.PeriodDate} object
	 */
	public PeriodTime build() {
		PeriodTimeImpl periodDate = new PeriodTimeImpl();
		periodDate.setStartDate(startDate);
		periodDate.setEndDate(endDate);
		return periodDate;
	}
	
	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	protected PeriodTimeBuilder<T> returnThis() {
		return this;
	}
}