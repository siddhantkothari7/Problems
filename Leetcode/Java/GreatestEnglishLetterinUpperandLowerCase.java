//Leetcode 2309

import java.util.*;
public class GreatestEnglishLetterinUpperandLowerCase {
    public static String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        Queue<Character> q = new PriorityQueue<>((a,b)-> b-a);
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }

        for(char c : set){
            char cur = c;
            if(set.contains(Character.toUpperCase(cur)) && set.contains(Character.toLowerCase(cur))){
                q.add(Character.toUpperCase(cur));
            }
        }
        if(!q.isEmpty()) return Character.toString(q.poll());
        else return "";
    }

    public static void main(String[] args) {
        //String s  = "lEeTcOdE";
        //String s1 = "arRAzFif";
        String s2 = "AbCdEfGhIjK";
        System.out.println(greatestLetter(s2));
    }
    
}
