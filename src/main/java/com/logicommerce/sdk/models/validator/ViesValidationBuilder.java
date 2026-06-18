package com.logicommerce.sdk.models.validator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ValidationResult;

/**
 * ViesValidation builder
 *
 * @author LogiCommerce
 * @see ViesValidation
 * @since 2.7.6
 */
public class ViesValidationBuilder {

	private ValidationResult validationResult;

	private LocalDateTime processedAt;

	private List<Message> messages;

	private ViesInformation viesInformation;

	/**
	 * Sets the validation result.
	 * @param validationResult {@link ValidationResult}
	 * @return a {@link ViesValidationBuilder} object
	 */
	public ViesValidationBuilder validationResult(ValidationResult validationResult) {
		this.validationResult = validationResult;
		return this;
	}

	/**
	 * Sets processedAt with ISO-8601 ("YYYY-MM-DDTHH:mm:ss") format.
	 * @param processedAt a {@link LocalDateTime}
	 * @return a {@link ViesValidationBuilder} object
	 */
	public ViesValidationBuilder processedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
		return this;
	}

	/**
	 * Sets the list of messages.
	 * @param messages a {@link List} of {@link Message}
	 * @return a {@link ViesValidationBuilder} object
	 */
	public ViesValidationBuilder messages(List<Message> messages) {
		this.messages = messages;
		return this;
	}

	/**
	 * Starts a nested {@link MessageBuilder} that adds the message to this builder on {@code done()}.
	 * @return a nested {@link MessageBuilder}
	 */
	public MessageBuilder<ViesValidationBuilder> addMessage() {
		return new MessageBuilder<>(this, msg -> {
			if (messages == null) {
				messages = new ArrayList<>();
			}
			messages.add(msg);
		});
	}

	/**
	 * Sets a pre-built {@link ViesInformation} object.
	 * @param viesInformation a {@link ViesInformation}
	 * @return a {@link ViesValidationBuilder} object
	 */
	public ViesValidationBuilder viesInformation(ViesInformation viesInformation) {
		this.viesInformation = viesInformation;
		return this;
	}

	/**
	 * Starts a nested {@link ViesInformationBuilder}. Call {@code done()} to return here.
	 * @return a nested {@link ViesInformationBuilder}
	 */
	public ViesInformationBuilder viesInformation() {
		return new ViesInformationBuilder(this);
	}

	/**
	 * Builds a {@link ViesValidationImpl} object.
	 * @return a {@link ViesValidation} object
	 */
	public ViesValidation build() {
		ViesValidationImpl viesValidation = new ViesValidationImpl();
		viesValidation.setValidationResult(validationResult);
		viesValidation.setProcessedAt(processedAt);
		viesValidation.setMessages(messages);
		viesValidation.setViesInformation(viesInformation);
		return viesValidation;
	}
}
