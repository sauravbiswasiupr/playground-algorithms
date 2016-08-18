package BST;

/**
 * Created by sougata on 18/08/16.
 */
public interface Tree<Data extends Comparable<Data>> {

    /**
     * Add a node in the tree with value n. Its O(lgn)
     * @param data
     */
    void insert(Data data);

    /**
     * Find a node in the tree with value n. Its O(lgn)
     * @param data
     * @return
     */
    boolean find(Data data);

    /**
     * Delete a node in the tree with value n. Its O(lgn)
     * @param data
     */
    void delete(Data data);

    /**
     * Prints the entire tree in in/pre/post order. O(n)
     * @param traverse_order
     * @param root
     */
    void display(TreeImpl.Traverse_Order traverse_order, TreeNode root);
}
