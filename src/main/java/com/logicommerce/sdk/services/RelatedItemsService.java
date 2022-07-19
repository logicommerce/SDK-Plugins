package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.enums.RelatedItemType;
import com.logicommerce.sdk.models.Product;

/**
 * <p>RelatedItemsService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface RelatedItemsService extends PluginService {

	/**
	 * <p>getItems.</p>
	 *
	 * @param relatedItemType a {@link com.logicommerce.sdk.enums.RelatedItemType} object
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<Integer> getItems(RelatedItemType relatedItemType, Integer id) throws PluginServiceException;
	
	/**
	 * <p>getItems.</p>
	 *
	 * @param relatedItemType a {@link com.logicommerce.sdk.enums.RelatedItemType} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<Integer> getItems(RelatedItemType relatedItemType) throws PluginServiceException;
	
	/**
	 * <p>updateProducts.</p>
	 *
	 * @param products a {@link java.util.List} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<Product> updateProducts(List<Product> products) throws PluginServiceException;

}
