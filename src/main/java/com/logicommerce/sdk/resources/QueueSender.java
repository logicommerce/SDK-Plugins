package com.logicommerce.sdk.resources;

import com.logicommerce.sdk.models.queues.QueueMessage;

/**
 * Sender for queue messages
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public interface QueueSender {

	/**
	 * Send a message to a queue
	 * 
	 * @param message a {@link QueueMessage} object
	 * @throws PluginResourceException if any.
	 */
	void send(QueueMessage message) throws PluginResourceException;

}
