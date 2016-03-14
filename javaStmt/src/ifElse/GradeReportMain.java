package ifElse;

import java.util.Scanner;

/**
 * @file : GradeReport.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 11.
 * @Story 성적표(점수에 따라 A~F까지 학점부여) [결과]
 **************************
 *        이름 과목 점수 학점 ------------------------- 홍길동 영어 89점 B
 **************************
 *        90점 이상 A 80점 이상 B 70점 이상 C 60점 이상 D 50점 이상 F 만약, 입력한 점수가 100점 초과한다든지
 *        0점 미만 이면 잘못 입력했습니다 라고 메세지 추가
 */
public class GradeReportMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 과목, 점수를 입력하세요");
		GradeReport gr = new GradeReport();

		if (score >= 90) {
			grade = "A";

		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "F";
		} else if (score >= 100 || score <= 0) {
			System.out.println("잘못 입력했습니다");
			return;
		}

		System.out.println("*************************");
		System.out.println("이름	  과목	   점수        학점");
		System.out.println("-------------------------");
		//System.out.println(name + "	" + subject + "	" + score + "	" + grade);
		System.out.println("*************************");
	}
}