// Leetcode Problem 3

import java.util.*;

public class LongestSubstringWithoutRepeatingChars {
	public static int lengthOfLongestSubstring(String s) {
		Set<String> set = new HashSet<String>();
		int max_len = 0;
		int temp_len = 0;
		for(int i = 0; i < s.length(); i++) {
			String charc = String.valueOf(s.charAt(i));
			System.out.println(charc);
			if(!set.contains(charc)) {
				set.add(charc);
				temp_len++;
				System.out.println("max_len is: " + max_len);
				System.out.println("temp_len is: " + temp_len);
				System.out.println(set);
			} else {
				if(temp_len > max_len) {
					System.out.println("Entering if");
					max_len = temp_len;
					temp_len = 1;
					set.clear();
					set.add(charc);
					System.out.println(set);
				} else {
					temp_len = 1;
					set.clear();
					set.add(charc);
				}
			}
		}
		if(temp_len>max_len) {
			return temp_len;
		} else {
			return max_len;
		}
    }

	public static void main(String[] args) {
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
