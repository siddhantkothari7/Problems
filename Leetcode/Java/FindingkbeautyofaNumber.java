//Leetcode 2269

public class FindingkbeautyofaNumber {
	public static int divisorSubstrings(int num, int k) {
        String number = num + "";
        int ret = 0;
        for(int i = 0; i < number.length()-k+1; i++) {
        	int substring_num = Integer.parseInt(number.substring(i,i+k));
        	if(substring_num == 0) continue;
        	if(num % substring_num == 0) {
        		 ret += 1;
        	}
        }
        return ret;
    }

	public static void main(String[] args) {
		//int a = 430043;
		int b = 240;
		System.out.println(divisorSubstrings(b,2));
	}

}
