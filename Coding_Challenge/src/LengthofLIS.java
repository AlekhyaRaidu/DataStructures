import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LengthofLIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthofLIS l=new LengthofLIS();
		int[] nums= {3,7,8,-1,4,3,9};
		List<Integer> list=new ArrayList<Integer>();
		list=l.lengthOfLonIncS(nums);
		System.out.print(list);
		
		
	}
	 
	 public List<Integer> lengthOfLonIncS(int[] nums) {
         if(nums.length==0 || nums==null) return null;
   PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
     List<Integer> list=new ArrayList<Integer>();
     if(nums.length==1) {list.add(nums[0]); return list;}
     int i=0,index=0;
     for(i=0;i<nums.length;i++)
     {
         if(i==0 || nums[i]>nums[list.get(list.size()-1)]) 
         { list.add(i); pq=new PriorityQueue<Integer>();
         for(int k:list)
         pq.add(k);}
         else if(nums[i]<nums[list.get(list.size()-1)])
         {
             index=binarySearch(nums,list,nums[i]);
             System.out.println(index+" "+nums[i]);
             list.set(index, i);
         }
     }
     
     List<Integer> res=new ArrayList<Integer>();
     //Collections.sort(list);
     for(int j:pq)
         res.add(nums[j]);
     return res; 
     
}
public int binarySearch(int[] nums,List<Integer> list,int element)
{
     int low=0,high=list.size()-1;
     int mid=0;
     System.out.println("BS"+" "+element);
     while(low<high)
     {
         System.out.println("BS"+" "+low+" "+high+" ");
         mid=(low+high)/2;
         if(nums[list.get(mid)]==element) return mid;
         else if(nums[list.get(mid)]<element) low=mid+1;
         else high=mid;
     }
     return low;
}

}
