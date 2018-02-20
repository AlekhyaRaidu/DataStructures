
public class InsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertPosition i=new InsertPosition();
		int [] nums= {1,5,6,9};
		System.out.print(i.searchInsert(nums,10));

	}
	 public int searchInsert(int[] nums, int target) {
	        int low=0,high=nums.length-1,mid=0;
		 while(low<=high)
		 {
			 mid=(low+high)/2;
			 if(nums[mid]==target) return mid;
			 if(target>nums[mid]) low=mid+1;
			 else if(target<nums[mid]) high=mid-1;
		 }
		 return low;
	    }	 

}
