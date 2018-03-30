package LinkedList;
class Node5
{
	int val;
	Node5 next;
	Node5(int val){
		this.val=val;
	}
	
	
}

public class SortLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public Node5 sortList(Node5 node) 
	{
		if(node==null ||node.next==null ) return node;
		Node5 slow=node, fast=node.next;
		while(fast!=null && fast.next!=null)
		 {
			slow=slow.next;
			fast=fast.next.next;
		 }
		Node5 temp=slow.next;
		slow.next=null;
		Node5 L1=sortList(node);
		Node5 L2=sortList(temp);
		return merging(L1,L2);
	}
	public Node5 merging(Node5 L1,Node5 L2)
	{
		Node5 move=new Node5(0);
		Node5 dummy=move;
		while(L1!=null || L2!=null)
		{
			if(L2==null || (L1!=null && L1.val<L2.val))
			{
				move.next=L1;
				L1=L1.next;
			}
			
			else
			{
				move.next=L2;
				L2=L2.next;
			}
			move=move.next;
		}
		return dummy.next;
	}

}
// we can break also when one of lists is null by assigning other pointer as it is a LL
