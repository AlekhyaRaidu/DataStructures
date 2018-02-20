
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int climbStairs(int n) {
	        if(n==0 || n==1) return n;
	        int[] num=new int[n+1];
	        num[0]=1; num[1]=1;
	        for(int i=2;i<num.length;i++)
	        {
	        	num[i]=num[i-1]+num[i-2];
	        }
	        return num[num.length-1];
	    }

}
