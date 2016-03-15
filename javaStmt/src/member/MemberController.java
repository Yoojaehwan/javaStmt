package member;

import java.util.Scanner;

import grade.GradeBean;

public class MemberController {
	public static void main(String[] args) {
		MemberServiceImpl service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.회원가입 2.로그인 3.내정보보기 4.내정보수정 5.탈퇴 0,종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("아이디,비번,이름,주소,생년월일 입력");
				service.join(new MemberBean(s.next(), s.next(), s.next(), s.next(), s.nextInt()));
				System.out.println("회원가입 되었습니다.");
				break;
			case 2:
				System.out.println("아이디, 비밀번호 입력");
				MemberBean tempBean = service.login(s.next(), s.next());
				tempBean = ((tempBean != null)) ? tempBean : null;
				System.out.println((tempBean != null) ? "로그인 성공" : "로그인 실패");
				break;
			case 3:
				System.out.println("아이디, 비밀번호");
				String id = s.next();
				MemberBean tempBean1 = service.login(id, s.next());
				tempBean1 = ((tempBean1 != null)) ? tempBean1 : null;
				System.out.println((tempBean1 != null) ? service.detail(id) : "정보보기 실패");
				break;
			case 4:
				System.out.println("아이디, 비밀번호");
				id = s.next();
				MemberBean tempBean3 = service.login(id, s.next());
				System.out.println("비밀번호, 주소, 생년월일");
				tempBean3 = ((tempBean3 != null)) ? tempBean3 : null;
				System.out.println(
						(tempBean3 != null) ? (service.update(tempBean3, s.next(), s.next(), s.nextInt())) : "업데이트 실패");
				break;

			case 5:
				System.out.println("아이디, 비밀번호");
				id = s.next();
				MemberBean tempBean2 = service.login(id, s.next());
				tempBean2 = ((tempBean2 != null)) ? tempBean2 : null;
				System.out.println((tempBean2 != null) ? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("시스템 종료");
				return;

			default:
				return;
			}
		}
	}

}
