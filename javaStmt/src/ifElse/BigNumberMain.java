package ifElse;

import java.util.Scanner;

/**
 * @file : BigNumber.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 입력된 3개 숫자에서 가장 큰 수
 */
public class BigNumberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		
		BigNumber big = new BigNumber();
		System.out.println("가장 큰 수는" +
		big.getBigNum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())+"입니다.");


	}

}


//{}메모리 영억 ,  BigNumber b = new BigNumber
class BigNumber {
	/*public BigNumber() {
		//  생략되었다.}
*/	public int getBigNum(int a, int b, int c){
		int big = 0;
		if (a > b || a > c) {
			big = a;
		} else if (b > c) {
			big = b;
		} else {
			big = c;
		}
		return big;
	
	}
}