package com.logicommerce.sdk.models.implementations;

import java.time.LocalTime;
import com.logicommerce.sdk.models.PeriodTime;

/**
 * <p>PeriodDateImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.6
 */
public class PeriodTimeImpl implements PeriodTime {

	private LocalTime startDate;

	private LocalTime endDate;

	/** {@inheritDoc} */
	@Override
	public LocalTime getStartDate() {
		return startDate;
	}

	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.time.LocalTime} object
	 */
	public void setStartDate(LocalTime startDate) {
		this.startDate = startDate;
	}

	/** {@inheritDoc} */
	@Override
	public LocalTime getEndDate() {
		return endDate;
	}

	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.time.LocalTime} object 
	 */
	public void setEndDate(LocalTime endDate) {
		this.endDate = endDate;
	}
}
