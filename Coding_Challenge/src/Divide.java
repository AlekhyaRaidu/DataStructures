/*
 * TC: O()
 */
public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divide d=new Divide();
		System.out.print(d.divide(-2147483648,1));
	}
	 public int divide(int dividend, int divisor) {
		 long count=0;
		  int sign=1;
	        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0) ) sign=-1;
	       long dividend1=Math.abs((long)dividend);
	       System.out.print("here: " + dividend1);
	        long divisor1=Math.abs((long) divisor);
	        System.out.println(divisor1);
	        while(dividend1>=0)
	        {
	        	dividend1-=divisor1;
	        	if(dividend1>=0)
	        	count++;
	        	
	        }
	        long res= (sign) *count;
	        return (int) ((res>Integer.MAX_VALUE)? Integer.MAX_VALUE:res);
	    }

}
