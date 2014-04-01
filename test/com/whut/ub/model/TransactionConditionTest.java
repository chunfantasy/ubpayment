package com.whut.ub.model;

import org.junit.Test;

public class TransactionConditionTest {
	@Test
	public TransactionCondition test(String number) {
		TransactionCondition tc = new TransactionCondition();
		
		tc.setNumber(number);
		tc.setBuyer_pay(0);
		tc.setBuyer_receive(0);
		tc.setSeller_getmoney(0);
		tc.setClosed(0);
		tc.setEvaluation_buyer(0);
		tc.setEvaluation_seller(0);
		tc.setRefund_apply(0);
		tc.setRefund_agree(0);
		tc.setSeller_deliver(0);
		
		return tc;
	}

	
}
