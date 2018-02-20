import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortColors {
	static int[] nums= {1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors s=new SortColors();
		s.sortColors(nums);
		System.out.print(nums[0]);
	}
	 public void sortColors(int[] nums) {
	     if(nums==null || nums.length==0) return;   
		 List<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<nums.length;i++)
	        	list.add(nums[i]);
	        Collections.sort(list);
	        for(int j=0;j<list.size();j++)
	           	nums[j]=list.get(j);
	        return;
	        
	    }
	 public void sortColors1(int[] nums) {
		 
	 }

}
