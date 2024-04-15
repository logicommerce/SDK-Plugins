package com.logicommerce.sdk.models;

import java.util.List;


/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public interface OpeningTimes {

	/**
	 * <p>getMonday.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	List<PeriodTime> getMonday();

	/**
	 * <p>getTuesday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getTuesday();
	
	/**
	 * <p>getWednesday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getWednesday();

	/**
	 * <p>getThursday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getThursday();

	/**
	 * <p>getFriday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getFriday();

	/**
	 * <p>getSaturday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getSaturday();

	/**
	 * <p>getSunday.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PeriodTime> getSunday();

}
