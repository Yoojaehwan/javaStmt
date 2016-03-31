package forloop;

import java.util.Arrays;

public class MaxMin {
	private int max, min;
	
	
	public void setMaxMin(int[] arr) {
		max = arr[0];
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

			if (min > arr[i]) {
				min = arr[i];
			}

		}
	}

	@Override
	public String toString() {
		return "최대갑,최소값 [최대값=" + max + ", 최소값=" + min + "]";
	}

}

	
	

