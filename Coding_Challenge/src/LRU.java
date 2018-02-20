// use of Linkedhashmap, remove eldest entry 
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	LinkedHashMap<Integer,Integer> map;
	public void LRUCache(int capacity)
	{
		map=new LinkedHashMap<Integer,Integer>(capacity,0.7f,true)
				{
			public boolean removeEldestEntry(Map.Entry eldest)
			{
				return size()>capacity;
			}};
				
	}
public void put(int key,int value)
{
map.put(key, value);
}
public int get(int key)
{
	return map.getOrDefault(key,-1);
}
}
