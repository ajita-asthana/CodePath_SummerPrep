package Week2.Session2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class hackerRank_Session2 {
    public static boolean isPrime(int x)
    {
        int count = 0;
        for(int i=1; i<=x; i++)
        {
            if(x%i == 0)
                count++;
        }
        return count == 2? true:false;
    }

    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        /*int count = 0;
        String s = "TGTTCCAGGCCTAGTTCCAGGCCTTTCCAG";
        if(s.contains("TTCCAGGCCT"))
            count++;

        System.out.println(count); */
        int k = 3;
        int[] nums = {1,4,2,1,2};
        int len = nums.length;
        int result=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<len; i++)
        {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }
            else
                set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[1]);
        System.out.println(arr[0]);
    }
}
