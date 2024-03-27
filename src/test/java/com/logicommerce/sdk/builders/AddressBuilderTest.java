package com.logicommerce.sdk.builders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.models.Address;

class AddressBuilderTest {

	private static final String ADDRESS = "123 Main St";
	private static final String CITY = "Anytown";
	private static final String STATE = "NY";
	private static final String POSTAL_CODE = "12345";
	private static final String COUNTRY = "US";
	private static final String MOBILE = "123-456-7890";
	private static final int LOCATION_ID = 123456;
	private static final double LATITUDE = 40.7128;
	private static final double LONGITUDE = -74.0060;

	@Test
	void test() {
		Address address = new AddressBuilder<>()
			.address(ADDRESS)
			.city(CITY)
			.mobile(MOBILE)
			.location()
				.latitude(LATITUDE)
				.longitude(LONGITUDE)
				.country(COUNTRY)
				.locationId(LOCATION_ID)
				.done()
			.state(STATE)
			.postalCode(POSTAL_CODE)
			.build();
		
		assertEquals(ADDRESS, address.getAddress());
		assertEquals(CITY, address.getCity());
		assertEquals(MOBILE, address.getMobile());
		assertEquals(LOCATION_ID, address.getLocation().getLocationId());
		assertEquals(LATITUDE, address.getLocation().getLatitude());
		assertEquals(LONGITUDE, address.getLocation().getLongitude());
		assertEquals(COUNTRY, address.getLocation().getCountry());
		assertEquals(STATE, address.getState());
		assertEquals(POSTAL_CODE, address.getPostalCode());
	}
}
