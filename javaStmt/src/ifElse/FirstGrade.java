package ifElse;

import java.util.Scanner;

/**
 * @file : FirstGrade.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 학생이름과 점수를 입력하세요");
		String aName = scanner.next();
		int aScore = scanner.nextInt();
		String bName = scanner.next();
		int bScore = scanner.nextInt();
		String cName = scanner.next();
		int cScore = scanner.nextInt();
		int grade=0;
		String name="";
		if (aScore > bScore || aScore > cScore) {
				grade += aScore;
				name = aName;
		} else if(bScore>cScore){
				grade += bScore;
				name = bName;
		}else{
			grade += cScore;
			name = cName;
		}
		System.out.println("1등은 "+name+", "+grade+"점 입니다");
	}

}