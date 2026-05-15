package com.logicommerce.sdk.models.validator;

/**
 * TaxIdInformation builder
 *
 * @author LogiCommerce
 * @see TaxIdInformation
 * @since 2.7.5
 */
public class TaxIdInformationBuilder {

	private TaxIdValidationBuilder parent;

	private String taxIdCompact;

	private String taxIdStandard;

	public TaxIdInformationBuilder() {}

	TaxIdInformationBuilder(TaxIdValidationBuilder parent) {
		this();
		this.parent = parent;
	}

	/**
	 * Sets the compact format of the taxId.
	 * @param taxIdCompact a String
	 * @return a {@link TaxIdInformationBuilder} object
	 */
	public TaxIdInformationBuilder taxIdCompact(String taxIdCompact) {
		this.taxIdCompact = taxIdCompact;
		return this;
	}

	/**
	 * Sets the standard format of the taxId.
	 * @param taxIdStandard a String
	 * @return a {@link TaxIdInformationBuilder} object
	 */
	public TaxIdInformationBuilder taxIdStandard(String taxIdStandard) {
		this.taxIdStandard = taxIdStandard;
		return this;
	}

	/**
	 * Finishes the nested builder and returns to the parent {@link TaxIdValidationBuilder}.
	 * @return the parent builder
	 */
	public TaxIdValidationBuilder done() {
		return parent.taxIdInformation(build());
	}

	/**
	 * Builds a {@link TaxIdInformationImpl} object.
	 * @return a {@link TaxIdInformation} object
	 */
	public TaxIdInformation build() {
		TaxIdInformationImpl taxIdInformation = new TaxIdInformationImpl();
		taxIdInformation.setTaxIdCompact(taxIdCompact);
		taxIdInformation.setTaxIdStandard(taxIdStandard);
		return taxIdInformation;
	}
}
