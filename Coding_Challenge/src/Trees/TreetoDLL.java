package Trees;
class Node 
{
    int data;
    Node left, right;
  
    public Node(int data) 
    {
        this.data = data;
        left = right = null;
    }
}
public class TreetoDLL {
	 Node root;
     
	    // head --> Pointer to head node of created doubly linked list
	    Node head;
	      
	    // Initialize previously visited node as NULL. This is
	    // static so that the same value is accessible in all recursive
	    // calls
	    static Node prev = null;
	void BinaryTree2DoubleLinkedList(Node root) 
    {
        // Base case
        if (root == null)
            return;
  
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);
  
        // Now convert this node
        if (prev == null) 
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }
}
