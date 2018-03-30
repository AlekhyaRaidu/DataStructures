package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode10 {
    int val;
    TreeNode10 left;
    TreeNode10 right;
    TreeNode10(int x) { val = x; }
}
public class KSumPath {

public static void main(String[] args) {
		
		TreeNode10 root = new TreeNode10(1);
			root.left = new TreeNode10(3);
			root.left.left = new TreeNode10(2);
			root.left.right = new TreeNode10(1);
			root.left.right.left = new TreeNode10(1);
			root.right = new TreeNode10(-1);
			root.right.left = new TreeNode10(4);
			root.right.left.left = new TreeNode10(1);
			root.right.left.right = new TreeNode10(2);
			root.right.right = new TreeNode10(5);
			root.right.right.right = new TreeNode10(2);
			int k = 5;
			printKPath(root, k);

	}
	static List<Integer> path=new ArrayList<Integer>();
	public static void printKPath(TreeNode10 root,int k)
	{
		if(root==null) return;
		path.add(root.val);
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int j=path.size()-1;j>=0;j--)
			{
			sb.insert(0, path.get(j));
			count+=path.get(j);
			if(count==k)
				{ System.out.println(sb);}
			}
		if(root.left!=null) printKPath(root.left, k);
		if(root.right!=null) printKPath(root.right, k);
		path.remove(path.size()-1);
		return;
		
	}

}
