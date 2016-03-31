package ifElse;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Trinomial t = new Trinomial();
		System.out.println("이름,국어,영어,수학 점수 입력");
		t.setName(s.next());
		t.setKor(s.nextInt());
		t.setEng(s.nextInt());
		t.setMath(s.nextInt());
		t.setAvg();
		t.setFlag();
	
		System.out.println(t.toString());
	}
}
