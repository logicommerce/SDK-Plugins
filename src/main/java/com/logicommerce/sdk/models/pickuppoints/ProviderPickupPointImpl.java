package com.logicommerce.sdk.models.pickuppoints;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodDate;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public class ProviderPickupPointImpl implements ProviderPickupPoint {

	private int id;
	
	private String name;

	private String key;

	private String email;
	
	private String city;

	private String state;

	private String postalCode;

	private String address;

	private String addressAdditionalInformation;

	private String number;

	private String phone;

	private String mobile;
	
	private Location location;

	private OpeningTimes openingTimes;

	private String openingTimesAdditionalInformation;

	private List<PeriodDate> upcomingHolidayClosurePeriods;

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
	public List<PeriodDate> getUpcomingHolidayClosurePeriods() {
		return upcomingHolidayClosurePeriods;
	}

	/**
	 * <p>Setter for the field <code>upcomingHolidayClosurePeriods</code>.</p>
	 *
	 * @param upcomingHolidayClosurePeriods a {@link com.logicommerce.sdk.models.PeriodDate} object
	 */
	public void setUpcomingHolidayClosurePeriods(List<PeriodDate> upcomingHolidayClosurePeriods) {
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

	/** {@inheritDoc} */
	@Override
	public String getAddress() {
		return address;
	}

	/** {@inheritDoc} */
	@Override
	public String getNumber() {
		return number;
	}

	/** {@inheritDoc} */
	@Override
	public String getAddressAdditionalInformation() {
		return addressAdditionalInformation;
	}

	/** {@inheritDoc} */
	@Override
	public String getCity() {
		return city;
	}

	/** {@inheritDoc} */
	@Override
	public String getState() {
		return state;
	}

	/** {@inheritDoc} */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/** {@inheritDoc} */
	@Override
	public Location getLocation() {
		return location;
	}

	/** {@inheritDoc} */
	@Override
	public String getPhone() {
		return phone;
	}

	/** {@inheritDoc} */
	@Override
	public String getMobile() {
		return mobile;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
