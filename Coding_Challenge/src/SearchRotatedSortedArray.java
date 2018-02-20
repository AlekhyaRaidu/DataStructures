
public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRotatedSortedArray s=new SearchRotatedSortedArray();
		int[] nums= {3,4,5,1,2};
		s.search(nums, 2);
	}
	 public int search(int[] nums, int target) {
	    	
	    	int low=0,high=nums.length-1;
	    	int mid=0;
	    	while(low<high)
	    	{
	    		mid=(low+high)/2;
	    		if(nums[mid]>nums[high]) low=mid+1;
	    		else high=mid;
	    	}
	         System.out.println(low);
	    	if(low!=0 && target>=nums[0]) { high=low-1; low=0; System.out.println(low+" "+high);}
	    	else {
	    		high=nums.length-1;
	    	}
	    	return binarySearch(nums,low,high,target);
	        
	    }
		public int binarySearch(int[] nums,int low,int high,int target)
		{
	        System.out.print(low+" "+high);
			int mid=0,res=-1;
			while(low<=high)
			{
				mid=(low+high)/2;
				//System.out.println(mid+" mid"+low+" "+high);
				if(nums[mid]==target) {res=mid; break;}
				if(nums[mid]<target) low=mid+1;
			//	System.out.print("low"+low);
				if(nums[mid]>target) high=mid-1;
				
			}
			return res;
		}
}
