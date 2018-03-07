package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Entry{
	int key;
	int value;
	Entry(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
}
public class ImplementHashMap {
List<Entry> list=new ArrayList<Entry>();
public void put(int key,int value)
{
	Entry entry=new Entry(key,value);
	int i=0;
	while(i<list.size())
	{
		if(list.get(i).key==key)
		{	list.remove(i); break;}
		i++;
	}
	list.add(entry);
	return;
		
}
public int get(int key)
{
	int i=0;
	while(i<list.size())
	{
		if(list.get(i).key==key)
		{	return list.get(i).value; }
		i++;
	}
	
	return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
