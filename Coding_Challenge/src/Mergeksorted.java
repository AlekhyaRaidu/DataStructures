import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Mergeksorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ListNode[] lists =new ListNode[] ;
		
	}
	 public ListNode mergeKLists1(ListNode[] lists) {
		 if(lists.length==0 || lists==null) return null;
		 PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
			 @Override
	            public int compare(ListNode o1,ListNode o2){
	               return o1.val-o2.val;
	            } 
		 });
		 for(ListNode node:lists)
			 if(node!=null  )
			 pq.add(node);
		 ListNode head=new ListNode(0);
		 ListNode dummy=head;
		 while(!pq.isEmpty())
		 {
			 head.next=pq.poll();
			 head=head.next;
			 if (head.next!=null)
	                pq.add(head.next);
		 }
		 return dummy.next;
		 
	        
	    }
//	 __________________________________________________________________________
	 
	 
	 public ListNode mergeKLists(ListNode[] lists) {
		 if(lists==null || lists.length==0) return null;
		// ListNode main=lists[0];
		 int low=0,high=lists.length-1;
		 return merge(lists,low,high);
		
	 }
	 public ListNode merge(ListNode[] lists,int low,int high)
	 {
		 if(low<high)
		 {
			int mid=(low+high)/2;
			return mergeTwoLists(merge(lists,low,mid),merge(lists,mid+1,high));
		 }
		 return lists[low];
	 }
	 
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1==null ) return l2;
		 if(l2==null) return l1;
		 ListNode head=new ListNode(0); // for retriving very first value, if it is assigned null cant get the fisrt elemnt using dummy
		 ListNode dummy=head;
		 while(l1!=null || l2!=null)
		 {
			 if(l2==null || (l1!=null && l1.val<l2.val) ) {
                // System.out.print(l1.val);
				 head.next=l1;
				 l1=l1.next;
			 }
			 else
			 {
				 head.next=l2;
				 l2=l2.next;
			 }
			 head=head.next;
		 }
		 return dummy.next;		
	    }

}
