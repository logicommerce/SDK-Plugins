package com.logicommerce.sdk.models.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FreeLargeQueueMessageTest {

	@Test
	void testBodyNotDefined() {
		assertThrows(IllegalArgumentException.class, () -> FreeLargeQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.build());
	}

	@ParameterizedTest
	@MethodSource("getIllegalBody")
	void testBodyWithIllegalValue(String body) {
		assertThrows(IllegalArgumentException.class, () -> FreeLargeQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.body(body)
			.build());
	}

	static String[] getIllegalBody() {
		return new String[] { "", " ", "a".repeat(1024 * 1024 + 1) };
	}

	@Test
	void testBodyDefined() {
		QueueMessage message = FreeLargeQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.body("body")
			.build();

		assertNotNull(message);
		assertEquals(QueueMessageType.FREE_LARGE, message.getType());
	}
}
