package switchcase;

import java.util.Scanner;

/**
 *@file : calc.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story	사칙연산기
 */
public class calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자, 연산기호, 숫자 입력");
		int a = scanner.nextInt();
		String opcode = scanner.next();
		// + - * / 단 나눗셈은 몫과 나머지로 출력
		int b = scanner.nextInt(),result=0, mok=0, nmg=0;
		switch (opcode) {
		case "+": result = a+b; break;
		case "-": result = a-b; break;
		case "*": result = a*b; break;
		case "/": mok = a/b; nmg=b%a; 
		System.out.println("몫은 "+mok+"  나머지는"+ nmg);
		return; 
		default:
			System.out.println("연산기호를 잘못 입력");
			return;
		}
		System.out.println(a + opcode + b + "=" + result);
	}
}
