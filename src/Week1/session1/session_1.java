package Week1.session1;
import java.io.*;

public class session_1 {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String str = ob.readLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

    }
}
