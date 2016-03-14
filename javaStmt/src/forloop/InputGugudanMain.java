package forloop;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @file : InputGugudan.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 입력받은 정수의 구구단 구하기 예를 들면 2를 입력하면 2단 출력 109를 입력하면 109*2 ~ 109* 9 까지 출력
 *        다만, 0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력
 */
public class InputGugudanMain {
	public static void main(String[] args) {
		int dan=0;
		Scanner s = new Scanner(System.in);
		System.out.println("입력받은 정수의 구구단 구하기");
		InputGugudan g = new InputGugudan();
		
		g.setDan(s.nextInt());
				

	System.out.println(g.toString());	
	}
}
