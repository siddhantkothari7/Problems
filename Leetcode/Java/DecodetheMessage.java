//Leetcode 2325

import java.util.*;
public class DecodetheMessage {
	public static String decodeMessage(String key, String message) {
		int ascii = 97;
		Map<Character, Character> decode_map = new HashMap<>();
		StringBuilder toReturn = new StringBuilder();
		for(int i = 0; i < key.length(); i ++){
			if(decode_map.size() == 26) break;
			char currchar = key.charAt(i);
			if(currchar != ' ' && !decode_map.containsKey(currchar)) {
				decode_map.put(currchar, (char)ascii);
				ascii += 1;
			}
		}
		
		for(int i = 0; i < message.length(); i++) {
			if(message.charAt(i) == ' ') toReturn.append(' ');
			else toReturn.append(decode_map.get(message.charAt(i)));
		}
		return toReturn.toString();
    }

	public static void main(String[] args) {
		//String key = "the quick brown fox jumps over the lazy dog";
		//String message = "vkbs bs t suepuv";
		String key1 = "eljuxhpwnyrdgtqkviszcfmabo";
		String message1 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
		System.out.println(decodeMessage(key1, message1));

	}

}
