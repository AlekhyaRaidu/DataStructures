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

}
