package com.whut.ub.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.whut.ub.dao.AccountFileDao;
import com.whut.ub.dao.TradingFlowDao;
import com.whut.ub.dao.TransactionConditionDao;
import com.whut.ub.dao.TransactionDetailDao;
import com.whut.ub.dao.TransactionStateDao;

public class TransactionDetailCService {
	public TransactionDetailCService() {

	}

	public boolean docsd(String number) {
		TransactionConditionDao tcd = new TransactionConditionDao();
		tcd.doseller_deliver(number);

		TransactionStateDao tsd = new TransactionStateDao();
		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "";
		time = df.format(dt);
		tsd.doseller_deliver(number, time);

		TransactionDetailDao tdd = new TransactionDetailDao();
		tdd.docsd(number);

		tcd.commit();
		tdd.commit();
		tsd.commit();

		return true;
	}

	public boolean docdr(String number) {
		TransactionConditionDao tcd = new TransactionConditionDao();
		tcd.dobuyer_receive(number);

		TransactionStateDao tsd = new TransactionStateDao();
		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "";
		time = df.format(dt);
		tsd.dobuyer_receive(number, time);

		TransactionDetailDao tdd = new TransactionDetailDao();
		tdd.docdr(number);

		tcd.commit();
		tdd.commit();
		tsd.commit();
		return true;
	}

	public boolean docrp(String number) {
		TransactionConditionDao tcd = new TransactionConditionDao();
		tcd.dobuyer_pay(number);

		TransactionStateDao tsd = new TransactionStateDao();
		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "";
		time = df.format(dt);
		tsd.dobuyer_pay(number, time);

		TransactionDetailDao tdd = new TransactionDetailDao();
		tdd.docrp(number);

		AccountFileDao afd = new AccountFileDao();
		TradingFlowDao tfd = new TradingFlowDao();
		String account_debit = tdd.showlist(number).get(0).getAccount_seller();
		String account_credit = tdd.showlist(number).get(0).getAccount_buyer();
		int amount = tdd.showlist(number).get(0).getAmount();

		// 流水账
		tfd.record(account_debit, account_credit, amount);
		// 转账
		boolean b = afd.transfer(account_credit, account_debit, amount);
		if (b) {
			afd.commit();
			tfd.commit();
			tcd.commit();
			tdd.commit();
			tsd.commit();
		} else {
			afd.rollback();
			tfd.rollback();
			tcd.rollback();
			tdd.rollback();
			tsd.rollback();
		}
		return b;
	}
}
