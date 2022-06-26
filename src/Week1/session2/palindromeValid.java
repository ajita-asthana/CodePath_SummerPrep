package Week1.session2;
import java.io.*;

public class palindromeValid {
    public static boolean checkValidPalindrome(String str, int start, int end)
    {
        if(start == end)
            return true;

        while(!Character.isLetterOrDigit(str.charAt(start)))
            start++;

        while(!Character.isLetterOrDigit(str.charAt(end)))
            end++;

        char x = str.charAt(start);
        char y = str.charAt(end);

        if(Character.toLowerCase(x) != Character.toLowerCase(y))
            return false;

        if(start<=end)
            checkValidPalindrome(str, start+1, end-1);

        return true;

    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String str = ob.readLine();
        int len = str.length();
        int start = 0;
        int end = len-1;
        boolean res = checkValidPalindrome(str, start, end);
    }
}
