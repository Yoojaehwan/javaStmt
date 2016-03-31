package switchcase;

import java.util.Scanner;

/**
 *@file : Gender.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 주민번호를 가지고 성별 판별하는 로직(swichCase 사용)
 */
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println("주민번호를 입력하세요");
		String name= scanner.next(), ssn=scanner.next(), male="남자", female="여자" ,foreigner="외국인", genders="";
		char flag = ssn.charAt(7);
		/**
		 * 800101-1234567 일때 
		 * charAt(인덱스값) 은 해당 인덱스에 해당하는 한 글자를 반환하는 
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3 이면 남자 if(flag = 1 || flag = 3)
		 * 2. 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호입니다.
		 * */
		switch (flag) {
		case '1':  genders+=male; break;
		case '3': genders+=male; break;
		case '2': genders+=female; break;
		case '4': genders+=female; break;
		case '5': genders+=foreigner; break;
		case '6': genders+=foreigner; break;

		default:
			break;
		}
		System.out.println(name+"은" +genders+"입니다.");
	}
}