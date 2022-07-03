package Week2.Session2;
import java.io.*;
import java.util.*;
public class interSectofTwoArrays {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        Set<Integer> nums = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int x : a)
        {
            nums.add(x);
        }
        for(int x : b)
        {
            if(nums.contains(x))
                result.add(x);
        }
        int[] ans = new int[result.size()];
        int i=0;
        for(Integer n : result)
            ans[i++] = n;

        for(int n : ans)
            System.out.print(n+" ");
    }
}
