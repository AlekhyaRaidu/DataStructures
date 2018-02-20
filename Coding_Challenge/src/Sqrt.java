import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt j=new Sqrt();
		Set<Character> set=new HashSet<Character>();
		set.add('a');
		for(Character c:set)
		{
			System.out.print(c);
		}
	//	set.add('a');
	//String str=String.valueOf(set);
		//System.out.print("hey"+str);
		int[][] nums= {{2},{3},{4}};
		int[] a= {1,2};
		int[] b= {5,6};
		
		b=a;
		//System.out.print(b[0]);
	//	 List<Integer> list=new ArrayList<Integer>();
	//	System.out.print(j.spiralOrder(nums));
		int[] nums1= {1,2,3,3};
	//	System.out.print(j.removeDuplicates(nums1));

	}
	 public int removeDuplicates(int[] nums) 
	    {
	        if(nums.length<2) return nums.length;
	        int count=1 ;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i-1]!=nums[i]) 
	            nums[count++]=nums[i];
	              
	        }
	        return count;
	    }
	 public List<Integer> sortTwoLists(List<Integer> l1,List<Integer> l2)
	 {
		Collections.sort(l1);
		Collections.sort(l2);
		int i=0,j=0;
		List<Integer> list=new ArrayList<Integer>();
		while(i<l1.size() || j<l2.size())
		{
			if(j==l2.size() || (i<l1.size()) && l1.get(i)<l2.get(j)) list.add(l1.get(i++));
			if((i<l1.size() && j<l2.size()) && l1.get(i)==l2.get(j)) {  list.add(l1.get(i++)); i++;j++;}
			else
			{
				list.add(l2.get(j++));
			}
			
		
		}
		return list;
	 }
	
}
