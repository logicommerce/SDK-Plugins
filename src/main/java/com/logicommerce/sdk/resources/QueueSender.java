package com.logicommerce.sdk.resources;

import com.logicommerce.sdk.models.queues.QueueMessage;

/**
 * Sender for queue messages
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public interface QueueSender {

	void send(QueueMessage message);

}
