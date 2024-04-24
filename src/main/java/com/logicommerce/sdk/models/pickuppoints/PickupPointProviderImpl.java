package com.logicommerce.sdk.models.pickuppoints;

import com.logicommerce.sdk.definition.DefinitionLanguages;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public class PickupPointProviderImpl implements PickupPointProvider {
	
	private String code;
	
	private DefinitionLanguages name;
	
	private DefinitionLanguages description;
	
	private String logo;
	
	private String url;

	/** {@inheritDoc} */
	@Override
	public String getCode() {
		return code;
	}
	
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getName() {
		return name;
	}
	
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setName(DefinitionLanguages name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getDescription() {
		return description;
	}
	
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setDescription(DefinitionLanguages description) {
		this.description = description;
	}

	/** {@inheritDoc} */
	@Override
	public String getLogo() {
		return logo;
	}
	
	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link java.lang.String} object
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/** {@inheritDoc} */
	@Override
	public String getUrl() {
		return url;
	}
	
	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}
