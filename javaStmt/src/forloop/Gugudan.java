package forloop;

/**
 * @file : Gugudan.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 2단부터 9단까지 구구단 출력 단, 책받침 구구단으로 출력
 */

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("2단부터 9단까지 구구단");
		for (int i = 2; i < 10; i += 4) {
			for (int j = 1; j < 9; j++) {

				System.out.println(i + "*" + j + "=" + i*j+"\t");
			}
		}
		System.out.println();
	}
}
