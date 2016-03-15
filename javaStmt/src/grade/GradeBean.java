package grade;

public class GradeBean {
		private String name;
		private int shoolNum, java, sql, jsp, spring;

		public GradeBean(String name, int shoolNum, int java, int sql, int jsp, int spring){
			this.name = name;
			this.shoolNum = shoolNum;
			this.java = java;
			this.sql = sql;
			this.jsp = jsp;
			this.spring = spring;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getShoolNum() {
			return shoolNum;
		}

		public void setShoolNum(int shoolNum) {
			this.shoolNum = shoolNum;
		}

		public int getJava() {
			return java;
		}

		public void setJava(int java) {
			this.java = java;
		}

		public int getSql() {
			return sql;
		}

		public void setSql(int sql) {
			this.sql = sql;
		}

		public int getJsp() {
			return jsp;
		}

		public void setJsp(int jsp) {
			this.jsp = jsp;
		}

		public int getSpring() {
			return spring;
		}

		public void setSpring(int spring) {
			this.spring = spring;
		}

		@Override
		public String toString() {
			return "성적표 [이름=" + name + ", 학번=" + shoolNum + ", 자바=" + java + ", SQL=" + sql + ", JSP=" + jsp
					+ ", SPRING=" + spring + "]";
		}

	}

