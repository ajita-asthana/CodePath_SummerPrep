package Week2.Session2;
import java.io.*;
import java.util.*;
public class unCommonWords {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String s1 = "apple apple";
        String s2 = "banana";
        List<String> result = new ArrayList<String>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for(String s : arr1)
            System.out.print(s+ " ");
        System.out.println();
        for(String s : arr2)
            System.out.print(s+" ");
        System.out.println();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String s : arr1)
        {
            map1.put(s, map1.getOrDefault(s, 0)+1);
        }
        for(String s : arr2)
        {
            map2.put(s, map2.getOrDefault(s, 0)+1);
        }
        for(String s : map1.keySet())
        {
            if(map1.get(s) == 1 && !map2.containsKey(s))
                result.add(s);
        }
        for(String s : map2.keySet())
        {
            if(map2.get(s) == 1 && !map1.containsKey(s))
                result.add(s);
        }
        for(String s : result)
            System.out.print(s+" ");
    }
}
