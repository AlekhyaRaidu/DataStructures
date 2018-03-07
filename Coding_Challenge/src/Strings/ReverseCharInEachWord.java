package Strings;

public class ReverseCharInEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" This is a Code";
		ReverseCharInEachWord r=new ReverseCharInEachWord();
		s=r.reversingChars(s);
		System.out.print(s);
		

	}
	public String reversingChars(String str)
	{
		if(str.length()==0 || str==null) return null;
		String res="";
		int start=0,end=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				if(end>start) res=res+reversingString(str.substring(start,end));
				res=res+' ';
				start=i+1;
			}
			end++;
		}
		if(str.charAt(str.length()-1)!=' ') res=res+reversingString(str.substring(start,end));
		return res;
	}
	public String reversingString(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		return res;
	}

}
