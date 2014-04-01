package com.whut.ub.service;

import com.whut.ub.dao.TransactionDetailDao;
import com.whut.ub.model.TransactionDetail;

public class TransactionDetailService {
	public TransactionDetailService() {

	}

	public TransactionDetail showdetail(int id) {
		TransactionDetail td;
		td = new TransactionDetailDao().showdetail(id);
		return td;
	}
}
