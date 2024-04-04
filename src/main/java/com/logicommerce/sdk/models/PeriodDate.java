package com.logicommerce.sdk.models;

import java.time.LocalDate;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.6
 */
public interface PeriodDate {

	/**
	 * <p>Get startDate with ISO-8601 ("YYYY-MM-DD") format..</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	LocalDate getStartDate();

	/**
	 * <p>Get endDate with ISO-8601 ("YYYY-MM-DD") format..</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	LocalDate getEndDate();

}
