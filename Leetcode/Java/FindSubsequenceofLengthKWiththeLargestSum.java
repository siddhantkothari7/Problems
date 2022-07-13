// Leetcode 2099
import java.util.*;

public class FindSubsequenceofLengthKWiththeLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
    	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    	int[] ret = new int[k];
    	for(int i = 0; i < nums.length; i++) {
    		q.add(nums[i]);
    		if(q.size() > k) {
    			q.poll();
    		}
    	}
    	int index = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(index == k) {
    			return ret;
    		}
    		
    		if(q.contains(nums[i])) {
    			ret[index] = nums[i];
    			q.remove(nums[i]);
    			index += 1;
    		}
    	}
    	return ret;
    }	

	public static void main(String[] args) {
		int[] arr = {-1,-2,3,4};
		//int[] arr1 = {63,-74,61,-17,-55,-59,-10,2,-60,-65};
		//int[] arr2 = {3,4,3,3};
		//int[] arr3 = {-16,-13,8,16,35,-17,30,-8,34,-2,-29,-35,15,13,-30,-34,6,15,28,-23,34,28,-24,15,-17,10,31,32,-3,-36,19,31,-5,-21,-33,-18,-23,-37,-15,12,-28,-40,1,38,38,-38,33,-35,-28,-40,4,-15,-29,-33,-18,-9,-29,20,1,36,-8,23,-34,16,-7,13,39,38,7,-7,-10,30,9,26,27,-37,-18,-25,14,-36,23,28,-15,35,-9,1};
		System.out.println(Arrays.toString(maxSubsequence(arr,3)));
	}

}
