package Strings;

public class ShortestStrAttach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestStrAttach s=new ShortestStrAttach();
		String s1=s.shortestSubSeq("skg","geeks");
		System.out.print(s1);

	}
	public String shortestSubSeq(String s1,String s2)
	{
		if(s1==null || s2==null) return null;
		if(s1.length()==0) return s2;
		if(s2.length()==0) return s1;
		String res=null;
		 res= findShorteststr(s1,s2);
		if(res==null) res=findShorteststr(s2,s1);
		return res;
	}
	public String findShorteststr(String s1,String s2)
	{
		int len=0,index2=0;
		for(int index1=s1.length()-1;index1>=0;index1--)
		{
			if(index2<s2.length() && s1.charAt(index1)==s2.charAt(index2++))
				len++;
			else break;
			
		}
		s1=s1+s2.substring(len,s2.length());
		return s1;
	}
}
