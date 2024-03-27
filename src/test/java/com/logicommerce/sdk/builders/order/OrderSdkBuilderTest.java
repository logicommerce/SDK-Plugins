package com.logicommerce.sdk.builders.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.OrderUser;

class OrderSdkBuilderTest {

	private static final String EMAIL = "email@domain.com";
	private static final String FIRST_NAME = "firstName";
	private static final String LAST_NAME = "lastName";
	private static final String NIF = "12345678A";
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
	void testBuild() {
		Order order = new OrderSdkBuilder()
			.user()
				.email(EMAIL)
				.billingAddress()
					.firstName(FIRST_NAME)
					.address(ADDRESS)
					.mobile(MOBILE)
					.lastName(LAST_NAME)
					.nif(NIF)
					.city(CITY)
					.state(STATE)
					.postalCode(POSTAL_CODE)
					.location()
						.locationId(LOCATION_ID)
						.country(COUNTRY)
						.latitude(LATITUDE)
						.longitude(LONGITUDE)
						.done()
					.done()
				.shippingAddress()
					.address(ADDRESS)
					.done()
				.done()
			.build();
		
		OrderUser user = order.getUser();
		assertEquals(EMAIL, user.getEmail());
		UserAddress billingAddress = user.getBillingAddress();
		assertEquals(ADDRESS, billingAddress.getAddress());
		assertEquals(MOBILE, billingAddress.getMobile());
		assertEquals(LOCATION_ID, billingAddress.getLocation().getLocationId());
		assertEquals(COUNTRY, billingAddress.getLocation().getCountry());
		assertEquals(LATITUDE, billingAddress.getLocation().getLatitude());
		assertEquals(LONGITUDE, billingAddress.getLocation().getLongitude());
		assertEquals(FIRST_NAME, billingAddress.getFirstName());
		assertEquals(CITY, billingAddress.getCity());
		assertEquals(STATE, billingAddress.getState());
		assertEquals(POSTAL_CODE, billingAddress.getPostalCode());
		assertEquals(ADDRESS, user.getShippingAddress().getAddress());

	}
}
