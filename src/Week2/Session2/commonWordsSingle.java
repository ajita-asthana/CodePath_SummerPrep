package Week2.Session2;
import java.io.*;
import java.util.*;

public class commonWordsSingle {
    public static void main(String args[])throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String[] words1 = {"a", "ab"};
        String[] words2 = {"a", "a", "a", "ab"};
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int count = 0;
        for(String s : words1)
        {
            if(!map1.containsKey(s))
                map1.put(s, 1);
            else
                map1.put(s, (map1.get(s)+1));
        }
        for(String s : words2)
        {
            if(!map2.containsKey(s))
                map2.put(s, 1);
            else
                map2.put(s, (map2.get(s)+1));
        }

        for(String s : map1.keySet())
        {
            if(map1.get(s) == 1 && map2.getOrDefault(s, 0) == 1)
                count++;
        }
        System.out.println(count);
    }
}
