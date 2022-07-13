import java.util.*;

public class MaximumLengthOfPairChain {
	public static int findLongestChain(int[][] pairs) {
		Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
		//System.out.println(Arrays.deepToString(pairs));
		int chain_length = 1;
		int cur = pairs[0][1];
		for(int i=1; i<pairs.length;i++) {
			if(cur < pairs[i][0]) {
				cur = pairs[i][1];
				chain_length += 1;
			}
		}
		return chain_length;
    }

	public static void main(String[] args) {
		int[][] pairs = new int[][] {{1,2},{7,8},{4,5}};
		System.out.println(findLongestChain(pairs));
	}

}
