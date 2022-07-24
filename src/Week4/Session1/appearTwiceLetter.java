package Week4.Session1;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class appearTwiceLetter {
    public static class Pairing{
        char c;
        int idx;
        Pairing(){}
        Pairing(char x, int y)
        {
            this.c = x;
            this.idx = y;
        }
    }
    public static void main(String[] args)throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String s = "aabbbbbccddeeffa";

        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            ArrayList<Integer> idxLst = new ArrayList<>();
            if(!map.containsKey(s.charAt(i)))
            {
                idxLst.add(i);
                map.put(s.charAt(i), idxLst);
            }
            else
            {
                idxLst = map.get(s.charAt(i));
                idxLst.add(i);
                map.put(s.charAt(i), idxLst);
            }
        }
        Pairing res = new Pairing();
        int secIdx = Integer.MAX_VALUE;
        for(char c : map.keySet())
        {
            System.out.print("Element "+c+ " is present at ");
            for(int x : map.get(c))
            {
                System.out.print(x+" ");
            }
            System.out.println();
            //finding the smallest second occurance

            if(map.get(c).size()>1) {
                Collections.sort(map.get(c));
                if(map.get(c).get(1) < secIdx)
                {
                    secIdx = map.get(c).get(1);
                    res.c = c;
                    res.idx = secIdx;
                }
            }
        }
        System.out.println(res.c);
    }
}
