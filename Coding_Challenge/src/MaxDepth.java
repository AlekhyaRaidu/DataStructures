
public class MaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 int max=1;
	    public int maxDepth(TreeNode root) {
	        if(root==null) return 0;
	        maxDepth(root,1);
	        return max;   
	    }
	    public void maxDepth(TreeNode root,int level)
	    {
	        max=Math.max(max,level);
	        if(root.left!=null) maxDepth(root.left,level+1);
	        if(root.right!=null) maxDepth(root.right,level+1);
	        return;
	        
	    }

}
