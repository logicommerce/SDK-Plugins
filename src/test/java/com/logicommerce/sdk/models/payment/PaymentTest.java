package com.logicommerce.sdk.models.payment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.logicommerce.sdk.enums.PaymentType;
import org.junit.jupiter.api.Test;

class PaymentTest {

	private static final boolean SUCCESSFUL = true;
	private static final boolean FAILURE = false;
	private static final String MESSAGE = "message";
	private static final String TRANSACTION_ID = "transactionId";
	private static final String URL = "url";
	private static final String PARAM_NAME = "paramName";
	private static final String PARAM_VALUE = "paramValue";

	@Test
	void testOfflineOK() {
		Payment payment = new PaymentBuilder()
				.ok()
				.offline()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(payment, is(not(nullValue())));
		assertThat(payment.getMessage(), is(MESSAGE));
		assertThat(payment.isSuccess(), is(SUCCESSFUL));
		assertThat(payment.getTransactionId(), is(TRANSACTION_ID));
		assertThat(payment.getData(), is(nullValue()));
		assertThat(payment.getType(), is(PaymentType.OFFLINE));
	}

	@Test
	void testWidgetOK() {
		Payment payment = new PaymentBuilder()
				.ok()
				.widget()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(payment, is(not(nullValue())));
		assertThat(payment.getMessage(), is(MESSAGE));
		assertThat(payment.isSuccess(), is(SUCCESSFUL));
		assertThat(payment.getTransactionId(), is(TRANSACTION_ID));
		assertThat(payment.getData(), is(nullValue()));
		assertThat(payment.getType(), is(PaymentType.WIDGET));
	}


	@Test
	void testNoPayOK() {
		Payment payment = new PaymentBuilder()
				.ok()
				.noPay().done()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(payment, is(not(nullValue())));
		assertThat(payment.getMessage(), is(MESSAGE));
		assertThat(payment.isSuccess(), is(SUCCESSFUL));
		assertThat(payment.getTransactionId(), is(TRANSACTION_ID));
		assertThat(payment.getData(), is(notNullValue()));
		assertThat(payment.getData(), instanceOf(PaymentDataNoPay.class));
		assertThat(payment.getType(), is(PaymentType.NO_PAY));
	}

	@Test
	void testFormKO() {
		Payment payment = new PaymentBuilder()
				.ko()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.build();

		assertThat(payment, is(not(nullValue())));
		assertThat(payment.getMessage(), is(MESSAGE));
		assertThat(payment.isSuccess(), is(FAILURE));
		assertThat(payment.getTransactionId(), is(TRANSACTION_ID));
		assertThat(payment.getData(), is(nullValue()));
		assertThat(payment.getType(), is(nullValue()));
	}

	@Test
	void testFormOK() {
		Payment payment = new PaymentBuilder()
				.ok()
				.message(MESSAGE)
				.transactionId(TRANSACTION_ID)
				.form()
					.post()
					.url(URL)
					.param(PARAM_NAME, PARAM_VALUE)
					.done()
				.build();

		assertThat(payment, is(not(nullValue())));
		assertThat(payment.getMessage(), is(MESSAGE));
		assertThat(payment.isSuccess(), is(SUCCESSFUL));
		assertThat(payment.getTransactionId(), is(TRANSACTION_ID));
		assertThat(payment.getData(), is(not(nullValue())));
		assertThat(payment.getData(), instanceOf(PaymentDataForm.class));
		assertThat(payment.getType(), is(PaymentType.FORM));

		PaymentDataForm data = (PaymentDataForm) payment.getData();
		assertThat(data.getUrl(), is(URL));
		assertThat(data.getMethod(), is("post"));
		assertThat(data.getParams(), hasSize(1));
		assertThat(data.getParams().get(0).getName(), is(PARAM_NAME));
		assertThat(data.getParams().get(0).getValue(), is(PARAM_VALUE));
	}

}
