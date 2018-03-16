// https://discuss.leetcode.com/topic/20806/convert-string-to-float/3
package Arrays;

public class Stringtodouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringtodouble s=new Stringtodouble();
		System.out.println("hey");
		double ans=s.stringToDouble("-123.14567");
		System.out.println(ans);
	}
	public double stringToDouble(String num)
	{
		if(num==null || num.length()==0) return 0;
		double res=0;
		int sign=1; int i=0;
		num=num.trim();
		if(num.charAt(0)=='+' || num.charAt(0)=='-')
		{
			sign=num.charAt(0)=='+'?1:-1;
			i++;
		}
		while(i<num.length() &&   num.charAt(i)!='.')
		{
			res=res*10+(num.charAt(i)-'0');
			//System.out.println(res+" "+i+" "+num.charAt(i));
			i++;
		}
		System.out.println(res+" "+i);
		if( i==num.length()) return (float) sign *res;
		double w=0.1;
		i++;
		while(i<num.length())
		{
			res=res+w*(num.charAt(i)-'0');
			w=w/10;
			i++;
		}
		
		 return (float) sign *res;
		

	}

}
