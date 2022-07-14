//Leetcode 1512

import java.util.*;
public class NumberofGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int[] freq = new int[100];
        for(int num : nums){
            freq[num] += 1;
        }
        System.out.println(Arrays.toString(freq));

        int toReturn = 0;
        for(int fre : nums){
            int red_freq = fre - 1;
            System.out.println(red_freq);
            toReturn += (red_freq * ((red_freq-1)/2));
        }
        return toReturn;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
