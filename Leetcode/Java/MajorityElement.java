//Leetcode

import java.util.*;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
    	Map<Integer, Integer> num_freq = new HashMap<>();
    	for(int num : nums) {
    		num_freq.put(num, num_freq.getOrDefault(num, 0) + 1);
    	}
    	//System.out.println(num_freq.get(2));
    	
    	int max_key = 0;
    	for(int key : num_freq.keySet()) {
    		if(num_freq.get(key) > Math.floorDiv(nums.length, 2)) {
    			max_key = key;
    		}
    	}
        return max_key;
    }

	public static void main(String[] args) {
		int[] arr = {3,2,3};
		System.out.println(majorityElement(arr));

	}

}
