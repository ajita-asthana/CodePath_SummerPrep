package Week3.Session1;
import java.io.*;

public class Node {
    public int val;
    public Node next = null;
    public Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
