package Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int rob(int[] nums) {
		 if(nums==null || nums.length==0) return 0;
		 int a=0,b=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(i%2==0)
			 {
				 a=Math.max(a+nums[i], b);
			 }
			 else
				 b=Math.max(b+nums[i], a);
		 }
		 return Math.max(a, b);
	 }

}
