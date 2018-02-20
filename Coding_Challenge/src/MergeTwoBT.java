 class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2(int x) { val = x; }
  }
public class MergeTwoBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode2 mergeTrees(TreeNode2 t1, TreeNode2 t2) {
		 if(t1==null && t2==null) return null;
		 int val=((t1==null)?0:t1.val)+((t2==null)?0:t2.val);
		 TreeNode2 newNode=new TreeNode2(val);
		 newNode.left=mergeTrees((t1==null)?null:t1.left, (t2==null)?null:t2.left);
		 newNode.right=mergeTrees((t1==null)?null:t1.right, (t2==null)?null:t2.right);
		 return newNode;
		 
	        
	    }

}
