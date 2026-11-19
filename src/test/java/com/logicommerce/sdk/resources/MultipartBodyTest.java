package com.logicommerce.sdk.resources;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class MultipartBodyTest {

	@Test
	void keepsPartsInOrderWithRepeatedNames() {
		MultipartBody body = new MultipartBody()
			.text("body", "Hello")
			.file("attachments[]", "a.png", "image/png", new byte[] { 1 })
			.file("attachments[]", "b.pdf", "application/pdf", new byte[] { 2 });

		assertThat(body.getParts().stream().map(MultipartPart::name).toList(),
			contains("body", "attachments[]", "attachments[]"));
		assertThat(body.getParts().get(0).isFile(), is(false));
		assertThat(body.getParts().get(1).isFile(), is(true));
	}

	@Test
	void sizeSumsFileBytesAndUtf8TextBytes() {
		MultipartBody body = new MultipartBody()
			.text("body", "año")
			.file("attachments[]", "a.bin", null, new byte[10]);

		assertThat(body.getSize(), is(14L));
	}

	@Test
	void emptyBody() {
		MultipartBody body = new MultipartBody();

		assertThat(body.isEmpty(), is(true));
		assertThat(body.getSize(), is(0L));
	}

	@Test
	void partsAreUnmodifiable() {
		MultipartBody body = new MultipartBody().text("body", "Hello");

		assertThrows(UnsupportedOperationException.class, () -> body.getParts().clear());
	}

	@Test
	void rejectsNullValues() {
		MultipartBody body = new MultipartBody();

		assertThrows(NullPointerException.class, () -> body.text("body", null));
		assertThrows(NullPointerException.class, () -> body.file("attachments[]", null, "image/png", new byte[0]));
		assertThrows(NullPointerException.class, () -> body.file("attachments[]", "a.png", "image/png", null));
	}

}
