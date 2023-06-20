package com.logicommerce.sdk.models.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.models.User;
import com.logicommerce.sdk.models.UserAddress;

class UserQueueMessageTest {

	@Test
	void testUserNotDefined() {
		assertThrows(IllegalArgumentException.class, () -> UserQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.build());
	}

	@Test
	void testUserDefined() {
		QueueMessage message = UserQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.user(getUser())
			.build();

		assertNotNull(message);
		assertEquals(QueueMessageType.USER, message.getType());
	}

	private User getUser() {
		return new User() {

			@Override
			public Integer getId() {
				return null;
			}

			@Override
			public String getEmail() {
				return null;
			}

			@Override
			public String getNick() {
				return null;
			}

			@Override
			public String getGender() {
				return null;
			}

			@Override
			public LocalDate getBirthday() {
				return null;
			}

			@Override
			public String getCompany() {
				return null;
			}

			@Override
			public Integer getSalesAgentId() {
				return null;
			}

			@Override
			public Boolean isSalesAgent() {
				return null;
			}

			@Override
			public List<UserAddress> getBillingAddresses() {
				return null;
			}

			@Override
			public List<UserAddress> getShippingAddresses() {
				return null;
			}

			@Override
			public Map<String, String> getCustomTags() {
				return null;
			}
			
		};
	}
}
