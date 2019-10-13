package Algorithm;

import java.util.Arrays;

public class BestSet {
	public int[] bestSet(int n, int s) {
		if(n > s) {
			int num[] = new int[1];
			num[0] = -1;
			return num;
		}
		
		int num[] = new int[n];
		int sum = s;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (sum / (num.length - i));
			sum = sum - (sum / (num.length - i));
		}
		
		return num;
	}
	public static void main(String[] args) {
		BestSet set = new BestSet();
		System.out.println(Arrays.toString(set.bestSet(9, 123)));
	}

}
