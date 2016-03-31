package forloop;

public class FactorOf5 {
	private int endNum , count , sum;

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNem) {
		this.endNum = endNem;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count = endNum/5;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for (int i = 0; i <= endNum; i += 5){
			
			sum += i;
		}
	}
	
	
	@Override
	public String toString() {
		return "1에서 100까지 점수까지 [입력수=" + endNum + ", 5 배수의 갯수는=" + count + ", 5 배수의 합은=" + sum + "]";
	}

	
}
