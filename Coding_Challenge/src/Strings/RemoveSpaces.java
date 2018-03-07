package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveSpaces r=new RemoveSpaces();
		//String s=" geek sg j";
		//s.trim();
		//s=s.replaceAll("\\s", "");
		String s=r.removingSpaces("geeks f");
		System.out.print(s);

	}
	public String removingSpaces(String str) {
		if(str.length()==0 || str==null) return "";
		//int index=0;
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				res=res+str.charAt(i);
			}
				
		}
		return res;
		
	}
}
