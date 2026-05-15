package com.logicommerce.sdk.models.validator;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ValidationResult;

/**
 * Validation model
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public interface Validation {

	/**
	 *  get validation status of the validation
	 * @return {@link ValidationResult}
	 */
	ValidationResult getStatus();
	
	/**
	 * Get processedAt with ISO-8601 ("YYYY-MM-DDTHH:mm:ss") format.
	 *
	 * @return a {@link LocalDateTime LocalDateTime} object
	 */
	LocalDateTime getProcessedAt();

	/**
	 *  get messages of the validation
	 * @return List of {@link Message}
	 */
	List<Message> getMessages();
}
