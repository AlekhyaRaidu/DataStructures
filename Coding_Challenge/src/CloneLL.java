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
		  RandomListNode root = null,prev=null,orghead=head,dummy=root,newhead=null,newdummy=newhead;
		  while(head!=null)
		  {
			  root=head;
			  if(prev!=null) prev.next=root;
			  prev=root;
			  root=root.next;
			  head=head.next;
		  }
		  head=orghead;
		  root=dummy;
		  while(newhead!=null)
		  {
			  newhead=head;
			  newhead=newhead.next;
			  head=head.next;
		  }
		  while(head!=null)
		  {
			  prev=head.next;
			  head.next=root;
			  root=root.next;
			  head=prev;
		  }
		  head=orghead;
		  root=dummy;
		  while(root!=null)
		  {
			  root.random=head.random.next;
			  root=root.next;
		  }
		  
		 
	    }
	

}
