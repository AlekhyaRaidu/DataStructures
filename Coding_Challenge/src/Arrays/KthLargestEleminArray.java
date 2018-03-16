// for pq problems of size k, you only have to pop elem when size is reached
package Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestEleminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLargestEleminArray k=new KthLargestEleminArray();
		int[] nums= {1	};
		int res=k.findKthLargest(nums, 1);
		System.out.print(res);

	}

	 public int findKthLargest(int[] nums, int k) {
		 if(nums==null || nums.length==0 || nums.length<k) return 0;
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
		    
         for(int 	el=0;el<nums.length;el++){
        	 if(pq.size()<k)
        		 	pq.add(nums[el]);
        	 else if(nums[el]>pq.peek())
        	 {
        		 pq.poll();
        		 pq.add(nums[el]);
        	 }
             
         }

         return pq.peek();
	      
	      
	        
	    }
}
