import java.util.Comparator;
import java.util.PriorityQueue;

// convert char[] ca to string: 
	// String str= String.valueOf(ca);
// cant sort string directly
// for assigning values to string builder
	// sb.setCharAt(index,character) -- index starts from 0
//  long dividend1=Math.abs((long)dividend);
	//where dividend is int
//substring function,index1 start from 0, index2 starts from 1
	// str.substring(index1,index2);
	// but str.substring(0,0) return 0;
	//String str="hello";
		//System.out.print(str.substring(str, "")); returns 0;
//string comparision
	// str1.equals(str2);
//priority queue
	// public ListNode mergeKLists(ListNode[] lists) {
	//	 PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
			// @Override
	       //     public int compare(ListNode o1,ListNode o2){
	         //      return o1.val-o2.val;
	         //   } 
		// });
// to retrieve value from set
	//for(Character c:set)
