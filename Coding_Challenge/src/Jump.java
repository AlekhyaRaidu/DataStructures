
public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jump j=new Jump();
		int[] nums= {2,3,1,1,4};
		System.out.print(j.canJump(nums));

	}
	 public boolean canJump(int[] nums) {
		 if(nums==null || nums.length==0) return false;
		 boolean[] min=new boolean[nums.length];
		 min[0]=true;
		 for(int i=1;i<nums.length;i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 if(nums[j]+j>=i && min[j]==true)
				 {
					 min[i]=true; break;
				 }
			 }
		 }
		 return min[nums.length-1];
	 }

}
