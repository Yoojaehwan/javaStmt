package array;

import java.util.Scanner;

/**
 *@file : MaxValue.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 14.
 *@Story 배열의 요소(승객) 중 가장 큰 값 출력
 */
public class MaxValueMain {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("정수값 3개를 입력");
		int a = scanner.nextInt(), b = scanner.nextInt(), c=scanner.nextInt();*/
		
		//int[] arr = new int[300000000];
		
		//null은 참조형에서만 존재한다.
		/*int[] arr= {}; //배열의 null은 {}이다. 
		String s = null; //또는 "";
		int i = 0;
		boolean b = false;
		char c = 0;
		double d = 0.0;*/
		
		/*int[] arr = new int[3];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		*/
		
		int[] arr = {32,26,76,44,66,30};  
		MaxValue mv = new MaxValue();
		System.out.println("배열중에서 가장 큰 값은"+mv.getMax(arr)+"입니다");
		
	}
}

	

