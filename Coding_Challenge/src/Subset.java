import java.util.ArrayList;
import java.util.List;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subset s=new Subset();
		int[] nums= {1,2,3};
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		res=s.subsets(nums);
		System.out.print(res.get(0));
		System.out.print(res.get(1));
		System.out.print(res.get(2));
		System.out.print(res.get(3));
	}
public List<List<Integer>> subsets(int[] nums) {

	List<List<Integer>> res=new ArrayList<List<Integer>>();
	if(nums==null || nums.length==0) return res;
	res.add(new ArrayList<Integer>());
	for(int i=0;i<nums.length;i++)
	{
		
		List<List<Integer>> blist=new ArrayList<List<Integer>>();
		for(List<Integer> sslist:res)
		{
			List<Integer> slist=new ArrayList<Integer>(sslist);
			slist.add(nums[i]);
			System.out.println(slist+" "+i);
			blist.add(slist);
		}
		res.addAll(blist);
	}
	return res;
	
    }

}
