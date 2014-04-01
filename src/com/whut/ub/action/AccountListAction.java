package com.whut.ub.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.model.AccountFile;
import com.whut.ub.service.AccountListService;

@SuppressWarnings("unchecked")
public class AccountListAction {
	private String account;
	private List<AccountFile> list;
	
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		account = (String) session.get("account");
		setList(showlist(account));
		session = ActionContext.getContext().getSession();
		session.put("list", list);
		return "success";
	}

	public List<AccountFile> showlist(String account) {
		list = new AccountListService().showlist(account);
		return list;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public List<AccountFile> getList() {
		return list;
	}

	public void setList(List<AccountFile> list) {
		this.list = list;
	}

}