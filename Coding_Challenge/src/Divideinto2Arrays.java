
public class Divideinto2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void splittingArrays(int[] arr)
	{
		int max=Integer.MIN_VALUE,maxindex = 0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]) { max=arr[i]; maxindex=i;}
		}
		for(int i=0;i<arr.length;i++)
			if(i!=maxindex)
				count+=arr[i];
	}

}
