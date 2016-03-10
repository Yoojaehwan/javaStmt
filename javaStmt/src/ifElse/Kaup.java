package ifElse;

public class Kaup {
	// 송석영역 : field	 필드는 가두고
	private String name;
	private int kaup;
	private double height,weight;
	private String result;
	//kaup = (int) ((weight/(height*height))*10000);
	
	
	// ALT  SHIFT  S R 
	
	// 기능영역 : area   오픈한다.
		

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getKaup() {
		
		return kaup;
	}


	public void setKaup() {
		
		this.kaup = (int) ((weight/(height*height))*10000);
	}


	public String getResult() {

		 
		return result;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

		
	public void setResult() {
		String temp= "";
		if (kaup >=30) {
			 temp ="비만";
		 }else if (kaup>=24){
			 temp ="과체중";
		 }else if (kaup>=20){
			 temp ="정상";
		 }else if(kaup >=15){
			 temp ="저체중";
		 }else if(kaup>=13){
			 temp ="마름";
		 }else if(kaup >= 10){
			 temp ="영양실조";
		}else{
			 temp ="소모증";
		}
		this.result = result;
	}	
}
