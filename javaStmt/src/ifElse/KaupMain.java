package ifElse;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 *@file : Kaup.java
 *@author $ rjh1226@naver.com
 *@date  2016. 3. 10.
 *@Story 카우푸 지수 구하기
 *몸무게를 키의 제곱으로 구한 후 10000을 곱하면 지수가 생성된다.
 *이를 카우푸 지수라고 한다.
 *카우푸 지수
 *30초과만 비만
 *24이상이면 과체중
 *20이상이면 정상
 *15 이상이면 저체중
 *13이상이면 마름
 *10이상이면 영양실조로 판별된다
 *10미만은 소모증이다.
 *이름과 키와 몸무게를 입력하면
 *홍길동님은 비만입니다. 라고 출력하는 프로그램을 작성하시오.
 */

public class KaupMain {
	public static void main(String[] args) {
		// 지역변수 영역
		 Scanner scanner = new Scanner(System.in);
		 Kaup k = new Kaup();
		 System.out.println("이름, 키 , 몸무게 입력");
		 k.setName(scanner.next());
		 k.setHeight(scanner.nextInt());
		 k.setWeight(scanner.nextInt());
		 k.setResult();
		 System.out.println(k.toString());
	}

	
}

	








