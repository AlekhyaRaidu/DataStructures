//Length of the largest subarray with contiguous elements
package Arrays;

public class LargestSubarContiElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestSubarContiElem l=new LargestSubarContiElem();
		int[] arr= {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		int res=l.findingLargeSubArr(arr);
		//System.out.print(res);
	}
	public int findingLargeSubArr(int[] arr)
	{
		int max=0,min=0,maxlen=0;
	for(int i=0;i<arr.length-1;i++)
	{
		max=arr[i];min=arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			max=Math.max(max, arr[j]);
			min=Math.min(min, arr[j]);
			System.out.println(min+" "+max);
			if((max-min)==(j-i) && maxlen<=(j-i))
				{
				
				maxlen=max-min+1;
				System.out.println(i+" "+j+" "+maxlen);
				}
					
		}
	}
	System.out.print(maxlen);
	return maxlen;
	}

}
