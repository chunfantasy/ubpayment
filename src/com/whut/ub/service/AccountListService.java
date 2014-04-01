package com.whut.ub.service;

import java.util.List;

import com.whut.ub.dao.AccountFileDao;
import com.whut.ub.model.AccountFile;

public class AccountListService {
	public AccountListService() {

	}

	public List<AccountFile> showlist(String account) {
		List<AccountFile> list;
		list = new AccountFileDao().showlist(account);
		return list;
	}

}
