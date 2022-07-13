//Leetcode 67

//Not complete
public class AddBinary {
	public static String addBinary(String a, String b) {
		StringBuilder str = new StringBuilder();
		int i = a.length();
		int j = b.length();
		int carry = 0;
		while(i > 0 && j > 0){
			int num_a = Character.getNumericValue(a.charAt(i));
			int num_b = Character.getNumericValue(a.charAt(j));
			int sum = num_a + num_b + carry;
			carry = 0;
			if(sum == 3) {
				carry = 1;
				str.append("1");
			} else if (sum == 2){
				carry = 1;
				str.append("0");
			} else if (sum == 1){
				str.append("1");
			} else {
				str.append("0");
			}
			i--;
			j--;
		}
		return str.toString();	
    }

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));

	}

}
