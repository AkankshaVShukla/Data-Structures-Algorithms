package algorithms;

import java.util.List;

public class MaxSumContiguousArray {
	public int maxSubArray(final List<Integer> a) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i:a){
			sum+=i;
			max = Math.max(max, sum);
			if(sum<0)sum=0;
		}
		return max;
	}
}
