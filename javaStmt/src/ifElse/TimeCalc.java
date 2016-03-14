package ifElse;

import java.util.Scanner;

/**
 *@file : TimeCalc.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 *10000초를 입력하면 7시간 47분 13초로 출력
 */

public class TimeCalc {
	public static void main(String[] args) {
		System.out.println("초를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(), hour=0, minute =0, second=0;
		if (input>=3600) {
			hour = input/3600;
			minute= (input-(hour*3600))/60;
			second= input-((minute*60)+(hour*3600)) ;
		}
		else if(input<3600)
		{
			minute = input/60;
			second= input-(minute*60);
		}
		System.out.println(hour+"시"+ minute +"분"+ second +"초");
	}
}