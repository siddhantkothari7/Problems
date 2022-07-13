// Leetcode 1464

import java.util.*;

public class MaximumProductofTwoElementsinanArray {
	public static int maxProduct(int[] nums) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int number: nums) {
			q.add(number);
		}
		System.out.println(q);
		return (q.remove()-1) * (q.remove()-1);
    }
	

	public static void main(String[] args) {
		//int[] arr = {1,5,4,5};
		//int[] arr1 = {3,4,5,2};
		int[] arr2 = {3,7};
		System.out.println(maxProduct(arr2));

	}

}
