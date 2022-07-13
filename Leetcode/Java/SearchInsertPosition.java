//Leetcode 35
public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                lo = mid+1;
            } else if(nums[mid] > target) {
            	hi = mid;
            }
        }
		return hi;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
