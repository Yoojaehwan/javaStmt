package ifElse;

public class GradeReport {
	String name, subject, grade;
	int score ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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

	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "성적표 [이름:" + name + ", 과목:" + subject + ", 등급:" + grade + ", 점수:" + score + "]";
	}
		
}
