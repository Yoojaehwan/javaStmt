package forloop;

public class InputGugudan {
	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				
				System.out.println(i +"*"+j+"="+i*j);
			
			}
		}
		
	}

	@Override
	public String toString() {
		return "InputGugudan [dan=" + dan + "]";
	}

	
}	
		
