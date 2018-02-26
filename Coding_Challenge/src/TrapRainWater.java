
public class TrapRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrapRainWater t=new TrapRainWater();
		int[] arr= {2,0,2};
		System.out.print(t.trap(arr));
		// System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[6]);

	}
	public int trap(int[] height)
	{
		if(height==null || height.length==0) return 0;
		int[] rightmax=new int[height.length];
		//int[] clogwater=new int[arr.length];
		int max=0;
		for(int i=height.length-1;i>=0;i--)
		{
			rightmax[i]=max;
			max=Math.max(max, height[i]);
		}
		max=0; int temp=0;int res=0;
		for(int i=0;i<height.length;i++)
		{
			temp=Math.min(max, rightmax[i])-height[i];
			System.out.println(i+" "+temp);
			res+=(temp<0)?0:temp;
			max=Math.max(max, height[i]);
		}
		return res;
	}

}
