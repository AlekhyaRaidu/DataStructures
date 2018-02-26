import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagram g=new GroupAnagram();
		String[] str= {"tea","tol","ate","lot"};
		List<List<String>> list=new ArrayList<List<String>>();
		list=g.groupAnagrams(str);
		System.out.print(list.get(0));
		
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
			 String[] res=new String[strs.length]; int i=0;
			 for(List<String> list:map.values())
			 {
				 for(int j=0;j<list.size();j++)
				 res[i++]=list.get(j);
			 }
			 System.out.print(res[0]+"  "+res[1]);
			 return new ArrayList<List<String>>( map.values());
		 }
}
