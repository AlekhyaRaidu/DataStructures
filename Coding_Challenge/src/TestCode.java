import java.util.HashSet;
import java.util.Set;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCode t=new TestCode();
		int[] nums= {2,4,1,5};
		int res=~(0);
		System.out.print(res);
		StringBuilder sb=new StringBuilder(0);
		sb.append('h');
		sb.append("ale");
		System.out.print(sb);
		
		

	}
public int rob(int[] nums) {
	if(nums==null || nums.length==0) return 0;
	if(nums.length==1) return nums[0];
	
	int sum=0,sum1=0;
        for(int i=0;i<nums.length;i+=2)
        {
        	sum+=nums[i];
        }
        for(int i=1;i<nums.length;i+=2)
        {
        	sum1+=nums[i];
        }
        return Math.max(sum, sum1);
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
	
	 public boolean containsDuplicate(int[] nums) {
		 if(nums==null || nums.length==0) return false;
		 Set<Integer> map=new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(map.contains(nums[i]))
	        	return true;
	        	map.add(nums[i]);
	        }
	        return false;
	    }
}
