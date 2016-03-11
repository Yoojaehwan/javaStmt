package forloop;

import java.util.Scanner;

/**
 *@file : MaxMin.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 최고점, 최저점 구하기
 *[결과]
 *학생들 평균 점수를 입력하시면 최고점, 최저점이 출력합니다.
 *단, 정원은 5명입니다.  (배열)
 *평균점수를 입력하세요.
 *
 *최고점은 100점이고 
 *최저점은 30점 입니다.
 */
public class MaxMin {
	public static void main(String[] args) {
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력합니다."
								+"단, 정원은 5명입니다."
								+"평균점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int[] arr= new int[5];
		int max=0, min=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		
			if(i==0){
				min = arr[i];
			}else if(arr[i]<=min){
				min = arr[i];
			}
			
			if(arr[i]>= max){
				max = arr[i];
				
			}
			
		}
		
		
		
		System.out.println("최고점은 "+max+"점이고 "
								+"최저점은 "+min+"점 입니다.");
		
	}
}
