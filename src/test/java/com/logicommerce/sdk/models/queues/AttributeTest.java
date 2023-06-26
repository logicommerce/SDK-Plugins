package com.logicommerce.sdk.models.queues;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeTest {

	private static final int MAX_NAME_LENGTH = 32;
	private static final int MAX_VALUE_LENGTH = 256;

	@ParameterizedTest
	@MethodSource("getIllegalNames")
	void testBuilderIllegalName(String name) {
		assertThrows(IllegalArgumentException.class, () -> new Attribute.Builder<>()
			.name(name)
			.type(AttributeType.STRING)
			.value("value")
			.build());
	}

	static Stream<String> getIllegalNames() {
		return Stream.of(null, "", " ", "name name", "$name", "name$", "n".repeat(MAX_NAME_LENGTH + 1));
	}

	@ParameterizedTest
	@MethodSource("getIllegalValues")
	void testBuilderIllegalValue(String value) {
		assertThrows(IllegalArgumentException.class, () -> new Attribute.Builder<>()
			.name("name")
			.type(AttributeType.STRING)
			.value(value)
			.build());
	}

	static Stream<String> getIllegalValues() {
		return Stream.of(null, "", " ", "v".repeat(MAX_VALUE_LENGTH + 1));
	}

	@ParameterizedTest
	@MethodSource("getIllegalTypesValues")
	void testBuilderIllegalType(AttributeType type, Object value) {
		assertThrows(IllegalArgumentException.class, () -> new Attribute.Builder<>()
			.name("name")
			.type(type)
			.value(value)
			.build());
	}

	static Stream<Arguments> getIllegalTypesValues() {
		return Stream.of(
			Arguments.of(null, "value"),
			Arguments.of(AttributeType.STRING, null),

			Arguments.of(AttributeType.INTEGER, null),
			Arguments.of(AttributeType.INTEGER, "value"),
			Arguments.of(AttributeType.INTEGER, 42.0),
			Arguments.of(AttributeType.INTEGER, 42L),
			Arguments.of(AttributeType.INTEGER, 42.0f),
			Arguments.of(AttributeType.INTEGER, 42.0d),
			Arguments.of(AttributeType.INTEGER, true),
			Arguments.of(AttributeType.INTEGER, false),
			Arguments.of(AttributeType.INTEGER, new Object()),

			Arguments.of(AttributeType.DOUBLE, null),
			Arguments.of(AttributeType.DOUBLE, "value"),
			Arguments.of(AttributeType.DOUBLE, 42),
			Arguments.of(AttributeType.DOUBLE, 42L),
			Arguments.of(AttributeType.DOUBLE, 42.0f),
			Arguments.of(AttributeType.DOUBLE, true),
			Arguments.of(AttributeType.DOUBLE, false),
			Arguments.of(AttributeType.DOUBLE, new Object()),

			Arguments.of(AttributeType.BOOLEAN, null),
			Arguments.of(AttributeType.BOOLEAN, "value"),
			Arguments.of(AttributeType.BOOLEAN, 42),
			Arguments.of(AttributeType.BOOLEAN, 42L),
			Arguments.of(AttributeType.BOOLEAN, 42.0f),
			Arguments.of(AttributeType.BOOLEAN, 42.0d),
			Arguments.of(AttributeType.BOOLEAN, new Object())
		);
	}

	@ParameterizedTest
	@MethodSource("getLegalTypesValues")
	void testBuilderLegalType(AttributeType type, Object value) {
		assertDoesNotThrow(() -> new Attribute.Builder<>()
			.name("name")
			.type(type)
			.value(value)
			.build());
	}

	static Stream<Arguments> getLegalTypesValues() {
		return Stream.of(
			Arguments.of(AttributeType.STRING, "value"),
			Arguments.of(AttributeType.INTEGER, 42),
			Arguments.of(AttributeType.DOUBLE, 42.0d),
			Arguments.of(AttributeType.BOOLEAN, true),
			Arguments.of(AttributeType.BOOLEAN, false)
		);
	}


}
