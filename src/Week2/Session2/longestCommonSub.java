package Week2.Session2;
import java.io.*;
import java.util.*;

public class longestCommonSub {
    public static boolean checkRepeat(String s, int start, int end)
    {
        int[] chars = new int[128];
        for(int i=start; i<=end; i++)
        {
            char c = s.charAt(i);
            chars[c] += 1;

            if(chars[c]>1)
                return false;
        }
        return true;
    }
    public static String resultSubString(String s, int start, int end)
    {
        int[] charArr = new int[128];
        String res = "";
        for(int i=start; i<=end; i++)
        {
            char c = s.charAt(i);
            charArr[c] += 1;

            if(charArr[c] > 1)
                break;
            else
                res += c;
        }
        return res;
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String s = "abcabcbb";
        int res = 0;
        String subStr = "";
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                if(checkRepeat(s, i, j))
                {
                    res = Math.max(res, j-i+1);
                    subStr = resultSubString(s, i, j);
                }
                else
                    break;
            }
        }

        System.out.println("The length of LCS is "+res);
        System.out.println("The longest Common subsequence is "+ subStr);
    }
}
