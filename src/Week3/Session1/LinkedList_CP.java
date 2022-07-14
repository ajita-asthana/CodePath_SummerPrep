package Week3.Session1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinkedList_CP {
    public Node head;

    public LinkedList_CP(){
        Node head = new Node(0);
    }

    public  void addAtHead(int val)
    {
        Node node = new Node(val);
        if(head != null)
            node.next =head;

        head = node;
    }
    public  void addAtTail(int val)
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

    public  int sizeLinkedList()
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

    public  int getValue(int index)
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

    public  void insertAtIndex(int index, int val)
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

    public  void deleteAtIndex(int index)
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

    public  void printLinkedLst(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public  void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        LinkedList_CP obj = new LinkedList_CP();
        System.out.println("Adding an element at the head of the list");
        //addAthead
        obj.addAtHead(6);
        obj.addAtHead(8);
        obj.addAtHead(4);
        obj.printLinkedLst(head);
        System.out.println("Adding an element at the tail of the List");
        //addAtTail
        obj.addAtTail(11);
        obj.addAtTail(13);
        obj.addAtTail(9);
        obj.printLinkedLst(head);
        //Get the value at i-th index
        System.out.println("Enter the index value to search: ");
        int index = Integer.parseInt(ob.readLine());
        System.out.println(obj.getValue(index));
        //Insert a val at i-th index position
        System.out.println("Enter the index position to insert: ");
        int idx = Integer.parseInt(ob.readLine());
        obj.insertAtIndex(idx, 21);
        obj.printLinkedLst(head);
        System.out.println("Enter the index value to delete: ");
        int x = Integer.parseInt(ob.readLine());
        obj.deleteAtIndex(x);
        obj.printLinkedLst(head);
    }
}
