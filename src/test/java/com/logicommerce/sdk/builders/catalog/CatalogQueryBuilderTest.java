package com.logicommerce.sdk.builders.catalog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.builders.basket.ClientInfoBuilder;
import com.logicommerce.sdk.models.catalog.CatalogContext;
import com.logicommerce.sdk.models.catalog.CatalogQuery;

class CatalogQueryBuilderTest {

	@Test
	void defaultsToTheFirstPage() {
		CatalogQuery query = new CatalogQueryBuilder().build();

		assertNull(query.getText());
		assertNull(query.getCategoryNamePaths());
		assertNull(query.getFromPrice());
		assertNull(query.getToPrice());
		assertNull(query.getPriceCurrencyCode());
		assertEquals(1, query.getPage());
		assertEquals(20, query.getPerPage());
	}

	@Test
	void buildsEveryField() {
		CatalogQuery query = new CatalogQueryBuilder()
			.text("shirt")
			.categoryNamePaths(List.of("Apparel > Shirts"))
			.fromPrice(1000L)
			.toPrice(5000L)
			.priceCurrencyCode("EUR")
			.page(3)
			.perPage(CatalogQuery.MAX_PER_PAGE)
			.build();

		assertEquals("shirt", query.getText());
		assertEquals(List.of("Apparel > Shirts"), query.getCategoryNamePaths());
		assertEquals(1000L, query.getFromPrice());
		assertEquals(5000L, query.getToPrice());
		assertEquals("EUR", query.getPriceCurrencyCode());
		assertEquals(3, query.getPage());
		assertEquals(100, query.getPerPage());
	}

	@Test
	void rejectsPagesOutOfRange() {
		assertThrows(IllegalArgumentException.class, () -> new CatalogQueryBuilder().page(0).build());
		assertThrows(IllegalArgumentException.class, () -> new CatalogQueryBuilder().perPage(0).build());
		assertThrows(IllegalArgumentException.class, () -> new CatalogQueryBuilder().perPage(101).build());
	}

	@Test
	void rejectsNullCategoryNamePaths() {
		List<String> paths = new ArrayList<>(List.of("Apparel"));
		paths.add(null);

		assertThrows(IllegalArgumentException.class, () -> new CatalogQueryBuilder().categoryNamePaths(paths).build());
	}

	@Test
	void buildsTheContext() {
		CatalogContext context = new CatalogContextBuilder()
			.countryCode("ES")
			.languageCode("es")
			.currencyHint("USD")
			.client(new ClientInfoBuilder().userAgent("agent/1.0").ip("192.0.2.1").build())
			.build();

		assertEquals("ES", context.getCountryCode());
		assertEquals("es", context.getLanguageCode());
		assertEquals("USD", context.getCurrencyHint());
		assertEquals("agent/1.0", context.getClient().getUserAgent());
		assertEquals("192.0.2.1", context.getClient().getIp());
	}

	@Test
	void contextWithoutClientHasNone() {
		assertNull(new CatalogContextBuilder().build().getClient());
	}

}
