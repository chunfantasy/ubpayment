package com.whut.ub.service;

import org.junit.Test;

public class TransactionDetailDServiceTest {

	@Test
	public void testDodsp() {
		TransactionDetailDService tdds = new TransactionDetailDService();
		tdds.dodsp("0000000000");
	}

}
