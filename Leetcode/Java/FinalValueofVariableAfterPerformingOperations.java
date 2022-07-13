
public class FinalValueofVariableAfterPerformingOperations {
	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for(String opr : operations) {
			if(opr.equals("X++") || opr.equals("++X")) {
				x += 1;
			} else {
				x -= 1;
			}
		}
		return x;
    }

	public static void main(String[] args) {
		String[] oprs = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(oprs));

	}

}
