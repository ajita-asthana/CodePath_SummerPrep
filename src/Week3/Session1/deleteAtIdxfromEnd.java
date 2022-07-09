package Week3.Session1;
import java.io.*;
import java.util.*;
import static Week3.Session1.LinkedList_CP.Node.*;
import static Week3.Session1.LinkedList_CP.head;

public class deleteAtIdxfromEnd {
    public static void deletelinkedLst(int index)
    {
        int len = sizeLinkedList();
        if(index<0 || index>len)
            return;

        int pos = len-index;
        LinkedList_CP.Node prev = head;
        LinkedList_CP.Node curr = head;
        for(int i=0; i<pos; i++)
        {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return;
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        addAtHead(7);
        addAtHead(12);
        addAtTail(45);
        addAtTail(77);
        addAtTail(28);
        addAtTail(54);
        printLinkedLst(head);
        //Assuming list to be 0-indexed
        System.out.println("Enter the index position to delete from end: ");
        int index = Integer.parseInt(ob.readLine());
        deletelinkedLst(index);
        printLinkedLst(head);
    }

}
