package whileloop;

import java.util.Scanner;
import org.omg.Messaging.SyncScopeHelper;

/**
 * @file : NumGolfMain.java
 * @author $ rjh1226@naver.com
 * @date 2016. 3. 10.
 * @Story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumGolfBean bean = new NumGolfBean();
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();

		while (true) {
			System.out.println("1부터 10까지 숫자 중 하나를 입력");
			bean.setPlayer(scanner.nextInt());
			bean.setCount();
			if (bean.getCom() == bean.getPlayer()) {
				bean.setFlag(true);
				System.out.println("일치합니다.");
				break;
			} else {
				System.out.println("불일치합니다.");

			}

			System.out.println(bean.toString());
		}

	}
}
