package com.logicommerce.sdk.models.validator;

/**
 * TaxIdInformation implementation
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public class TaxIdInformationImpl implements TaxIdInformation {

	private String taxIdCompact;

	private String taxIdStandard;

	/** {@inheritDoc} */
	@Override
	public String getTaxIdCompact() {
		return taxIdCompact;
	}

	/** {@inheritDoc} */
	@Override
	public String getTaxIdStandard() {
		return taxIdStandard;
	}

	public void setTaxIdCompact(String taxIdCompact) {
		this.taxIdCompact = taxIdCompact;
	}

	public void setTaxIdStandard(String taxIdStandard) {
		this.taxIdStandard = taxIdStandard;
	}
}
