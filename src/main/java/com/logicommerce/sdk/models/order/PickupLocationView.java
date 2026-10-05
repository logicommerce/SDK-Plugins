package com.logicommerce.sdk.models.order;

/**
 * <p>The place a pickup order is collected at ({@link OrderView#getPhysicalLocation()}): a physical location of the
 * commerce, or a carrier's pickup point.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface PickupLocationView {

	/**
	 * Returns the physical location id.
	 *
	 * @return the id, or 0 for a carrier's pickup point
	 */
	int getPhysicalLocationId();

	/**
	 * Returns the location or pickup point name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the location address.
	 *
	 * @return the address, never null
	 */
	AddressView getAddress();

}
