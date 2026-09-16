package com.logicommerce.sdk.models.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ProductSdkBuilderTest {

	private static final String PRODUCT_ID = "42";
	private static final int LANGUAGE_ID = 1;
	private static final String NAME = "T-Shirt";
	private static final String DESCRIPTION = "A short description";
	private static final String LONG_DESCRIPTION = "A much longer description";
	private static final String SMALL_IMAGE = "small.jpg";
	private static final String MEDIUM_IMAGE = "medium.jpg";
	private static final String LARGE_IMAGE = "large.jpg";
	private static final String ADDITIONAL_SMALL_IMAGE = "additional-small.jpg";
	private static final String CUSTOM_TAG_NAME = "color";
	private static final String CUSTOM_TAG_VALUE = "red";
	private static final String SELECTABLE_VALUE_KEY = "Red";
	private static final String SELECTABLE_VALUE_IMAGE = "red.png";
	private static final String SELECTABLE_VALUE_LABEL = "Vermell";
	private static final String GROUP_ID = "1";
	private static final String GROUP_NAME = "Display";
	private static final String PID = "PID-1";
	private static final String SKU = "SKU-1";
	private static final String JAN = "4901234567894";
	private static final String ISBN = "9783161484100";
	private static final String EAN = "5901234123457";
	private static final String UPC = "012345678905";
	private static final String MANUFACTURER_SKU = "MAN-SKU-1";
	private static final String BRAND_ID = "161";
	private static final String BRAND_NAME = "ASUS";
	private static final String CATEGORY_ID = "222";
	private static final String CATEGORY_NAME = "Pantallas para PC";

	@Test
	void testBuild() {
		Product product = new ProductSdkBuilder()
			.productId(PRODUCT_ID)
			.language(LANGUAGE_ID)
				.name(NAME)
				.description(DESCRIPTION)
				.longDescription(LONG_DESCRIPTION)
				.done()
			.images()
				.smallImage(SMALL_IMAGE)
				.mediumImage(MEDIUM_IMAGE)
				.largeImage(LARGE_IMAGE)
				.done()
			.additionalImage()
				.smallImage(ADDITIONAL_SMALL_IMAGE)
				.done()
			.customTag()
				.type(CustomTagType.SELECTOR)
				.filtrable(true)
				.searchable(true)
				.customTagGroup()
					.id(GROUP_ID)
					.language(LANGUAGE_ID)
						.name(GROUP_NAME)
						.done()
					.done()
				.language(LANGUAGE_ID)
					.name(CUSTOM_TAG_NAME)
					.value(CUSTOM_TAG_VALUE)
					.done()
				.selectableValue()
					.value(SELECTABLE_VALUE_KEY)
					.image(SELECTABLE_VALUE_IMAGE)
					.language(LANGUAGE_ID)
						.name(SELECTABLE_VALUE_LABEL)
						.done()
					.done()
				.done()
			.productCodes()
				.pId(PID)
				.sku(SKU)
				.jan(JAN)
				.isbn(ISBN)
				.ean(EAN)
				.upc(UPC)
				.manufacturerSku(MANUFACTURER_SKU)
				.done()
			.productBrand()
				.brandId(BRAND_ID)
				.language(LANGUAGE_ID)
					.name(BRAND_NAME)
					.done()
				.done()
			.productCategory()
				.categoryId(CATEGORY_ID)
				.language(LANGUAGE_ID)
					.name(CATEGORY_NAME)
					.done()
				.done()
			.build();

		assertEquals(PRODUCT_ID, product.getProductId());

		assertEquals(1, product.getLanguages().size());
		ProductLanguage language = product.getLanguages().get(LANGUAGE_ID);
		assertEquals(NAME, language.getName());
		assertEquals(DESCRIPTION, language.getDescription());
		assertEquals(LONG_DESCRIPTION, language.getLongDescription());

		ProductImage images = product.getImages();
		assertEquals(SMALL_IMAGE, images.getSmallImage());
		assertEquals(MEDIUM_IMAGE, images.getMediumImage());
		assertEquals(LARGE_IMAGE, images.getLargeImage());

		assertEquals(1, product.getAdditionalImages().size());
		assertEquals(ADDITIONAL_SMALL_IMAGE, product.getAdditionalImages().get(0).getSmallImage());

		assertEquals(1, product.getCustomTags().size());
		ProductCustomTag customTag = product.getCustomTags().get(0);
		assertEquals(CustomTagType.SELECTOR, customTag.getType());
		assertTrue(customTag.isFiltrable());
		assertTrue(customTag.isSearchable());
		CustomTagGroup customTagGroup = customTag.getCustomTagGroup();
		assertEquals(GROUP_ID, customTagGroup.getId());
		assertEquals(GROUP_NAME, customTagGroup.getLanguages().get(LANGUAGE_ID).getName());
		ProductCustomTagLanguage customTagLanguage = customTag.getLanguages().get(LANGUAGE_ID);
		assertEquals(CUSTOM_TAG_NAME, customTagLanguage.getName());
		assertEquals(CUSTOM_TAG_VALUE, customTagLanguage.getValue());

		assertEquals(1, customTag.getSelectableValues().size());
		CustomTagSelectableValue selectableValue = customTag.getSelectableValues().get(0);
		assertEquals(SELECTABLE_VALUE_KEY, selectableValue.getValue());
		assertEquals(SELECTABLE_VALUE_IMAGE, selectableValue.getImage());
		assertEquals(SELECTABLE_VALUE_LABEL, selectableValue.getLanguages().get(LANGUAGE_ID).getName());

		ProductCodes productCodes = product.getProductCodes();
		assertEquals(PID, productCodes.getPId());
		assertEquals(SKU, productCodes.getSku());
		assertEquals(JAN, productCodes.getJan());
		assertEquals(ISBN, productCodes.getIsbn());
		assertEquals(EAN, productCodes.getEan());
		assertEquals(UPC, productCodes.getUpc());
		assertEquals(MANUFACTURER_SKU, productCodes.getManufacturerSku());

		ProductBrand productBrand = product.getProductBrand();
		assertEquals(BRAND_ID, productBrand.getBrandId());
		assertEquals(BRAND_NAME, productBrand.getLanguages().get(LANGUAGE_ID).getName());

		ProductCategory productCategory = product.getProductCategory();
		assertEquals(CATEGORY_ID, productCategory.getCategoryId());
		assertEquals(CATEGORY_NAME, productCategory.getLanguages().get(LANGUAGE_ID).getName());
	}

	@Test
	void testBuildEmpty() {
		Product product = new ProductSdkBuilder().build();

		assertEquals(null, product.getProductId());
		assertTrue(product.getLanguages().isEmpty());
		assertTrue(product.getAdditionalImages().isEmpty());
		assertTrue(product.getCustomTags().isEmpty());
		assertNull(product.getProductCodes());
		assertNull(product.getProductBrand());
		assertNull(product.getProductCategory());
	}
}
