package com.logicommerce.sdk.resources;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * <p>Part of a multipart/form-data request body. It is either a text part or a file part.</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 * @param name the form field name
 * @param value the text value, null for file parts
 * @param fileName the file name, null for text parts
 * @param contentType the file content type, null for text parts
 * @param content the file content, null for text parts
 */
public record MultipartPart(String name, String value, String fileName, String contentType, byte[] content) {

	/**
	 * <p>Creates a text part.</p>
	 *
	 * @param name a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link MultipartPart} object
	 */
	public static MultipartPart text(String name, String value) {
		Objects.requireNonNull(name, "name");
		Objects.requireNonNull(value, "value");
		return new MultipartPart(name, value, null, null, null);
	}

	/**
	 * <p>Creates a file part.</p>
	 *
	 * @param name a {@link String} object
	 * @param fileName a {@link String} object
	 * @param contentType a {@link String} object, application/octet-stream is used when it is blank or invalid
	 * @param content a byte array
	 * @return a {@link MultipartPart} object
	 */
	public static MultipartPart file(String name, String fileName, String contentType, byte[] content) {
		Objects.requireNonNull(name, "name");
		Objects.requireNonNull(fileName, "fileName");
		Objects.requireNonNull(content, "content");
		return new MultipartPart(name, null, fileName, contentType, content);
	}

	/**
	 * <p>Whether the part is a file part.</p>
	 *
	 * @return a boolean
	 */
	public boolean isFile() {
		return content != null;
	}

	/**
	 * <p>Size in bytes of the part value or file content.</p>
	 *
	 * @return a long
	 */
	public long size() {
		if (isFile()) {
			return content.length;
		}
		return value.getBytes(StandardCharsets.UTF_8).length;
	}

}
