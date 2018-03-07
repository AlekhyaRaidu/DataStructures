package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReOrganizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReOrganizeString r=new ReOrganizeString();
		String res=r.reorganizeString("baaba");
		System.out.print(res);

	}
	public String reorganizeString(String S) {
		if(S==null || S.length()==0) return S;
		char[] carry=S.toCharArray();
		Arrays.sort(carry);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<carry.length;i++)
			sb.append(carry[i]);
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<sb.length();i++)
		{
			if(map.containsKey(sb.charAt(i)))
				count=map.get(sb.charAt(i))+1;
			map.put(sb.charAt(i), count);
			count=1;
		}
		char c= ' ';
		for(int i=0;i<sb.length()-1;i++)
		{
			
			if(c!=sb.charAt(i))
			{c=sb.charAt(i);
				map.remove(c);
				
			}
			if(sb.charAt(i)==sb.charAt(i+1) && !map.isEmpty())
			{
				
				char ch=map.keySet().iterator().next();
				
				map.put(ch, (map.get(ch)-1));
				
				if(map.get(ch)==0) map.remove(ch);
				int index=sb.indexOf(Character.toString(ch));
				
				sb.deleteCharAt(index);
				sb.insert(i+1, ch);
				System.out.println(sb+" "+index);
				i=i+1;
			}
			else if(sb.charAt(i)==sb.charAt(i+1))
				return "no output";

				
			
		}
		return sb.toString();
        
    }

}
