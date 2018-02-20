class TreeNode1{
	int val;
	TreeNode1 left;
	TreeNode1 right;
}
public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValidBST(TreeNode1 root)
	{
		return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}
	public boolean isValidBST(TreeNode1 root,long min,long max)
	{
		if(root==null) return true;
		if(root.val<=min && root.val>=max) return false;
		return (isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max));
	}
	
	

}
