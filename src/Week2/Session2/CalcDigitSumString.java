package Week2.Session2;
import java.io.*;
import java.util.*;

public class CalcDigitSumString {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String s = "1234";
        int k = 2;
        while(s.length() > k) {
            String ns = "";
            //Dividing into a String of 3 characters
            for (int i = 0; i < s.length(); i += k) {
                String temp = s.substring(i, Math.min(i + k, s.length()));
                System.out.println("The substring is "+temp);
                int sum = 0;
                for (int t = 0; t < temp.length(); t++) {
                    sum += temp.charAt(t) - '0';
                }
                System.out.println("The sum is "+sum);
                ns += Integer.toString(sum);
            }
            System.out.println(ns);
            s = ns;
        }
    }
}
