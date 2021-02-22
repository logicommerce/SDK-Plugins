package com.logicommerce.sdk;

public interface LanguageValue<T> {

	T getValue(String language);

	void setValue(String language, T value);

}
