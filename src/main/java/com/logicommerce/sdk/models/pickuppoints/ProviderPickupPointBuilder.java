package com.logicommerce.sdk.models.pickuppoints;

import java.util.HashMap;
import java.util.Map;
import com.logicommerce.sdk.builders.AddressBuilder;
import com.logicommerce.sdk.builders.OpeningTimesBuilder;
import com.logicommerce.sdk.builders.PeriodDateBuilder;
import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodDate;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public class ProviderPickupPointBuilder {
	
	private Integer id;
	
	private String name;

	private String key;

	private String email;

	private Address address;
	
	private AddressBuilder<ProviderPickupPointBuilder, ?> addressBuilder;

	private OpeningTimes openingTimes;
	
	private OpeningTimesBuilder<ProviderPickupPointBuilder> openingTimesBuilder;

	private String openingTimesAdditionalInformation;

	private PeriodDate upcomingHolidayClosurePeriods;
	
	private PeriodDateBuilder<ProviderPickupPointBuilder> periodDateBuilder;

	private String upcomingHolidayClosurePeriodsAdditionalInformation;

	private double distance;

	private String url;
	
	private Map<String, String> additionalData;
	
	/**
	 * <p>id</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder id(Integer id) {
		this.id = id;
		return returnThis();
	}
	
	/**
	 * <p>name</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder name(String name) {
		this.name = name;
		return returnThis();
	}

	/**
	 * <p>key</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder key(String key) {
		this.key = key;
		return returnThis();
	}

	/**
	 * <p>email</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder email(String email) {
		this.email = email;
		return returnThis();
	}
	
	/**
	 * <p>url</p>
	 *
	 * @param url a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder url(String url) {
		this.url = url;
		return returnThis();
	}
	
	/**
	 * <p>openingTimes</p>
	 *
	 * @param openingTimes a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder openingTimes(OpeningTimes openingTimes) {
		this.openingTimes = openingTimes;
		return returnThis();
	}
	
	/**
	 * <p>return OpeningTimesBuilder for openingTimes</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */	
	public OpeningTimesBuilder<ProviderPickupPointBuilder> openingTimes() {
		if (openingTimesBuilder == null) {
			openingTimesBuilder = new OpeningTimesBuilder<>(returnThis());
		}
		return openingTimesBuilder;
	}

	private void setOpeningTimes(ProviderPickupPointImpl providerPickupPoint) {
		if (openingTimes != null) {
			providerPickupPoint.setOpeningTimes(openingTimes);
		} else if (openingTimesBuilder != null) {
			providerPickupPoint.setOpeningTimes(openingTimesBuilder.build());
		}
	}
	
	/**
	 * <p>openingTimesAdditionalInformation</p>
	 *
	 * @param openingTimesAdditionalInformation a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder openingTimesAdditionalInformation(String openingTimesAdditionalInformation) {
		this.openingTimesAdditionalInformation = openingTimesAdditionalInformation;
		return returnThis();
	}
	
	/**
	 * <p>return PeriodDateBuilder for upcomingHolidayClosurePeriods</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodDateBuilder} object
	 */	
	public PeriodDateBuilder<ProviderPickupPointBuilder> upcomingHolidayClosurePeriods() {
		if (periodDateBuilder == null) {
			periodDateBuilder = new PeriodDateBuilder<>(returnThis());
		}
		return periodDateBuilder;
	}
	
	/**
	 * <p>upcomingHolidayClosurePeriods</p>
	 *
	 * @param upcomingHolidayClosurePeriods a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder upcomingHolidayClosurePeriods(PeriodDate upcomingHolidayClosurePeriods) {
		this.upcomingHolidayClosurePeriods = upcomingHolidayClosurePeriods;
		return returnThis();
	}	

	private void setUpcomingHolidayClosurePeriods(ProviderPickupPointImpl providerPickupPoint) {
		if (upcomingHolidayClosurePeriods != null) {
			providerPickupPoint.setUpcomingHolidayClosurePeriods(upcomingHolidayClosurePeriods);
		} else if (periodDateBuilder != null) {
			providerPickupPoint.setUpcomingHolidayClosurePeriods(periodDateBuilder.build());
		}
	}
	
	/**
	 * <p>upcomingHolidayClosurePeriodsAdditionalInformation</p>
	 *
	 * @param upcomingHolidayClosurePeriodsAdditionalInformation a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder upcomingHolidayClosurePeriodsAdditionalInformation(String upcomingHolidayClosurePeriodsAdditionalInformation) {
		this.upcomingHolidayClosurePeriodsAdditionalInformation = upcomingHolidayClosurePeriodsAdditionalInformation;
		return returnThis();
	}
	
	/**
	 * <p>distance</p>
	 *
	 * @param distance a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPointBuilder} object
	 */
	public ProviderPickupPointBuilder distance(double distance) {
		this.distance = distance;
		return returnThis();
	}

	/**
	 * <p>return AddressBuilder for address</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */	
	public AddressBuilder<ProviderPickupPointBuilder, ?> address() {
		if (addressBuilder == null) {
			addressBuilder = new AddressBuilder<>(returnThis());
		}
		return addressBuilder;
	}
	
	/**
	 * <p>address</p>
	 *
	 * @param address a {@link com.logicommerce.sdk.models.Address} object
	 */
	public ProviderPickupPointBuilder address(Address address) {
		this.address = address;		
		return returnThis();
	}
	
	private void setAddress(ProviderPickupPointImpl providerPickupPoint) {
		if (address != null) {
			providerPickupPoint.setAddress(address);
		} else if (addressBuilder != null) {
			providerPickupPoint.setAddress(addressBuilder.build());
		}
	}
	
	public ProviderPickupPointBuilder addAdditionalData(String name, String value) {
		if (additionalData == null) {
			additionalData = new HashMap<>();
		}
		additionalData.putIfAbsent(name, value);
		return returnThis();
	}

	/**
	 * <p>builder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProvider} object
	 */
	public ProviderPickupPoint build() {
		ProviderPickupPointImpl providerPickupPoint = new ProviderPickupPointImpl();
		this.setAddress(providerPickupPoint);
		this.setUpcomingHolidayClosurePeriods(providerPickupPoint);
		this.setOpeningTimes(providerPickupPoint);
		providerPickupPoint.setName(name);
		providerPickupPoint.setKey(key);
		providerPickupPoint.setEmail(email);
		providerPickupPoint.setUrl(url);
		providerPickupPoint.setOpeningTimesAdditionalInformation(openingTimesAdditionalInformation);
		providerPickupPoint.setUpcomingHolidayClosurePeriodsAdditionalInformation(upcomingHolidayClosurePeriodsAdditionalInformation);
		providerPickupPoint.setDistance(distance);
		providerPickupPoint.setAdditionalData(additionalData);
		providerPickupPoint.setId(id);
		return providerPickupPoint;
	}

	public ProviderPickupPointBuilder returnThis() {
		return this;
	}
	
}
