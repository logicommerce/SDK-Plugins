package com.logicommerce.sdk.models.validator;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ValidationResult;

/**
 * ViesValidationImpl
 *
 * @author LogiCommerce
 * @see ViesValidation
 * @since 2.7.6
 */
public class ViesValidationImpl implements ViesValidation {

	private ValidationResult validationResult;

	private LocalDateTime processedAt;

	private List<Message> messages;

	private ViesInformation viesInformation;

	/** {@inheritDoc} */
	@Override
	public ValidationResult getStatus() {
		return validationResult;
	}

	@Override
	public LocalDateTime getProcessedAt() {
		return processedAt;
	}

	/** {@inheritDoc} */
	@Override
	public List<Message> getMessages() {
		return messages;
	}

	/** {@inheritDoc} */
	@Override
	public ViesInformation getViesInformation() {
		return viesInformation;
	}

	public void setValidationResult(ValidationResult validationResult) {
		this.validationResult = validationResult;
	}

	public void setProcessedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public void setViesInformation(ViesInformation viesInformation) {
		this.viesInformation = viesInformation;
	}
}
