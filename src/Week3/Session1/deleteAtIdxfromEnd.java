package Week3.Session1;
import java.io.*;
import java.util.*;
import static Week3.Session1.LinkedList_CP.*;

public class deleteAtIdxfromEnd {
    LinkedList_CP obj = new LinkedList_CP();
    public  void deletelinkedLst(int index)
    {
        int len = obj.sizeLinkedList();
        if(index<0 || index>len)
            return;

        int pos = len-index;
        Node prev = obj.head;
        Node curr = obj.head;
        for(int i=0; i<pos; i++)
        {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return;
    }

    public  boolean isPalindrome(Node head)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        Node curr = head;
        while(curr != null)
        {
            lst.add(curr.val);
            curr = curr.next;
        }
//        for(int x : lst)
//            System.out.print(x+" ");

        int start =0;
        int end = lst.size()-1;

        while(start <= end)
        {
            if(lst.get(start) !=  lst.get(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public  void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        obj.addAtTail(1);
        obj.addAtTail(2);
        obj.addAtTail(3);
        obj.addAtTail(3);
        obj.addAtTail(2);
        obj.addAtTail(1);
        obj.printLinkedLst(obj.head);
        //Assuming list to be 0-indexed
        //System.out.println("Enter the index position to delete from end: ");
        //int index = Integer.parseInt(ob.readLine());
        //deletelinkedLst(2);
        obj.printLinkedLst(obj.head);
        System.out.println(isPalindrome(obj.head));
    }
}
