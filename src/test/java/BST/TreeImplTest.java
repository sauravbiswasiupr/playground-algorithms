package BST;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sougata on 19/08/16.
 */
public class TreeImplTest {

    TreeImpl tree;

    @Before
    public void setUp() throws Exception {
        this.tree = new TreeImpl();
        tree.insert(0);
        tree.insert(10);
        tree.insert(3);
        tree.insert(1);
        tree.insert(18);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void insertBSTTest() {
        Assert.assertTrue(this.tree.root.data.equals(0));
        Assert.assertTrue(this.tree.root.left == null);
        Assert.assertTrue(this.tree.root.right.data.equals(10));
    }

    // Check the size of a binary search tree
    @Test
    public void sizeOfBSTTest() {
        // Default tree with 5 node
        Assert.assertTrue(this.tree.getSize()==5);
        Assert.assertFalse(this.tree.getSize() >= 6);

        // tree without root node
        final Tree tree1 = new TreeImpl();
        Assert.assertTrue(tree1.getSize()==0);

        // tree with only root node
        final Tree tree2 = new TreeImpl();
        tree2.insert(10);
        Assert.assertTrue(tree2.getSize()==1);
    }
}
