package Strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseCharInEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is Code a Code";
		ReverseCharInEachWord r=new ReverseCharInEachWord();
		s=r.reverseWords(s);
		System.out.print(s);
		

	}
	public String reverseWords(String s) {
		s=s.trim();
       StringBuilder sb=new StringBuilder();
       Set<String> set=new HashSet<String>();
       for(int i=0;i<s.length();i++)
       {
    	   sb.append(s.charAt(i));
       }
     
       System.out.print(sb);
    
int start=0,end=0;
       for(int i=0;i<sb.length();i++)
       {
    	   if(sb.charAt(i)==' ' || sb.charAt(i)==',' || i==sb.length()-1)
    	   {
    		   if(i==sb.length()-1) end++;
    		   System.out.println(start+" "+end+" "+sb.substring(start,end));
    		   if(set.contains(sb.substring(start,end)))
    		   {
    			   System.out.println("ki");
    			   sb.delete(start, end);
    		   }
    		   else set.add(sb.substring(start,end));
    		   start=i+1;
    	   }
    	  
    	   end++;
       }
       return sb.toString();
	}
	

}
