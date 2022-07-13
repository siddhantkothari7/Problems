//Leetcode 506
import java.util.*;

public class RelativeRanks {
	public static String[] findRelativeRanks(int[] score) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		HashMap<Integer, String> map = new HashMap<>();
		String[] ret = new String[score.length];
		for(int s : score) {
			q.add(s);
		}
		
		for(int i = 1; i < score.length+1; i++) {
			int val = q.remove();
			if(i == 1) {
				map.put(val, "Gold Medal");
			}else if(i == 2) {
				map.put(val, "Silver Medal");
			}else if(i == 3) {
				map.put(val, "Bronze Medal");
			} else {
				map.put(val, Integer.toString(i));
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			ret[i] = map.get(score[i]);
		}
		return ret;
    }

	public static void main(String[] args) {
		//int[] score = {5,4,3,2,1};
		int[] score1 = {10,3,8,9,4};
		System.out.println(Arrays.toString(findRelativeRanks(score1)));
		
		//Time Complexity--> O(N)
		//Space Complexity--> O(N)

	}

}
