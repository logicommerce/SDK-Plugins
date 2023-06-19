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
	private final int priority;

	/**
	 * Settings constructor
	 *
	 * @param retryCount a {@link int} object
	 * @param delay a {@link int} object
	 * @param priority a {@link int} object
	 */
	public Settings(int retryCount, int delay, int priority) {
		this.retryCount = retryCount;
		this.delay = delay;
		this.priority = priority;
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
	 * Returns the priority of the message
	 * @return a {@link int} object
	 */
	public int getPriority() {
		return priority;
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
		private int priority;

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
		 * Sets the priority of the message
		 * @param priority a int
		 * @return a {@link Builder} object
		 */
		public Builder<T> priority(int priority) {
			this.priority = priority;
			return this;
		}

		/**
		 * Builds the {@link Settings} object
		 * @return a {@link Settings} object
		 */
		public Settings build() {
			return new Settings(retryCount, delay, priority);
		}

		/**
		 * Returns the parent object
		 * @return T
		 */
		public T done() {
			if (parent == null) {
				throw new IllegalStateException("parent cannot be null");
			}
			return parent;
		}
	}

}
