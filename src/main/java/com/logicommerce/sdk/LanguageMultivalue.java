package com.logicommerce.sdk;

import java.util.List;

public interface LanguageMultivalue<T> extends LanguageValue<List<T>> {

	void addLanguageValue(String language, T value);

}
