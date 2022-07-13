//Leetcode 125

//import java.util.*;
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
//		s = s.toLowerCase();
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		int start = 0;
//		int end = s.length()-1;
//		while(start < end){
//			if(s.charAt(start) != s.charAt(end)) return false;
//			start += 1;
//			end -= 1;
//		}
//		return true;
		int start = 0;
		int end = s.length() - 1;
		while(start <= end) {
			char start_char = s.charAt(start);
			char end_char = s.charAt(end);
			if(!Character.isLetterOrDigit(start_char)) {
				start += 1;
				continue;
			}
			if(!Character.isLetterOrDigit(end_char)) {
				end -= 1;
				continue;
			}
			if(Character.toLowerCase(start_char) != Character.toLowerCase(end_char)) {
				return false;
			}
			start += 1;
			end -= 1;
		}
		return true;			
    }

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

}
