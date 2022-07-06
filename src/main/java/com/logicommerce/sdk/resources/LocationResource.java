package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.Location;

public interface LocationResource {

	List<Location> getLocationsPath(Integer languageId, Integer countryId, Integer locationId);

	Integer getCountryId(String countryCode);

	String getCountryName(String countryCode);

	String getCountryCode(Integer countryId);

	String getStateCode(Integer languageId, Integer countryId, Integer locationId);

	String getStateName(Integer languageId, Integer countryId, Integer locationId);

	String getLanguageCode(Integer languageId);

	Integer getLanguageId(String languageCode);
}