package grade;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class GradeContoller {
	public static void main(String[] args) {
		System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		while (true)

		{

			switch (scanner.nextInt()) {
			case 1:
				service.input();
				break;
			case 2:
				service.update();
				break;
			case 3:
				service.delete();
				break;
			case 4:
				service.getList();
				break;
			case 5:
				service.getGradeByName();
				break;
			case 6:
				service.getGradeByshoolNum();
				break;
			case 7:
				service.getCount();
				break;
			case 0:
				System.out.println("종료합니다.");
				return;

			default: System.out.println("잘못된 입력값입니다."); return;
			}
		}
	}
}
