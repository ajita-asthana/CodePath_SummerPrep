package Week3.Session1;
import java.io.*;

public class Node {
    int val;
    Node next = null;
    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
