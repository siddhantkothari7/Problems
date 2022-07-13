//Leetcode 2335

import java.util.*;
public class MinimumAmountofTimetoFillCups {
	public static int fillCups(int[] amount) {
		int time = 0;
		Queue<Integer> amtQ = new PriorityQueue<>(Collections.reverseOrder());
		for(int amt : amount) {
			if(amt != 0) {
				amtQ.offer(amt);
			}	
		}
		
		//System.out.println(amtQ);
			
		while(!amtQ.isEmpty()) {
			if(amtQ.size() > 1) {
				int currCup = amtQ.poll();
				if(currCup == 0) {
					continue;
				}
				int nextCup = amtQ.poll();
				if(nextCup == 0) {
					amtQ.offer(currCup);
					continue;
				}
				currCup -= 1;
				if(currCup != 0) amtQ.offer(currCup);
				nextCup -= 1;
				if(nextCup != 0) amtQ.offer(nextCup);
				time +=1;
			} else {
				int currCup = amtQ.poll();
				currCup -= 1;
				if(currCup != 0) amtQ.offer(currCup);
				time +=1;
			}		
		}
		return time;
    }

	public static void main(String[] args) {
		//int[] arr = {1,4,2};
		//int[] arr1 = {5,4,4};
		//int[] arr2 = {5,0,0};
		int[] arr3 = {0,0,0};
				
		System.out.println(fillCups(arr3));

	}

}
