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
}
