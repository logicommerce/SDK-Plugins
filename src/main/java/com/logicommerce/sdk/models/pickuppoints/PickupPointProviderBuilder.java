package com.logicommerce.sdk.models.pickuppoints;

import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.implementations.DefinitionLanguagesImpl;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public class PickupPointProviderBuilder {
	
	private String code;
	
	private DefinitionLanguages name;
	
	private DefinitionLanguages description;

	private DefinitionLanguagesImpl.Builder<PickupPointProviderBuilder> nameBuilder;
	
	private DefinitionLanguagesImpl.Builder<PickupPointProviderBuilder> descriptionBuilder;
	
	private String logo;
	
	private String url;
	
	/**
	 * <p>code</p>
	 *
	 * @param code a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProviderBuilder} object
	 */
	public PickupPointProviderBuilder code(String code) {
		this.code = code;
		return returnThis();
	}

	/**
	 * <p>logo</p>
	 *
	 * @param logo a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProviderBuilder} object
	 */
	public PickupPointProviderBuilder logo(String logo) {
		this.logo = logo;
		return returnThis();
	}

	/**
	 * <p>url</p>
	 *
	 * @param url a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProviderBuilder} object
	 */
	public PickupPointProviderBuilder url(String url) {
		this.url = url;
		return returnThis();
	}
	
	/**
	 * <p>return DefninitionLanguages builder for name</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.implementations.DefinitionLanguagesImpl.Builder} object
	 */	
	public DefinitionLanguagesImpl.Builder<PickupPointProviderBuilder> name() {
		if (nameBuilder == null) {
			nameBuilder = new DefinitionLanguagesImpl.Builder<>(returnThis());
		}
		return nameBuilder;
	}
	
	/**
	 * <p>name</p>
	 *
	 * @param name a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProviderBuilder} object
	 */
	public PickupPointProviderBuilder name(DefinitionLanguages name) {
		this.name = name;		
		return returnThis();
	}
	
	/**
	 * <p>return DefninitionLanguages builder for description</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.implementations.DefinitionLanguagesImpl.Builder} object
	 */
	public DefinitionLanguagesImpl.Builder<PickupPointProviderBuilder> description() {
		if (descriptionBuilder == null) {
			descriptionBuilder = new DefinitionLanguagesImpl.Builder<>(returnThis());
		}
		return descriptionBuilder;
	}
	
	/**
	 * <p>description</p>
	 *
	 * @param description a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProviderBuilder} object
	 */
	public PickupPointProviderBuilder description(DefinitionLanguages description) {
		this.description = description;		
		return returnThis();
	}
	
	private void setName(PickupPointProviderImpl pickupPointProvider) {
		if (name != null) {
			pickupPointProvider.setName(name);
		} else if (nameBuilder != null) {
			pickupPointProvider.setName(nameBuilder.build());
		}
	}
	
	
	private void setDescription(PickupPointProviderImpl pickupPointProvider) {
		if (description != null) {
			pickupPointProvider.setName(description);
		} else if (nameBuilder != null) {
			pickupPointProvider.setName(descriptionBuilder.build());
		}
	}

	/**
	 * <p>builder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointProvider} object
	 */
	public PickupPointProvider build() {
		PickupPointProviderImpl pickupPointProvider = new PickupPointProviderImpl();
		pickupPointProvider.setCode(code);
		this.setName(pickupPointProvider);
		this.setDescription(pickupPointProvider);
		pickupPointProvider.setLogo(logo);
		pickupPointProvider.setUrl(url);
		return pickupPointProvider;
	}

	public PickupPointProviderBuilder returnThis() {
		return this;
	}
	
}