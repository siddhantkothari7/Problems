// Leetcode 258
public class AddDigits {
	public static int get_next(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		return sum;
	}
	public static int addDigits(int num) {
		while(num/10 != 0) {
			num = get_next(num);
		}
		return num; 
    }

	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}
}
