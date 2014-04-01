package com.whut.ub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class TradingFlow {
	private int id;
	private String number;
	private String account_debit;
	private String account_credit;
	private int amount;
	private String time;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccount_debit() {
		return account_debit;
	}

	public void setAccount_debit(String accountDebit) {
		account_debit = accountDebit;
	}

	public String getAccount_credit() {
		return account_credit;
	}

	public void setAccount_credit(String accountCredit) {
		account_credit = accountCredit;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
