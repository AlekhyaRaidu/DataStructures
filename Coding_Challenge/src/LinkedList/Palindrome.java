package LinkedList;
 class ListNode8 {
	      int val;
	      ListNode8 next;
	      ListNode8(int x) { val = x; }
	 }
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isPalindrome(ListNode8 head) {
		 if(head==null || head.next==null) return true;
		 ListNode8 slow=head,fast=head.next;
		 while(fast!=null && fast.next!=null)
		 {
			slow=slow.next;
			fast=fast.next.next;
		 }
		 ListNode8 revhead=reverse(slow.next);
		 ListNode8 revtemp=revhead;
		 ListNode8 temp=head;
		 boolean res=true;
		 while(temp!=null && revtemp!=null)
		 {
			 if(temp.val!=revtemp.val)
			 {
				 res=false;
				 break;
			 }
			 temp=temp.next; revtemp=revtemp.next;
		 }
		 slow.next=reverse(revhead);
		 return res;
	 }
	 public ListNode8 reverse(ListNode8 root) {
		 ListNode8 prev=null;
		 ListNode8 temp;
		 while(root!=null)
		 {
			 temp=root.next;
			 root.next=prev;
			 prev=root;
			 root=temp;
		 }
		 return prev;
	 }
	 

}
