class Node3{
	int val;
	Node3 next;
	Node3(int val)
	{
		this.val=val;
	}
}
class TreeNode33{
	int val;
	TreeNode33 left;
	TreeNode33 right;
	TreeNode33(int val)
	{
		this.val=val;
	}
}
public class GenerateBalBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateBalBST g=new GenerateBalBST();
		Node3 n1=new Node3(1);
		n1.next=new Node3(2);
		//n1.next.next=new Node3(3);
		//n1.next.next.next=new Node3(4);
		//n1.next.next.next.next=new Node3(5);
		TreeNode33 root=g.generatingBalBST(n1);
		g.inorder(root);
		
	
	}
	public void inorder(TreeNode33 root)
	{
		if(root==null) return;
		System.out.println(root.val);
		inorder(root.left);
		inorder(root.right);
		return;
	}
	public TreeNode33 generatingBalBST(Node3 root)
	{
		if(root==null) return null;
		
		if(root.next==null) { TreeNode33 newnode=new TreeNode33(root.val); return newnode; }
		Node3 slow=root,fast=root.next,prev=null;
		//getting mid of LL
		while(fast!=null && fast.next!=null)
		{
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		if(prev!=null ) prev.next=null;
		if(prev==null) root=null;
		TreeNode33 newnode=new TreeNode33(slow.val);
		newnode.left=generatingBalBST(root);
		newnode.right=generatingBalBST(slow.next);
		return newnode;
	}

}
