package back;

public interface BankService {
	/**
	 * 계좌 개설
	 */
	public String openAccount(String name, int password);
	/**
	 * 입금 
	 **/
	public String depoit(int money);
	/**
	 *  출금
	 * */
	public String withdraw(int money);
	/**
	 * 잔액조회
	 * */
	public String findMoney();
}
