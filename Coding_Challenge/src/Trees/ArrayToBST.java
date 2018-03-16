package Trees;
 class TreeNode6 {
     int val;
     TreeNode6 left;
     TreeNode6 right;
     TreeNode6(int x) { val = x; }
 }
public class ArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayToBST a=new ArrayToBST();
		int[] nums= {1,2,3,4,5,6};
		TreeNode6 root=a.sortedArrayToBST(nums);
		inorder(root);
	}
	static void inorder(TreeNode6 root)
	{
		if(root==null) return;
		System.out.println(root.val);
		inorder(root.left);
		inorder(root.right);
		return;
	}
	public TreeNode6 sortedArrayToBST(int[] nums)
	{
		if(nums.length==0 || nums==null) return null;
		return sortedArrayToBST(nums,0,nums.length-1);
	}
	 public TreeNode6 sortedArrayToBST(int[] nums,int low,int high) {
	        int mid=0;
	        if(low>high) return null;
	        mid=(low+high)/2;
	        TreeNode6 newnode=new TreeNode6(nums[mid]);
	        newnode.left=sortedArrayToBST(nums, low, mid-1);
	        newnode.right=sortedArrayToBST(nums, mid+1, high);
	       // if(newnode.left!=null && newnode.right!=null)System.out.println(newnode.val+" "+newnode.left.val+" "+newnode.right.val);
	        return newnode;
	        
	    }

}
