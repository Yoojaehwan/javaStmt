package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== 집전화기로 통화 ===");
	//	usePhone(s); 메서드를 실행시키지 않기 위해 주석처리
		Phone nokia = new CelPhone();
		//부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany()+"를 사용");
		System.out.println("휴대폰으로 통화할 사람?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public static void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성전화기");
		System.out.println(phone.getCompany()+"를 사용합니다.");
		System.out.println("통화할 사람?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}

}
