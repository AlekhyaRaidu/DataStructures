//Find the element that appears once in a sorted array where all other elements appear twice one after another. Find that element in 0(logn) complexity.
// if array sorted try using binarty serach
package Arrays;

public class OnceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnceElement o=new OnceElement();
		int[] arr= {1,1,3, 3, 8,8,9};
		System.out.print(o.search(arr,0,arr.length-1));

	}
	public int search(int[] arr)
	{
		if(arr.length==0 || arr==null) return 0;
		return arr[binarySearching(arr,0,arr.length-1)];
	}
	public int binarySearching(int[] arr,int low,int high)
	{
		int mid=0,res=-1;
		if(low<high)
		{
			if(arr[low]==arr[high]) return -1;
			mid=(low+high)/2;
			if(arr[mid]==arr[mid+1])
				mid=mid-1;
			 res=binarySearching(arr,low,mid);
			if(res==-1) res=binarySearching(arr,mid+1,high);
			
		}
		if(low==high) return low;
		return res;
	}
//	______________________________________________________________________
	
	  public int singleNonDuplicate(int[] nums) {
	       return search(nums,0,nums.length-1);
	    }
	    public int search(int[] arr,int low,int high)
		{
			int mid=0;
			while(low<high)
			{
				mid=(low+high)/2;
				if(mid%2==0)
				{
					if(arr[mid]==arr[mid+1])
						low=mid+2;
					else high=mid;
				}
				else {
					if(arr[mid]==arr[mid-1])
						low=mid+1;
					else high=mid-1;
				}
				
			}
			return arr[low];
			}
		
}
