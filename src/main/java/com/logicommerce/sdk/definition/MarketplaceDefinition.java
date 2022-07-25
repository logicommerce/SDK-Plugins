package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.models.Carrier;
import com.logicommerce.sdk.models.Marketplace;

/**
 * <p>MarketplaceDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface MarketplaceDefinition extends ConnectorDefinition {
	
	/**
	 * <p>getMarketplaces.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<Marketplace> getMarketplaces();
	
	/**
	 * <p>getShippers.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<Carrier> getShippers();
	
	/**
	 * <p>setMarketplaces.</p>
	 *
	 * @param marketplaces a {@link java.util.List} object
	 */
	void setMarketplaces(List<Marketplace> marketplaces);

	/**
	 * <p>setShippers.</p>
	 *
	 * @param shippers a {@link java.util.List} object
	 */
	void setShippers(List<Carrier> shippers);

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.MARKETPLACE;
	}

}
