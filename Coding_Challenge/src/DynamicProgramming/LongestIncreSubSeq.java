package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
7,8,0,1,2,-1,3,12
0,1,2
public class LongestIncreSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void LongestIncreSubSeq(int[] num)
	{
		List<Integer> list=new ArrayList<Integer>();
		int[] indexarr=new int[num.length];
		int index=-1;
		for(int i=0;i<num.length;i++)
		{
			// maintain list for storing path
			if(i==0 || num[i]>=num[list.get(list.size()-1)])
			{	list.add(i);
			    if(i!=0)index=(list.size()-1);
			}
			else
			{
				index=positionSearch(num,i,list);
			}
		
		
		// index array for tracking indices
			indexarr[i]=index;
		}
		// print with indexarray
		int last=list.get(list.size()-1);
		List<Integer> res=new ArrayList<Integer>();
		while(num[last]!=-1)
		{	
			res.add(num[last]);
			last=indexarr[last];
		}
		// reverse res
		return;
	}
	public int positionSearch(int[] num,int i,List<Integer> list)
	{
		int low=0,high=list.size()-1;
		int mid=0;
		while(low<high)
		{
			mid=(low+high)/2;
			if(num[i]>num[list.get(mid)])
				low=mid+1;
			else high=mid-1;	
		}
		list.set(low, i);
		return list.get(low-1);
	}

}
