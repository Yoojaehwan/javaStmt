package ifElse;

public class Trinomial {
	int kor, eng, math,avg;
	String name, flag;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (int)((kor+eng+math)/3);
	}

	

	public String getFlag() {
		return flag;
	}

	public void setFlag() {
		this.flag = (this.avg>=60) ? "합격":"불합격" ;
	}

	@Override
	public String toString() {
		return "성적표 [국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + avg + ", 이름=" + name
				+ ", 합격여부=" + flag + "]";
	}

	
	

}
