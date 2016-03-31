package forloop;
//자바는 클래스는 대문자로 시작 _바는 사용하지 않는다.

// 클래스는 FactorOf Of 파스칼 표기법에 따른다
// 객체는 Account accountNo 카멜 표기법을 따른다

import java.util.Scanner;

/**
 * @file : FactorOf5.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 5의 배수의 갯수와 합
 */
public class FactorOf5Main {
	/**
	 * [결과] 1에서 100까지 점수까지 5 배수의 갯수는 20이고 5 배수의 합은 1050이다.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("리미트값 입력");
		FactorOf5 f= new FactorOf5();
		f.setEndNum(s.nextInt());
		f.setCount();
		f.setSum();
		

		System.out.println(f.toString());
	}
}
