package com.logicommerce.sdk.models.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.implementations.OrderImpl;

class OrderQueueMessageTest {

	private static final Integer ORDER_ID = 137;

	@Test
	void testOrderNotDefined() {
		assertThrows(IllegalArgumentException.class, () -> OrderQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.build());
	}

	@Test
	void testOrderDefined() {
		QueueMessage message = OrderQueueMessage.builder()
			.action("action")
			.attribute()
				.name("any")
				.type(AttributeType.STRING)
				.value("any")
				.done()
			.order(getOrder())
			.build();

		assertNotNull(message);
		assertEquals(QueueMessageType.ORDER, message.getType());
		assertEquals(ORDER_ID, ((OrderQueueMessage) message).getOrderId());
	}

	private Order getOrder() {
		OrderImpl order = new OrderImpl();
		order.setId(ORDER_ID);
		return order;
	}
}
