package Week2.Session1;
import java.io.*;
import java.util.HashMap;

public class isoMorphic {
    public static void main(String args[])throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String 1: ");
        String str_1 = ob.readLine();
        System.out.println("Enter String 2: ");
        String str_2 = ob.readLine();
        HashMap<Character, Character> map = new HashMap<>();
        if (str_2.length() != str_1.length())
            System.out.println("String is not isomorphic.");
        boolean res = true;
        for (int i = 0; i < str_1.length(); i++) {
            char a = str_1.charAt(i);
            char b = str_2.charAt(i);
            /*
            if (map.containsKey(a)) {
                if (map.get(a).equals(b))
                    continue;
                else
                    res = false;
            } else {
                if (map.containsValue(b))
                    res = false;
                else
                    map.put(a, b);
            } */
            if(!map.containsKey(a) && !map.containsValue(b))
            {
                map.put(a,b);
            }
            else if(map.containsKey(a))
            {
                char x = map.get(a);
                if(x != b)
                    res = false;
                else
                    continue;
            }
            else if(map.containsValue(b))
                res = false;

        }
        System.out.println(res);
    }
}
