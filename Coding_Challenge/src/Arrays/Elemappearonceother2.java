// fid elemnts that appear 1 time while others appear 2 times
// XOR -> elem with same elem, ans=0
// XOR-elem with 0,ans =elem
package Arrays;

public class Elemappearonceother2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elemappearonceother2 e=new Elemappearonceother2();
		int[] nums= {2,3,4,3,4};
		System.out.print(e.singleNumber(nums));
	}
	  public int singleNumber(int[] nums) {
	        if(nums==null || nums.length==0 ) return 0;
	        int res=0;
	        for(int i=0;i<nums.length;i++)
	        	res^=nums[i];
	        return res;
	    }
 
}




