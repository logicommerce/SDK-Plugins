package com.logicommerce.sdk.services.queues;

import java.util.Set;
import com.logicommerce.sdk.models.queues.Attribute;
import com.logicommerce.sdk.services.PluginServiceException;

/**
 * Service to process free queue messages
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public interface FreeQueueProcessorService extends QueueProcessorService {

	/**
	 * Process the free queue message
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set}&lt;{@link Attribute}&gt; object
	 * 
	 * @throws PluginServiceException if an error occurs
	 */
	void process(String action, Set<Attribute> attributes) throws PluginServiceException;

}
