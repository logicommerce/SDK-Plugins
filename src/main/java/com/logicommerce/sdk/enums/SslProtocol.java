package com.logicommerce.sdk.enums;

public enum SslProtocol {

	TLS("TLS"),
	TLS_V1_3("TLSv1.3"),
	TLS_V1_2("TLSv1.2"),
	TLS_V1_1("TLSv1.1"),
	TLS_V1_0("TLSv1"),
	SSL_V3("SSLv3"),
	SSL_V2("SSLv2"),
	SSL("SSL"),
	DTLS("DTLS"),
	DTLS_V1_2("DTLSv1.2");

	private final String value;

	private SslProtocol(String value) {
		this.value = value;
	}

	public String get() {
		return value;
	}

}
