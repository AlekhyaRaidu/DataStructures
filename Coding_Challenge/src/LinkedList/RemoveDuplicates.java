package LinkedList;
class Node4
{
	int val;
	Node4 next;
	Node4(int val){
		this.val=val;
	}
	
	
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicates r=new RemoveDuplicates();
		Node4 n1=new Node4(3);
		n1.next=null;
		//n1.next.next=new Node4(7);
	//	n1.next.next.next=new Node4(6);
		//n1.next.next.next.next=new Node4(7);
	   n1=r.removingDuplicates(n1);
	while(n1!=null)
		{	System.out.print(n1.val+"->");
			n1=n1.next;}
	
		
	}
	public Node4 removingDuplicates(Node4 root)
	{
		if(root==null) return null;
		Node4 node=root, prev=null;
		int checker =0;
		while(node!=null) 
		{
				int bitIndex=1<<node.val;
				// checking visited or not
					if((checker&bitIndex)==0)
						{
						System.out.println(node.val);
						prev=node;
						// if not visisted, set checker
						checker=(checker|bitIndex);
						}
					else
					{
						System.out.println("2nd"+node.val);
						prev.next=node.next;
					}
				
						node=node.next;

		}
		return root;
	}

}
