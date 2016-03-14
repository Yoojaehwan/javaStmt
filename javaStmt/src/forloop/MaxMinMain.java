package forloop;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 최고점, 최저점 구하기 [결과] 학생들 평균 점수를 입력하시면 최고점, 최저점이 출력합니다. 단, 정원은 5명입니다. (배열)
 *        평균점수를 입력하세요.
 *
 *        최고점은 100점이고 최저점은 30점 입니다.
 */
public class MaxMinMain {
	public static void main(String[] args) {
		
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력합니다." + "단, 정원은 5명입니다." + "평균점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int[] arr = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
		MaxMin mm = new MaxMin();
		mm.setMaxMin(arr);

		System.out.println(mm.toString());

	}
}
