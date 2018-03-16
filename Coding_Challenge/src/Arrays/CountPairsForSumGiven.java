// for 3 sum dont use hash map
// for 2 sum u ca freely use hashmap
// for 2 sum--- sort and process  TC: O(nlogn), SC: O(1)
// for 2 sum---hash and process  TC: O(n), SC: O(2n)---> for set to remove duplicates and hash
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPairsForSumGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	CountPairsForSumGiven c=new CountPairsForSumGiven();
		int arr[] = new int[]{1, 5, 7, -1, 5} ;
		int rescount=getPairsCount1(arr, 6);
		System.out.print(rescount);
	}
	 static int getPairsCount(int[] arr, int target)
	    {
		
		 List<Integer> list=new ArrayList<Integer>();
		 Set<Integer> dict=new HashSet<Integer>();
		 Set< List<Integer>> res=new HashSet< List<Integer>>();
		 int compli=0;
		 for(int i=0;i<arr.length;i++)
		 {
			compli=target- arr[i];
			if(dict.contains(compli))
			{
				list=new  ArrayList<Integer>();
				list.add(compli);
				list.add(arr[i]);
				res.add(list);
				System.out.println(list);
			}
			dict.add(arr[i]);
				
		 }
		 return res.size();
		 
		 
	    }
	 // ________________________________________________________________________
	 // O(nlogn) +SC O(1)
	
	 
	 static int getPairsCount1(int[] arr, int target)
	 {
		 Arrays.sort(arr);
		 int low=0,high=arr.length-1;
		 while(low<high)
		 {
			 int sum=(arr[low]+arr[high]);
			 if(sum==target)
			 {
			//to remove dups
				 while(low<high && arr[low]==arr[low+1]) low++;
				//to remove dups
				 while(low<high && arr[high]==arr[high-1]) high--;
				 System.out.println(arr[low]+" "+arr[high]);
				 low++; high--;
			 }
			 else if(sum<target) low++;
			 else sum=high--;
			 
		 }
		 return 0;
	 }

}
