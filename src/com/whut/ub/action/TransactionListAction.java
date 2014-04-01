package com.whut.ub.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.model.TransactionDetail;
import com.whut.ub.service.TransactionListService;

@SuppressWarnings("unchecked")
public class TransactionListAction {
	private String account;
	private List<TransactionDetail> list;
	Map session = ActionContext.getContext().getSession();

	public String execute() {
		return "success";
	}

	public String list_buyer() {
		account = (String) session.get("account");
		list = new TransactionListService().showlist_buyer(account);
		session.put("list", list);
		return "list_buyer";
	}

	public String list_seller() {
		account = (String) session.get("account");
		list = new TransactionListService().showlist_seller(account);
		session.put("list", list);
		return "list_seller";
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public List<TransactionDetail> getList() {
		return list;
	}

	public void setList(List<TransactionDetail> list) {
		this.list = list;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

}
