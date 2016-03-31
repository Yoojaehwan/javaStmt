package ifElse;

public class LeapYear {
	int year; 
	String yearStr = "";
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year % 4 == 0 || year==2000 ) { 
			yearStr = "윤년";
		}else if(year % 1 ==0){
			yearStr = "평년";
			
		}
		this.year = year;
	}
	public String getYearStr() {
		return yearStr;
	}
	public void setYearStr() {
		this.yearStr = yearStr;
	}
	@Override
	public String toString() {
		return   year +"년은 "+  yearStr + "년이다.";
	}
	
	
	
	
	
	

	
}
