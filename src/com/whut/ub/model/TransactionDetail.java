package com.whut.ub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionDetail {
	private int id;
	private String number;
	private String account_buyer;
	private String account_seller;
	private String number_order;
	private int amount;
	private String mode;
	private String state;
	private String time_start;
	private String time_end;
	private int evaluation_buyer;
	private int evaluation_seller;
	private String credit_buyer;
	private String credit_seller;

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

	public String getAccount_buyer() {
		return account_buyer;
	}

	public void setAccount_buyer(String accountBuyer) {
		account_buyer = accountBuyer;
	}

	public String getAccount_seller() {
		return account_seller;
	}

	public void setAccount_seller(String accountSeller) {
		account_seller = accountSeller;
	}

	public String getNumber_order() {
		return number_order;
	}

	public void setNumber_order(String numberOrder) {
		number_order = numberOrder;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String timeStart) {
		time_start = timeStart;
	}

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String timeEnd) {
		time_end = timeEnd;
	}

	public int getEvaluation_buyer() {
		return evaluation_buyer;
	}

	public void setEvaluation_buyer(int evaluationBuyer) {
		evaluation_buyer = evaluationBuyer;
	}

	public int getEvaluation_seller() {
		return evaluation_seller;
	}

	public void setEvaluation_seller(int evaluationSeller) {
		evaluation_seller = evaluationSeller;
	}

	public String getCredit_buyer() {
		return credit_buyer;
	}

	public void setCredit_buyer(String creditBuyer) {
		credit_buyer = creditBuyer;
	}

	public String getCredit_seller() {
		return credit_seller;
	}

	public void setCredit_seller(String creditSeller) {
		credit_seller = creditSeller;
	}

}
