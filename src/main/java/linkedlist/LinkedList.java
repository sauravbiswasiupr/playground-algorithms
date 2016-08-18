package linkedlist;

import static org.apache.commons.lang3.ArrayUtils.reverse;

/**
 * Created by saurav on 8/17/16.
 */
public class LinkedList {
   public Node head = null;
   public LinkedList() {
   }

   public void addNode(int data) {
       Node temp = new Node(data);
       temp.next = head;
       head = temp;
   }

   public void createFromArray(int[] arr) {
       Node temp;
       for (int i = 0; i < arr.length; i++) {
           temp = new Node(arr[i]);
           temp.next = head;
           head = temp;
       }
   }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       Node temp = head;
       while(temp != null) {
           sb.append(String.valueOf(temp.data) + "->");
           temp = temp.next;
       }

       sb.append("NONE");
       return sb.toString();
   }

   public static void main(String[] args) throws Exception {
       LinkedList l = new LinkedList();
       int[] arr = {1, 2, 4, 5, 10};
       reverse(arr);
       l.createFromArray(arr);
       System.out.println("Linkedlist is: " + l);
   }
}
