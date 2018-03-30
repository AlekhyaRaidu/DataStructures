package Strings;


public class ReverseCharInEachWord {
	  StringBuilder sb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  This     a               got  ";
		ReverseCharInEachWord r=new ReverseCharInEachWord();
		s=r.reverseWords(s);
		System.out.print(s);
		

	}
	public String reverseWords(String s) {
		
        sb=new StringBuilder(s.trim());   
      reverse(0,sb.length()-1);
      System.out.println(sb);
      int start=0,end=0;
      for(int i=0;i<sb.length();i++)
      {
    	 
    	  if(sb.charAt(i)==' ' || i==sb.length()-1)
    	  {
    		  System.out.println(start+" "+end+" "+i+" "+sb.charAt(start)+" "+sb.charAt(end));
    		  if(start==end && sb.charAt(start)==' ') { System.out.println("here"+start); sb.deleteCharAt(start); i--; end--;}
    		  else if(sb.charAt(i)==' ') 
    			 reverse(start,end-1);
    		  else 
    			 reverse(start,end);
    		 start=i+1;
    	  }
    	   end++;
      }
       return sb.toString();
	}
	public  void reverse(int start,int end) {
		char temp;
		while(start<end)
		{
			temp=sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;  end--;
		}
		return;
	}

}
