package Arrays;

import java.util.Arrays;

public class ShortContiSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findUnsortedSubarray(int[] nums) {
		 if(nums.length==0 || nums==null) return 0;
	        int[] temp=nums.clone();
	        Arrays.sort(nums);
	        int start=0,end=0;int low=0,high=temp.length-1;
	        while(low<temp.length) { 
	        	if(temp[low]!=nums[low]) {start=low; break;} low++;
	        }
	        while(high<temp.length) { 
	        	if(temp[high]!=nums[high]) {end=high; break;} high--;
	        }
	        return end-start+1;
	    }

}
