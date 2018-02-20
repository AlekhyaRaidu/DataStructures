import java.util.ArrayList;
import java.util.List;

class TreeNode12 {
     int val;
      TreeNode12 left;
      TreeNode12 right;
      TreeNode12(int x) { val = x; }
  }
public class ZigzagOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> blist=new ArrayList<List<Integer>>();
public List<List<Integer>> zigzagLevelOrder(TreeNode12 root) {
        
    }
public void zigzagLevelOrder(List<TreeNode12> list,boolean flag) {
	int size=list.size();
	int j=size-1;
	for(int i=0;i<list.size();i++)
	blist.add(list.get(i).val);
	while(j>=0)
	{
		TreeNode12 head=list.get(j);
		if(flag==true)
		{
			if(head.left!=null) list.add(head.left);
			if(head.right!=null)list.add(head.right);
		}
		else
		{
			if(head.right!=null)list.add(head.right);
			if(head.left!=null) list.add(head.left);
		}
		j--;
		
	}
	zigzagLevelOrder(list,!flag);
}

}
