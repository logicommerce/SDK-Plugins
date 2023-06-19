package com.logicommerce.sdk.models.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

// @formatter:off
class FreeQueueMessageTest {

	private static final QueueMessageType TYPE = QueueMessageType.FREE;
	private static final String ACTION = "action_name";
	private static final int DELAY = 42;
	private static final int PRIORITY = 73;
	private static final int RETRY_COUNT = 38;
	private static final String ATTRIBUTE_NAME = "name";
	private static final AttributeType ATTRIBUTE_TYPE = AttributeType.STRING;
	private static final String ATTRIBUTE_VALUE = "value";

	@ParameterizedTest
	@MethodSource("getNullValues")
	void testBuildNullValues(FreeQueueMessage.Builder builder) {
		assertThrows(IllegalArgumentException.class, () -> builder.build());
	}

	static Stream<FreeQueueMessage.Builder> getNullValues() {
		return Stream.of(
			FreeQueueMessage.builder(),
			FreeQueueMessage.builder().action(ACTION).attribute().done(),
			FreeQueueMessage.builder().action(ACTION)
				.attribute().name(ATTRIBUTE_NAME).done(),
			FreeQueueMessage.builder().action(ACTION)
				.attribute().name(ATTRIBUTE_NAME).type(ATTRIBUTE_TYPE).done()
		);
	}

	@ParameterizedTest
	@MethodSource("getIllegalActions")
	void testBuildWithIllegalAction(String action) {
		assertThrows(IllegalArgumentException.class, () -> FreeQueueMessage.builder()
			.action(action)
			.settings(new Settings.Builder<>()
				.delay(DELAY)
				.priority(PRIORITY)
				.retryCount(RETRY_COUNT)
				.build())
			.attribute()
				.name(ATTRIBUTE_NAME)
				.type(ATTRIBUTE_TYPE)
				.value(ATTRIBUTE_VALUE)
				.done()
			.build());
	}

	static Stream<String> getIllegalActions() {
		return Stream.of("", " ", "action name", "$action", "action$", "a".repeat(101));
	}

	@Test
	void testBuildWithoutSettings() {
		QueueMessage message = FreeQueueMessage.builder()
			.action(ACTION)
			.attributes(Set.of(new Attribute.Builder<>()
				.name(ATTRIBUTE_NAME)
				.type(ATTRIBUTE_TYPE)
				.value(ATTRIBUTE_VALUE)
				.build()))
			.build();
		
		assertNotNull(message);
		assertNotNull(message.getSettings());
		assertEquals(0, message.getSettings().getDelay());
		assertEquals(0, message.getSettings().getPriority());
		assertEquals(0, message.getSettings().getRetryCount());
	}

	@Test
	void testSimpleBuildQueueMessage() {
		QueueMessage message = FreeQueueMessage.builder()
			.action(ACTION)
			.settings(new Settings.Builder<>()
				.delay(DELAY)
				.priority(PRIORITY)
				.retryCount(RETRY_COUNT)
				.build())
			.attributes(Set.of(
				new Attribute.Builder<>()
					.name(ATTRIBUTE_NAME)
					.type(ATTRIBUTE_TYPE)
					.value(ATTRIBUTE_VALUE)
					.build(),
				new Attribute.Builder<>()
					.name("name2")
					.type(AttributeType.STRING)
					.value("value2")
					.build()
				))
			.build();
		assertMessage(message);
	}

	@Test
	void testBuildQueueMessage() {
		QueueMessage message = FreeQueueMessage.builder()
			.action(ACTION)
			.settings()
				.delay(DELAY)
				.priority(PRIORITY)
				.retryCount(RETRY_COUNT)
				.done()
			.attribute()
				.name(ATTRIBUTE_NAME)
				.type(ATTRIBUTE_TYPE)
				.value(ATTRIBUTE_VALUE)
				.done()
			.attribute()
				.name("name2")
				.type(AttributeType.STRING)
				.value("value2")
				.done()
			.build();
		assertMessage(message);
	}

	private void assertMessage(QueueMessage message) {
		assertNotNull(message);

		assertEquals(TYPE, message.getType());
		assertEquals(ACTION, message.getAction());

		assertNotNull(message.getSettings());
		assertEquals(DELAY, message.getSettings().getDelay());
		assertEquals(PRIORITY, message.getSettings().getPriority());
		assertEquals(RETRY_COUNT, message.getSettings().getRetryCount());

		assertNotNull(message.getAttributes());
		assertEquals(2, message.getAttributes().size());

		Attribute attribute = message.getAttributes().stream()
			.filter(a -> ATTRIBUTE_NAME.equals(a.getName()))
			.findFirst()
			.orElse(null);
		assertNotNull(attribute);
		assertEquals(ATTRIBUTE_NAME, attribute.getName());
		assertEquals(ATTRIBUTE_TYPE, attribute.getType());
		assertEquals(ATTRIBUTE_VALUE, attribute.getValue());
	}
}
// @formatter:on
