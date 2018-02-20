 class TreeNode3 {
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode3(int x) { val = x; }
  }
public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public boolean isSameTree(TreeNode3 p, TreeNode3 q) {
	if(p==null && q==null) return true;
	if(p==null || q==null) return false;
	if(p.val==q.val)
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	return false;
	
        
    }
	

}
