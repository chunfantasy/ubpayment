package com.whut.ub.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.whut.ub.model.TransactionDetail;
import com.whut.ub.service.TransactionDetailService;
@SuppressWarnings("unchecked")
public class TransactionDetailAction {
	private List<TransactionDetail> list;
	private TransactionDetail td;
	private String account;
	private int id;

	public String execute() {
		Map session = ActionContext.getContext().getSession();
		td = showdetail(id);
		account = (String) session.get("account");
		session.put("td", td);
		if (td.getAccount_buyer().equals(account)){
			if (td.getState().equals("dsp")){
				return "dsp_buyer";
			}
				
			else if (td.getState().equals("dpd")){
				return "dpd_buyer";
			}
			
			else if (td.getState().equals("ddr")){
				return "ddr_buyer";
			}
			
			else if (td.getState().equals("drg")){
				return "drg_buyer";
			}
			
			if (td.getState().equals("csd")){
				return "csd_buyer";
			}
				
			else if (td.getState().equals("cdr")){
				return "cdr_buyer";
			}
			
			else if (td.getState().equals("crp")){
				return "crp_buyer";
			}
			
			else if (td.getState().equals("cpg")){
				return "cpg_buyer";
			}
		}
		
		if (td.getAccount_seller().equals(account)){
			if (td.getState().equals("dsp")){
				return "dsp_seller";
			}
				
			else if (td.getState().equals("dpd")){
				return "dpd_seller";
			}
			
			else if (td.getState().equals("ddr")){
				return "ddr_seller";
			}
			
			else if (td.getState().equals("drg")){
				return "drg_seller";
			}
			
			if (td.getState().equals("csd")){
				return "csd_seller";
			}
				
			else if (td.getState().equals("cdr")){
				return "cdr_seller";
			}
			
			else if (td.getState().equals("crp")){
				return "crp_seller";
			}
			
			else if (td.getState().equals("cpg")){
				return "cpg_seller";
			}
		}
		return "error";
	}

	public TransactionDetail showdetail(int id) {
		td = new TransactionDetailService().showdetail(id);
		return td;
	}

	public List<TransactionDetail> getList() {
		return list;
	}

	public void setList(List<TransactionDetail> list) {
		this.list = list;
	}

	public TransactionDetail getTd() {
		return td;
	}

	public void setTd(TransactionDetail td) {
		this.td = td;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
