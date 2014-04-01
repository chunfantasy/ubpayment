package com.whut.ub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AccountFile {
	private int id;
	private String account;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String name;
	private int balance;
	private String bank_certificate;
	private String account_certificate;
	private int credit_buyer;
	private int credit_seller;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBank_certificate() {
		return bank_certificate;
	}

	public void setBank_certificate(String bankCertificate) {
		bank_certificate = bankCertificate;
	}


	public String getAccount_certificate() {
		return account_certificate;
	}

	public void setAccount_certificate(String accountCertificate) {
		account_certificate = accountCertificate;
	}

	public int getCredit_buyer() {
		return credit_buyer;
	}

	public void setCredit_buyer(int creditBuyer) {
		credit_buyer = creditBuyer;
	}

	public int getCredit_seller() {
		return credit_seller;
	}

	public void setCredit_seller(int creditSeller) {
		credit_seller = creditSeller;
	}

}
