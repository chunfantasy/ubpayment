package com.whut.ub.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.service.LoginService;

@SuppressWarnings("unchecked")
public class LoginAction {
	private String account;
	private String password;

	LoginService ls = new LoginService();

	public String execute() {
		if (login(account, password)) {
			Map session = ActionContext.getContext().getSession();
			session.put("account", account);
			return "login_success";
		} else
			return "failed";
	}

	public boolean login(String account, String password) {
		if (ls.login(account, password))
			return true;
		return false;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}