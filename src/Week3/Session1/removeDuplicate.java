package Week3.Session1;
import java.io.*;
import java.util.*;

public class removeDuplicate {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        LinkedList_CP linkedLst = new LinkedList_CP();
        linkedLst.addAtTail(7);
        linkedLst.addAtTail(5);
        linkedLst.addAtTail(1);
        linkedLst.addAtTail(6);
        linkedLst.addAtTail(3);

        linkedLst.printLinkedLst(linkedLst.head);
        Node dummy = new Node(0);
        dummy.next = linkedLst.head;
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
//
//        for(int i=0; i<4; i++)
//        {
//            Node curr = linkedLst.head;
//            Node pred = linkedLst.head;
//            while(curr.next != null)
//            {
//                pred =curr;
//                curr = curr.next;
//            }
//            pred.next = null;
//            curr.next = linkedLst.head;
//            linkedLst.head = curr;
//        }
//        linkedLst.printLinkedLst(linkedLst.head);
//
//       Node pointer = dummy;
//       int k = 2;
//       while(pointer != null)
//       {
//           Node node = pointer;
//           for(int i=0; i<k; i++)
//           {
//               if(node == null)
//                   break;
//               node = node.next;
//           }
//           if(node == null)
//               break;
//          Node prev = null, curr = pointer.next, next = null;
//           for(int i=0; i<k; i++)
//           {
//               next = curr.next;
//               curr.next = prev;
//               prev = curr;
//               curr = next;
//           }
//           Node tail = pointer.next;
//           tail.next = curr;
//           pointer.next = prev;
//           pointer = tail;
//       }
//        linkedLst.printLinkedLst(dummy.next);

        //SORTING A LINKED LIST
        Node curr = linkedLst.head;
        Node pointer = dummy;
        Node prev = null, nextTemp = null;
        while(curr.next != null)
        {
            nextTemp = curr.next;
            prev = curr;
            if(curr.val > nextTemp.val)
            {
                curr = nextTemp;
                prev.next = curr.next;
                curr.next = prev;
                pointer.next = curr;
            }
            curr = curr.next;
        }




        linkedLst.printLinkedLst(dummy.next);
    }
}
