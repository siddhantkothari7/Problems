//import java.util.*;

public class ReverseWordsInAString {
	public static String reverseWords(String s) {
		String[] str_arr = s.split(" ");
		StringBuilder ret = new StringBuilder();
		for(String str:str_arr) {
			ret.append(new StringBuffer(str).reverse().toString() + " ");
		}
		return ret.toString().trim();
    }

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

}
