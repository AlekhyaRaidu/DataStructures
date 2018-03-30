import java.util.ArrayList;
import java.util.List;

// giving chance to each and evry letter to occupy 1st position
// giving chance to e/e letter except 1st one to occupy 2nd position
// so on

public class Permutation {
	
	static List<String> slist=new ArrayList<String>();
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Permutation p=new Permutation();
			StringBuilder str=new StringBuilder("abc");
			p.permutations(str, 0);
			int[] nums= {1,2,3};
			 List<List<Integer>> blist=new ArrayList<List<Integer>>();
			blist=p.permute(nums);
			System.out.print(blist.get(0));
			System.out.print(blist.get(1));
			System.out.print(blist.get(2));
			System.out.print(blist.get(3));
			System.out.print(blist.get(4));
			System.out.print(blist.get(5));
	}
	public void permutations(StringBuilder str,int index)
	{
		if(index==str.length()) {
			System.out.println(str);
		}
		for(int i=index;i<str.length();i++)
		{
			str=swap(str,index,i);
			permutations(str,index+1);
				str=swap(str,index,i);
			
		}
	
	}
	public StringBuilder swap(StringBuilder str,int i,int j)
	{
		char temp=str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j, temp);
		return str;
		
	}
	 public List<List<Integer>> permute(int[] nums) {
		  List<List<Integer>> blist=new ArrayList<List<Integer>>();
		  if(nums.length==0 || nums==null) return blist;
		  List<Integer> smlist=new ArrayList<Integer>();
		  for(int i:nums)
			  smlist.add(i);
		  blist=permute(smlist,0,blist);
		  return blist;
	    }
	 public List<List<Integer>> permute(List<Integer> smlist,int index, List<List<Integer>> blist)
	 {
		 if(index==smlist.size())
		 {		 
			 blist.add(new ArrayList<Integer>(smlist));
			 return blist; 
		 }
		 for(int i=index;i<smlist.size();i++)
		 {
			smlist= swap(smlist,index,i);
			System.out.println(smlist+" "+i+" before");
			blist=permute(smlist,index+1,blist);
			smlist=swap(smlist,i,index);
			System.out.println(smlist+" "+i+"after");
		 }
		 return blist;
	 }
	 public List<Integer> swap(List<Integer> slist,int i,int j)
	 {
		 System.out.println(slist+" "+i+" "+j+"swap");
		 int temp=slist.get(i);
		 slist.set(i, slist.get(j));
		 slist.set(j, temp);
		 return slist;
	 }
	

	

}
