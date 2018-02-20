import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
int val;
TreeNode left;
TreeNode right;
}
public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree f=new SymmetricTree();
		int[] nums= {1,1,1,1,1};
	System.out.print(	f.findTargetSumWays(nums, 3));
		

	}
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return isSymmetric(root.left,root.right);
		
		
	}
	public boolean isSymmetric(TreeNode left,TreeNode right)
	{
		if(left==null && right==null) return true;
		if(left==null || right==null) return false;
		if(left.val!=right.val) return false;
		else
	return	isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
		
	}
	//Iterative Approach
	public boolean isSymmetric1(TreeNode root) {
		if(root==null) return true;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root.left); q.add(root.right);
		TreeNode left,right;
		while(q.size()>1)
		{
			left=q.poll();
			right=q.poll();
			if(left==null && right==null) continue;
			if(left==null || right==null) return false;
			if(left.val!=right.val) return false;
			q.add(left.left);
			q.add(right.right);
			q.add(left.right);
			q.add(right.left);

		}
		return true;
	}
    int count=0;
    public int findTargetSumWays(int[] nums, int S) {
         findTargetSumWays(nums,S,0,0);
         return count;
    }
    public void findTargetSumWays(int[] nums,int S,int i,int sum)
    {
        if(i==nums.length) {
        	if(sum==S) count++;
        	return ;
        }
      //  if(sum+nums[i] ==S) {System.out.println(i+" "+count);count++; }
       // if(sum-nums[i]==S) {System.out.println(i+" "+count);count++; } 
        findTargetSumWays(nums,S,i+1,sum+nums[i]);
        findTargetSumWays(nums,S,i+1,sum-nums[i]);
        return ;
    }
		
		

	}

