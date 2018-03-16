
public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jump j=new Jump();
		int[] nums= {2,3,1,1,4};
		boolean res=j.canJump(nums);
		System.out.print(res);

	}
	public boolean canJump(int[] A) {
		   if(A.length==0) return true;
		   int maxcan=0;// the farthest position it can jump
		   for(int i=0;i<A.length;i++){
		       if(maxcan>=A.length-1) return true; //if the farthest postion have passed the end or reached the end
		       maxcan=Math.max(maxcan,A[i]+i);// update the farthest position
		       if(maxcan==i) return false; // return false when you cannot move any further..
		   }
		   return true;//not necessary, just a return type...
		}

}
