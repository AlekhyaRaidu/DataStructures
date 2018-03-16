//Sieve of Eratosthenes
package Arrays;

public class CountPrimes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes t=new CountPrimes();
		System.out.print(t.countPrimes(50));
		
		

	}
	public int countPrimes(int n) {
	     if(n==0 || n==2 || n==1) return 0;   
	     int count=0;
	     boolean[] nonprimes=new boolean[n];
	     for(int i=2;i<n;i++)
	    {
	    	 if(!nonprimes[i])
	    	 {
	    		 count++;
	    		 // going to mark all multiples of i to true in non prime array
	    		 for(int j=2;j*i<n;j++)
	    			 nonprimes[i*j]=true;
	    	 }
	    }
	     return count;
	    }
}
