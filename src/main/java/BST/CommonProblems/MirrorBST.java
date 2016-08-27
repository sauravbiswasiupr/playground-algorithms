package BST.CommonProblems;

import BST.TreeNode;

/**
 * Created by sougata on 24/08/16.
 */
public class MirrorBST {

    public TreeNode createMirror(final TreeNode root) {

        if(root == null)
            return null;

        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            createMirror(root.right);
            createMirror(root.left);
        }
        return root;
    }
}
