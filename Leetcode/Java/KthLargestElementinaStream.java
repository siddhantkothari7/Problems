//Leetcode 703
import java.util.*;

public class KthLargestElementinaStream {
	int index;
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	public KthLargestElementinaStream(int k, int[] nums) {
		index = k;
		for(int num : nums) {
			q.offer(num);
		}
		while(q.size()>k) {
			q.poll();
		}
    }
    
    public int add(int val) {
    	q.offer(val);
    	while(q.size() > index) {
    		q.poll();
    	}
        return q.peek();
    }

	public static void main(String[] args) {
//		int[] nums = {4, 5, 8, 2};
//		int[] nums1 = {};
//		KthLargestElementinaStream kthLargest = new KthLargestElementinaStream(1, nums1);
//		System.out.println(kthLargest.add(-3));      // return 4
//		System.out.println(kthLargest.add(-2));     // return 5
//		System.out.println(kthLargest.add(-4));   // return 5
//		System.out.println(kthLargest.add(0));   // return 8
//		System.out.println(kthLargest.add(4));  // return 8	
		//TreeMap<Integer, Integer> map = new TreeMap<>();
		

	}

}
