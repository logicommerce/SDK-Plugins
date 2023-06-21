package com.logicommerce.sdk.models.queues;

/**
 * Settings for the message
 * 
 * @see FreeQueueMessage
 * @author LogiCommerce
 * @since 1.2.0
 */
public class Settings {

	private static final int MIN_DELAY = 0;
	private static final int MAX_DELAY = 900;
	private static final int MIN_RETRY_COUNT = 0;
	private static final int MAX_RETRY_COUNT = 10;
	private static final int MIN_INTERVAL = 0;
	private static final int MAX_INTERVAL = 900;

	private final int delay;
	private final int retryCount;
	private final int interval;


	/**
	 * Settings constructor
	 *
	 * @param retryCount a {@link int} object
	 * @param delay a {@link int} object
	 * @param interval a {@link int} object
	 */
	public Settings(int delay, int retryCount, int interval) {
		Validator.validateRange("Delay", delay, MIN_DELAY, MAX_DELAY);
		Validator.validateRange("Retry count", retryCount, MIN_RETRY_COUNT, MAX_RETRY_COUNT);
		Validator.validateRange("Interval", interval, MIN_INTERVAL, MAX_INTERVAL);

		this.delay = delay;
		this.retryCount = retryCount;
		this.interval = interval;
	}

	/**
	 * Returns the delay of the message in seconds
	 * @return a {@link int} object
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * Returns the retry count of the message
	 * @return a {@link int} object
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * Returns the interval of the message in seconds
	 * @return a {@link int} object
	 */
	public int getInterval() {
		return interval;
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
		private int delay;
		private int retryCount;
		private int interval;

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
		 * <p>Sets the delay of the message in seconds. The delay is the time in seconds that the 
		 * message will be available for processing by the queue consumer.</p>
		 * The default value is 0 and the range is 0 to 900 seconds.
		 * 
		 * @param delay a int in seconds
		 * @return a {@link Builder} object
		 */
		public Builder<T> delay(int delay) {
			this.delay = delay;
			return this;
		}

		/**
		 * <p>Sets the retry count of the message. The retry count is the number of times the 
		 * message will be retried if it fails to be processed by the queue consumer.</p>
		 * The default value is 0 and the range is 0 to 10.
		 * 
		 * @param retryCount a int
		 * @return a {@link Builder} object
		 */
		public Builder<T> retryCount(int retryCount) {
			this.retryCount = retryCount;
			return this;
		}

		/**
		 * <p>Sets the interval of the message in seconds. The interval is the time in seconds that 
		 * the message will be retried if it fails to be processed by the queue consumer.</p>
		 * The default value is 0 and the range is 0 to 900 seconds.
		 * 
		 * @param interval a int in seconds
		 * @return a {@link Builder} object
		 */
		public Builder<T> interval(int interval) {
			this.interval = interval;
			return this;
		}

		/**
		 * Builds the {@link Settings} object
		 * @return a {@link Settings} object
		 */
		public Settings build() {
			return new Settings(delay, retryCount, interval);
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
