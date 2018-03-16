// rotate right means ,rotate from right to left postion i.e., from below
package Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray r=new RotateArray();
		int[] nums= {1,2,3,4,5,6};
		r.rotate(nums, 2);
	}
	public void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length-1);  // reverse the whole array
	    reverse(nums, 0, nums.length-k-1);  // reverse the first part
	    reverse(nums, nums.length-k, nums.length-1);  // reverse the second part
	    System.out.print(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]+" "+nums[5]);
	}

	public void reverse(int[] nums, int l, int r) {
	    while (l < r) {
	        int tmp = nums[l];
	        nums[l++] = nums[r];
	        nums[r--] = tmp;
	    }
	}
}
