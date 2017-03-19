package algorithms;

import java.util.List;

//Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
public class RepeatedNumber {
	public int repeatedNumber(final List<Integer> a) {
	    int[] arr = new int[a.size()-1];
	    for(int i :a){
	        if(arr[i-1]==0){
	            arr[i-1]=1;
	        }else{
	            return i;
	        }
	    }
	    return -1;
	}
}
