package org.cap.bankapp.test;

import org.cap.dto.Account;

public interface accountDao {

	static Account findAccountById(Object accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	static Account findAccountById(Account accountService) {
		// TODO Auto-generated method stub
		return accountService;
	}

	static Account findAccountById(AccountService accountService) {
		// TODO Auto-generated method stub
		return null;
	}

	static Account findAccountById1(AccountService accountService) {
		return null;
	}

	Account findAccountById11(AccountService accountService);

}
