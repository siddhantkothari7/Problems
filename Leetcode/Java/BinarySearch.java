//Leetcode 704
//import java.util.*;

public class BinarySearch {
	public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        if(nums.length == 1 && target == nums[0]) {
        	return 0;
        }
        while(i<=j){
            if(nums[i] == target){
                return i;
            } else if(nums[j] == target){
                return j;
            } else{
                i++;
                j--; 
            }
        }
        return -1;
    }

	public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12}; // target=9 should return 4
		//int[] nums1 = {-1,0,5};
		System.out.println(search(nums, 9));
	}

}
