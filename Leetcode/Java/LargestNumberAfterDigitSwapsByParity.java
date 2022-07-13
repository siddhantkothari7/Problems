import java.util.*;

public class LargestNumberAfterDigitSwapsByParity {
	public static int largestInteger(int num) {
		PriorityQueue<Integer> pq_even = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq_odd = new PriorityQueue<Integer>();
		int placeholder = num;
		while(num != 0) {
			int digit = num%10;
			if(digit % 2 == 0) {
				pq_even.add(digit);
			} else {
				pq_odd.add(digit);
			}
			num = num / 10;
		}
		
		int ret_num = 0;
		int factor = 1;
		
		while(placeholder > 0) {
			int cur = placeholder%10;
			if (cur % 2 == 0) {
				ret_num = pq_even.poll() * factor + ret_num;
			} else {
				ret_num = pq_odd.poll() * factor + ret_num;
			}
			System.out.println(ret_num);
			factor = factor * 10;	
			placeholder = placeholder/10;
		}	
		return ret_num;
    }

	public static void main(String[] args) {
		System.out.println(largestInteger(1234));
		

	}

}
