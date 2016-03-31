package forloop;

public class InputSum {
	private int num ;

	public int getNum(int num) {
		return num;
	}

	public void setNum(int num) {
		for (int i = 0; i <= num; i++) {
	
		this.num += i;
		}
	}

	@Override
	public String toString() {
		return "입력값 [num=" + num + "]";
	}
	
	
	
	

	
	
}
