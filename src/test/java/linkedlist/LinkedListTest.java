package linkedlist;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

import static org.apache.commons.lang3.ArrayUtils.reverse;
import static org.junit.Assert.*;

/**
 * Created by saurav on 8/17/16.
 */
public class LinkedListTest extends TestCase {
    @Before
    public void setUp() throws Exception {
    }

    public void testCreateLinkedListWithOneNode() {
        LinkedList ll = new LinkedList();
        ll.addNode(1);
        assertTrue(ll.head.data == 1);
    }

    public void testCreateLinkedListWithArray() {
        int[] arr = {1, 5, 10};
        reverse(arr);
        LinkedList ll = new LinkedList();
        ll.createFromArray(arr);
        int count = 0;
        Node root = ll.head;
        while (root != null) {
            count++;
            root = root.next;
        }

        assertEquals(arr.length, count);
        assertEquals(1, ll.head.data);
    }

    @After
    public void tearDown() throws Exception {

    }

}