package BST;

import com.google.common.base.Preconditions;

/**
 * Created by saurav on 8/17/16.
 */
public class TreeImpl<Data extends Comparable<Data>> implements Tree{

    public TreeNode<Data> root;

    public TreeImpl() {
    }

    public TreeImpl(TreeNode node) {
        this.root = node;
    }

    public enum Traverse_Order {
        PREORDER,
        INORDER,
        POSTORDER
    }

    public void insert(final Comparable data) {
        Preconditions.checkNotNull(data, "Null or Empty node cannot be inserted");

        this.root = insert((Data) data, this.root);
    }

    public boolean find(Comparable data) {
        return false;
    }

    public void delete(Comparable data) {

    }

    public void display(final Traverse_Order traverse_order, final TreeNode root) {

        switch (traverse_order) {
            case PREORDER: printInorder(root);
                break;
            case INORDER: printPreorder(root);
                break;
            case POSTORDER: printPostorder(root);
                break;
            default: printPreorder(root);   //sorted order
                break;
        }
    }

    /**
     * Printing the contents of the tree in an inorder way.
     */
    private void printInorder(final TreeNode root){
        if ( root == null ){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+", ");
        printInorder(root.right);
    }

    /**
     * Printing the contents of the tree in an preorder way.
     */
    private void printPreorder(final TreeNode root){
        if ( root == null ){
            return;
        }
        System.out.print(root.data+", ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    /**
     * Printing the contents of the tree in an preorder way.
     */
    private void printPostorder(final TreeNode root){
        if ( root == null ){
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data+", ");
    }

    private TreeNode insert(Data data, TreeNode root) {
        if (root == null) {
            return new TreeNode(data);
        } else if (data.compareTo((Data) root.data) < 0) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }
        return root;
    }

}
