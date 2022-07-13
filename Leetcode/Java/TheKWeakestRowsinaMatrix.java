//Leetcode 1337
import java.util.*;

public class TheKWeakestRowsinaMatrix {
	public static int[] kWeakestRows(int[][] mat, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int ret[] = new int[k];
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for(int val : mat[i]) {
				sum += val;
			}			
			map.put(i, sum);
			sum = 0;
		}
		
		for(int i = 0; i < map.size()-1; i++) {
			int row_i = map.get(i);
			int row_j = map.get(i+1);
			
			if(row_i <= row_j){
				q.add(row_i);
			}
		}

		System.out.println(q);
		System.out.println(map);
		
		int index = 0;
		int i = 0;
		while(index != 3) {
			System.out.println("top of q is: " + q.peek());
			System.out.println("Map value at index: " + i + " is: " + map.get(i));
			if(map.get(i) == q.peek()) {
				ret[index] = i;
				map.remove(i);
				q.remove();
				index += 1;
				i = 0;
				
			} else {
				i += 1;
			}
			
		}
		return ret;
    }

	public static void main(String[] args) {
		int[][] mat = {{1,1,0,0,0},
		               {1,1,1,1,0},
		               {1,0,0,0,0},
		               {1,1,0,0,0},
		               {1,1,1,1,1}};
		System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
		

	}

}
