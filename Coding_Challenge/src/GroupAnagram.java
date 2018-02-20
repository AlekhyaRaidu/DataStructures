import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public List<List<String>> groupAnagrams(String[] strs) {
			 if(strs.length==0 || strs==null) return new ArrayList<List<String>>();
			 Map<String,List<String>> map=new HashMap<String,List<String>>();
			 for(String s:strs)
			 {
				 char[] ca=s.toCharArray();
				 Arrays.sort(ca);
				 String key=String.valueOf(ca);
				 if(!map.containsKey(key))
					 map.put(key, new ArrayList<String>());
					 map.get(key).add(s);	 
			 }
			 return new ArrayList<List<String>>( map.values());
		 }
}
