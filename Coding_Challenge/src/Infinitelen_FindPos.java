// Given a sorted array of infinite length, how would you find a certain value?  
public class Infinitelen_FindPos {
	public static void main(String[] args)
	{
		Infinitelen_FindPos d=new Infinitelen_FindPos();
	int[] arr= {1,2,3,4,8,10,15,16,17};
	System.out.print(d.findingPos(arr, 10));
	}
	public boolean findingPos(int[] arr,int key)
	{
		
		int low=0,high=1;
		while(low<=high)
		{
			if(key<arr[high])
				break;
			else if(key==arr[high]) return true;
			else
			{
				low=high+1;
				high=2*high;
			}
		}
		return binarySearch(arr,low,high,key);
	}
	public boolean binarySearch(int[] arr, int low,int high,int key)
	
	{
		System.out.print(low+" "+high);
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key) return true;
			if(key>arr[mid]) low=mid+1;
			else high=mid-1;
		}
		return false;
	}

}
