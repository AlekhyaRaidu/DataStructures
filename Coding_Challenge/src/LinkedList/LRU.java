package LinkedList;

import java.util.HashMap;
import java.util.Map;

class ListNode7{
	int value;
	ListNode7 next;
	ListNode7(int value)
	{
		this.value=value;
	}
}
public class LRU {
	ListNode7 start=new ListNode7(0);
	Map<Integer,ListNode7> map=new HashMap<Integer,ListNode7>();
	int count=0,capacity1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public  LRU(int capacity) {
	        capacity1=capacity;
	    }
	    
	    public int get(int key) {
	    	if(map.containsKey(key))
	    	{
	    		return map.get(key).value;
	    	}
	    	return -1;
	        
	    }

	    public void updateList(ListNode7 node)
	    {
	    	ListNode7 temp=node;
	    	if(temp==null) {node=null; return;}
	    	node.value=node.next.value;
	    	node.next=node.next.next;
	    	addToEnd(temp);
	    	
	    }
	public void addToEnd(ListNode7 node)
	{
		ListNode7 temp=start,prev=null;
		while(temp!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=node;
	}
	public void removeLRU()
	{
		
		start.next=start.next.next;
		return;
	}
	
	    public void put(int key, int value) {
	    	ListNode7 newnode;
	    	
	    	 if(map.containsKey(key))
	    	{
	    		newnode=map.get(key);
	    		updateList(newnode);
	    	}
	    	else{
	    		if(count==capacity1) { removeLRU(); count--; }
	    		newnode=new ListNode7(value);
	    		 map.put(key, newnode);
	    		 count++;
	    	}
	       
	        addToEnd(newnode);
	    }

}
