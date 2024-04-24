package com.logicommerce.sdk.models.pickuppoints;

import java.util.Map;
import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodDate;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public interface ProviderPickupPoint extends Address {

	/**
	 * <p>Get id value.</p>
	 *
	 * @return a {@link java.lang.Integer Integer} object
	 */
	int getId();

	/**
	 * <p>getKey.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getKey();
	
	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * <p>getEmail.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getEmail();

	/**
	 * <p>Get openingTimes value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	OpeningTimes getOpeningTimes();
	
	/**
	 * <p>Get openingTimesAdditionalInformation value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getOpeningTimesAdditionalInformation();

	/**
	 * <p>Get upcomingHolidayClosurePeriods value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	PeriodDate getUpcomingHolidayClosurePeriods();

	/**
	 * <p>Get upcomingHolidayClosurePeriodsAdditionalInformation value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getUpcomingHolidayClosurePeriodsAdditionalInformation();
	
	/**
	 * <p>Get distance value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	double getDistance();
	
	/**
	 * <p>Get url value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getUrl();

	/**
	 * <p>Get additionalData value.</p>
	 *
	 * @return a {@link java.util.Map Map} object
	 */	
	Map<String, String> getAdditionalData();
	
}
