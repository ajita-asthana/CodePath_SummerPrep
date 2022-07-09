package Week3.Session1;
import java.io.*;
import java.util.*;

public class doublyLinked {
    public static class Node
    {
        int val;
        Node prev;
        Node next;
        public Node(int val)
        {
            this.val = val;
        }
    }

    public static class doublyLinkedList
    {
        public static Node head, tail; //Sentinel Nodes
        doublyLinkedList()
        {
            head = new Node(0);
            tail = new Node(0);
            head.next = tail;
            tail.prev = head;
        }

        public static void addAtHead(int val)
        {
            Node node = new Node(val);
            Node pred = head;
            Node succ = head.next;
            node.prev = pred;
            node.next = succ;
            pred.next = node;
            succ.prev = node;
        }

        public static void addAtTail(int val)
        {
            Node node = new Node(val);
            Node pred = tail.prev;
            Node succ = tail;
            node.prev = pred;
            node.next = succ;
            pred.next =node;
            succ.prev = node;
        }

        public static int getSize()
        {
            int size = 0;
            Node curr = head.next;
            while(curr.next != tail)
            {
                size++;
                curr= curr.next;
            }
            return size;
        }

        public static int getAtIndex(int index)
        {
            int size = getSize();
            if(index<0 || index>=size)
                return -1;

            Node curr = head;
            if(index < size-index)
            {
                for (int i = 0; i <= index; i++)
                    curr = curr.next;
            }
            else
            {
                curr = tail;
                for(int i=0; i<size-index;i++)
                    curr = curr.prev;
            }

            return curr.val;
        }

        public static void addAtIndex(int index, int val)
        {
            Node node = new Node(val);
            Node pred, succ;
            int size = getSize();
            if(index<0 ||index>size)
                return;
            if(index < size-index)
            {
                pred = head;
                for(int i=0; i<index; i++)
                    pred = pred.next;
                succ = pred.next;
            }
            else{
                succ = tail;
                for(int i=0; i<size-index; i++)
                    succ = succ.prev;
                pred = succ.prev;
            }
            node.prev = pred;
            node.next = succ;
            succ.prev = node;
            pred.next = node;
        }

        public static void deleteAtIndex(int index)
        {
            int size = getSize();
            if(index<0 || index>=size)
                return;
            Node pred, succ;
            if(index < size-index)
            {
                pred = head;
                for(int i=0; i<index; i++)
                    pred = pred.next;

                succ = pred.next.next;
            }else{
                succ = tail;
                for(int i=0; i<size-index; i++)
                    succ = succ.prev;
                pred = succ.prev.prev;
            }
            succ.prev = pred;
            pred.next = succ;
        }

        public static void printDLL()
        {
            Node curr = head.next;
            while(curr!= tail)
            {
                System.out.print(curr.val+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        doublyLinkedList obj = new doublyLinkedList();
        System.out.println("Adding at the head position");
        obj.addAtHead(8);
        obj.addAtHead(21);
        obj.addAtHead(29);
        obj.addAtHead(45);
        obj.addAtHead(60);
        obj.printDLL();
        System.out.println("Adding at the Tail position");
        obj.addAtTail(90);
        obj.addAtTail(34);
        obj.addAtTail(92);
        obj.addAtTail(59);
        obj.addAtTail(75);
        obj.printDLL();
        System.out.println("Adding the value at index position 2");
        obj.addAtIndex(2, 22);
        obj.printDLL();
        System.out.println("Deleting at the index position 5");
        obj.deleteAtIndex(5);
        obj.printDLL();
        System.out.println("Getting the value at index position 4");
        System.out.println("The value is: "+ obj.getAtIndex(4));
    }
}
