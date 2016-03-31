package switchcase;

import java.util.Scanner;


/**
 *@file : Pass.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 11.
 *@Story 과목점수를 입력하면 총점과 평균이 나오고 
 *이를 통해 합격 여부를 통지하는 프로그램 (SWITCH CASE 처리)
 *[결과]
 *****************************************************************
 *학생	자바		JSP		SQL		스프링		총점		평균		합격여부
 *----------------------------------------------------------------
 *홍길동	80		40		60		70			250		62.5	합격
 *****************************************************************
 *합격 여부는 60 이상이면 합격
 * */
public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생이름, 자바점수, JSP점수, SQL점수, 스프링점수를 입력");
		String name = scanner.next(), pass="";
		int javaS = scanner.nextInt() , jsp = scanner.nextInt(), sql=scanner.nextInt(), spring = scanner.nextInt();
		int total = javaS+jsp+sql+spring ;
		double avg=total/4;
		int totlaAvg=0;
		
		switch (totlaAvg) {
		case 100: 
		case 90:  
		case 70:  
		case 60:   pass="합격"; break;
		case 50:  
		case 40: 
		case 30: 
		case 20:  
		case 10:  
		case 0:   pass="불합격"; break;
		default:
			break;
		}
		
		System.out.println(name+"은 "+ avg+"점수로" +pass+"하셨습니다.");
	}
}