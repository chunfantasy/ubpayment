package com.whut.ub.service;

import java.util.List;

import com.whut.ub.dao.TransactionDetailDao;
import com.whut.ub.model.TransactionDetail;

public class TransactionListService {
	public TransactionListService() {

	}

	public List<TransactionDetail> showlist_buyer(String account) {
		List<TransactionDetail> list;
		list = new TransactionDetailDao().showlist_buyer(account);
		return list;
	}
	
	public List<TransactionDetail> showlist_seller(String account) {
		List<TransactionDetail> list;
		list = new TransactionDetailDao().showlist_seller(account);
		return list;
	}

}
