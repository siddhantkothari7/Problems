//Leetcode 1281

//import java.util.*;
public class SubtracttheProductandSumofDigitsofanInteger {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product =  1;
        while(n != 0){
            int val = n%10;
            sum += val;
            product *= val;
            n = n/10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        //int num = 234;
        int num1 = 4421;
        System.out.println(subtractProductAndSum(num1));

        
    }
    
}
