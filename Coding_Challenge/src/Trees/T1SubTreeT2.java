package Trees;
class TreeNode9 {
    int val;
    TreeNode9 left;
    TreeNode9 right;
    TreeNode9(int x) { val = x; }
}
public class T1SubTreeT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isSubtree(TreeNode9 s, TreeNode9 t) {
	        if(s==null) return false;
	        if(t==null) return true;
	        if(s.val==t.val && isIdentical(s,t))
	            return true;
	        return isSubtree(s.left,t) || isSubtree(s.right,t);
	    }
	    public boolean isIdentical(TreeNode9 s, TreeNode9 t)
	    {
	        if(s==null && t==null) return true;
	        if(s==null || t==null) return false;
	        if(s.val==t.val)
	            return isIdentical(s.left,t.left) && isIdentical(s.right,t.right);
	         return false;
	    }
	}


