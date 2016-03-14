package ifElse;

public class Pass {
	String name, pass="";
	int java , jsp , sql, spring, total;
	double avg;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass() {
		if (avg >= 60) {
			pass = "합격";

		} else if (avg < 60) {
			pass = "불합격";
		}

		this.pass = pass;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java+ jsp+ sql+spring;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total/4;
	}
	@Override
	public String toString() {
		return "[이름:" + name + ", 자바:" + java + ", jsp:" + jsp + ", sql:" + sql
				+ ", spring:" + spring + ", total:" + total + ", avg:" + avg + ", pass:" + pass + "]";
	}

	
}
