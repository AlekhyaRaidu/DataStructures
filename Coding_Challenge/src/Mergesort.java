
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mergesort m=new Mergesort();
		int[] a= {1,2};
		int[] b= {5,6};
		
		b=a;
		System.out.print(b[0]);

	}
	  public void merge(int[] nums1, int m, int[] nums2, int n) 
		 {
			 if(nums1==null) { nums1=nums2; return;}
			int l1=m-1,l2=n-1,len=m+n-1;
			while(l1>-1 && l2>-1)
			{
				if(nums1[l1]>nums2[l2]) nums1[len--]=nums1[l1--];
				else nums1[len--]=nums2[l2--];
			}
			while(l2>-1)
				nums1[len--]=nums2[l2--];
			return;
		        
		  }
}
	 
	        
	    


