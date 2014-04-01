package com.whut.ub.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.whut.ub.model.TradingFlow;

public class TradingFlowDao extends MyDaoSupport {

	TradingFlow tf = new TradingFlow();

	public void record(String account_debit, String account_credit, int amount) {

		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "";
		time = df.format(dt);

		tf.setAccount_debit(account_debit);
		tf.setAccount_credit(account_credit);
		tf.setAmount(amount);
		tf.setTime(time);
		save(tf);
	}

}
