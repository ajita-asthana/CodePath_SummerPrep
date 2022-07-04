package Week2.Session2;
import java.io.*;
import java.util.*;

public class mostCommonWord {
    public static void main(String arrgs[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String strs = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        List<String> bannedLst = Arrays.asList(banned);
        String[] arr = strs.toLowerCase().split("\\W+");
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr)
        {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int max = 0;
        String result = "";
        for(String s : map.keySet())
        {

            //System.out.println(s+" "+map.get(s));
            if(bannedLst.contains(s))
                continue;
            else
            {
                if(map.get(s) > max){
                    result = s;
                    max = map.get(s);
                }
            }
        }
        System.out.println(result+" "+max);
    }
}

