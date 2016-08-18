package BST;

/**
 * Created by saurav on 8/17/16.
 */
public class Tree {
    public TreeNode root;
    public Tree() {}

    public Tree(TreeNode node) {
        root = node;
    }

    public TreeNode insert(int data, TreeNode root) {
        if (root == null) {
            root = new TreeNode(data);
        } else if (data < root.data) {
            root.left = insert(data, root);
        } else {
            root.right = insert(data, root);
        }
        return root;
    }
}
