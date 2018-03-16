
public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeWays d=new DecodeWays();
		int res=d.numDecodings("0");
		System.out.print(res);
	}
	 public int numDecodings(String s) 
	 {
		 if(s==null || s.length()==0 || s=="0") return 0;
	       int[] dp=new int[s.length()+1];
	       dp[0]=1;
	       dp[1]=1;
	       for(int i=2;i<=s.length();i++)
	       {
	    	   int first=s.charAt(i-1)-'0';
	    	   int second=Integer.parseInt(s.substring(i-2,i));
	    	   if(first>0 && first<=9) dp[i]=dp[i-1];
	    	   if(second>9 && second<=26) dp[i]=dp[i]+dp[i-2];
	       }
	       return dp[s.length()];
	     
	    }
	       
	 }


