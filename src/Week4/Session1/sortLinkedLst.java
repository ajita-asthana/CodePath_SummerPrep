package Week4.Session1;
import Week3.Session1.LinkedList_CP;
import Week3.Session1.Node;

import java.io.*;
import java.util.*;

public class sortLinkedLst {
    public static LinkedList_CP linkedLst = new LinkedList_CP();
    public static Node merge(Node p, Node q)
    {
        Node dummy = new Node(0);
        Node pointer = dummy;
        while(p != null && q != null)
        {
            if(p.val> q.val)
            {
                pointer.next = q;
                q = q.next;
            }
            else
            {
                pointer.next = p;
                p = p.next;
            }
            pointer = pointer.next;
        }
        while(p != null)
        {
            pointer.next = p;
            p = p.next;
            pointer = pointer.next;
        }
        while(q != null)
        {
            pointer.next = q;
            q = q.next;
            pointer = pointer.next;
        }
        return dummy.next;
    }
    public static Node sortList(Node node)
    {
        if(node == null || node.next == null)
            return node;

        Node mid = node;
        Node slow = node;
        Node fast = node;

        while(fast != null && fast.next != null)
        {
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        mid.next = null;
        Node lhs = sortList(node);
        Node rhs = sortList(slow);
        return merge(lhs, rhs);
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        linkedLst.addAtTail(4);
        linkedLst.addAtTail(2);
        linkedLst.addAtTail(1);
        linkedLst.addAtTail(3);
        linkedLst.printLinkedLst(sortList(linkedLst.head));
    }
}
