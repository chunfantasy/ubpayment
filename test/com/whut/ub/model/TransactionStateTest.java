package com.whut.ub.model;

import org.junit.Test;

public class TransactionStateTest {
	@Test
	public TransactionState test(String number) {
		TransactionState td = new TransactionState();
		td.setNumber(number);
		return td;
	}
}
