import java.util.Arrays;

public class Tradedesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tradedesk t=new Tradedesk();
		String[] s= {"ab","po"};
		System.out.print(t.MergeStrings(s));
		

	}
   String MergeStrings(String[] strings) {
		
		StringBuilder builder = new StringBuilder();
		for(String s : strings) {
		    builder.append(s);
		}
		String str = builder.toString();
		str=sortingString(str);
		return str;
	    }
	  public String sortingString(String s)
	    {	       
	        char[] chars = s.toCharArray();
	        Arrays.sort(chars);
	      return String.valueOf(chars);
	    }
	  String MergeStrings1(String[] strings) {
		  if(strings==null || strings.length==0) return "";
		  String s1=strings[0];
		  for(int i=1;i<strings.length;i++)
		  {
			  s1=merging(s1,strings[i]);
		  }
		  return s1;
	  }
	  public String merging(String s1,String s2)
	  {
		  if (s1==null) return s2;
		  if(s2==null) return s1;
		  int i=0,j=0,len=s1.length()+s2.length(); 
		  StringBuilder s3=new StringBuilder();
		  while(s3.length()<=len)
		  {
			  int a;
			  a=(i<s1.length())?s1.charAt(i)-'0':Integer.MAX_VALUE;
			  int b;
			  b=(j<s2.length())?s2.charAt(i)-'0':Integer.MAX_VALUE;
			  
			  if(a<b) 
				  s3.append(s1.charAt(i++));
			  else
				  s3.append(s2.charAt(j++));
			  
		  }
		  return s3.toString();
	  }
	  
	
	  
}
