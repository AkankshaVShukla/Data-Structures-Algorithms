package algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class FirstMissingPositive {
	public int firstMissingPositive(ArrayList<Integer> a) {
		Collections.sort(a);
		int sum=0;
		int num=0;
		int intSum=0;
		for(int i:a){
			if(i<=0)continue;
			num++;
			sum+=num;
			intSum+=i;
			if(sum!=intSum){
				return num;
			}
		}
		if(intSum<=0) return 1;
		else return num+1;
	}
}
