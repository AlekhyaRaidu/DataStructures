package Trees;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class TreeNode4{
	int val;
	TreeNode4 left;
	TreeNode4 right;
	TreeNode4(int val,TreeNode4 left,TreeNode4 right)
	{
		this.val=val;
		this.left=left;
		this.right=right;
	}
}
class ListNode4{
	int val;
	ListNode4 next;
	ListNode4(int val){
		this.val=val;
	}
}
public class EachDepthLL {
Map<Integer,ListNode4> map=new HashMap<Integer,ListNode4>();
public static void main(String[] args) {
	// TODO Auto-generated method stub
	TreeNode4 n1=new TreeNode4(4,null,null);
	TreeNode4 n2=new TreeNode4(8,null,null);
	TreeNode4 t=new TreeNode4(6,n1,n2);
   EachDepthLL e=new EachDepthLL();
e.eachDepthLL(t);
	
}
	public void eachDepthLL(TreeNode4 root)
	{
	eachDepthLL( root,0);
	Iterator<ListNode4> it=map.values().iterator();
	while(it.hasNext())
		System.out.print(it.next().val);

	}
	public void eachDepthLL(TreeNode4 root,int ht)
	{
		
		if(root==null) return;
		System.out.print(root.val+" "+ht);
		ListNode4 temp,newnode=new ListNode4(root.val);
		if(map.containsKey(ht))
		{
			temp=map.get(ht);
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
		}
		else
			map.put(ht,newnode);
		eachDepthLL(root.left, ht+1);
		eachDepthLL(root.right, ht+1);
		return ;
		
	}

}
