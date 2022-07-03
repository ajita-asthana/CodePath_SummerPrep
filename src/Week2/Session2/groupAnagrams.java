package Week2.Session2;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class groupAnagrams {
    public static void main(String agrs[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List> map = new HashMap<>();
        for(String x : strs)
        {
            char[] charArr = x.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(strs);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        
    }
}
