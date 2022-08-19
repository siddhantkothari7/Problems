package Interviews;

import java.util.*;
public class Amazon2 {
    public static int getMinimum(int[] parcels, int k){
        List<Integer> parcels_lst = new ArrayList<>();
        for(int parcel : parcels){
            parcels_lst.add(parcel);
        }

        int i = 1;
        int sum = 0;
        while(parcels_lst.size() != k){
            if(!parcels_lst.contains(i)){
                parcels_lst.add(i);
                sum += i;
            }
            i += 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Test Case 1
        int[] parcels = {2,3,6,10,11};
        int k = 9;

        // //Test Case 2
        // int[] parcels1 = {6,5,4,1,3};
        // int k1 = 7;

        // //Test Case 3
        // int[] parcels2 = {4,5,7,1};
        // int k2 = 4;
        
        System.out.println(getMinimum(parcels, k));
        
    }
    
}
