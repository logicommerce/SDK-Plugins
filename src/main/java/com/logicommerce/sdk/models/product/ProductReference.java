package com.logicommerce.sdk.models.product;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>ProductReference interface. Identifies a product of the external source that is a candidate to be
 * imported or updated, together with the moment the source last modified it.</p>
 *
 * @author LogiCommerce
 * @since 2.8.0
 */
public interface ProductReference {

	/**
	 * <p>Get the identifier of the product in the external source.</p>
	 *
	 * @return a {@link String} object
	 */
	String getIdentifier();

	/**
	 * <p>Get the codes of the product in the external source.</p>
	 *
	 * @return a {@link List} of {@link String} objects
	 */
	List<String> getCodes();

	/**
	 * <p>Get the date on which the external source last modified the product. It is stored as the process
	 * date of the product, so the next execution only imports the products modified after it. When it is
	 * {@code null} the product is always imported.</p>
	 *
	 * @return a {@link LocalDateTime} object
	 */
	LocalDateTime getUpdatedAt();

}
