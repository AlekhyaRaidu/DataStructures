import java.util.ArrayList;
import java.util.List;

public class CombAddUptoN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombAddUptoN1 c=new CombAddUptoN1();
		c.findingCombinations(5,0,new int[5],5);

	}
	
	public  void findingCombinations(int n,int index,int[] arr,int reducednumber)
	{
		if(reducednumber<0) return;
		if(reducednumber==0)
		{
			for(int i=0;i<index;i++)
				System.out.print(arr[i]);
			System.out.println();
			return;
		}
		int prev=(index==0)?1:arr[index-1];
		for (int k=prev;k<n;k++)
		{
			arr[index]=k;
			findingCombinations(n,index+1,arr,reducednumber-k);
		}
	}

}
