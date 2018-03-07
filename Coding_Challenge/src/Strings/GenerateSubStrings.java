package Strings;

public class GenerateSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateSubStrings g=new GenerateSubStrings();
		g.generatingSubStr("Alekhya");
	}
	public void generatingSubStr(String str)
	{
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			j=0;
			while(j<=i)
				System.out.println(str.substring(j++,i+1));
			
		}
		
	}

}
