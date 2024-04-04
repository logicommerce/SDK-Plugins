package com.logicommerce.sdk.models.pickuppoints;

import java.util.Map;
import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodDate;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.6
 */
public class ProviderPickupPointImpl implements ProviderPickupPoint {

	private int id;
	
	private String name;

	private String key;

	private String email;

	private Address address;

	private OpeningTimes openingTimes;

	private String openingTimesAdditionalInformation;

	private PeriodDate upcomingHolidayClosurePeriods;

	private String upcomingHolidayClosurePeriodsAdditionalInformation;

	private double distance;

	private String url;
	
	private Map<String, String> additionalData;

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <p>Setter for the field <code>key</code>.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/** {@inheritDoc} */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** {@inheritDoc} */
	@Override
	public Address getAddress() {
		return address;
	}

	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link com.logicommerce.sdk.models.Address} object
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/** {@inheritDoc} */
	@Override
	public OpeningTimes getOpeningTimes() {
		return openingTimes;
	}

	/**
	 * <p>Setter for the field <code>openingTimes</code>.</p>
	 *
	 * @param openingTimes a {@link java.lang.String} object
	 */
	public void setOpeningTimes(OpeningTimes openingTimes) {
		this.openingTimes = openingTimes;
	}	

	/** {@inheritDoc} */
	@Override
	public String getOpeningTimesAdditionalInformation() {
		return openingTimesAdditionalInformation;
	}

	/**
	 * <p>Setter for the field <code>openingTimesAdditionalInformation</code>.</p>
	 *
	 * @param openingTimesAdditionalInformation a {@link java.lang.String} object
	 */
	public void setOpeningTimesAdditionalInformation(String openingTimesAdditionalInformation) {
		this.openingTimesAdditionalInformation = openingTimesAdditionalInformation;
	}

	/** {@inheritDoc} */
	@Override
	public PeriodDate getUpcomingHolidayClosurePeriods() {
		return upcomingHolidayClosurePeriods;
	}

	/**
	 * <p>Setter for the field <code>upcomingHolidayClosurePeriods</code>.</p>
	 *
	 * @param upcomingHolidayClosurePeriods a {@link com.logicommerce.sdk.models.PeriodDate} object
	 */
	public void setUpcomingHolidayClosurePeriods(PeriodDate upcomingHolidayClosurePeriods) {
		this.upcomingHolidayClosurePeriods = upcomingHolidayClosurePeriods;
	}

	/** {@inheritDoc} */
	@Override
	public String getUpcomingHolidayClosurePeriodsAdditionalInformation() {
		return upcomingHolidayClosurePeriodsAdditionalInformation;
	}

	/**
	 * <p>Setter for the field <code>upcomingHolidayClosurePeriodsAdditionalInformation</code>.</p>
	 *
	 * @param upcomingHolidayClosurePeriodsAdditionalInformation a {@link java.lang.String} object
	 */
	public void setUpcomingHolidayClosurePeriodsAdditionalInformation(String upcomingHolidayClosurePeriodsAdditionalInformation) {
		this.upcomingHolidayClosurePeriodsAdditionalInformation = upcomingHolidayClosurePeriodsAdditionalInformation;
	}

	/** {@inheritDoc} */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <p>Setter for the field <code>distance</code>.</p>
	 *
	 * @param distance a {@link java.lang.String} object
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/** {@inheritDoc} */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, String> getAdditionalData() {
		return additionalData;
	}

	/**
	 * <p>Setter for the field <code>additionalData</code>.</p>
	 *
	 * @param additionalData a {@link java.util.Map} object
	 */
	public void setAdditionalData(Map<String, String> additionalData) {
		this.additionalData = additionalData;
	}

	/** {@inheritDoc} */
	@Override
	public int getId() {
		return id;
	}
	
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
