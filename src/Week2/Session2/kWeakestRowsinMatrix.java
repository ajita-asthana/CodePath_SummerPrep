package Week2.Session2;
import java.io.*;
import java.util.*;

public class kWeakestRowsinMatrix {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[][] mat = { {1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}
                      };
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<mat.length; i++)
        {
            int count = 0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                    count++;
            }
            map.put(i, count);
        }
        List<Integer> res = new ArrayList<Integer>(map.keySet()); // 0,1,2,3,4
        Collections.sort(res, (a,b)->map.get(a).compareTo(map.get(b)));
        for(int x : map.keySet())
        {
            System.out.println(x+" "+map.get(x));

        }

    }
}
