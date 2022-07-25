package Week4.Session1;
import java.io.*;
import java.util.*;

public class ExcellentPairs {
    public static Map<Integer, Long> map = new HashMap<>();
//    public static int countSetBits(String array)
//    {
//        int count =0;
//        char[] charArr = array.toCharArray();
//        for(char c : charArr)
//        {
//            if(c == '1')
//                count++;
//        }
//        return count;
//    }
public static long countSetBits(int n)
    {
        if(map.containsKey(n))
            return map.get(n);

        // `count` stores the total bits set in `n`
        long count = 0;

        while (n != 0)
        {
            n = n & (n - 1);    // clear the least significant bit set
            count++;
        }
        map.put(n, count);
        return count;
    }
    //1111111111111111111111111111111
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[] arr  = {1,2,3,1};
        int k = 3;
        int count =0;
        Set<Integer> set = new HashSet<>();
        for(int x : arr)
            set.add(x);
        Integer[] nums = set.toArray(new Integer[set.size()]);
        for(int i=0; i<set.size(); i++)
        {
            int num = nums[i];
            for(int j=i; j<set.size(); j++)
            {
//                String binAnd = Integer.toBinaryString(num&nums[j]);
//                String binOr = Integer.toBinaryString(num|nums[j]);
                int binAnd = num & nums[j];
                int binOr = num | nums[j];
                long setBits = countSetBits(binAnd) +countSetBits(binOr);
                if(setBits >= k)
                {
                    //count += 1;
                    if(num != nums[j])
                        count += 2;
                    else
                        count += 1;
                }
            }
        }
        System.out.println("Total number of Excellent pairs is "+count);
    }
}




//
//
//class Solution {
//    public long countSetBits(int n)
//    {
//        // `count` stores the total bits set in `n`
//        long count = 0;
//
//        while (n != 0)
//        {
//            n = n & (n - 1);    // clear the least significant bit set
//            count++;
//        }
//
//        return count;
//    }
//    public long countExcellentPairs(int[] nums, int k) {
//        long count = 0;
//        Set<Integer> set = new HashSet<>();
//        for(int x : nums)
//            set.add(x);
//
//        Integer[] arr = set.toArray(new Integer[set.size()]);
//
//        for(int i=0; i<arr.length; i++)
//        {
//            int num = arr[i];
//            for(int j=i; j<arr.length; j++)
//            {
//                int binAnd = num & arr[j];
//                int binOr = num | arr[j];
//                long setBits = countSetBits(binAnd) + countSetBits(binOr);
//
//                if(setBits >= k)
//                {
//                    if(num != arr[j])
//                        count += 2;
//                    else
//                        count += 1;
//                }
//            }
//        }
//
//        return count;
//    }
//}




