package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.MappedItemType;

public interface MappedFieldDefinition {

	MappedItemType getType();

	List<String> getFields();

}
