package Strings;

public class ShortestSubSeq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestSubSeq s=new ShortestSubSeq();
		String str=s.shortestSubSeq("geek", "ekef");
		System.out.print(str);

	}
	public String shortestSubSeq(String s1,String s2)
	{
		if(s1==null || s2==null) return null;
		if(s1.length()==0 || s1.equals(s2)) return s2;
		if(s2.length()==0) return s1;
		String minstr=(s1.length()>s2.length())?s2:s1;
		String maxstr=(minstr.equals(s1))?s2:s1;
		int j=0;
		for(int i=0;i<maxstr.length();i++)
		{
			System.out.println(i+" "+maxstr.charAt(i)+" "+minstr.charAt(j));
			
			if(j==minstr.length()) return maxstr; 
			if((maxstr.charAt(i)==minstr.charAt(j)))
				{  j++;}
			
		}
		
			maxstr=maxstr+minstr.substring(j,minstr.length());
		return maxstr;
		
	}

}
