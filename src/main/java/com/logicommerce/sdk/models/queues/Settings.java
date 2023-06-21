package com.logicommerce.sdk.models.queues;

/**
 * Settings for the message
 * 
 * @see FreeQueueMessage
 * @author LogiCommerce
 * @since 1.2.0
 */
public class Settings {

	private final int retryCount;
	private final int delay;

	/**
	 * Settings constructor
	 *
	 * @param retryCount a {@link int} object
	 * @param delay a {@link int} object
	 * @param priority a {@link int} object
	 */
	public Settings(int retryCount, int delay) {
		validate(retryCount, delay);
		this.retryCount = retryCount;
		this.delay = delay;
	}

	private void validate(int retryCount, int delay) {
		if (retryCount < 0) {
			Validator.raiseError("Retry count must be greater than or equal to 0");
		}
		if (retryCount > 10) {
			Validator.raiseError("Retry count must be less than or equal to 10");
		}
		if (delay < 0) {
			Validator.raiseError("Delay must be greater than or equal to 0");
		}
		if (delay > 900) {
			Validator.raiseError("Delay must be less than or equal to 900");
		}
	}

	/**
	 * Returns the retry count of the message
	 * @return a {@link int} object
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * Returns the delay of the message in seconds
	 * @return a {@link int} object
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * Returns a new {@link Builder} object
	 * @return a {@link Builder} object
	 */
	public static Builder<?> builder() {
		return new Builder<>();
	}

	/**
	 * Builder for {@link Settings}
	 */
	public static final class Builder<T extends QueueMessageBuilder<T>> {

		private T parent;
		private int retryCount;
		private int delay;

		/**
		 * Builder constructor
		 */
		public Builder() {}

		/**
		 * Builder constructor
		 * @param parent a T object
		 */
		public Builder(T parent) {
			this.parent = parent;
		}

		/**
		 * Sets the retry count of the message
		 * @param retryCount a int
		 * @return a {@link Builder} object
		 */
		public Builder<T> retryCount(int retryCount) {
			this.retryCount = retryCount;
			return this;
		}

		/**
		 * Sets the delay of the message in seconds
		 * @param delay a int in seconds
		 * @return a {@link Builder} object
		 */
		public Builder<T> delay(int delay) {
			this.delay = delay;
			return this;
		}


		/**
		 * Builds the {@link Settings} object
		 * @return a {@link Settings} object
		 */
		public Settings build() {
			return new Settings(retryCount, delay);
		}

		/**
		 * Returns the parent object
		 * @return T
		 */
		public T done() {
			Validator.validateNotNull("Parent", parent);
			return parent;
		}
	}

}
