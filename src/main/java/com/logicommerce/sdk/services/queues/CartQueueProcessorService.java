package com.logicommerce.sdk.services.queues;

import java.util.Set;
import com.logicommerce.sdk.models.Cart;
import com.logicommerce.sdk.models.queues.Attribute;
import com.logicommerce.sdk.services.PluginServiceException;

/**
 * Service to process order queue messages
 * 
 * @author LogiCommerce
 * @since 1.3.9
 */
public interface CartQueueProcessorService extends QueueProcessorService {

	/**
	 * Process the cart queue message
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set}&lt;{@link Attribute}&gt; object
	 * @param cart a {@link Cart} object
	 * 
	 * @throws PluginServiceException if an error occurs
	 */
	void process(String action, Set<Attribute> attributes, Cart cart) throws PluginServiceException;

}
