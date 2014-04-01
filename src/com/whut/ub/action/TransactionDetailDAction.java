package com.whut.ub.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.model.TransactionDetail;
import com.whut.ub.service.TransactionDetailDService;

public class TransactionDetailDAction {
	private TransactionDetail td = null;
	private String account = null;
	private String message = null;
	private String action = null;
	private int id;
	TransactionDetailDService tdds = new TransactionDetailDService();

	@SuppressWarnings("unchecked")
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		td = (TransactionDetail) session.get("td");
		id = td.getId();
		setAccount((String) session.get("account"));
		setAction("detail?id=" + id);

		if (td.getState().equals("dsp")) {
			if (tdds.dodsp(td.getNumber()))
				setMessage("success");
			else
				setMessage("moneyless");
			return "message";
		}

		else if (td.getState().equals("dpd")) {
			if (tdds.dodpd(td.getNumber()))
				setMessage("success");
			else
				setMessage("error");
			return "message";
		}

		else if (td.getState().equals("ddr")) {
			if (tdds.doddr(td.getNumber()))
				setMessage("success");
			else
				setMessage("error");
			return "message";
		}

		else if (td.getState().equals("drg")) {

			return "drg";
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
