package com.logicommerce.sdk.builders;

import java.time.LocalDate;
import com.logicommerce.sdk.models.PeriodDate;
import com.logicommerce.sdk.models.implementations.PeriodDateImpl;

/**
 * <p>PeriodDateBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.6
 */
public class PeriodDateBuilder<T> {

	private T parentBuilder;

	private LocalDate startDate;

	private LocalDate endDate;

	/**
	 * <p>Constructor for PeriodDateBuilder.</p>
	 */
	public PeriodDateBuilder() {
		
	}

	/**
	 * <p>Constructor for PeriodDateBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public PeriodDateBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	
	/**
	 * <p>startDate.</p>
	 *
	 * @param startDate a {@link java.time.LocalDate} object
	 * @return a {@link com.logicommerce.sdk.builders.PeriodDateBuilder} object
	 */
	public PeriodDateBuilder<T> startDate(LocalDate startDate) {
		this.startDate = startDate;
		return returnThis();
	}

	/**
	 * <p>endDate.</p>
	 *
	 * @param endDate a {@link java.time.LocalDate} object
	 * @return a {@link com.logicommerce.sdk.builders.PeriodDateBuilder} object
	 */
	public PeriodDateBuilder<T> endDate(LocalDate endDate) {
		this.endDate = endDate;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.PeriodDate} object
	 */
	public PeriodDate build() {
		PeriodDateImpl periodDate = new PeriodDateImpl();
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
	 * @return a {@link com.logicommerce.sdk.builders.PeriodDateBuilder} object
	 */
	protected PeriodDateBuilder<T> returnThis() {
		return this;
	}
}