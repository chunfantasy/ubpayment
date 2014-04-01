package com.whut.ub.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.model.TransactionDetail;
import com.whut.ub.service.TransactionDetailCService;

public class TransactionDetailCAction {
	private TransactionDetail td = null;
	private String account = null;
	private String message = null;
	private String action = null;
	private int id;
	TransactionDetailCService tdcs = new TransactionDetailCService();

	@SuppressWarnings("unchecked")
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		td = (TransactionDetail) session.get("td");
		id = td.getId();
		setAccount((String) session.get("account"));
		setAction("detail?id=" + id);

		if (td.getState().equals("csd")) {
			if (tdcs.docsd(td.getNumber()))
				setMessage("success");
			else
				setMessage("error");
			return "message";
		}

		else if (td.getState().equals("cdr")) {
			if (tdcs.docdr(td.getNumber()))
				setMessage("success");
			else
				setMessage("error");
			return "message";
		}

		else if (td.getState().equals("crp")) {
			if (tdcs.docrp(td.getNumber()))
				setMessage("success");
			else
				setMessage("moneyless");
			return "message";
		}

		else if (td.getState().equals("cpg")) {

			return "cpg";
		}
		return "error";
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
