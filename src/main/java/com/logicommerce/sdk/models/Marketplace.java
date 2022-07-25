package com.logicommerce.sdk.models;

import java.util.List;
import java.util.Map;

/**
 * <p>Marketplace interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Marketplace {

	/**
	 * <p>getMarketplaceId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMarketplaceId();
	
	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();
	
	/**
	 * <p>getLogo.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getLogo();
	
	/**
	 * <p>getCarriers.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<Carrier> getCarriers();
	
	/**
	 * <p>getAdditionalData.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getAdditionalData();

}
