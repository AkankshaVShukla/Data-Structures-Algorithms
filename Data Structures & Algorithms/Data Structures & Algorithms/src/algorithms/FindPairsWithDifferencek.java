package algorithms;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindPairsWithDifferencek {
	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0)   return 0;

		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int num :nums){
			if(!map.containsKey(num))
				map.put(num, 1);
			else 
				map.put(num, map.get(num)+1);
		}
		int result=0;
		for(Entry<Integer, Integer> entry :map.entrySet()){
			if(k==0){
				if(entry.getValue()>=2){
					result++;
				}
			}else{
				if(map.containsKey(entry.getKey()+k)){
					result++;
				}
			}
		}
		return result;
	}
}
