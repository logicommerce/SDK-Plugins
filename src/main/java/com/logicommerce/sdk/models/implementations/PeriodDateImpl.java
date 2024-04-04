package com.logicommerce.sdk.models.implementations;

import java.time.LocalDate;
import com.logicommerce.sdk.models.PeriodDate;

/**
 * <p>PeriodDateImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.6
 */
public class PeriodDateImpl implements PeriodDate {

	private LocalDate startDate;

	private LocalDate endDate;

	/** {@inheritDoc} */
	@Override
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.time.LocalDate} object
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.time.LocalDate} object 
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
