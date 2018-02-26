import java.util.LinkedHashMap;
import java.util.Map;

public class LRUSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Map<Integer,Integer> cache;
	Map.Entry<Integer, Integer> entry;
	int Capacity;
	public void LRUCache(int capacity)
	{
	 cache=new LinkedHashMap<Integer,Integer>();
	 Capacity=capacity;
		
	}
	public void put(int key,int value)
	{
		if(cache.size()<Capacity)
		{
			if(cache.containsKey(key))
				cache.remove(key);
		}
		else
		{
			cache.remove(cache.keySet().iterator().next());
		}
		cache.put(key, value);
	}
	public int get(int key)
	{
		int val=cache.getOrDefault(key,-1);
		if(val!=-1) {
			int value=cache.get(key);
			cache.remove(key);
			cache.put(key,value );
		}
		return val;
	}

}
