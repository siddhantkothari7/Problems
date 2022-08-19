package Interviews;

import java.util.*;
public class Amazon1 {

    public static int minimizeMemory(int[] processes, int m){
        int total_sum = 0;
        for(int process : processes){
            total_sum += process;
        }

        int max_sum = 0;
        for(int k = 0; k < m; k ++){
            max_sum += processes[k];
        }

        int i = 0;
        int j = i + m;
        int temp_sum = max_sum;

        
        while(j < processes.length){
            temp_sum -= processes[i];
            temp_sum += processes[j];
            if(temp_sum > max_sum){
                max_sum = temp_sum;
            }
            //temp_sum = Math.max(temp_sum, max_sum);
            i += 1;
            j += 1;


        }
        return total_sum - max_sum;
    }


    public static void main(String[] args) {
        int[] processes = {10,4,8,13,20};
        int m = 2;

        int[] processes1 = {10,4,8,1};
        int m1 = 2;

        int[] processes2 = {4,6,10,8,2,1};
        int m2 = 3;
        System.out.println(minimizeMemory(processes2, m2));
        
    }
}
