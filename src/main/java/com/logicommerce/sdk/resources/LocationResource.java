package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.Location;

/**
 * The LocationResource interface provides methods to retrieve information about locations.
 * 
 * @author Logicommerce
 * @since 1.0.16
 */
public interface LocationResource {

	/**
	 * Retrieves a list of locations based on the language, country, and location IDs.
	 *
	 * @param languageId The ID of the language.
	 * @param countryId The ID of the country.
	 * @param parentLocationId The ID of the parent location.
	 * @return A list of {@link Location} objects.
	 */
	List<Location> getLocationsPath(Integer languageId, Integer countryId, Integer parentLocationId);

	/**
	 * Retrieves a list of locations based on the language, country, and postal code.
	 *
	 * @since 1.3.5
	 * 
	 * @param languageCode The language code.
	 * @param countryCode The country code.
	 * @param postalCode The postal code.
	 * @return A list of {@link Location} objects.
	 */
	List<Location> getLocations(String languageCode, String countryCode, String postalCode);

	/**
	 * Retrieves the country ID based on the country code.
	 *
	 * @param countryCode The country code.
	 * @return The country ID.
	 */
	Integer getCountryId(String countryCode);

	/**
	 * Retrieves the country name based on the country code.
	 *
	 * @param countryCode The country code.
	 * @return The country name.
	 */
	String getCountryName(String countryCode);

	/**
	 * Retrieves the country code based on the country ID.
	 *
	 * @param countryId The country ID.
	 * @return The country code.
	 */
	String getCountryCode(Integer countryId);

	/**
	 * Retrieves the state code based on the language, country, and location IDs.
	 *
	 * @param languageId The ID of the language.
	 * @param countryId The ID of the country.
	 * @param locationId The ID of the location.
	 * @return The state code.
	 */
	String getStateCode(Integer languageId, Integer countryId, Integer locationId);

	/**
	 * Retrieves the state name based on the language, country, and location IDs.
	 *
	 * @param languageId The ID of the language.
	 * @param countryId The ID of the country.
	 * @param locationId The ID of the location.
	 * @return The state name.
	 */
	String getStateName(Integer languageId, Integer countryId, Integer locationId);

	/**
	 * Retrieves the language code based on the language ID.
	 *
	 * @param languageId The language ID.
	 * @return The language code.
	 */
	String getLanguageCode(Integer languageId);

	/**
	 * Retrieves the language ID based on the language code.
	 *
	 * @param languageCode The language code.
	 * @return The language ID.
	 */
	Integer getLanguageId(String languageCode);

}
