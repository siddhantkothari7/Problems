//Leetcode 451

import java.util.*;
public class SortCharactersByFrequency {
	public static String frequencySort(String s) {
		Map<Character, Integer> freq_map = new TreeMap<>();
		StringBuilder res = new StringBuilder();	
		Queue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
		
		for(int i = 0; i < s.length(); i++) {
			char curr_char = s.charAt(i);
			if(freq_map.containsKey(curr_char)) {
				freq_map.put(curr_char, freq_map.getOrDefault(curr_char, 0) + 1);
			} else {
				freq_map.put(curr_char, freq_map.getOrDefault(curr_char, 0) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : freq_map.entrySet()) {
			q.offer(entry);
		}
		
		while(!q.isEmpty()) {
			Map.Entry<Character, Integer> currEntry = q.poll();
			int currCount = currEntry.getValue();
			char currChar = currEntry.getKey();
			for(int i = 0; i < currCount; i++) {
				res.append(currChar);
			}
		}
		return res.toString();
    }
	

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));

	}

}
