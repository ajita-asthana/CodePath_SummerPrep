package session2;
import java.io.*;

public class validPalindrome2 {
    public static boolean isPalin(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    public static boolean validPalin(String s)
    {
        int start = 0;
        int end = s.length()-1;

        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                if(isPalin(s, start+1, end) || isPalin(s, start, end-1))
                    return true;
                else
                    return false;
            }

            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String str = ob.readLine();
        if(validPalin(str))
            System.out.println("String is Plaindrome. ");
        else
            System.out.println("String is not Palindrome ");

    }
}
