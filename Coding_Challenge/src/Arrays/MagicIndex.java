//A magic index in an array A[0…n-1] is defined to be an index such that A[i] = i. Given a sorted array of distinct integers, write a method to find a magic index if one exists, in an array A. FOLLOW UP: What if the values are not distinct?
package Arrays;

public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int searchingMagicIndex(int[] arr)
	{
		if(arr.length==0 || arr==null) return -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
				return arr[i];
		}
		return -1;
	}

}
