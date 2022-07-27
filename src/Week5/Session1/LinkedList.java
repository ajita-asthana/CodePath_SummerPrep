package Week5.Session1;
import java.io.*;
import java.util.*;

public class LinkedList {
    public static class Node
    {
        int val;
        Node next;
        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next){
            this.val= val;
            this.next = next;
        }
    }
    public static Node head;
    public LinkedList()
    {
        head = new Node(0, null);
    }

    public static void addAthead(int val)
    {
        Node curr = head;
        Node newNode = new Node(val);
        newNode.next = curr;
        head = newNode;
    }

    public static void printLL(Node head)
    {
        while(head != null)
        {
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static int lenghtOfLst(Node node)
    {
        int len = 0;
        while(node != null)
        {
            len++;
            node = node.next;
        }
        return len;
    }

    public static Node intersectNode(Node head1, Node head2)
    {
        if(head1 == null  && head2 ==null)
            return null;

        Node a = head1;
        Node b = head2;

        while(a!=b)
        {
            a = a == null ? head2 : a.next;
            b = b == null ? head1 : b.next;
        }
        return a;
    }

    public static Node reverseLst(Node head)
    {
        if(head == null || head.next == null)
            return head;

        Node temp = reverseLst(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void main(String[] args)throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader((System.in)));
        addAthead(5);
        addAthead(4);
        addAthead(3);
        addAthead(2);
        addAthead(1);
        printLL(head);
        head = reverseLst(head);
        printLL(head);



    //System.out.println("The intersecting Node is: "+intersectNode(list1.head, list2.head).val);


    }
}
