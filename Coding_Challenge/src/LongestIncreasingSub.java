import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSub l=new LongestIncreasingSub();
		int[] arr= {3,4,5};
		List<Integer> list=new ArrayList<Integer>();
		list=l.LongestSub(arr);
		System.out.print(list);
	}


	 public List<Integer> LongestSub(int[] nums) {
         if(nums.length==0 || nums==null) return null;
  
	 List<Integer> list=new ArrayList<Integer>();
	// list.add(nums[0]);
	 if(nums.length==1) return list;
	 int i=0,index=0;
	 for(i=0;i<nums.length;i++)
	 {
		 if(i==0 || nums[i]>nums[list.get(list.size()-1)]) {list.add(i);
		 System.out.println(nums[i]); }
		 else if(nums[i]<nums[list.get(list.size()-1)])
		 {
			 index=binarySearch(nums,list,nums[i],0,list.size()-1);
			 System.out.println(nums[i]);
			 list.set(index, i);
		 }
	 }
	 List<Integer> res=new ArrayList<Integer>();
	 for(int j:list)
		 res.add(nums[j]);
	// System.out.print("ji");
	 return res; 
}

	 
	public int binarySearch(int[] nums,List<Integer> list,int key,int low,int high)
	{
		
		int mid=0;
		while(low<high)
		{
			mid=(low+high)/2;
			if(list.get(mid)>key)
				low=mid-1;
			else high=mid+1;
		}
		if(low==high) list.set(low,key);
		return low;
	}

}
