//Given three strings str1, str2 and str3; complete the function to find the smallest subsequence in str1 which contains all the characters in str2 
//(in any order) and not those in str3. 
package Strings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinWindow m=new MinWindow();
		String res=m.minWindow("spqrstrupvqw ", "sprt","q");
		System.out.print(res);

	}
	 public String minWindow(String s, String t, String q) 
	    {
		 System.out.print(t.length());
		// String minwin=s;
	        if(t.length()>s.length()) return "";
	        Map<Character,Integer> map=new HashMap<Character,Integer>();
	        Map<Character,Integer> ref=new HashMap<Character,Integer>();
	        Set<Character> mapq=new HashSet<Character>();
	        int count=1,left=0,minlen=s.length()+1,minleft=0;
	        for(int i=0;i<t.length();i++)
	        {
	        	if(map.containsKey(t.charAt(i))) 
	        		count=map.get(t.charAt(i))+1;
	        	map.put(t.charAt(i),count);
	        	ref.put(t.charAt(i),count);
	        	count=1;
	        }
	       
	        for(int i=0;i<q.length();i++)
	        {
	        	mapq.add(q.charAt(i));
	        }
	        count=0;
	        for(int right=0;right<s.length();right++)
	        {
	        	if(mapq.contains(s.charAt(right))) {
	        		left=right+1;
	        		map=ref;
	        		count=0;
	        	}
	        	else if(map.containsKey(s.charAt(right)))
	        	{
	        		map.put(s.charAt(right),map.get(s.charAt(right))-1);
	        		if(map.get(s.charAt(right))>=0)
	        			count++;
	        		System.out.println(count+"hi "+s.charAt(right));
	        	}
	        	//System.out.println(" "+count+"hi out "+s.charAt(right)+" "+t.length());
	        	while(count==t.length())
	        	{
	        		// System.out.print(s.charAt(right)+"here");
	        		if(minlen>=(right-left+1))
	        			 {
	        			 System.out.println(right+" "+left);
	        			 minlen=right-left+1;
	        			 minleft=left;
	        			 //System.out.print(minwin);
	        			 }
	        		
	        		if(map.containsKey(s.charAt(left)))
	        			{
	        			map.put(s.charAt(left), map.get(s.charAt(left))+1);
	        			if(map.get(s.charAt(left))>0) count--;
	        			}
	        		left++;
	        	}
	        	
	        }
	        if(minlen<=s.length()) return s.substring(minleft,minleft+minlen);
	        return "";
	        
	    }

}
