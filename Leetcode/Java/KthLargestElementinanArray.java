//Leetcode 215

import java.util.*;
public class KthLargestElementinanArray {
	public static int findKthLargest(int[] nums, int k) {
		Queue<Integer> num_q = new PriorityQueue<>(Collections.reverseOrder());
		for(int num : nums) {
			num_q.offer(num);
		}
		
		k = k - 1;
		while(k != 0) {
			num_q.poll();
			k -= 1;
		}
		return num_q.poll();
    }

	public static void main(String[] args) {
		//int[] arr = {3,2,1,5,6,4};
		int[] arr1 = {3,2,3,1,2,4,5,5,6};
		System.out.println(findKthLargest(arr1,4));
	}

}
