package Week3.Session1;

import java.io.*;
import java.util.*;
import static Week3.Session1.LinkedList_CP.*;

public class hasCycle {
//
//    public static boolean hasCycle(LinkedList_CP.Node head)
//    {
//        LinkedList_CP.Node slow = head;
//        LinkedList_CP.Node fast = head.next;
//
//        while(slow != fast)
//        {
//            if(fast == null || fast.next == null)
//                return false;
//
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//    }

    //Merge two sorted Linked Lists
    public static Node mergeSortedLists(Node l1, Node l2)
    {
        Node dummy = new Node(0);
        Node curr = dummy;
        while(l1!=null && l2!= null){
            if(l1.val <= l2.val)
            {
                curr.next = l1;
                l1= l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null)
        {
            curr.next = l1;
            l1=l1.next;
        }

        if(l2 != null)
        {
            curr.next = l2;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public static void printLL(Node node)
    {
        while(node != null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        LinkedList_CP obj1 = new LinkedList_CP();
        LinkedList_CP obj2 = new LinkedList_CP();
        System.out.println("Creating Linked List 1: ");
        obj1.addAtTail(1);
        obj1.addAtTail(2);
        obj1.addAtTail(2);
        obj1.addAtTail(4);
        obj1.addAtTail(7);
        obj1.addAtTail(10);
        obj1.printLinkedLst(obj1.head);
        System.out.println("Creating linked List 2: ");
        obj2.addAtTail(2);
        obj2.addAtTail(6);
        obj2.addAtTail(8);
        obj2.addAtTail(11);
        obj2.printLinkedLst(obj2.head);
        System.out.println("Merging the 2 Linked Lists:");
        Node result = mergeSortedLists(obj1.head, obj2.head);
        printLL(result);
    }
}