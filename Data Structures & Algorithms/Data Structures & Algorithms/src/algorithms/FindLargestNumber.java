package algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Given a list of non negative integers, arrange them such that they form the largest number.

//For example:
//Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

public class FindLargestNumber {
	public String largestNumber(final List<Integer> a) {
		String[] arr = new String[a.size()];
		for(int i=0; i<arr.length;i++){
			arr[i]=String.valueOf(a.get(i));
		}
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String a, String b){
				return (b+a).compareTo(a+b);
			}
		});

		StringBuilder sb = new StringBuilder();
		for(String s: arr){
			sb.append(s);
		}

		while(sb.charAt(0)=='0'&&sb.length()>1)
			sb.deleteCharAt(0);

		return sb.toString();
	}
}
