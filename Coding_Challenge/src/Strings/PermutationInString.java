package Strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationInString p=new PermutationInString();
		System.out.print(p.checkInclusion("adc", "dcda"));

	}
	 public boolean checkInclusion(String s1, String s2) {
		 if(s1==null || s2==null || (s1.length()>0 && s2.length()==0) || s1.length()>s2.length()) return false;
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
		 int count=1;
		 for(int i=0;i<s1.length();i++)
		 {
			 if(map.containsKey(s1.charAt(i)))
				 { count=map.get(s1.charAt(i)); count++;}
			 	map.put(s1.charAt(i), count); count=1;
		 }
		 int start=-1;
		 for(int i=0;i<s2.length();i++)
		 {
			 if(map.containsKey(s2.charAt(i)) )
					{
						 if(start==-1 || (start>=0 && start==i))
						 {
						 if(start==-1) { start=i;}
						 System.out.println(i+" "+start);
						 start++;
						 count= map.get(s2.charAt(i)); count--;
						 if(count>0) map.put(s2.charAt(i), count);
						 else map.remove(s2.charAt(i));
						 }
				 else return false;
					}
		 }
		 if(map.isEmpty()) return true;
		 return false;
	        
	    }

}
