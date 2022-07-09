package Week3.Session1;
import java.io.*;
import java.util.*;

import static Week3.Session1.LinkedList_CP.Node.*;

public class LinkedList_CP {
    public static Node head;
    public static class Node
    {
        int val;
        Node next = null;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }

        public static void addAtHead(int val)
        {
            Node node = new Node(val);
            if(head != null)
                node.next =head;

            head = node;
        }
        public static void addAtTail(int val)
        {
            Node node = new Node(val);
            if(head == null)
                head = node;
            else
            {
                Node curr = head;
                while(curr.next != null)
                {
                    curr = curr.next;
                }

                curr.next = node;
            }
            return;
        }

        public static int sizeLinkedList()
        {
            int size = 0;
            Node curr = head;
            while(curr != null)
            {
                size++;
                curr = curr.next;
            }
            return size;
        }

        public static int getValue(int index)
        {
            int size = sizeLinkedList();
            if(index<0 || index>size)
                return -1;
            Node temp = head;
            for(int i=0; i<index-1; i++)
            {
                temp = temp.next;
            }
            return temp.val;
        }

        public static void insertAtIndex(int index, int val)
        {
            int size = sizeLinkedList();

            if(index<0 || index>size)
                return;
            Node curr = head;
            Node node = new Node(val);
            int idx = index-1;
            if(idx == 0)
                addAtHead(val);
            else
            {
                for(int i=0; i<idx-1; i++)
                {
                    curr = curr.next;
                }
                node.next = curr.next;
                curr.next = node;
            }
        }

        public static void deleteAtIndex(int index)
        {
            int size = sizeLinkedList();
            if(index<0 || index>size)
                return;

            if(size == 1)
                head = null;

            int idx = index-1;
            Node temp = head;
            Node prev = head;
            for(int i=0; i<idx; i++)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next=  temp.next;
        }

        public static void printLinkedLst(Node head)
        {
            Node curr = head;
            while(curr != null)
            {
                System.out.print(curr.val+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        head = null;
        System.out.println("Adding an element at the head of the list");
        //addAthead
        addAtHead(6);
        addAtHead(8);
        addAtHead(4);
        printLinkedLst(head);
        System.out.println("Adding an element at the tail of the List");
        //addAtTail
        addAtTail(11);
        addAtTail(13);
        addAtTail(9);
        printLinkedLst(head);
        //Get the value at i-th index
        System.out.println("Enter the index value to search: ");
        int index = Integer.parseInt(ob.readLine());
        System.out.println(getValue(index));
        //Insert a val at i-th index position
        System.out.println("Enter the index position to insert: ");
        int idx = Integer.parseInt(ob.readLine());
        insertAtIndex(idx, 21);
        printLinkedLst(head);
        System.out.println("Enter the index value to delete: ");
        int x = Integer.parseInt(ob.readLine());
        deleteAtIndex(x);
        printLinkedLst(head);
    }
}
