 package LinkedList;
 class ListNode9 {
	      int val;
	      ListNode9 next;
	      ListNode9(int x) { val = x; }
	 }


public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode9 removeNthFromEnd(ListNode9 head, int n) {
		   if(head==null) return null;
		   int count=1;
		   ListNode9 temp=head,t1=head,prev=null;
		   while(count<n)
		   {
			  if(temp==null) return null; 
			   count++;
			  temp=temp.next;
			 
		   }
		   while(temp.next!=null)
		   {
	           prev=t1;
			   t1=t1.next;
			   temp=temp.next;
		   }
		  if(prev==null) { temp=head; head=head.next; temp.next=null; }
		  else prev.next=t1.next;
	         //System.out.print(prev.val+" "+t1.val);
		  return head;
		   
	    }

}
