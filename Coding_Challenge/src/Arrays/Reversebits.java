package Arrays;

public class Reversebits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int reverseBits(int n) {
	     int count=0;
	    int res=0;
	     while(count!=33)
	     {
	    	 res+=(n&1);
	    	 res=res<<1 ;
	    	 n=n>>>1;
	     }
	     return res;
		 
		 
	    }

}
