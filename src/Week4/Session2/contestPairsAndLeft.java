package Week4.Session2;
import java.io.*;
import java.util.*;

public class contestPairsAndLeft {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1,3,2,1,3,2,2};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int x : map.keySet())
            System.out.println(x+" "+map.get(x));

        int result = 0;
        int left = 0;
        for(int key : map.keySet())
        {
            int rem = map.get(key) % 2;
            int quo = map.get(key) / 2;
            if(rem != 0)
            {
                left += rem;
            }
            result += quo;
        }

        System.out.println("The number of pairs formed are: "+result);
        System.out.println("Number of remaining elements: "+ left);
    }
}
