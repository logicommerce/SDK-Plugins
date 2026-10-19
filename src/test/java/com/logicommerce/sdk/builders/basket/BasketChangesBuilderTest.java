package com.logicommerce.sdk.builders.basket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.models.basket.BasketChanges;
import com.logicommerce.sdk.models.basket.BasketContext;
import com.logicommerce.sdk.models.basket.RowChange;

class BasketChangesBuilderTest {

	@Test
	void emptyChangesLeaveEverythingUnchanged() {
		BasketChanges changes = new BasketChangesBuilder().build();

		assertNull(changes.getRows());
		assertNull(changes.getVoucherCodes());
		assertNull(changes.getCustomer());
		assertNull(changes.getCountryCode());
		assertNull(changes.getLanguageCode());
		assertNull(changes.getCurrencyHint());
		assertNull(changes.getStorage());
	}

	@Test
	void buildsEveryField() {
		RowChange row = new RowChangeBuilder().rowHash("abc").productId(12).optionValueIds(List.of(5, 3)).quantity(2).build();
		BasketChanges changes = new BasketChangesBuilder()
			.rows(List.of(row))
			.voucherCodes(List.of("SUMMER"))
			.customer(new CustomerChangeBuilder().email("customer@example.com").firstName("Ada").build())
			.countryCode("ES")
			.languageCode("es")
			.currencyHint("EUR")
			.storage(Map.of("ucp_checkout_id", "chk_1"))
			.build();

		assertEquals(1, changes.getRows().size());
		RowChange built = changes.getRows().get(0);
		assertEquals("abc", built.getRowHash());
		assertEquals(12, built.getProductId());
		assertEquals(List.of(5, 3), built.getOptionValueIds());
		assertEquals(2, built.getQuantity());
		assertEquals(List.of("SUMMER"), changes.getVoucherCodes());
		assertEquals("customer@example.com", changes.getCustomer().getEmail());
		assertEquals("Ada", changes.getCustomer().getFirstName());
		assertNull(changes.getCustomer().getLastName());
		assertEquals("ES", changes.getCountryCode());
		assertEquals("es", changes.getLanguageCode());
		assertEquals("EUR", changes.getCurrencyHint());
		assertEquals("chk_1", changes.getStorage().get("ucp_checkout_id"));
	}

	@Test
	void emptyRowsRemoveEveryRow() {
		BasketChanges changes = new BasketChangesBuilder().rows(List.of()).build();

		assertTrue(changes.getRows().isEmpty());
	}

	@Test
	void copiesTheCollectionsItIsGiven() {
		List<String> codes = new ArrayList<>(List.of("A"));
		Map<String, String> storage = new HashMap<>(Map.of("k", "v"));
		BasketChanges changes = new BasketChangesBuilder().voucherCodes(codes).storage(storage).build();
		codes.add("B");
		storage.put("k2", "v2");

		assertEquals(List.of("A"), changes.getVoucherCodes());
		assertEquals(Map.of("k", "v"), changes.getStorage());
		assertThrows(UnsupportedOperationException.class, () -> changes.getVoucherCodes().add("C"));
	}

	@Test
	void rowWithoutOptionsHasAnEmptyList() {
		RowChange row = new RowChangeBuilder().productId(7).optionValueIds(null).quantity(1).build();

		assertNull(row.getRowHash());
		assertTrue(row.getOptionValueIds().isEmpty());
	}

	@Test
	void rowRejectsNonPositiveValues() {
		assertThrows(IllegalArgumentException.class, () -> new RowChangeBuilder().productId(0).quantity(1).build());
		assertThrows(IllegalArgumentException.class, () -> new RowChangeBuilder().productId(1).quantity(0).build());
	}

	@Test
	void rejectsNullElements() {
		List<RowChange> rows = new ArrayList<>();
		rows.add(null);
		List<String> codes = new ArrayList<>(List.of("A"));
		codes.add(null);
		Map<String, String> nullValue = new HashMap<>();
		nullValue.put("k", null);
		Map<String, String> nullKey = new HashMap<>();
		nullKey.put(null, "v");
		List<Integer> values = new ArrayList<>(List.of(1));
		values.add(null);

		assertThrows(IllegalArgumentException.class, () -> new BasketChangesBuilder().rows(rows).build());
		assertThrows(IllegalArgumentException.class, () -> new BasketChangesBuilder().voucherCodes(codes).build());
		assertThrows(IllegalArgumentException.class, () -> new BasketChangesBuilder().storage(nullValue).build());
		assertThrows(IllegalArgumentException.class, () -> new BasketChangesBuilder().storage(nullKey).build());
		assertThrows(IllegalArgumentException.class,
			() -> new RowChangeBuilder().productId(1).optionValueIds(values).quantity(1).build());
	}

	@Test
	void buildsTheContext() {
		BasketContext context = new BasketContextBuilder()
			.countryCode("FR")
			.languageCode("fr")
			.currencyHint("EUR")
			.client(new ClientInfoBuilder().userAgent("agent/1.0").ip("192.0.2.1").build())
			.build();

		assertEquals("FR", context.getCountryCode());
		assertEquals("fr", context.getLanguageCode());
		assertEquals("EUR", context.getCurrencyHint());
		assertEquals("agent/1.0", context.getClient().getUserAgent());
		assertEquals("192.0.2.1", context.getClient().getIp());
	}

}
