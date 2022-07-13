import java.util.*;

public class HappyNumber {
	public static int get_next(int n) {
		int sum = 0;
        while(n > 0){
        	int mod = n%10;
        	sum += mod * mod;
        	n = n/10;
        }
        return sum;
	}
	public static boolean isHappy(int n) {
        Set<Integer> sum_set = new HashSet<Integer>();
        while(n != 1 && !sum_set.contains(n)) {
        	sum_set.add(n);
        	n = get_next(n);	
        } 
        return n == 1;
     }

	public static void main(String[] args) {
		//System.out.println(209%10);
		System.out.println(isHappy(19));

	}

}
