//Leetcode 2315

public class CountAsterisks {
    public static int countAsterisks(String s) {
        int bar_count = 0;
        int asterisk_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|') bar_count += 1;
            if(s.charAt(i) == '*' && bar_count%2 == 0) asterisk_count += 1;
        }
        return asterisk_count;
    }

    public static void main(String[] args) {
        //String s = "l|*e*et|c**o|*de|";
        //String s1 = "iamprogrammer";
        String s3 = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s3));
        
    }
    
}
