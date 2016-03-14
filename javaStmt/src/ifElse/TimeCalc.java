package ifElse;

public class TimeCalc {
	private int hour=0, minute =0, second=0, input;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond() {
		if (input>=3600) {
			hour = input/3600;
			minute= (input-(hour*3600))/60;
			second= input-((minute*60)+(hour*3600)) ;
		}
		else if(input<3600)
		{
			minute = input/60;
			second= input-(minute*60);
		}
		
		this.second = second;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return "시간 [" + hour + "시 " + minute + "분 " + second + "초, 입력값:" + input + "]";
	}

}

