class RandomListNode {
    int label;
     RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };
public class CloneLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public RandomListNode copyRandomList(RandomListNode head) {
		  if(head==null) return null;
		// Insert dup nades in org list
		  RandomListNode node=head,nwnode,duphead,dup;
		// lood utnil node!=null
		  while(node!=null) {
			  nwnode=new RandomListNode(node.label);
			  nwnode.next=node.next;
			  node.next=nwnode;
			  node=nwnode.next;
			  
		  }
		 // set random pointers
		  node=head;
		  while(node!=null)
		  {
			  if(node.random!=null) node.next.random=node.random.next;
              else node.next.random=node.random;
			  node=node.next.next;
		  }
		  node=head;
		  duphead=node.next;
		 //detach dup list from org list
		  while(node!=null)
		  {
			  dup=node.next;
			  node.next=dup.next;
			  if(node.next!=null)dup.next=node.next.next;
			  else dup.next=null;
			  node=node.next;
		  }
		 
		  return duphead;
		 
	    }
	

}
