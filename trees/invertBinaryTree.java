public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root)
    {
        //empty tree
        if (root == null)
        {
            return null;
        }

        // Swap children of current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursely invert left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    public static void main(String[] args) {
        System.out.println("INVERT BINARY TREE");
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    //constructors
    TreeNode(){}
    TreeNode(int val) {this.val = val; }
    
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
