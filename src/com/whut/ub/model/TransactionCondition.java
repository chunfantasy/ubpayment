package com.whut.ub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionCondition {
	private int id;
	private String number;
	private int buyer_pay;
	private int seller_deliver;
	private int buyer_receive;
	private int seller_getmoney;
	private int refund_apply;
	private int refund_agree;
	private int evaluation_buyer;
	private int evaluation_seller;
	private int closed;

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

	public int getBuyer_pay() {
		return buyer_pay;
	}

	public void setBuyer_pay(int buyerPay) {
		buyer_pay = buyerPay;
	}

	public int getSeller_deliver() {
		return seller_deliver;
	}

	public void setSeller_deliver(int sellerDeliver) {
		seller_deliver = sellerDeliver;
	}

	public int getSeller_getmoney() {
		return seller_getmoney;
	}

	public void setSeller_getmoney(int sellerGetmoney) {
		seller_getmoney = sellerGetmoney;
	}

	public int getRefund_apply() {
		return refund_apply;
	}

	public void setRefund_apply(int refundApply) {
		refund_apply = refundApply;
	}

	public int getRefund_agree() {
		return refund_agree;
	}

	public void setRefund_agree(int refundAgree) {
		refund_agree = refundAgree;
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

	public int getClosed() {
		return closed;
	}

	public void setClosed(int closed) {
		this.closed = closed;
	}

	public int getBuyer_receive() {
		return buyer_receive;
	}

	public void setBuyer_receive(int buyerReceive) {
		buyer_receive = buyerReceive;
	}

}