package forloop;
//자바는 클래스는 대문자로 시작 _바는 사용하지 않는다.
// 클래스는 FactorOf Of 파스칼 표기법에 따른다
// 객체는 Account accountNo 카멜 표기법을 따른다

import java.util.Scanner;

/**
 *@file : FactorOf5.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 5의 배수의 갯수와 합
 */
public class FactorOf5 {
	/**
	 *  [결과]
	 *  1에서 100까지 점수까지
	 *  5 배수의 갯수는 20이고
	 *  5 배수의 합은  1050이다.
	 * */
	
	public static void main(String[] args) {
		int endNum=0, count=0, sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트값 입력");
		endNum = scanner.nextInt();
	
		
		for(int i = 0; i <= endNum; i+=5){
			count = endNum/5;
			sum  += i;
	}
		
		
		System.out.println(" 1에서 "+endNum+"까지 점수까지"+"5 배수의 갯수는 "+count+"이고"+"5 배수의 합은  "+sum+"이다.");
	}
}
