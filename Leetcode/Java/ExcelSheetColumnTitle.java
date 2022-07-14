//Leetcode 168

import java.util.*;
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        Map<Integer, String> num_map = new HashMap<>();
        int start = 65;
        String toReturn = "";
        for(int i = 0; i < 26; i++){
            num_map.put(i, Character.toString((char) start));
            start ++;
        }

        while(columnNumber != 0){
            System.out.println(columnNumber%26);
            toReturn = (num_map.get((columnNumber - 1)% 26)) + toReturn;
            columnNumber = (columnNumber - 1)/ 26;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        //int colNum = 1;
        //int colNum1 = 28;
        //int colNum2 = 701;
       System.out.println(convertToTitle(701));
    }
}
