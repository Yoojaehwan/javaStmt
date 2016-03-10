package back;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		//지역변수영역
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl service = new BankServiceImpl();
		AdminBackServiceImpl admin = new AdminBackServiceImpl(100);
	
		//연산영역
		System.out.println("이름, 비밀번호를 입력하세요");
		System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
		System.out.println("입금 금액을 입력하세요");
		System.out.println(service.depoit(scanner.nextInt()));
		System.out.println("출금 금액을 입력하세요");
		System.out.println(service.withdraw(scanner.nextInt()));
		System.out.println("잔액확인");
		System.out.println(service.findMoney());
	}
}
