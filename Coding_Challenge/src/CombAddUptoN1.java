import java.util.ArrayList;
import java.util.List;

public class CombAddUptoN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombAddUptoN1 c=new CombAddUptoN1();
		System.out.print(c.findingCombinations(0));

	}
	public List<List<Integer>> findingCombinations(int n)
	{
		List<List<Integer>> blist=new ArrayList<List<Integer>>();
		List<Integer> slist=new ArrayList<Integer>();
		if(n<=0) return blist;
		for(int i=0;i<n;i++)
			slist.add(1);
		blist.add(slist);
		while(blist.size()<n)
		{
			List<Integer> sslist= new  ArrayList<Integer>(blist.get(blist.size()-1));
			//sslist=blist.get(blist.size()-1);
			int size=sslist.size();
			sslist.set(size-2,sslist.get(size-2)+sslist.get(size-1));
			sslist.remove(size-1);
			blist.add(sslist);
		}
		return blist;
		
	}

}
