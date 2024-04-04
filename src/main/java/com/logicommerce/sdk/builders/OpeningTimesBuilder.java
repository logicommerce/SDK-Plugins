package com.logicommerce.sdk.builders;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.OpeningTimes;
import com.logicommerce.sdk.models.PeriodTime;
import com.logicommerce.sdk.models.implementations.OpeningTimesImpl;

/**
 * <p>OpeningTimesBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.6
 */
public class OpeningTimesBuilder<T> {

	private T parentBuilder;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> mondayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> tuesdayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> wednesdayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> thursdayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> fridayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> saturdayPeriods;
	
	private List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> sundayPeriods;
	
	/**
	 * <p>Constructor for OpeningTimesBuilder.</p>
	 * 
	 */
	public OpeningTimesBuilder() {
		mondayPeriods = new ArrayList<>();
		tuesdayPeriods = new ArrayList<>();
		wednesdayPeriods = new ArrayList<>();
		thursdayPeriods = new ArrayList<>();
		fridayPeriods = new ArrayList<>();
		saturdayPeriods = new ArrayList<>();
		sundayPeriods = new ArrayList<>();
	}
	
	/**
	 * <p>Constructor for OpeningTimesBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OpeningTimesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>Monday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> monday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> monday = new PeriodTimeBuilder<>(this);
		mondayPeriods.add(monday);
		return monday;
	}
	
	/**
	 * <p>Tuesday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> tuesday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> tuesday = new PeriodTimeBuilder<>(this);
		this.tuesdayPeriods.add(tuesday);
		return tuesday;
	}
	
	/**
	 * <p>Wednesday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> wednesday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> wednesday = new PeriodTimeBuilder<>(this);
		this.wednesdayPeriods.add(wednesday);
		return wednesday;
	}
	
	/**
	 * <p>Thursday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> thursday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> thursday = new PeriodTimeBuilder<>(this);
		this.thursdayPeriods.add(thursday);
		return thursday;
	}
	
	/**
	 * <p>Friday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> friday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> friday = new PeriodTimeBuilder<>(this);
		this.fridayPeriods.add(friday);
		return friday;
	}
	
	/**
	 * <p>Saturday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> saturday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> saturday = new PeriodTimeBuilder<>(this);
		this.saturdayPeriods.add(saturday);
		return saturday;
	}
	
	/**
	 * <p>Sunday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> sunday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> sunday = new PeriodTimeBuilder<>(this);
		this.sundayPeriods.add(sunday);
		return sunday;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.OpeningTimes} object
	 */
	
	public OpeningTimes build() {
		OpeningTimesImpl openingTimes = new OpeningTimesImpl();
		openingTimes.setMonday(this.getPeriods(mondayPeriods));
		openingTimes.setTuesday(this.getPeriods(tuesdayPeriods));
		openingTimes.setWednesday(this.getPeriods(wednesdayPeriods));
		openingTimes.setThursday(this.getPeriods(thursdayPeriods));
		openingTimes.setFriday(this.getPeriods(fridayPeriods));
		openingTimes.setSaturday(this.getPeriods(saturdayPeriods));
		openingTimes.setSunday(this.getPeriods(sundayPeriods));
		return openingTimes;
	}
	
	private List<PeriodTime> getPeriods(List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> periods ) {
		return periods.stream()
				.map(PeriodTimeBuilder::build)
				.collect(Collectors.toList());
	}

	/**
	 * Returns the parent builder.
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
