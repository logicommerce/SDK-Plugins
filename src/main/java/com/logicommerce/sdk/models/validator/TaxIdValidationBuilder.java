package com.logicommerce.sdk.models.validator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ValidationResult;

/**
 * TaxIdValidation builder
 *
 * @author LogiCommerce
 * @see TaxIdValidation
 * @since 2.7.5
 */
public class TaxIdValidationBuilder {

	private ValidationResult validationResult;

	private LocalDateTime processedAt;

	private List<Message> messages;

	private boolean blocking;

	private TaxIdInformation taxIdInformation;

	/**
	 * Sets the validation result.
	 * @param validationResult {@link ValidationResult}
	 * @return a {@link TaxIdValidationBuilder} object
	 */
	public TaxIdValidationBuilder validationResult(ValidationResult validationResult) {
		this.validationResult = validationResult;
		return this;
	}

	/**
	 * Sets processedAt with ISO-8601 ("YYYY-MM-DDTHH:mm:ss") format.
	 * @param processedAt a {@link LocalDateTime}
	 * @return a {@link TaxIdValidationBuilder} object
	 */
	public TaxIdValidationBuilder processedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
		return this;
	}

	/**
	 * Sets the list of messages.
	 * @param messages a {@link List} of {@link Message}
	 * @return a {@link TaxIdValidationBuilder} object
	 */
	public TaxIdValidationBuilder messages(List<Message> messages) {
		this.messages = messages;
		return this;
	}

	/**
	 * Starts a nested {@link MessageBuilder} that adds the message to this builder on {@code done()}.
	 * @return a nested {@link MessageBuilder}
	 */
	public MessageBuilder<TaxIdValidationBuilder> addMessage() {
		return new MessageBuilder<>(this, msg -> {
			if (messages == null) {
				messages = new ArrayList<>();
			}
			messages.add(msg);
		});
	}

	/**
	 * Sets whether the validation is blocking.
	 * @param blocking a boolean
	 * @return a {@link TaxIdValidationBuilder} object
	 */
	public TaxIdValidationBuilder blocking(boolean blocking) {
		this.blocking = blocking;
		return this;
	}

	/**
	 * Sets a pre-built {@link TaxIdInformation} object.
	 * @param taxIdInformation a {@link TaxIdInformation}
	 * @return a {@link TaxIdValidationBuilder} object
	 */
	public TaxIdValidationBuilder taxIdInformation(TaxIdInformation taxIdInformation) {
		this.taxIdInformation = taxIdInformation;
		return this;
	}

	/**
	 * Starts a nested {@link TaxIdInformationBuilder}. Call {@code done()} to return here.
	 * @return a nested {@link TaxIdInformationBuilder}
	 */
	public TaxIdInformationBuilder taxIdInformation() {
		return new TaxIdInformationBuilder(this);
	}

	/**
	 * Builds a {@link TaxIdValidationImpl} object.
	 * @return a {@link TaxIdValidation} object
	 */
	public TaxIdValidation build() {
		TaxIdValidationImpl taxIdValidation = new TaxIdValidationImpl();
		taxIdValidation.setValidationResult(validationResult);
		taxIdValidation.setProcessedAt(processedAt);
		taxIdValidation.setMessages(messages);
		taxIdValidation.setBlocking(blocking);
		taxIdValidation.setTaxIdInformation(taxIdInformation);
		return taxIdValidation;
	}
}
