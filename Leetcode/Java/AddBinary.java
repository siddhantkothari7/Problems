//Leetcode 67

//import java.util.*;
public class AddBinary {
	public static String addBinary(String a, String b) {
		StringBuilder toReturn = new StringBuilder();
		int carry = 0;
		int a_end = a.length() - 1;
		int b_end = b.length() - 1;
		
		while(a_end >= 0 || b_end >= 0){
			int sum = carry;
			if(b_end >= 0){
				sum += Character.getNumericValue(b.charAt(b_end));
				b_end -= 1;
			}
			if(a_end >= 0){
				sum += Character.getNumericValue(a.charAt(a_end));
				a_end -= 1;
			}
			toReturn.append(sum%2);
			carry = sum/2;
		}

		if(carry != 0) toReturn.append(carry);
		return toReturn.reverse().toString();
    }

	public static void main(String[] args) {
		//System.out.println(addBinary("11", "1"));
		System.out.println(addBinary("1010", "1011"));
	}

}
