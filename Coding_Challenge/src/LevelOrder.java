import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
class TreeNode4 {
      int val;
      TreeNode4 left;
      TreeNode4 right;
      TreeNode4(int x) { val = x; }
  }

public class LevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Alek is a coder";
str.trim();
String[] arr=str.split(" ");
System.out.println(str+" "+arr[0]+" "+arr[1]);
System.out.print(arr[2]+" "+arr[3]);

	}
	List<List<Integer>> blist=new ArrayList<List<Integer>>();
	 public List<List<Integer>> levelOrder(TreeNode root) {
		 if(root==null) return blist;
		 Queue<TreeNode> q=new LinkedList<TreeNode>();
		 q.add(root);
		 List<Integer> slist=new ArrayList<Integer>();
		 
		 while(!q.isEmpty())
		 {
            slist=new ArrayList<Integer>();
		 int size=q.size();
		 int i=0;
		 while(i<size)
		 {
			 if(q.peek().left!=null) q.add(q.peek().left);
			 if(q.peek().right!=null) q.add(q.peek().right);
			 i++;
			 slist.add(q.poll().val);
		}
		 blist.add(slist);
		 }
		 return blist;
	 }

}
