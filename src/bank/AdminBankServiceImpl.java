package bank;

import java.util.Vector;

/**
 *@file : BankServiceImpl.java 
 *@author inhyeon
 *@date 2016. 3. 10.
 *@story 뱅크 서비스 비즈니스 로직
 */
public class AdminBankServiceImpl implements AdminBankService{

	Vector<AccountBean> getList;
	
	public AdminBankServiceImpl() {
		
		Vector<AccountBean> getList = new Vector<AccountBean>();
	}
	
	
	@Override
	public String openAccount(AccountBean bank) {
		
		
		getList.add(bank);
		return null;
	}

	@Override
	public Vector<AccountBean> findAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		
		return gradeList.size();
	}

	@Override
	public int countByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<AccountBean> getList() {
		// TODO Auto-generated method stub
		return null;
	}



	


	
}