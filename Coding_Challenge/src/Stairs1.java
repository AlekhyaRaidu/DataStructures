import java.util.ArrayList;
import java.util.List;

public class Stairs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stairs s=new Stairs();
		System.out.print(s.stepsCombinations(4));
		List<Integer> list=new ArrayList<Integer>();
		
	}
	public int stepsCombinations(int n)
	{
		int[] arr=new int[n+1];
		arr[0]=1;
		int i;
		for( i=1;i<arr.length;i++)
		{
			if(i==1) arr[1]=1;
			else {
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		return arr[arr.length-1];
	}
}
