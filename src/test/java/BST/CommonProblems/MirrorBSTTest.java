package BST.CommonProblems;

import BST.TreeImpl;
import BST.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by sougata on 27/08/16.
 */
public class MirrorBSTTest {

    @Test
    public void testBSTMirror() throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {

        final TreeImpl tree = new TreeImpl();
        tree.insert(10);
        tree.insert(12);
        tree.insert(5);

        Assert.assertTrue(tree.root.data.equals(10));
        Assert.assertTrue(tree.root.left.data.equals(5));
        Assert.assertTrue(tree.root.right.data.equals(12));

        // Calling createMirror method by using Java Reflection, to create the mirror of the BST.
        final Class clazz = Class.forName("BST.CommonProblems.MirrorBST");
        final Object object = clazz.newInstance();
        final Method method = clazz.getDeclaredMethod("createMirror", TreeNode.class);
        method.invoke(object, tree.root);

        Assert.assertTrue(tree.root.data.equals(10));
        Assert.assertTrue(tree.root.left.data.equals(12));
        Assert.assertTrue(tree.root.right.data.equals(5));
    }
}
