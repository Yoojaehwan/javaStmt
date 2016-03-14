package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 입력된 수만큼 합 구하기 예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSumMain {
	public static void main(String[] args) {
		System.out.println("10을 입력하세요.");
		Scanner s = new Scanner(System.in);
		InputSum is = new InputSum();
		is.setNum(s.nextInt());
		

		
		System.out.println(is.toString());
	}
}
