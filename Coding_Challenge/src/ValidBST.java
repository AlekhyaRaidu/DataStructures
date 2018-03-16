 class TreeNode8 {
     int val;
      TreeNode8 left;
     TreeNode8 right;
      TreeNode8(int x) { val = x; }
 }
public class ValidBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 boolean res=true;    
public boolean isBalanced(TreeNode8 root) {
	if(root==null) return true;
			heightchecking(root);
			return res;
    }
public int heightchecking(TreeNode8 root)
{
	if(root.left==null && root.right==null)
		return 0;
	int leftht=heightchecking(root.left);
	int rightht=heightchecking(root.right);
	if(Math.abs(leftht-rightht)>1)
		res=false;
	return Math.max(leftht,rightht);
}

}
