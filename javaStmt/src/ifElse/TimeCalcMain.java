package ifElse;

import java.util.Scanner;

/**
 *@file : TimeCalc.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 *10000초를 입력하면 7시간 47분 13초로 출력
 */

public class TimeCalcMain {
	public static void main(String[] args) {
		System.out.println("초를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		TimeCalc tc = new TimeCalc();
		tc.setInput(scanner.nextInt());
		tc.setSecond();
		
		System.out.println(tc.toString());
	}
}