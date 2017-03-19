package algorithms;

import java.util.List;

public class OneThirdRepeatNumber {
	public int repeatedNumber(final List<Integer> a) {
		int candidate1=Integer.MAX_VALUE;
		int candidate2=Integer.MAX_VALUE;
		int count1=0;
		int count2=0;
		for(int i:a){
			if(count1>0 && candidate1==i){
				count1++;
			}else if (count2>0 && candidate2==i){
				count2++;
			}else if(count1==0){
				candidate1=i;
				count1++;
			}else if(count2==0){
				candidate2=i;
				count2++;
			}else{
				count1--;
				count2--;
			}
		}
		int freq = checkFrequency(a, candidate1);
		if(freq!=-1) return freq;
		else return checkFrequency(a, candidate2);

	}

	private int checkFrequency(List<Integer> a, int candidate){
		int frequency=0;
		for(int i :a){
			if(i==candidate){
				frequency++;
			}
		}
		if(frequency>a.size()/3)return candidate;
		else return -1;

	}
}
