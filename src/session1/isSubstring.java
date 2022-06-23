package session1;
import java.io.*;


public class isSubstring {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String 1: ");
        String str1 = ob.readLine();
        System.out.println("Enter String 2: ");
        String str2 = ob.readLine();

        if(str2.length() > str1.length())
            System.out.println("False");
        else if(str1.contains(str2))
            System.out.println("True");

    }
}
