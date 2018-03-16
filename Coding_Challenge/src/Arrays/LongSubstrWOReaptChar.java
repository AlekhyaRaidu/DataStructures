// before changing eleme, check whetehr u need it in future
// working with string probls=> check for invalid input and white spaces(before, after, between)
// working with int problems => overflow?? sign??
package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongSubstrWOReaptChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongSubstrWOReaptChar l=new LongSubstrWOReaptChar();
		String s="pwwkew";
		int len=l.lengthOfLongestSubstring(s);
		System.out.print(len);
	}
	   public int lengthOfLongestSubstring(String s) {
	        if(s==null || s.length()==0) return 0;
	        Set<Character> set=new HashSet<Character>();
	        int start=0;
	        int maxlen=0;
	        for(int i=0;i<s.length();i++)
	        {
	        	if(set.contains(s.charAt(i))) {
	        		for(int j=start;j<i;j++)
	        		{
	        			set.remove(s.charAt(j));
	        			if(s.charAt(j)==s.charAt(i)) { start=j+1; break;}
	        		}
	        	}
	        	
	        		set.add(s.charAt(i));
	        		if(maxlen<(i-start+1))
	        		{
	        			maxlen=i-start+1;
	        		}
	        	
	        }
	       
	        return maxlen;
	    }


}
