import java.util.*;
public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		for(int i=0; i < nums.length; i++) {
			if(nums[i] != 0) {
				s2.push(nums[i]);
			} else {
				s1.push(nums[i]);
			}
		}
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		for(int j=0; j<nums.length; j++) {
			nums[j] = s1.pop();
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
		
		
		

	}

}
