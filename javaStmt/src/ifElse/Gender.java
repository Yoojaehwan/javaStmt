package ifElse;

import java.util.Scanner;

/**
 *@file : Gender.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 주민번호를 가지고 성별 판별하는 로직
 */
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println("주민번호를 입력하세요");
		String name= scanner.next(), ssn=scanner.next();
		char flag = ssn.charAt(7);
		/**
		 * 800101-1234567 일때 
		 * charAt(인덱스값) 은 해당 인덱스에 해당하는 한 글자를 반환하는 
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3 이면 남자 if(flag == 1 || flag == 3)
		 * 2. 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호입니다.
		 * */
		for (char i = 0; flag < ssn.charAt(7); i++) {
			
		}
			if (flag == 1 || flag == 3) {
				flag = ssn.charAt(7);
				System.out.println(name+"은 남자입니다.");
			}
			else if(flag == 2 || flag == 4){
				flag = ssn.charAt(7);
				System.out.println(name+"은 여자입니다.");
			}
			else if(flag == 5 || flag == 6){
				flag = ssn.charAt(7);
				System.out.println(name+"은 외국인입니다.");
			}
			else {
				System.out.println("잘못된 주민번호입니다.");
				return;
			}
			
		}
}
