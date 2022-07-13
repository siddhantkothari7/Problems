
public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
        int max = 0;
        int glob_max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(i, max+i);
            System.out.println(max);
            glob_max = Math.max(max, glob_max);
            
        }
        return glob_max;
    }
	

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));

	}

}
