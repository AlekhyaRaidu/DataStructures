package LinkedList;
 class ListNode5 {
	      int val;
	      ListNode5 next;
	      ListNode5(int x) { val = x; }
	  }
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode5 l1=new ListNode5(8);
		l1.next=new ListNode5(1);
		ListNode5 l2=new ListNode5(2);
		l2.next=new ListNode5(3);
		AddTwoNumbers a=new AddTwoNumbers();
		l1=a.addTwoNumbers(l1, l2);
		while(l1!=null)
			{
			System.out.print(l1.val+"->"); l1=l1.next;
			}

	}
public ListNode5 addTwoNumbers(ListNode5 l1, ListNode5 l2) {
	if(l2==null) return l1;
	if(l1==null) return l2;
	
	ListNode5 node1=l1,node2=l2,newnode=new ListNode5(0),dummy=newnode,prev=newnode;
	int sum=0,carry=0;
	while(node1!=null|| node2!=null)
	{
		if(node1!=null)
			{ sum+=node1.val; node1=node1.next;}
		if(node2!=null)
			{ sum+=node2.val; node2=node2.next;}
		sum=sum+carry;
		carry=sum/10;
		prev.next=new ListNode5(sum%10);
		prev=prev.next;
		sum=0;
	}
	if(carry==1) 
	prev.next=new ListNode5(1);
	return dummy.next;
        
    }

}
