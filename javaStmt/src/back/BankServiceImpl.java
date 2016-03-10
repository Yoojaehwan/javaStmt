package back;

/**
 *@file : BackServiceImpl.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 10.
 *@Story 개인고객 입출금 
 */
public class BankServiceImpl implements BankService{
	private AccountBean account;

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name,password);
		return account.toString();
	}

	@Override
	public String depoit(int money) {
		// 입금 
		account.setMoney(account.getMoney()+money);
		return "고객님의 입금 금액은"+account.getMoney() + "원입니다.";
	}

	@Override
	public String withdraw(int money) {
		// 출금
		if(account.getMoney() < money)
		{
			return "잔액이 부족합니다.";
		}
		account.setMoney(account.getMoney() - money);
		return "고객님의 잔액은" +account.getMoney() + "원 입니다.";
	}

	@Override
	public String findMoney() {
		// 잔액조회
	 return account.getMoney() + "원 입니다.";
	}
	

}
