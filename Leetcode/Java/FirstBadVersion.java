//Leetcode 278

public class FirstBadVersion {
	public static int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		while(lo<hi) {
			int mid = lo + (hi-lo)/2;
			if(isBadVersion(mid) == true) {
				hi = mid;
			} else {
				lo = mid+1;
			}
		}
		return lo;
    }
	
	public static boolean isBadVersion(int n) {
		if(n==1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(firstBadVersion(1));
	}

}
