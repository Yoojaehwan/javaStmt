package forloop;

import java.util.Scanner;

/**
 *@file : InputSum.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 입력된 수만큼 합 구하기
 *예) 10을 입력하면  콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSum {
	public static void main(String[] args) {
		System.out.println("10을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt(), allnum = 0;
		
		
		for (int i = 0; i <= num; i++) {
			
			allnum += i ;
		}
		
		
		System.out.println("합은 "+allnum+"입니다");
	}
}
