package com.logicommerce.sdk.models.payment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;
import com.logicommerce.sdk.enums.PaymentValidateStatusType;
import org.junit.jupiter.api.Test;

class PaymentValidateResponseTest {

	private static final String MESSAGE = "message";
	private static final String TRANSACTION_ID = "transactionId";
	private static final String AUTH_CODE = "authCode";
	private static final String URL = "url";
	private static final String PARAM_NAME = "paramName";
	private static final String PARAM_VALUE = "paramValue";
	private static final boolean PAID = true;
	private static final LocalDateTime PAYMENT_DATE = LocalDateTime.now();

	@Test
	void testDenied() {
		PaymentValidateResponse response = new PaymentValidateResponseBuilder()
				.ko()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(response, is(not(nullValue())));
		assertThat(response.getStatus(), is(PaymentValidateStatusType.KO));
		assertThat(response.getMessage(), is(MESSAGE));
		assertThat(response.getTransactionId(), is(TRANSACTION_ID));
		assertThat(response.getType(), is(nullValue()));
		assertThat(response.getData(), is(nullValue()));
	}

	@Test
	void testOkNoData() {
		PaymentValidateResponse response = new PaymentValidateResponseBuilder()
				.ok()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.authorizationCode(AUTH_CODE)
				.paid(PAID)
				.paymentDate(PAYMENT_DATE)
				.noData()
				.build();

		assertThat(response, is(not(nullValue())));
		assertThat(response.getStatus(), is(PaymentValidateStatusType.OK));
		assertThat(response.getMessage(), is(MESSAGE));
		assertThat(response.getTransactionId(), is(TRANSACTION_ID));
		assertThat(response.getAuthorizationCode(), is(AUTH_CODE));
		assertThat(response.isPaid(), is(PAID));
		assertThat(response.getPaymentDate(), is(PAYMENT_DATE));
		assertThat(response.getType(), is(PaymentValidateResponseType.NO_DATA));
		assertThat(response.getData(), is(nullValue()));
	}

	@Test
	void testOkForm() {
		PaymentValidateResponse response = new PaymentValidateResponseBuilder()
				.ko()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.authorizationCode(AUTH_CODE)
				.paid(PAID)
				.paymentDate(PAYMENT_DATE)
				.orderStatus()
					.status(OrderStatusType.INCOMING)
					.substatus(0)
					.done()
				.form()
					.post()
					.url(URL)
					.param(PARAM_NAME, PARAM_VALUE)
					.done()
				.build();

		assertThat(response, is(not(nullValue())));
		assertThat(response.getType(), is(PaymentValidateResponseType.FORM));
		assertThat(response.getData(), instanceOf(PaymentDataForm.class));
		assertThat(response.getStatus(), is(PaymentValidateStatusType.KO));

		PaymentDataForm data = (PaymentDataForm) response.getData();
		assertThat(data.getUrl(), is(URL));
		assertThat(data.getMethod(), is("post"));
		assertThat(data.getParams(), hasSize(1));
		assertThat(data.getParams().get(0).getName(), is(PARAM_NAME));
		assertThat(data.getParams().get(0).getValue(), is(PARAM_VALUE));
	}

	@Test
	void testTypeMessage() {
		PaymentValidateResponse response = new PaymentValidateResponseBuilder()
				.ok()
				.webhookMessage()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(response, is(not(nullValue())));
		assertThat(response.getType(), is(PaymentValidateResponseType.WEBHOOK_MESSAGE));
		assertThat(response.getMessage(), is(MESSAGE));
		assertThat(response.getTransactionId(), is(TRANSACTION_ID));
		assertThat(response.getData(), is(nullValue()));
	}

	@Test
	void testValidated() {
		PaymentValidateResponse response = new PaymentValidateResponseBuilder()
				.validated()
				.build();

		assertThat(response, is(not(nullValue())));
		assertThat(response.getStatus(), is(PaymentValidateStatusType.VALIDATED));
	}
}
