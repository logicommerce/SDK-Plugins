package com.logicommerce.sdk.models.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.Gender;

/**
 * <p>A registered user of the commerce ({@link com.logicommerce.sdk.resources.UserResource#getUser(String)}): the
 * person, identified by its email, and the accounts it belongs to.</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public interface RegisteredUser {

	/**
	 * Returns the registered user id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the public id of the registered user.
	 *
	 * @return the public id, or null when it has none
	 */
	String getPId();

	/**
	 * Returns the email.
	 *
	 * @return the email
	 */
	String getEmail();

	/**
	 * Returns the username.
	 *
	 * @return the username, or null when it has none
	 */
	String getUsername();

	/**
	 * Returns the first name.
	 *
	 * @return the first name, never null
	 */
	String getFirstName();

	/**
	 * Returns the last name.
	 *
	 * @return the last name, never null
	 */
	String getLastName();

	/**
	 * Returns the gender.
	 *
	 * @return the gender, or null when it is not set
	 */
	Gender getGender();

	/**
	 * Returns the birthday.
	 *
	 * @return the birthday, or null when it is not set
	 */
	LocalDate getBirthday();

	/**
	 * Returns the date the registered user was created.
	 *
	 * @return the date added
	 */
	LocalDateTime getDateAdded();

	/**
	 * Returns the last date the registered user was used.
	 *
	 * @return the last used date, or null when it has never been used
	 */
	LocalDateTime getLastUsed();

	/**
	 * Returns the accounts the registered user belongs to, one entry per account, sorted by
	 * {@link RegisteredUserAccount#getId() id}.
	 *
	 * @return the accounts, never null
	 */
	List<RegisteredUserAccount> getAccounts();

}
