
public class SearchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRange s=new SearchRange();
		int[] nums= {5,6,8,8,8,8,10};
		System.out.println(s.findLast(nums, 18));
		
		System.out.print((int)Math.ceil((5+6)/2.0));

	}
	  public int[] searchRange(int[] nums, int target) {
			 int[] res=new int[2];
	      //  if(nums.length==0 || nums==null) return res;
			 res[0]=findFirst(nums, target);
			 res[1]=findLast(nums,target);
			 return res;
		        
		    }
		public int findFirst(int[] nums,int target)
		{
	        if(nums.length==0) return -1;
			int low=0,high=nums.length-1,mid=0;
			while(low<high)
			{
				System.out.println(low+" "+high);
				mid=(low+high)/2;
				if(nums[mid]<target) low=mid+1;
				else high=mid;
			}
			if(nums[low]==nums[high] && nums[low]==target)
			return high;
			return -1;
		}
		public int findLast(int[] nums,int target)
		{
	        if(nums.length==0) return -1;
			int low=0,high=nums.length-1,mid=0;
			while(low<high)
			{
				System.out.println(low+" "+high);
				mid=(int) Math.ceil((low+high)/2.0);
				if(nums[mid]>target) high=mid-1;
				else low=mid;
			}
			if(nums[low]==nums[high] && nums[low]==target)
			return low;
			return -1;
		}


}
