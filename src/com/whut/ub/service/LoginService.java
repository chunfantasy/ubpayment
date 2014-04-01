package com.whut.ub.service;

import com.whut.ub.dao.LoginDao;

public class LoginService {
	LoginDao ld = new LoginDao();

	public LoginService() {
		
	}

	public boolean login(String account, String password) {
		String pw;
		if (ld.check(account)) {
			pw = ld.getPassword(password);
			if (password.equals(pw))
				return true;
		}
		return false;
	}
}
