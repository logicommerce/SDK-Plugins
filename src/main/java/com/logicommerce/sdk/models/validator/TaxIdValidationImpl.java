package com.logicommerce.sdk.models.validator;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ValidationResult;

/**
 * TaxIdValidation implementation
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public class TaxIdValidationImpl implements TaxIdValidation {

	private ValidationResult validationResult;

	private LocalDateTime processedAt;

	private List<Message> messages;

	private boolean blocking;

	private TaxIdInformation taxIdInformation;

	/** {@inheritDoc} */
	@Override
	public ValidationResult getStatus() {
		return validationResult;
	}

	/** {@inheritDoc} */
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
	public boolean isBlocking() {
		return blocking;
	}

	/** {@inheritDoc} */
	@Override
	public TaxIdInformation getTaxIdInformation() {
		return taxIdInformation;
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

	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}

	public void setTaxIdInformation(TaxIdInformation taxIdInformation) {
		this.taxIdInformation = taxIdInformation;
	}
}
