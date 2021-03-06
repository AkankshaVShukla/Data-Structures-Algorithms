package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualsZero {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i!=0 && nums[i-1]==nums[i])continue;
			int sum=nums[i];
			int start=i+1;
			int end=nums.length-1;
			while(start<end){
				if(nums[start]+nums[end]+sum==0){
					result.add(Arrays.asList(sum,nums[start],nums[end]));
					while(start<end && nums[start]==nums[start+1])start++;
					while(start<end && nums[end-1]==nums[end])end--;
					end--;start++;

				}else if(nums[start]+nums[end]+sum<0){
					start++;
				}else{
					end--;
				}
			}
		}
		return result;
	}   


	public static void main(String args[]){
		int[] a= {3,0,-2,-1,1,2};
		threeSum(a);
	}
}
