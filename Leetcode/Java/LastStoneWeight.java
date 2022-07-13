import java.util.*;
public class LastStoneWeight {
	public static int lastStoneWeight(int[] stones) {
		if(stones.length == 0) {
			return 0;
		}
		
		if(stones.length == 1) {
			return stones[0];
		}
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int stone : stones) {
			q.add(stone);
		}
		
		while(q.size() > 1) {
			int stone1 = q.poll();
			int stone2 = q.poll();
			
			if(stone1 != stone2) {
				q.add(stone1-stone2);
			}
		}
		if(q.size() == 1) {
			return q.poll();
		} else {
			return 0;
		}
    }

	public static void main(String[] args) { 
		//int[] arr = {1};
		int[] arr1 = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(arr1));
	}

}
