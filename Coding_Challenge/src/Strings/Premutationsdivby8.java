package Strings;

public class Premutationsdivby8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Premutationsdivby8 p=new Premutationsdivby8();
		StringBuilder sb=new StringBuilder("952");
		boolean res=p.permutations(sb, 0);
		System.out.print(res);

	}
	public boolean permutations(StringBuilder str,int index)
	{
		if(index==str.length()) {
			if(! isEightDivisible(str))
				return false;
		}
		for(int i=index;i<str.length();i++)
		{
			str=swap(str,index,i);
			if(permutations(str,index+1))
				str=swap(str,index,i);
			else return false;
		}
		return true;
	}
	public StringBuilder swap(StringBuilder str,int i,int j)
	{
		char temp=str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j, temp);
		return str;
		
	}
	public boolean isEightDivisible(StringBuilder str)
    {
        int n = str.length();
      
        // Empty string
        if (n == 0)
            return false;
      
        // If there is single digit
        if (n == 1)
            return ((str.charAt(0)-'0')%8 == 0);
      
        // If there is double digit
        if (n == 2)
            return (((str.charAt(n-2)-'0')*10 + (str.charAt(n-1)-'0'))%8 == 0);
      
        // If number formed by last three digits is
        // divisible by 8.
        int last = str.charAt(n-1) - '0';
        int second_last = str.charAt(n-2) - '0';
        int third_last = str.charAt(n-3) - '0';
      
        return ((third_last*100 + second_last*10 + last) % 8 == 0);
    }

}
