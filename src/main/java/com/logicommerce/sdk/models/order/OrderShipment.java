package com.logicommerce.sdk.models.order;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;

/**
 * <p>OrderShipment interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShipment {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getStatus();

	/**
	 * <p>setStatus.</p>
	 *
	 * @param status a {@link java.lang.String} object
	 */
	void setStatus(String status);

	/**
	 * <p>getOriginAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	ShipmentAddress getOriginAddress();

	/**
	 * <p>getDestinationAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	ShipmentAddress getDestinationAddress();
	
	/**
	 * <p>getDestinationUserAddress.</p>
	 * 
	 * @since 1.3.12
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	ShipmentAddress getDestinationUserAddress();

	/**
	 * <p>getIncomingDate.</p>
	 *
	 * @return a {@link java.time.LocalDate} object
	 */
	LocalDate getIncomingDate();

	/**
	 * <p>getItems.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderShipmentItem> getItems();

	/**
	 * <p>getStatuses.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderShipmentStatus> getStatuses();

	/**
	 * <p>getShipping.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipping} object
	 */
	OrderShipping getShipping();

	/**
	 * <p>getExportStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	ExportStatusType getExportStatus();

	/**
	 * <p>getHash.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getHash();

	/**
	 * <p>getTrackingNumber.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTrackingNumber();

	/**
	 * <p>setTrackingNumber.</p>
	 *
	 * @param trackingNumber a {@link java.lang.String} object
	 */
	void setTrackingNumber(String trackingNumber);

	/**
	 * <p>getTrackingUrl.</p>
	 * @since 1.2.3
	 * 
	 * @return a {@link java.lang.String} object
	 */
	String getTrackingUrl();

	/**
	 * <p>setTrackingUrl.</p>
	 * @since 1.2.3
	 * 
	 * @param trackingUrl a {@link java.lang.String} object
	 */
	void setTrackingUrl(String trackingUrl);

	/**
	 * <p>getDocumentNumber.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDocumentNumber();

	/**
	 * <p>getSubstatus.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getSubstatus();

	/**
	 * <p>getProviderPickupPoint.</p>
	 * @since 1.3.8
	 * 
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	DocumentProviderPickupPoint getProviderPickupPoint();

	/**
	 * <p>setProviderPickupPoint.</p>
	 * @since 1.3.8
	 * 
	 * @param providerPickupPoint a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	void setProviderPickupPoint(DocumentProviderPickupPoint providerPickupPoint);

}
