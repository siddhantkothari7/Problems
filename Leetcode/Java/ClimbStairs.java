
public class ClimbStairs {
	public static int climbStairs(int n) {
		int[] memo = new int[n+1];
		return helper(n, memo);
        
    }
	
	public static int helper(int n, int[] memo) {
		if(n==0) {
        	return 1;
        }
        if(n<0) {
        	return 0;
        }
        if(memo[n] != 0) {
        	return memo[n];
        }
        
        memo[n] = helper(n-1, memo) + helper(n-2, memo);
        return memo[n];
		
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
}
