package com.logicommerce.sdk.models.user;

import com.logicommerce.sdk.enums.RegisteredUserAccountStatus;
import com.logicommerce.sdk.models.UserAddress;

/**
 * <p>The link between a {@link RegisteredUser} and one of its accounts ({@link RegisteredUser#getAccounts()}).</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public interface RegisteredUserAccount {

	/**
	 * Returns the id of the link between the registered user and the account. It is the user id of
	 * {@link com.logicommerce.sdk.models.User#getId()} and
	 * {@link com.logicommerce.sdk.models.queues.UserQueueMessage}.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the account id. It is the {@link com.logicommerce.sdk.models.order.list.OrderListParam#getUserId() user id}
	 * that lists the orders of the account.
	 *
	 * @return the account id
	 */
	int getAccountId();

	/**
	 * Returns whether the registered user is the master of the account.
	 *
	 * @return true when the registered user is the master of the account
	 */
	boolean isMaster();

	/**
	 * Returns the status of the registered user in the account.
	 *
	 * @return the status
	 */
	RegisteredUserAccountStatus getStatus();

	/**
	 * Returns the default invoicing address of the account, which holds its tax data
	 * ({@link UserAddress#getNif()}, {@link UserAddress#getVat()}) and its invoicing name
	 * ({@link UserAddress#getFirstName()}, {@link UserAddress#getLastName()}, {@link UserAddress#getCompany()}).
	 *
	 * @return the default invoicing address, or null when the account has none
	 */
	UserAddress getInvoicingAddress();

}
