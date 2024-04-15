package com.logicommerce.sdk.models.implementations;

import java.util.List;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodTime;

/**
 * <p>OpeningTimesImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.7
 */
public class OpeningTimesImpl implements OpeningTimes {

	private List<PeriodTime> monday;
	
	private List<PeriodTime> tuesday;
	
	private List<PeriodTime> wednesday;
	
	private List<PeriodTime> thursday;
	
	private List<PeriodTime> friday;
	
	private List<PeriodTime> saturday;
	
	private List<PeriodTime> sunday;

	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getMonday() {
		return monday;
	}

	/**
	 * <p>Setter for the field <code>monday</code>.</p>
	 *
	 * @param monday a {@link java.lang.String} object
	 */
	public void setMonday(List<PeriodTime> monday) {
		this.monday = monday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getTuesday() {
		return tuesday;
	}

	/**
	 * <p>Setter for the field <code>tuesday</code>.</p>
	 *
	 * @param tuesday a {@link java.lang.String} object
	 */
	public void setTuesday(List<PeriodTime> tuesday) {
		this.tuesday = tuesday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getWednesday() {
		return wednesday;
	}

	/**
	 * <p>Setter for the field <code>wednesday</code>.</p>
	 *
	 * @param wednesday a {@link java.lang.String} object
	 */
	public void setWednesday(List<PeriodTime> wednesday) {
		this.wednesday = wednesday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getThursday() {
		return thursday;
	}

	/**
	 * <p>Setter for the field <code>thursday</code>.</p>
	 *
	 * @param thursday a {@link java.lang.String} object
	 */
	public void setThursday(List<PeriodTime> thursday) {
		this.thursday = thursday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getFriday() {
		return friday;
	}

	/**
	 * <p>Setter for the field <code>friday</code>.</p>
	 *
	 * @param friday a {@link java.lang.String} object
	 */
	public void setFriday(List<PeriodTime> friday) {
		this.friday = friday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getSaturday() {
		return saturday;
	}

	/**
	 * <p>Setter for the field <code>saturday</code>.</p>
	 *
	 * @param saturday a {@link java.lang.String} object
	 */
	public void setSaturday(List<PeriodTime> saturday) {
		this.saturday = saturday;
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PeriodTime> getSunday() {
		return sunday;
	}
	
	/**
	 * <p>Setter for the field <code>sunday</code>.</p>
	 *
	 * @param sunday a {@link java.lang.String} object
	 */
	public void setSunday(List<PeriodTime> sunday) {
		this.sunday = sunday;
	}
}
