
public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRotatedSortedArray s=new SearchRotatedSortedArray();
		int[] nums= {1};
		s.search(nums, 2);
	}
	 public int search(int[] nums, int target) {
	 int low=0,high=nums.length-1,mid=0;
	 while(low<=high)
	 {
		 mid=(low+high)/2;
		 if(nums[mid]>nums[high])
		 {
			 if(target>=nums[low] && target <=nums[mid])
				 return binarySearch(nums, low, mid, target);
			 else
				 low=mid+1;
		 }
		 else
		 {
			 if(target>=nums[mid] && target <=nums[high])
				 return binarySearch(nums, mid, high, target);
			 else
				 high=mid-1;
		 }
	 }
	 return -1;
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
			System.out.println(res);
			return res;
		}
}
