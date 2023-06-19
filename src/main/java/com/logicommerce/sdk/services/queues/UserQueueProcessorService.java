package com.logicommerce.sdk.services.queues;

import java.util.Set;
import com.logicommerce.sdk.models.User;
import com.logicommerce.sdk.models.queues.Attribute;
import com.logicommerce.sdk.services.PluginServiceException;

/**
 * Service to process user queue messages
 * 
 * @Author LogiCommerce
 * @since 1.2.0
 */
public interface UserQueueProcessorService extends QueueProcessorService {

	/**
	 * Process the user queue message
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set}&lt;{@link Attribute}&gt; object
	 * @param user a {@link User} object
	 * 
	 * @throws PluginServiceException if an error occurs
	 */
	void process(String action, Set<Attribute> attributes, User user) throws PluginServiceException;

}
