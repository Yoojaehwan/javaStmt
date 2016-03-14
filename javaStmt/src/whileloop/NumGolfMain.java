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
		int key = 0;
		while (true) {
			System.out.println("[메뉴] 1.숫자 맞추기 2.종료");
			key = scanner.nextInt();
			String msg = "";
			switch (key) {
			case 1:
				while(true){
				System.out.println("1부터 10까지 숫자 중 하나를 입력");
				System.out.println("도전 횟수는" + bean.getCount() + 1);
				bean.setPlayer(scanner.nextInt());
				bean.setCount();
				
				msg= (bean.getCom() == bean.getPlayer())? bean.toString(): "랜덤숫자와 불일치";
				/*if (bean.getCom() == bean.getPlayer()) {
					bean.setFlag(true);
					System.out.println("일치합니다.");
					break;
				} else {
					System.out.println("불일치합니다.");
				}
				System.out.println(bean.toString());
				break;*/


				}
			case 2:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된값");
				break;
			
		}
		}
	}
}


