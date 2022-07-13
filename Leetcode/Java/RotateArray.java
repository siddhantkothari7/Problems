import java.util.*;;

public class RotateArray {
//	public static void rotate(int[] nums, int k) {
//		Queue<Integer> q = new LinkedList<Integer>();
//		for(int i =nums.length-k; i < nums.length; i++) {
//			//System.out.println(nums[i]);
//			q.add(nums[i]);
//		}
//		
//		for(int j=0; j<nums.length-k; j++) {
//			//System.out.println(nums[j]);
//			q.add(nums[j]);
//		}
//		
//		int i = 0;
//		while(!q.isEmpty()) {
//			nums[i] = q.remove();
//			i++;
//		}
	
	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		System.out.println(k);
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));		
    }
	
	public static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		rotate(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
