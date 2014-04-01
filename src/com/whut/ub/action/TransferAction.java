package com.whut.ub.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.service.LoginService;

@SuppressWarnings("unchecked")
public class TransferAction {
	private String account;

	LoginService ls = new LoginService();

	public String execute() {
		Map session = ActionContext.getContext().getSession();
		account = (String)session.get("account");
		return "transfer";
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}