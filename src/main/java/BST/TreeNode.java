package BST;

/**
 * Created by saurav on 8/17/16.
 */

public class TreeNode<Data extends Comparable<? super Data>> {
    protected Data data;
    protected TreeNode left;
    protected TreeNode right;

    private TreeNode() {}

    public TreeNode(final Data data) {
        this.data = data;
        this.left = this.right = null;
    }
}
