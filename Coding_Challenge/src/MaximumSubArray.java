
public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubArray m=new MaximumSubArray();
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
	//	m.maxSubArray(nums);
	System.out.print(" "+m.maxSubArray(nums));

	}
public int maxSubArray(int[] nums) {
	if(nums==null || nums.length==0) return 0;
	int maxsum=Integer.MIN_VALUE,sum=0,st=0;
	int mxst=0,mxe=0;
	for(int i=0;i<nums.length;i++)
	{	
		if(sum<=0 && nums[i]>=sum) {sum=nums[i]; 
		//st=i;
		}
		else sum+=nums[i];
		if(sum>=maxsum)
		{
			System.out.println(sum+" "+i+" "+st);
			maxsum=sum;
			//mxst=st;
			//mxe=i;
		}
		else if(sum<=0) {
			st=st+1;
			sum=0;
		}
		
	}
	//for(int i=mxst;i<=mxe;i++)
		//System.out.print(nums[i]+" ");
	return maxsum;
        
    }



}
