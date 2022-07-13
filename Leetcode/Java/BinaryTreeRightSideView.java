
import java.util.*;

public class BinaryTreeRightSideView {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
		    this.left = left;
		    this.right = right;
		}
	}
	
	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		rightView(root, ret, 0);
		return ret;
	}
	
	public static void rightView(TreeNode curr, List<Integer> ret, int currDepth){
	if(curr == null) {
		return;
	} 
	if(currDepth == ret.size()) {
		ret.add(curr.val);
	}
		rightView(curr.right, ret, currDepth + 1);
		rightView(curr.left, ret, currDepth + 1);
	}


	public static void main(String[] args) {
		TreeNode T = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)), 
						new TreeNode(3, null, new TreeNode(4, null, null)));

		System.out.println(rightSideView(T));
	}
}




