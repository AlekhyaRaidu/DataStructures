
public class Tradedesk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tradedesk1 t=new Tradedesk1();
		String[]  strings= {"afx","","poq"};
		System.out.print(t.MergeStrings1(strings));
		

	}
	 String MergeStrings1(String[] strings) {
		  if(strings==null || strings.length==0) return "";
		  String s1=strings[0];
		  for(int i=1;i<strings.length;i++)
		  {
			  s1=merging(s1,strings[i]);
			//  System.out.println(s1);
		  }
		  return s1;
	  }
	  public String merging(String s1,String s2)
	  {
		 // System.out.println(s1+" "+s2);
		  if (s1==null) return s2;
		  if(s2==null) return s1;
		  int i=0,j=0,k=0,len=s1.length()+s2.length(); 
		  StringBuilder s3=new StringBuilder();
		  while(k<len)
		  {
			  int a;
			  a=(i<s1.length())?s1.charAt(i)-'0':Integer.MAX_VALUE;
			  int b;
			  b=(j<s2.length())?s2.charAt(j)-'0':Integer.MAX_VALUE;
			  System.out.println(a+" "+b);
			  if(a<b) 
				  s3.append(s1.charAt(i++));
			  else
			  {
				  s3.append(s2.charAt(j++));
				//  System.out.println("poc");
			  }
				  
		//	  System.out.println(s3);
			  k++;
			  
		  }
		  return s3.toString();
	  }

}
