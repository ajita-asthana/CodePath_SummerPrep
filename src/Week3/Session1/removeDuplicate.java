package Week3.Session1;
import java.io.*;
import java.util.*;

public class removeDuplicate {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        LinkedList_CP linkedLst = new LinkedList_CP();
        linkedLst.addAtTail(0);
        linkedLst.addAtTail(1);
        linkedLst.addAtTail(2);
//        linkedLst.addAtTail(3);
//        linkedLst.addAtTail(4);
//        linkedLst.addAtTail(5);
        linkedLst.printLinkedLst(linkedLst.head);
        Node dummy = new Node(0);
        dummy.next = linkedLst.head;
        Node prev = dummy;
        //Remove Duplicated 2
//        while(curr != null)
//        {
//            while(curr.next != null && curr.next.val==curr.val)
//            {
//                curr = curr.next;
//            }
//
//            if(prev.next == curr)
//                prev = prev.next;
//
//            else
//            {
//                prev.next = curr.next;
//            }
//            curr = curr.next;
//        }
//        linkedLst.printLinkedLst(dummy.next);
        //Node curr = linkedLst.head;
//        while(linkedLst.head != null && linkedLst.head.next != null)
//        {
//            Node firstnode = linkedLst.head;
//            Node secondNode = linkedLst.head.next;
//
//            prev.next = secondNode;
//            firstnode.next = secondNode.next;
//            secondNode.next = firstnode;
//
//            linkedLst.head = firstnode.next;
//            prev = firstnode;
//        }
        //linkedLst.printLinkedLst(dummy.next);

        for(int i=0; i<4; i++)
        {
            Node curr = linkedLst.head;
            Node pred = linkedLst.head;
            while(curr.next != null)
            {
                pred =curr;
                curr = curr.next;
            }
            pred.next = null;
            curr.next = linkedLst.head;
            linkedLst.head = curr;
        }
        linkedLst.printLinkedLst(linkedLst.head);
    }
}
