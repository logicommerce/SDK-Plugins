package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.Location;

/**
 * <p>LocationResource interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface LocationResource {

	/**
	 * <p>getLocationsPath.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @param countryId a {@link java.lang.Integer} object
	 * @param locationId a {@link java.lang.Integer} object
	 * @return a {@link java.util.List} object
	 */
	List<Location> getLocationsPath(Integer languageId, Integer countryId, Integer locationId);

	/**
	 * <p>getCountryId.</p>
	 *
	 * @param countryCode a {@link java.lang.String} object
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getCountryId(String countryCode);

	/**
	 * <p>getCountryName.</p>
	 *
	 * @param countryCode a {@link java.lang.String} object
	 * @return a {@link java.lang.String} object
	 */
	String getCountryName(String countryCode);
	
	/**
	 * <p>getCountryCode.</p>
	 *
	 * @param countryId a {@link java.lang.Integer} object
	 * @return a {@link java.lang.String} object
	 */
	String getCountryCode(Integer countryId);

	/**
	 * <p>getStateCode.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @param countryId a {@link java.lang.Integer} object
	 * @param locationId a {@link java.lang.Integer} object
	 * @return a {@link java.lang.String} object
	 */
	String getStateCode(Integer languageId, Integer countryId, Integer locationId);

	/**
	 * <p>getStateName.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @param countryId a {@link java.lang.Integer} object
	 * @param locationId a {@link java.lang.Integer} object
	 * @return a {@link java.lang.String} object
	 */
	String getStateName(Integer languageId, Integer countryId, Integer locationId);

	/**
	 * <p>getLanguageCode.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link java.lang.String} object
	 */
	String getLanguageCode(Integer languageId);

	/**
	 * <p>getLanguageId.</p>
	 *
	 * @param languageCode a {@link java.lang.String} object
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getLanguageId(String languageCode);
}
