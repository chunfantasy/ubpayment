package com.whut.ub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionState {
	private int id;
	private String number;
	private String time_buyer_pay;
	private String time_seller_deliver;
	private String time_buyer_receive;
	private String time_seller_getmoney;

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

	public String getTime_buyer_pay() {
		return time_buyer_pay;
	}

	public void setTime_buyer_pay(String timeBuyerPay) {
		time_buyer_pay = timeBuyerPay;
	}

	public String getTime_seller_deliver() {
		return time_seller_deliver;
	}

	public void setTime_seller_deliver(String timeSellerDeliver) {
		time_seller_deliver = timeSellerDeliver;
	}

	public String getTime_buyer_receive() {
		return time_buyer_receive;
	}

	public void setTime_buyer_receive(String timeBuyerReceive) {
		time_buyer_receive = timeBuyerReceive;
	}

	public String getTime_seller_getmoney() {
		return time_seller_getmoney;
	}

	public void setTime_seller_getmoney(String timeSellerGetmoney) {
		time_seller_getmoney = timeSellerGetmoney;
	}


}
