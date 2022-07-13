//Leetcode 2336

import java.util.*;
public class SmallestNumberinInfiniteSet {
	Queue<Integer> set_q = new PriorityQueue<>();
	int min;
	
	public SmallestNumberinInfiniteSet() {
		this.set_q.offer(1);
		this.min = 1;
    }
    
    public int popSmallest() {
    	if(this.set_q.size() == 1) {
    		int toReturn = this.set_q.poll();
        	this.set_q.offer(toReturn+1);
        	this.min = toReturn+1;
        	System.out.println("Returning: " + toReturn);
        	System.out.println(this.set_q);
        	System.out.println(this.min);
        	return toReturn;
    	} else {
    		int toReturn = this.set_q.poll();
    		this.min = this.set_q.peek();
    		System.out.println("Returning: " + toReturn);
    		System.out.println(this.set_q);
    		System.out.println(this.min);
    		return toReturn;
    	}
    }
    
    public void addBack(int num) {
    	if(!this.set_q.contains(num)) this.set_q.offer(num);
    	if(num < this.min) {
    		this.min = num;
    	}
    	System.out.println(this.set_q);
		System.out.println(this.min);
    }
    	
//    @Override
//    public String toString() {
//    	StringBuilder sb = new StringBuilder();
//    	while(!this.set_q.isEmpty()) {
//    		sb.append(this.set_q.poll());
//    	}
//    	return sb.toString();
//    	
//    }

	public static void main(String[] args) {
		SmallestNumberinInfiniteSet smallestInfiniteSet = new SmallestNumberinInfiniteSet();
//		smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
//		smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
//		smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
//		smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
//		smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
//		smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
//		                                   // is the smallest number, and remove it from the set.
//		smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
//		smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.
		
		
		smallestInfiniteSet.popSmallest();
		smallestInfiniteSet.addBack(1); 
		smallestInfiniteSet.popSmallest();
		smallestInfiniteSet.popSmallest();
		smallestInfiniteSet.popSmallest();
		smallestInfiniteSet.addBack(2);
		smallestInfiniteSet.addBack(3);
//		smallestInfiniteSet.popSmallest();
//		smallestInfiniteSet.popSmallest();
	}

}
