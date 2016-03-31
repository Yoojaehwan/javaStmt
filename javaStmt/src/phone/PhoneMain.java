package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== 집전화기로 통화 ===");
		PhoneMain pm = new PhoneMain();
		// pm.usePhone(s); 메서드를 실행시키지 않기 위해 주석처리
		// pm.useNokia(s);
		// pm.useIPhone(s);
		pm.useAndroid();
	}

	public void useAndroid() {
		AndroidPhone and = new AndroidPhone();
		and.setCompany("안드로이드");
		System.out.println(and.getCompany() + "를 사용");
		System.out.println("잘지내 라고 안드로이드폰으로 문자를 보낼 사람?");
		and.setData(s.next(), s.next(), "6인치");
		System.out.println(and.getData());
	}

	public void useIPhone(Scanner s) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("Apple");
		System.out.println(iPhone.getCompany() + "를 사용");
		System.out.println("잘지내 라고 아이폰으로 문자를 보낼 사람?");
		iPhone.setData(s.next(), s.next());
		System.out.println(iPhone.getData());
	}

	public void useNokia(Scanner s) {
		Phone nokia = new CelPhone();
		// 부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용");
		System.out.println("휴대폰으로 통화할 사람?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}

}
