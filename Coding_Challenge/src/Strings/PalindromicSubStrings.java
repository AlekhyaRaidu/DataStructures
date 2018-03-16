// max avoid storing res in DS...return dirctly as below
package Strings;

import java.util.HashSet;
import java.util.Set;

public class PalindromicSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromicSubStrings p=new PalindromicSubStrings();
		Set<String> set=new HashSet<String>();
		set=p.palindromicSubStrings("abaaa");
		System.out.print(set);
		

	}
	public Set<String> palindromicSubStrings(String str)
	{
		int len=1,end=0;
		boolean[][] dp=new boolean[str.length()][str.length()];
		Set<String> set=new HashSet<String>();
		while(len<=str.length())
		{
			for(int start=0;start<=str.length()-len;start++)
			{
				end=start+len-1;
				if(str.charAt(start)==str.charAt(end))
				{
					if((start+1)>(end-1) || dp[start+1][end-1])
						{ dp[start][end]=true; 
						
						System.out.println (str.substring(start,end+1));
								set.add(str.substring(start,end+1));}
				}
			}
			len++;
		}
		return set;
	}
//	____________________________________________________
	// for printing longest palidrome substring
	 public String longestPalindrome(String s) {
	        int len=1,end=0;
			boolean[][] dp=new boolean[s.length()][s.length()];
	        int maxlen=0,startpt=0;
	    
	        if(s==null || s.length()==0) return "";
			while(len<=s.length())
			{
				for(int start=0;start<=s.length()-len;start++)
				{
					end=start+len-1;
					if(s.charAt(start)==s.charAt(end))
					{
						if((start+1)>(end-1) || dp[start+1][end-1])
							{
                         dp[start][end]=true; 
							    if(len>maxlen)
	                                { startpt=start; maxlen=len;}
							
	                        }
				    }
				}
             len++;
     }
			return s.substring(startpt,startpt+maxlen);
	    }
	
	
	
	

}
