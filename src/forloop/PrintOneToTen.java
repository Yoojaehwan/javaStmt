package forloop;

/**
 * @file : PrintOneToTen.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 1부터 10까지 정수값 출력( 가로로 출력, \t 탭의 역할 )
 *
 */

public class PrintOneToTen {
	public static void main(String[] args) {
		System.out.println("1부터 10까지 정수값 출력( 가로로 출력, \t 탭의 역할 )");
		for (int i = 1; i < 11; i++) {
			int num = i;

			System.out.print(num + "\t");
			// \n 는 ln을 하는 효과가 있다.
		}

	}
}
