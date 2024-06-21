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
 * @since 1.3.7
 */
public class OpeningTimesBuilder<T> {

	private T parentBuilder;

	private List<PeriodTime> monday;

	private List<PeriodTime> tuesday;
	
	private List<PeriodTime> wednesday;
	
	private List<PeriodTime> thursday;
	
	private List<PeriodTime> friday;
	
	private List<PeriodTime> saturday;
	
	private List<PeriodTime> sunday;
	
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
		monday = new ArrayList<>();
		tuesday = new ArrayList<>();
		wednesday = new ArrayList<>();
		thursday = new ArrayList<>();
		friday = new ArrayList<>();
		saturday = new ArrayList<>();
		sunday = new ArrayList<>();
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
		PeriodTimeBuilder<OpeningTimesBuilder<T>> mondayPeriod = new PeriodTimeBuilder<>(this);
		mondayPeriods.add(mondayPeriod);
		return mondayPeriod;
	}
	
	/**
	 * <p>Monday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> monday(PeriodTime periodTime) {
		monday.add(periodTime);
		return this;
	}
	
	/**
	 * <p>Tuesday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> tuesday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> tuesdayPeriod = new PeriodTimeBuilder<>(this);
		this.tuesdayPeriods.add(tuesdayPeriod);
		return tuesdayPeriod;
	}

	/**
	 * <p>Tuesday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> tuesday(PeriodTime periodTime) {
		tuesday.add(periodTime);
		return this;
	}

	/**
	 * <p>Wednesday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> wednesday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> wednesdayPeriod = new PeriodTimeBuilder<>(this);
		this.wednesdayPeriods.add(wednesdayPeriod);
		return wednesdayPeriod;
	}

	/**
	 * <p>Wednesday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> wednesday(PeriodTime periodTime) {
		wednesday.add(periodTime);
		return this;
	}

	/**
	 * <p>Thursday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> thursday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> thursdayPeriod = new PeriodTimeBuilder<>(this);
		this.thursdayPeriods.add(thursdayPeriod);
		return thursdayPeriod;
	}

	/**
	 * <p>Thursday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> thursday(PeriodTime periodTime) {
		thursday.add(periodTime);
		return this;
	}

	/**
	 * <p>Friday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> friday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> fridayPeriod = new PeriodTimeBuilder<>(this);
		this.fridayPeriods.add(fridayPeriod);
		return fridayPeriod;
	}

	/**
	 * <p>Friday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> friday(PeriodTime periodTime) {
		friday.add(periodTime);
		return this;
	}

	/**
	 * <p>Saturday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> saturday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> saturdayPeriod = new PeriodTimeBuilder<>(this);
		this.saturdayPeriods.add(saturdayPeriod);
		return saturdayPeriod;
	}

	/**
	 * <p>Saturday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> saturday(PeriodTime periodTime) {
		saturday.add(periodTime);
		return this;
	}

	/**
	 * <p>Sunday.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.PeriodTimeBuilder} object
	 */
	public PeriodTimeBuilder<OpeningTimesBuilder<T>> sunday() {
		PeriodTimeBuilder<OpeningTimesBuilder<T>> sundayPeriod = new PeriodTimeBuilder<>(this);
		this.sundayPeriods.add(sundayPeriod);
		return sundayPeriod;
	}

	/**
	 * <p>Sunday.</p>
	 *
	 * @param periodTime a {@link com.logicommerce.sdk.models.PeriodTime} object
	 * @return a {@link com.logicommerce.sdk.builders.OpeningTimesBuilder} object
	 */
	public OpeningTimesBuilder<T> sunday(PeriodTime periodTime) {
		sunday.add(periodTime);
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.OpeningTimes} object
	 */
	
	public OpeningTimes build() {
		OpeningTimesImpl openingTimes = new OpeningTimesImpl();
		openingTimes.setMonday(this.getPeriods(mondayPeriods, monday));
		openingTimes.setTuesday(this.getPeriods(tuesdayPeriods, tuesday));
		openingTimes.setWednesday(this.getPeriods(wednesdayPeriods, wednesday));
		openingTimes.setThursday(this.getPeriods(thursdayPeriods, thursday));
		openingTimes.setFriday(this.getPeriods(fridayPeriods, friday));
		openingTimes.setSaturday(this.getPeriods(saturdayPeriods, saturday));
		openingTimes.setSunday(this.getPeriods(sundayPeriods, sunday));
		return openingTimes;
	}
	
	private List<PeriodTime> getPeriods(List<PeriodTimeBuilder<OpeningTimesBuilder<T>>> periods, List<PeriodTime> dayPeriods) {
		List<PeriodTime> listPeriods = periods.stream()
			.map(PeriodTimeBuilder::build)
			.collect(Collectors.toList());
		listPeriods.addAll(dayPeriods);
		return listPeriods;
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
