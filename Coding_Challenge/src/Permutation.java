import java.util.ArrayList;
import java.util.List;

// giving chance to each and evry letter to occupy 1st position
// giving chance to e/e letter except 1st one to occupy 2nd position
// so on

public class Permutation {
	static List<String> slist=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Permutation p=new Permutation();
int[] nums= {1,2,3};
p.permute(nums, 0);
System.out.print(blist.get(0));
System.out.print(blist.get(1));
System.out.print(blist.get(2));
System.out.print(blist.get(3));
System.out.print(blist.get(4));
System.out.print(blist.get(0));
	}
	

	static List<Integer> blist=new ArrayList<Integer>();
	static List<List<Integer>> biglist=new ArrayList<List<Integer>>();
	private void permute(int[] nums, int l,List<Integer> blist)
    {
        if (l == nums.length)
            biglist.add(blist);
        else
        {
            for (int i = l; i <nums.length; i++)
            
            	nums = swap(nums,l,i);
                permute(nums, l+1,blist);
                nums = swap(nums,l,i);
            }
        }
    }
	 public int[] swap(int[] nums,int i,int j)
	 {
		 int temp=nums[i];
		 nums[i]=nums[j];
		 nums[j]=temp;
		 return nums;
		 
	 }

}
