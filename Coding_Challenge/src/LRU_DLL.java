import java.util.LinkedHashMap;
import java.util.Map;

class Node{
	int value;
	int key;
	Node next=null;
	Node prev=null;
}
public class LRU_DLL {
Node head=new Node();
Node tail=new Node();



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Map<Integer,Integer> map;
	static int count=0;
	static int CAPACITY;
	
	public void LRUCache(int capacity)
	{
		CAPACITY=capacity;
		 map=new LinkedHashMap<Integer,Integer>();
		 head.next=tail;
		 tail.prev=head;
		 
	}
	public void addtail(Node node)
	{
	tail.prev=node;
	
	}
	public void put(int key,int value)
	{
		Node node=new Node();
		node.value=value;
		node.key=key;
		
		if(!map.containsKey(key))
		{			
			 map.put(key, value); 
			if(count<CAPACITY)
		    {  
				count++;
				addtail(node);
			}
			else
			{
				deletenode(head);
				addtail(node);
				
			}			
		}
		else
		{
			//map.put(key, value);
			deletenode(node);
			addtail(node);
		}
			
			
		}
	}

