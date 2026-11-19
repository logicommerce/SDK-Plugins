package com.logicommerce.sdk.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>Body of a multipart/form-data request. Part names can be repeated.</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public final class MultipartBody {

	/**
	 * Maximum size in bytes of a multipart body: the sum of the sizes of its parts.
	 */
	public static final int MAX_SIZE = 20 * 1024 * 1024;

	private final List<MultipartPart> parts = new ArrayList<>();

	/**
	 * <p>Adds a text part.</p>
	 *
	 * @param name a {@link String} object
	 * @param value a {@link String} object
	 * @return this {@link MultipartBody} object
	 */
	public MultipartBody text(String name, String value) {
		parts.add(MultipartPart.text(name, value));
		return this;
	}

	/**
	 * <p>Adds a file part.</p>
	 *
	 * @param name a {@link String} object
	 * @param fileName a {@link String} object
	 * @param contentType a {@link String} object, application/octet-stream is used when it is blank or invalid
	 * @param content a byte array
	 * @return this {@link MultipartBody} object
	 */
	public MultipartBody file(String name, String fileName, String contentType, byte[] content) {
		parts.add(MultipartPart.file(name, fileName, contentType, content));
		return this;
	}

	/**
	 * <p>Parts in the order they were added.</p>
	 *
	 * @return an unmodifiable {@link List} of {@link MultipartPart}
	 */
	public List<MultipartPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	/**
	 * <p>Sum of the sizes in bytes of the parts.</p>
	 *
	 * @return a long
	 */
	public long getSize() {
		return parts.stream().mapToLong(MultipartPart::size).sum();
	}

	/**
	 * <p>Whether the body has no parts.</p>
	 *
	 * @return a boolean
	 */
	public boolean isEmpty() {
		return parts.isEmpty();
	}

}
